<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>部门管理</title>
    <!--2 引入element css-->
    <link href="../static/element-ui/index.css"
          rel="stylesheet">
</head>
<body>
<!--3 创建容器-->
<div id="app">
    <!--页面内容区域-->
    <div class="mx-main-content">
        <div class="mx-table-title" >
            <el-row type="flex" justify="end">
                <el-col style="margin-bottom:1px">
                    <font size="6pt">部门信息&nbsp;&nbsp;&nbsp;&nbsp;</font>
<%--                    <el-button type="primary" size="mini" @click="onAdd()">添加</el-button>--%>
                </el-col>
                <el-col :span="10">
                    <el-input v-model="search"  placeholder="请输入搜索内容" style="margin-bottom:1px"></el-input>
                </el-col>
            </el-row>

        </div>
        <div class="el-divider">
            <el-divider></el-divider>
        </div>
        <div class="mx-table-content">
            <!--      v-if=v-if"tableData.length > 0"-->
            <el-table
                    ref="multipleTable"
                    :data="tables.slice((currpage-1)*pagesize,currpage*pagesize)"
                    tooltip-effect="dark"
                    stripe
                    id="table1"
                    style="width: 100%"
                    @row-dblclick="dbClickFn"
                    @selection-change="handleSelectionChange">
                <el-table-column
                        type="index"
                        prop=""
                        label="序号"
                        width="50">
                </el-table-column>
                <el-table-column
                        prop="bumenId"
                        label="编号"
                        sortable
                        width="120">
                </el-table-column>
                <el-table-column
                        prop="bumenName"
                        label="部门名称"
                        sortable
                        width="200">
                </el-table-column>

                <el-table-column
                        prop="bumenZhicheng"
                        sortable
                        label="职称"
                        width="200">
                </el-table-column>
                <el-table-column
                        prop="bumenRenshu"
                        sortable
                        label="人数"
                        align="center"
                        width="200">
                </el-table-column>

                <el-table-column
                        prop=""
                        label="操作"
                        align="center"
                        width="220">
                    <template slot-scope="scope">
                        <el-button size="mini" plain type="primary" @click="onEdit(scope.$index+pagesize*(currpage-1))">修改</el-button>
                        <el-button size="mini" plain type="danger" @click="onDelete(scope.$index)">删除</el-button>
                    </template>
                </el-table-column>
            </el-table>
            <el-button type="primary" size="mini" @click="onAddbm()">添加部门</el-button>
            <el-button type="primary" size="mini" @click="onAddzhiwei()">添加职位</el-button>
            <%--            分页--%>
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
            width="80%"
            :title="dialogbm.title"
            :visible.sync="dialogbm.show"
            :close-on-click-modal='false'
            :close-on-press-escape='false'
            :modal-append-to-body='false'>
        <!--使用el-form组件进行数据添加和修改-->
        <el-form
                ref="myformbm"
                :model="mymodelbm"
                label-width="150px"
                style="margin:10px;width:auto;">
            <!--如果是修改,则账号为只读-->
            <el-form-item prop='bmName' label="部门名称" required>
                <el-col :span="15">
                    <el-form-item prop='bmName'>
                        <el-input type="string" v-model="mymodelbm.bmName"></el-input>
                    </el-form-item>
                </el-col>
            </el-form-item>
            <el-form-item prop='bmFuze' label="部门负责人:" required>
                <el-col :span="15">
                    <el-input type="string" v-model="mymodelbm.bmFuze"></el-input>
                </el-col>
            </el-form-item>

            <el-form-item class="text_right">
                <el-button type="primary" @click='onSubmitAddbm("myformbm")'>保 存</el-button>
                <el-button @click="dialogbm.show = false">取 消</el-button>
            </el-form-item>

        </el-form>

    </el-dialog>
    <el-dialog
            width="80%"
            :title="dialogzhiwei.title"
            :visible.sync="dialogzhiwei.show"
            :close-on-click-modal='false'
            :close-on-press-escape='false'
            :modal-append-to-body='false'>
        <!--使用el-form组件进行数据添加和修改-->
        <el-form
                ref="myformzhiwei"
                :model="mymodelzhiwei"
                label-width="150px"
                style="margin:10px;width:auto;">
            <!--如果是修改,则账号为只读-->
            <el-form-item prop='zhiweiName' label="职称" required>
                <el-col :span="15">
                    <el-form-item prop='zhiweiName'>
                        <el-input type="string" v-model="mymodelzhiwei.zhiweiName"></el-input>
                    </el-form-item>
                </el-col>
            </el-form-item>
            <el-form-item prop='bumenName' label="部门名称:" required>
                <el-col :span="15">
                    <el-input type="string" v-model="mymodelzhiwei.bumenName"></el-input>
                </el-col>
            </el-form-item>

            <el-form-item class="text_right">
                <el-button type="primary" @click='onSubmitAddzhiwei("myformzhiwei")'>保 存</el-button>
                <el-button @click="dialogzhiwei.show = false">取 消</el-button>
            </el-form-item>

        </el-form>

    </el-dialog>
    <!--注册用户对话框-->
    <el-dialog
            width="80%"
            :title="dialog.title"
            :visible.sync="dialog.show"
            :close-on-click-modal='false'
            :close-on-press-escape='false'
            :modal-append-to-body='false'>
        <!--使用el-form组件进行数据添加和修改-->
        <el-form
                ref="myform"
                :model="mymodel"
                :rules="myrules"
                label-width="150px"
                style="margin:10px;width:auto;">
            <!--如果是修改,则账号为只读-->
            <el-form-item prop='bumenName' label="部门名称" required>
                <el-col :span="15">
                    <el-form-item prop='bumenName'>
                        <el-input type="string" v-model="mymodel.bumenName"></el-input>
                    </el-form-item>
                </el-col>
            </el-form-item>
            <el-form-item prop='bumenZhicheng' label="职称:" required>
                <el-col :span="15">
                    <el-input type="string" v-model="mymodel.bumenZhicheng"></el-input>
                </el-col>
            </el-form-item>
            <el-form-item prop='bumenRenshu' label="人数:" required>
                <el-col :span="15">
                    <el-input type="string" v-model="mymodel.bumenRenshu"></el-input>
                </el-col>
            </el-form-item>

            <el-form-item class="text_right">
                <el-button type="primary" @click='onSubmitAdd("myform")'>保 存</el-button>
                <el-button @click="dialog.show = false">取 消</el-button>
            </el-form-item>

        </el-form>

    </el-dialog>
    <!--修改用户信息对话框-->
    <el-dialog
            width="80%"
            :title="dialogEdit.title"
            :visible.sync="dialogEdit.show"
            :close-on-click-modal='false'
            :close-on-press-escape='false'
            :modal-append-to-body='false'>

        <!--使用el-form组件进行数据添加和修改-->
        <!--:rules="myrulesEdit"设置表单检验规则-->
        <el-form
                ref="myformedit"
                :model="mymodel"
                label-width="150px"
                style="margin:10px;width:auto;">
            <el-form-item  prop='bumenId' label="部门编号:">
                <el-col :span="15">
                    <el-input disabled type="string" v-model="mymodel.bumenId"></el-input>
                </el-col>

            </el-form-item>
            <!--如果是修改,则账号为只读-->
            <el-form-item prop='bumenName' label="部门名称">
                <el-col :span="15">
                    <el-form-item prop='bumenName'>
                        <el-input type="string" v-model="mymodel.bumenName"></el-input>
                    </el-form-item>
                </el-col>
            </el-form-item>
            <el-form-item prop='bumenZhicheng' label="职称:">
                <el-col :span="15">
                    <el-input type="string" v-model="mymodel.bumenZhicheng"></el-input>
                </el-col>
            </el-form-item>
            <el-form-item prop='bumenRenshu' label="人数:">
                <el-col :span="15">
                    <el-input type="string" v-model="mymodel.bumenRenshu"></el-input>
                </el-col>
            </el-form-item>

            <el-form-item class="text_right">
                <el-button type="primary" @click='onSubmitEdit("myformedit")'>保 存</el-button>
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
                pagesize:1,
                currpage:1,
                //搜索变量
                search: "",
                tableData:[],
                //控制对话框
                dialog:{
                    title:'',
                    show:false
                },
                dialogEdit:{
                    title:'',
                    show: false
                },
                dialogbm:{
                    title:'',
                    show: false
                },
                dialogzhiwei:{
                    title:'',
                    show: false
                },
                dialogSuccess:{
                    title:'注册成功',
                    show:false
                },
                //定义模型，与表单匹配
                mymodel:{
                    bumenId: '',
                    bumenName:'',
                    bumenZhicheng:'',
                    bumenRenshu: '',
                },
                mymodelbm:{
                    bmId:'',
                    bmTime: '',
                    bmFuze: '',
                    bmName: '',
                },
                mymodelzhiwei:{
                    zhiweiId:'',
                    zhiweiName:'',
                    bumenName:'',
                },

                //设置一个变量，保存哪行数据被选中了
                selectItemIndex:-1,
                //表单校验规则
            }

        },
        //生命周期函数
        mounted: function () {
            //   初始化表格
            this.initTable();
        },
        methods: {
            //初始化表格
            initTable:function(){
                //通过axios调用服务器json服务
                axios.get("/bumen/").then(res => {
                    this.tableData = res.data;
                });

            },

            //响应添加按钮
            onAdd:function () {
                //清空表单
                this.mymodel = {
                    bumenId:'',
                    bumenName: '',
                    bumenZhicheng:'',
                    bumenRenshu: '',

                };
                //alert("注册用户");
                this.dialog.title="添加部门";
                this.dialog.show = true;

            },
            onAddbm:function () {
                //清空表单
                this.mymodelbm = {
                    bmId:'',
                    bmTime: '',
                    bmFuze: '',
                    bmName: '',

                };
                //alert("注册用户");
                this.dialogbm.title="添加部门";
                this.dialogbm.show = true;

            },
            onAddzhiwei:function () {
                //清空表单
                this.mymodelzhiwei = {
                    zhiweiId:'',
                    zhiweiName:'',
                    bumenName:'',
                };
                //alert("注册用户");
                this.dialogzhiwei.title="添加部门";
                this.dialogzhiwei.show = true;

            },
            //响应注册用户对话框 保存按钮
            onSubmitAdd:function (form) {
                axios.post("/bumen", this.mymodel).then(res => {
                    this.tableData.push(res.data);
                    // 操作成功
                    this.initTable();
                    this.$message({
                        message: "添加成功！",
                        type: "success"
                    });
                    //2.2 整个表格重新加载

                    //alert("添加成功")
                    this.dialog.show = false;
                    this.dialogSuccess.show = true;
                })
            },
            onSubmitAddbm:function () {
                axios.post("/bm", this.mymodelbm).then(res => {
                    this.tableData.push(res.data);
                    // 操作成功
                    this.initTable();
                    this.$message({
                        message: "添加成功！",
                        type: "success"
                    });
                    //2.2 整个表格重新加载

                    //alert("添加成功")
                    this.dialogbm.show = false;
                    this.dialogSuccess.show = true;
                })
            },
            onSubmitAddzhiwei:function () {
                axios.post("/zhiwei", this.mymodelzhiwei).then(res => {
                    this.tableData.push(res.data);
                    // 操作成功
                    this.initTable();
                    this.$message({
                        message: "添加成功！",
                        type: "success"
                    });
                    //2.2 整个表格重新加载

                    //alert("添加成功")
                    this.dialogzhiwei.show = false;
                    this.dialogSuccess.show = true;
                })
            },
            handleSizeChange(val) {
                this.pagesize=val;
            },
            handleCurrentChange(val) {
                this.currpage=val;
            },
            //响应修改按钮
            onEdit:function (index) {
                //进行数据回填---通过选中的index获得tableData里面的数据
                this.mymodel = {
                    bumenId:this.tableData[index].bumenId,
                    bumenName: this.tableData[index].bumenName,
                    bumenZhicheng: this.tableData[index].bumenZhicheng,
                    bumenRenshu:this.tableData[index].bumenRenshu,
                };
                //保存被选中的行 索引值
                this.selectItemIndex = index;
                //设置对话框可见
                this.dialogEdit.title = '修改部门信息';
                this.dialogEdit.show = true;

            },

            //响应修改对话框 保存按钮
            onSubmitEdit:function (form) {
                //保存到数据库
                axios.put("/bumen/", this.mymodel).then(res =>{
                    // 操作成功
                    this.$message({
                        message: "保存成功！",
                        type: "success"
                    });
                    // 方法1:更新指定索引的元素
                    this.tableData.splice(this.selectItemIndex, 1, res.data);
                    // 方法2:数据重新从服务器加载table数据,这种方法效率差
                    // this.initTable();
                    // 关闭对话框
                    this.dialogEdit.show = false;
                })
            },
            //响应删除按钮
            onDelete:function (index) {
                //删除被选中的数据
                this.$confirm('确认删除该数据吗?', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(() => {
                    // 删除
                    axios.delete("/bumen/" + this.tableData[index].userId).then(res => {
                        if (res.data == 200){
                            this.$message("删除成功");
                            // 删除table起始下标为1，长度为1的一个值
                            this.tableData.splice(index, 1);
                        }
                    });
                }).catch(() => {

                });

            },
            //分页

        },

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