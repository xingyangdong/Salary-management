<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工申诉</title>
    <link rel="stylesheet"
          href="../static/element-ui/index.css">
</head>
<body>
<div id="app">
    <!--页面内容区域-->
    <div class="mx-main-content">
        <div class="mx-table-title">
            <el-row type="flex" justify="end">
                <el-col style="margin-bottom:1px">
                    <font size="6pt">申诉管理&nbsp;&nbsp;&nbsp;&nbsp;</font>
                </el-col>

                <el-col :span="10">
                    <el-input v-model="search"  placeholder="请输入搜索内容"></el-input>
                </el-col>
            </el-row>

        </div>
<%--     分割线--%>
        <div class="el-divider">
            <el-divider></el-divider>
        </div>

        <div class="mx-table-content">
            <!--      v-if=v-if"tableData.length > 0"-->
            <el-table
                    :cell-style="addClass"
                    id="table1"
                    :data="tables.slice((currpage-1)*pagesize,currpage*pagesize)"
                    stripe
                    border="true"
                    style="width: 100%"
                    @row-dblclick="dbClickFn">
                <el-table-column
                        type="index"
                        prop=""
                        label="序号"
                        width="50">
                </el-table-column>
                <el-table-column
                        prop="zhuangtai"
                        label="状态"
                        sortable
                        width="120">
                    <template slot-scope="scope">
                        <span v-if="scope.row.zhuangtai == '0'">未受理</span>
                        <span v-if="scope.row.zhuangtai == '1'">已受理</span>
                    </template>
                </el-table-column>
                <el-table-column
                        prop="shensuId"
                        label="申诉编号"
                        sortable
                        width="120">
                </el-table-column>

                <el-table-column
                        prop="saId"
                        label="工资编号"
                        sortable
                        width="120">
                </el-table-column>

                <el-table-column
                        prop="useId"
                        label="员工账户"
                        sortable
                        width="120">
                </el-table-column>
                <el-table-column
                        prop="userName"
                        label="姓名"
                        sortable
                        width="120">
                </el-table-column>
                <el-table-column
                        prop="shensuNext"
                        label="申诉内容"
                        sortable
                        width="120"
                        @click="">
                </el-table-column>
                <el-table-column
                        prop=""
                        label="操作"
                        align="center"
                        width="220">
                    <template slot-scope="scope">
<%--                        <el-button size="mini" plain type="primary" @click="onEdit(scope.$index)">查 看</el-button>--%>
                        <el-button size="mini" plain type="primary" @click='queding(scope.$index+pagesize*(currpage-1))'>确 定</el-button>
                    </template>
                </el-table-column>

            </el-table>
            <div align="center">

                <el-pagination
                        @size-change="handleSizeChange"
                        @current-change="handleCurrentChange"
                        :current-page="currpage"
                        :page-sizes="[1, 2, 3, 4]"
                        :page-size="pagesize"
                        layout="total, sizes, prev, pager, next, jumper"
                        :total="tableData.length">
                </el-pagination>
            </div>

        </div>
    </div>
    <el-dialog
            width="50%"
            :title="dialogEdit.title"
            :visible.sync="dialogEdit.show"
            :close-on-click-modal='false'
            :close-on-press-escape='false'
            :modal-append-to-body='false'>
         <el-form
            ref="myformedit"
            :model="mymodel"
            label-width="150px"
            style="margin:10px;width:auto;">

        <el-form-item  prop='saId' label="工资编号:">
            <el-col :span="15">
                <el-input disabled type="string" v-model="mymodel.saId"></el-input>
            </el-col>
        </el-form-item>

        <el-form-item prop='useId' label="员工账户:">
            <el-col :span="15">
                <el-form-item prop='userName'>
                    <el-input disabled type="string" v-model="mymodel.useId"></el-input>
                </el-form-item>
            </el-col>
        </el-form-item>

        <el-form-item prop='userName' label="姓名:">
            <el-col :span="15">
                <el-form-item prop='userName'>
                    <el-input disabled type="string" v-model="mymodel.userName"></el-input>
                </el-form-item>
            </el-col>
        </el-form-item>

        <el-form-item prop='shensuNext' label="申诉内容:">
            <el-col :span="15">
                <el-input type="textarea"
                          disabled
                          v-model="mymodel.shensuNext"
                          maxlength="10"
                          show-word-limit></el-input>
            </el-col>
        </el-form-item>

        <el-form-item class="text_right">
            <el-button type="primary" @click='onSubmitEdit("myformedit")'>确 定</el-button>
            <el-button @click="dialogEdit.show = false">取 消</el-button>
        </el-form-item>
    </el-form>
    </el-dialog>

