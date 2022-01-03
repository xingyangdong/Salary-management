<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>员工信息</title>
    <!--2 引入element css-->
    <link rel="stylesheet" href="../static/element-ui/index.css">
    <!--在element-UI中使用fontawesome和阿里矢量库-->
    <link href="../static/fontawesome/css/all.min.css"
          rel="stylesheet">
    <link  href="../static/font-icon/all.css" rel="stylesheet">
</head>
<body>
<!--3 创建容器-->
<div id="app">
    <!--页面内容区域-->
    <div class="mx-main-content">
        <div class="mx-table-title">
            <el-row type="flex" justify="end">
                <el-col style="margin-bottom:1px">
                    <font size="6pt">员工信息&nbsp;&nbsp;&nbsp;&nbsp;</font>
                    <el-button type="primary" size="mini" @click="onAdd()">添加</el-button>
                </el-col>

                <el-col :span="10">
                    <el-input v-model="search"  placeholder="请输入搜索内容"></el-input>
                </el-col>
                <i title="导出员工信息" >
                    <el-button id="btn" size="medium " class="fa fa-download" style="border:0px;margin-bottom:-1px" onclick="btn_export()"></el-button>
                </i>

            </el-row>

        </div>
        <div class="el-divider">
            <el-divider></el-divider>
        </div>
        <div class="mx-table-content">
            <!--      v-if=v-if"tableData.length > 0"-->
            <el-table
                    id="table1"
                    :data="tables.slice((currpage-1)*pagesize,currpage*pagesize)"
                    stripe
                    style="width: 100%"
                    @row-dblclick="dbClickFn">
                <el-table-column
                        type="index"
                        prop=""
                        fixed
                        label="序号"
                        width="50">
                </el-table-column>
                <el-table-column
                        prop="personId"
                        label="员工编码"
                        sortable
                        fixed
                        width="120">
                </el-table-column>
                <el-table-column
                        prop="fullName"
                        label="姓名"
                        sortable
                        fixed
                        width="120">
                </el-table-column>
                <el-table-column
                        prop="gender"
                        label="性别"
                        sortable
                        width="120">
                </el-table-column>
                <el-table-column
                        prop="birthDate"
                        label="出生日期"
                        sortable
                        width="120">
                </el-table-column>
                <el-table-column
                        prop="phone"
                        label="手机号"
                        sortable
                        width="120">
                </el-table-column>
                <el-table-column
                        prop="occupation"
                        label="部门"
                        sortable
                        width="120">
                </el-table-column>
                <el-table-column
                        prop="personalTitle"
                        label="职位"
                        sortable
                        width="120">
                </el-table-column>
                <el-table-column
                        prop="cardId"
                        label="身份证号"
                        sortable
                        width="120">
                </el-table-column>
                <el-table-column
                        prop="entryDate"
                        label="入职时间"
                        sortable
                        width="120">
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
                label-width="150px"
                style="margin:10px;width:auto;">
            <el-form-item hidden prop='personId' label="ID:">
                <el-input type="string" v-model="mymodel.personId"></el-input>
            </el-form-item>
            <el-form-item label="姓名" prop='fullName' required>
                <el-col :span="15">
                        <el-input type="string" v-model="mymodel.fullName"></el-input>
                </el-col>
            </el-form-item>

            <el-form-item prop='gender' label="性别:" required>
                <el-radio-group v-model="mymodel.gender">
                    <el-radio-button label="男">男</el-radio-button>
                    <el-radio-button label="女">女</el-radio-button>
                </el-radio-group>
            </el-form-item>

            <el-form-item prop='birthDate' label="出生日期:" required>
                    <el-date-picker
                            v-model="mymodel.birthDate"
                            type="date"
                            value-format="yyyy-MM-dd"
                            placeholder="选择日期">
                    </el-date-picker>
            </el-form-item>

            <el-form-item prop='phone' label="手机号:">
                <el-col :span="15">
                    <el-input type="string" v-model="mymodel.phone"></el-input>
                </el-col>
            </el-form-item>
            <el-form-item prop='occupation' label="部门:">
                <el-col :span="15">
                    <el-input type="string" v-model="mymodel.occupation"></el-input>
                </el-col>
            </el-form-item>
            <el-form-item prop='personalTitle' label="职位:">
                <el-col :span="15">
                    <el-input type="string" v-model="mymodel.personalTitle"></el-input>
                </el-col>
            </el-form-item>
            <el-form-item prop='cardId' label="身份证号:">
                <el-col :span="15">
                    <el-input type="string" v-model="mymodel.cardId"></el-input>
                </el-col>
            </el-form-item>
            <el-form-item prop='entryDate' label="入职时间:">
                    <el-date-picker
                            v-model="mymodel.entryDate"
                            align="right"
                            type="date"
                            value-format="yyyy-MM-dd"
                            placeholder="选择日期"
                            :picker-options="pickerOptions">
                    </el-date-picker>
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
            <el-form-item hidden prop='personId' label="ID:">
                <el-input type="string" v-model="mymodel.personId"></el-input>
            </el-form-item>
            <el-form-item label="姓名" prop='fullName' required>
                <el-col :span="15">
                    <el-input type="string" v-model="mymodel.fullName"></el-input>
                </el-col>
            </el-form-item>

            <el-form-item prop='gender' label="性别:" required>
                <el-radio-group v-model="mymodel.gender">
                    <el-radio-button label="男">男</el-radio-button>
                    <el-radio-button label="女">女</el-radio-button>
                </el-radio-group>
            </el-form-item>

            <el-form-item prop='birthDate' label="出生日期:" required>
                <el-col :span="15">
                    <el-input type="string" v-model="mymodel.birthDate"></el-input>
                </el-col>
            </el-form-item>

            <el-form-item prop='phone' label="手机号:">
                <el-col :span="15">
                    <el-input type="string" v-model="mymodel.phone"></el-input>
                </el-col>
            </el-form-item>
            <el-form-item prop='occupation' label="部门:">
                <template>
                    <el-select v-model="mymodel.occupation" placeholder="请选择">
                        <el-option
                                v-for="item in options1"
                                :key="item.bmId"
                                :label="item.bmName"
                                :value="item.bmName">
                        </el-option>
                    </el-select>
                </template>
            </el-form-item>
            <el-form-item prop='personalTitle' label="职位:">
                <el-col :span="15">
                    <el-input type="string" v-model="mymodel.personalTitle"></el-input>
                </el-col>
            </el-form-item>
            <el-form-item prop='cardId' label="身份证号:">
                <el-col :span="15">
                    <el-input type="string" v-model="mymodel.cardId"></el-input>
                </el-col>
            </el-form-item>
            <el-form-item prop='entryDate' label="入职时间:">
                <el-col :span="15">
                    <el-input type="string" v-model="mymodel.entryDate"></el-input>
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
<script src="../static/js/xlsx.full.min.js"></script>
<script src="../static/js/export.js"></script>
<script>
    //打印表格
    function btn_export() {
        var table1 = document.querySelector("#table1");
        var sheet = XLSX.utils.table_to_sheet(table1);//将一个table对象转换成一个sheet对象
        openDownloadDialog(sheet2blob(sheet),'下载.xlsx');
    }
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
                //表格数据
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
                //定义模型，与表单匹配
                mymodel:{
                    personId: '',
                    fullName:'',
                    gender: '',
                    birthDate:'',
                    phone:'',
                    occupation:'',
                    personalTitle:'',
                    cardId:'',
                    entryDate:'',
                    currentStatus:'0'
                },
                options1:[],
                //设置一个变量，保存哪行数据被选中了
                selectItemIndex:-1,
                //选择时间
                pickerOptions: {
                    disabledDate(time) {
                        return time.getTime() > Date.now();
                    },
                    shortcuts: [{
                        text: '今天',
                        onClick(picker) {
                            picker.$emit('pick', new Date());
                        }
                    }, {
                        text: '昨天',
                        onClick(picker) {
                            const date = new Date();
                            date.setTime(date.getTime() - 3600 * 1000 * 24);
                            picker.$emit('pick', date);
                        }
                    }, {
                        text: '一周前',
                        onClick(picker) {
                            const date = new Date();
                            date.setTime(date.getTime() - 3600 * 1000 * 24 * 7);
                            picker.$emit('pick', date);
                        }
                    }]
                },
                value1: '',
                value2: '',
            }

        },
        //生命周期函数
        mounted: function () {
            //   初始化表格
            this.initTable();
            this.initTable2();
        },
        methods: {
            //初始化表格
            initTable:function(){
                //通过axios调用服务器json服务
                axios.get("/person/").then(res => {
                    this.tableData = res.data;
                });
            },
            initTable2:function(){
                //通过axios调用服务器json服务
                axios.get("/bm/").then(res => {
                    this.options1 = res.data;
                });
            },
            //每页几条
            handleSizeChange(val) {
                this.pagesize=val;
            },
            //当前页数
            handleCurrentChange(val) {
                this.currpage=val;
            },
            //响应添加按钮
            onAdd:function () {
                this.mymodel = {
                    personId: '',
                    fullName:'',
                    gender: '',
                    birthDate:'',
                    phone:'',
                    occupation:'',
                    personalTitle:'',
                    cardId:'',
                    entryDate:'',
                    currentStatus:'0'
                };

                //alert("注册用户");
                this.dialog.title="添加员工信息";
                this.dialog.show = true;

            },
            //响应注册用户对话框 保存按钮
            onSubmitAdd:function (form) {
                axios.post("/person", this.mymodel).then(res => {
                    this.tableData.push(res.data);
                    // 操作成功
                    this.initTable();
                    this.$message({
                        message: "添加成功！",
                        type: "success"
                    });
                    //alert("添加成功")
                    this.dialog.show = false;
                })},
            //响应修改按钮
            onEdit:function (index) {
                //进行数据回填---通过选中的index获得tableData里面的数据
                this.mymodel = {
                    personId:this.tableData[index].personId,
                    fullName: this.tableData[index].fullName,
                    gender: this.tableData[index].gender,
                    birthDate:this.tableData[index].birthDate,
                    phone:this.tableData[index].phone,
                    occupation:this.tableData[index].occupation,
                    personalTitle:this.tableData[index].personalTitle,
                    cardId:this.tableData[index].cardId,
                    entryDate:this.tableData[index].entryDate,
                    currentStatus:this.tableData[index].currentStatus
                };

                //保存被选中的行 索引值
                this.selectItemIndex = index;

                //设置对话框可见
                this.dialogEdit.title = '修改用户信息';
                this.dialogEdit.show = true;

            },
            onSubmitEdit:function (form) {
                //保存到数据库
                axios.put("/person/", this.mymodel).then(res =>{
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


            //响应修改对话框 保存按钮

            //响应删除按钮
            onDelete:function (index) {
                //删除被选中的数据
                this.$confirm('确认删除该数据吗?', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(() => {
                    // 删除
                    axios.delete("/person/" + this.tableData[index].personId).then(res => {
                        if (res.data == 200) {
                            this.$message("删除成功");
                            // 删除table起始下标为1，长度为1的一个值
                            this.tableData.splice(index, 1);
                        }
                    });
                }).catch(() => {

                });
            }
        },
        computed: {
            tables(){
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
