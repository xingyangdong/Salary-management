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
                    <el-button type="primary" size="mini" @click="onAdd()">添加</el-button>
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
                        <span v-if="scope.row.zhuangtai == '0'">正在办理中...</span>
                        <span v-if="scope.row.zhuangtai == '1'">已办理</span>
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
            :title="dialog.title"
            :visible.sync="dialog.show"
            :close-on-click-modal='false'
            :close-on-press-escape='false'
            :modal-append-to-body='false'>
<%--        设置步骤条--%>
        <el-steps :active="active" finish-status="success">
            <el-step title="填写工资编号"></el-step>
            <el-step title="确定个人信息"></el-step>
            <el-step title="填写申诉内容"></el-step>
            <el-step title="完成"></el-step>
        </el-steps>
<%--    将表单分步--%>
        <el-form
                ref="myform"
                :rules="myrule"
                :model="mymodel"
                label-width="150px"
                style="margin:10px;width:auto;">
            <div class="info" v-if="active==1">
                <el-form-item  prop='saId' label="工资编号:">
                    <el-col :span="15">
                        <el-input type="string" v-model="mymodel.saId"></el-input>
                    </el-col>
                </el-form-item>
            </div>
            <div class="info" v-if="active==2">
                <el-form-item required prop='useId' label="员工账户:">
                    <el-col :span="15">
                        <el-form-item prop='userName'>
                            <el-input  type="string" v-model="mymodel.useId"></el-input>
                        </el-form-item>
                    </el-col>
                </el-form-item>
                <el-form-item prop='userName' required label="姓名:">
                    <el-col :span="15">
                        <el-form-item prop='userName'>
                            <el-input  type="string" v-model="mymodel.userName"></el-input>
                        </el-form-item>
                    </el-col>
                </el-form-item>
            </div>
            <div class="info" v-if="active==3">
                <el-form-item prop='shensuNext' required label="申诉内容:">
                    <el-col :span="15">
                        <el-input type="textarea"
                                  v-model="mymodel.shensuNext"
                                  maxlength="10"
                                  show-word-limit></el-input>
                    </el-col>
                </el-form-item>
            </div>
            <div class="info" v-if="active==4">
                提交成功！
            </div>
            <el-button style="margin-top: 12px;" @click="pre" v-if="active>1">上一步</el-button>
            <el-button style="margin-top: 12px;" @click="next" v-if="active<3">下一步</el-button>
            <el-button style="margin-top: 12px;" @click='onSubmitAdd("myform")' v-if="active==3">提 交</el-button>
            <el-button style="margin-top: 12px;" @click="dialog.show = false" v-if="active==4">完 成</el-button>


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
                active: 1,
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
                //定义模型，与浏览器缓存区数据进行匹配
                userInfo: {
                    userId:'',
                    userName: '',
                },
                dialog:{
                    title:'',
                    show: false
                },
                //设置表单校验规则
                myrule: {
                    saId: [
                        {required: true, message: '请输入工资编码', trigger: 'blur'},
                        {min: 12, max: 12, message: '长度为12个字符', trigger: 'blur'}
                    ]
                },

            }

        },
        //生命周期函数
        mounted: function () {
            //从浏览器的缓存区拿到用户的姓名和账户
            this.userInfo = JSON.parse(localStorage.getItem('userInfo'));
            //   初始化表格
            this.initTable();
        },
        methods: {
            //步骤条
            //下一步
            next() {
                if (this.active++ > 3) this.active = 1;
            },
            //上一步
            pre() {
                if (this.active-- < 2) this.active = 1;
            },
            //查看员工申诉信息
            initTable: function () {
                //通过axios调用服务器json服务
                axios.get("/shensu/" + this.userInfo.userId).then(res => {
                    this.tableData = res.data;
                });
            },
            //分页
            //每页几条
            handleSizeChange(val) {
                this.pagesize = val;
            },
            //当前第几页
            handleCurrentChange(val) {
                this.currpage = val;
            },
            //设置未操作的申诉单为红色
            addClass({row, cilumn, rowIndex, columnIndex}) {
                if (columnIndex == 1) {
                    if (row.zhuangtai == 0) {
                        return 'background:red';
                    }
                }
            },
            //添加
            onAdd: function () {
                //清空表单
                this.mymodel = {
                    shensuId: '',
                    saId: '',
                    useId: this.userInfo.userId,
                    userName: this.userInfo.userName,
                    shensuNext: '',
                    zhuangtai: '0'
                };
                //alert("注册用户");
                this.dialog.title = "注册用户";
                this.dialog.show = true;

            },
            //响应添加
            onSubmitAdd:function (form) {
                    axios.post("/shensu", this.mymodel).then(res => {
                    this.tableData.push(res.data);
                    // 操作成功
                    this.initTable();
                    this.$message({
                        message: "提交成功！",
                        type: "success"
                    });
                    //alert("添加成功")
                })
                    if (this.active++ > 3) this.active = 1;
            }
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