</div>
<!--1 引入vue、element、axios-->
<script src="../static/vue/vue.js"></script>
<script src="../static/element-ui/index.js"></script>
<script src="../static/axios/axios.js"></script>
<!--配置服务器地址-->
<script src="../static/mx-config.js"></script>
<script>
    // 定义vue实例
    var app = new Vue({
        el: "#app",
        data: function () {
            return {
                //分页变量
                currentPage1: 1,
                pagesize:1,
                currpage:1,
                //搜索变量
                search: "",
                tableData:[],
                //定义模型，与表单匹配
                mymodel:{
                    shensuId: '',
                    saId:'',
                    useId:'',
                    userName: '',
                    shensuNext:'',
                    zhuangtai:''
                },
                dialogEdit:{
                    title:'',
                    show: false
                },

            }

        },
        //生命周期函数
        mounted: function () {
            //   初始化表格
            this.initTable();
        },
        methods: {
            //查看员工申诉信息
            initTable:function(){
                //通过axios调用服务器json服务
                axios.get("/shensu/").then(res => {
                    this.tableData = res.data;
                });
            },
            //分页
            handleSizeChange(val) {
                this.pagesize=val;
            },
            handleCurrentChange(val) {
                this.currpage=val;
            },
            addClass({row,cilumn,rowIndex,columnIndex}){
                if(columnIndex == 1){
                    if(row.zhuangtai == 0){
                        return 'background:red';
                    }
                }
            },
            onEdit: function (index) {
                this.mymodel = {
                    shensuId: this.tableData[index].shensuId,
                    saId:this.tableData[index].saId,
                    useId:this.tableData[index].useId,
                    userName: this.tableData[index].userName,
                    shensuNext:this.tableData[index].shensuNext,
                    zhuangtai:1,
                }
                //保存被选中的行 索引值
                this.selectItemIndex = index;
                //设置对话框可见
                this.dialogEdit.show = true;
            },
            onSubmitEdit:function (form) {
                //保存到数据库
                axios.put("/shensu/", this.mymodel).then(res =>{
                    this.tableData.splice(index, 1, res.data);

                })
                this.initTable();
                this.initTable();
                this.initTable();
                this.dialogEdit.show = false;

            },
            queding:function (index) {
                this.mymodel = {
                    shensuId: this.tableData[index].shensuId,
                    saId:this.tableData[index].saId,
                    useId:this.tableData[index].useId,
                    userName: this.tableData[index].userName,
                    shensuNext:this.tableData[index].shensuNext,
                    zhuangtai:1,
                }
                //保存到数据库
                axios.put("/shensu/", this.mymodel).then(res =>{
                    this.tableData.splice(index, 1, res.data);
                })
                this.initTable();
                this.dialogEdit.show = false;

            },
        },
        //模糊搜索
        computed: {
            tables() {
                const search = this.search;
                if (search) {
                    return this.tableData.filter((dataNews) => {
                        return Object.keys(dataNews).some((key) => {
                            return String(dataNews[key]).toLowerCase().indexOf(search) > -1;
                        });
                    });
                }
                return this.tableData;
            },
        }
    });
</script>
</body>
</html>
