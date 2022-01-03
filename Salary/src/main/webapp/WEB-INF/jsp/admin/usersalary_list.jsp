<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>工资管理</title>
    <link rel="stylesheet" href="../static/element-ui/index.css">
    <!--在element-UI中使用fontawesome和阿里矢量库-->
    <link href="../static/fontawesome/css/all.min.css"
          rel="stylesheet">
    <link  href="../static/font-icon/all.css" rel="stylesheet">
</head>
<body>
<div id="app">
    <!--页面内容区域-->
    <div class="mx-main-content">
        <div class="mx-table-title">
            <el-row type="flex" justify="end">
                <el-col style="margin-bottom:1px">
                    <font size="6pt">工资管理&nbsp;&nbsp;&nbsp;&nbsp;</font>
                    <el-button type="primary" size="mini" @click="onAdd()">添加</el-button>
                </el-col>

                <el-col :span="10">
                    <el-input v-model="search"  placeholder="请输入搜索内容"></el-input>
                </el-col>
                <i title="导出员工工资信息" >
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
                    :cell-style="addClass"
                    show-summary
                    :summary-method="getSummaries"
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
                        prop="saZhuangtai"
                        label="状态"
                        sortable
                        fixed
                        width="120">
                </el-table-column>

                <el-table-column
                        prop="saId"
                        label="工资编号"
                        sortable
                        fixed
                        width="120">
                </el-table-column>

                <el-table-column
                        prop="saTime"
                        label="发放日期"
                        sortable
                        fixed
                        width="120">
                </el-table-column>
                <el-table-column
                        prop="userId"
                        label="员工编号"
                        sortable
                        fixed
                        width="120">
                </el-table-column>
                <el-table-column
                        prop="userName"
                        label="姓名"
                        sortable
                        fixed
                        width="120">
                </el-table-column>

                <el-table-column
                        prop="xingzhi"
                        label="合同性质"
                        sortable
                        width="120">
                </el-table-column>

                <el-table-column
                        prop="bumenName"
                        label="所属部门"
                        sortable
                        fixed
                        width="120">
                </el-table-column>

                <el-table-column
                        prop="bumen"
                        label="职称"
                        sortable
                        width="120">
                </el-table-column>

                <el-table-column
                        prop="saJiben"
                        label="基本工资"
                        sortable
                        width="120">
                </el-table-column>

                <el-table-column
                        prop="saShiye"
                        label="失业保险"
                        sortable
                        width="120">
                </el-table-column>
                <el-table-column
                        prop="saYangliao"
                        label="养老保险"
                        sortable
                        width="120">
                </el-table-column>
                <el-table-column
                        prop="saShenyu"
                        label="生育保险"
                        sortable
                        width="120">
                </el-table-column>
                <el-table-column
                        prop="saGongshang"
                        label="工伤保险"
                        sortable
                        width="120">
                </el-table-column>
                <el-table-column
                        prop="saYiliao"
                        label="医疗保险"
                        sortable
                        width="120">
                </el-table-column>

                <el-table-column
                        prop="saGongjijin"
                        label="公积金"
                        sortable
                        width="120">
                </el-table-column>

                <el-table-column
                        prop="saJiangjin"
                        label="奖金"
                        sortable
                        width="120">
                </el-table-column>

                <el-table-column
                        prop="saFakuan"
                        label="罚款"
                        sortable
                        width="120">
                </el-table-column>

                <el-table-column
                        prop="saZongshu"
                        label="工资总数"
                        sortable
                        width="120">
                </el-table-column>

                <el-table-column
                        prop="saNashui"
                        label="应纳税"
                        sortable
                        width="120">
                </el-table-column>

                <el-table-column
                        prop="shifa"
                        label="实发工资"
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
                <el-form-item label="员工编号" prop='userId' required>
                    <el-col :span="15">
                        <el-input type="string" v-model="mymodel.userId"></el-input>
                    </el-col>
                </el-form-item>

                <el-form-item label="员工姓名" prop='userName' required>
                    <el-col :span="15">
                        <el-input type="string" v-model="mymodel.userName"></el-input>
                    </el-col>
                </el-form-item>

                <el-form-item label="合同性质" required prop="xingzhi">
                    <el-col :span="15">
                        <template>
                            <el-select v-model="mymodel.xingzhi" placeholder="请选择" required>
                                <el-option
                                        v-for="item in options2"
                                        :key="item.value"
                                        :label="item.label"
                                        :value="item.value">
                                </el-option>
                            </el-select>
                        </template>
                    </el-col>
                </el-form-item>

                <el-form-item label="所属部门" required prop="bumenName">
                    <el-col :span="15">
                        <template>
                            <el-select v-model="mymodel.bumenName" placeholder="请选择">
                                <el-option
                                        v-for="item in options3"
                                        :key="item.bmId"
                                        :label="item.bmName"
                                        :value="item.bmName">
                                </el-option>
                            </el-select>
                        </template>
                    </el-col>
                </el-form-item>

                <el-form-item label="职称" required prop='bumen' >
                    <el-col :span="15">
                        <template>
                            <el-select v-model="mymodel.bumen" placeholder="请选择">
                                <el-option
                                        v-for="item in options4"
                                        :key="item.zhiweiId"
                                        :label="item.zhiweiName"
                                        :value="item.zhiweiName">
                                </el-option>
                            </el-select>
                        </template>
                    </el-col>
                </el-form-item>

                <el-form-item label="基本工资" prop='saJiben' required>
                    <template>
                        <el-select v-model="mymodel.saJiben" placeholder="请选择">
                            <el-option
                                    v-for="item in options1"
                                    :key="item.value"
                                    :label="item.label"
                                    :value="item.value">
                            </el-option>
                        </el-select>
                    </template>
                </el-form-item>
                <el-form-item prop='saJiangjin' label="奖金:" >
                    <el-col :span="15">
                        <el-input type="string" v-model="mymodel.saJiangjin"></el-input>
                    </el-col>
                </el-form-item>
                <el-form-item prop='saFakuan' label="罚款:" >
                    <el-col :span="15">
                        <el-input type="string" v-model="mymodel.saFakuan"></el-input>
                    </el-col>
                </el-form-item>
                <el-form-item prop='saZhuangtai' label="状态:" required>
                    <el-radio-group v-model="mymodel.saZhuangtai">
                        <el-radio-button label="已发">已发</el-radio-button>
                        <el-radio-button label="未发">未发</el-radio-button>
                    </el-radio-group>
                </el-form-item>
                <%--截取日期：value-format--%>
                <el-form-item prop='saTime' label="发放日期:" required>
                    <el-date-picker
                            v-model="mymodel.saTime"
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
                <el-form-item label="员工编号" prop='userId' >
                    <el-col :span="15">
                        <el-input type="string" v-model="mymodel.userId"></el-input>
                    </el-col>
                </el-form-item>

                <el-form-item label="员工姓名" prop='userName' >
                    <el-col :span="15">
                        <el-input type="string" v-model="mymodel.userName"></el-input>
                    </el-col>
                </el-form-item>

                <el-form-item label="合同性质" prop="xingzhi">
                    <el-col :span="15">
                    <template>
                        <el-select v-model="mymodel.xingzhi" placeholder="请选择">
                            <el-option
                                    v-for="item in options2"
                                    :key="item.value"
                                    :label="item.label"
                                    :value="item.value">
                            </el-option>
                        </el-select>
                    </template>
                    </el-col>
                </el-form-item>

                <el-form-item label="所属部门" prop="bumenName">
                    <el-col :span="15">
                        <template>
                            <el-select v-model="mymodel.bumenName" placeholder="请选择">
                                <el-option
                                        v-for="item in options3"
                                        :key="item.bmId"
                                        :label="item.bmName"
                                        :value="item.bmName">
                                </el-option>
                            </el-select>
                        </template>
                    </el-col>
                </el-form-item>

                <el-form-item label="职称" prop='bumen' >
                    <el-col :span="15">
                        <template>
                            <el-select v-model="mymodel.bumen" placeholder="请选择">
                                <el-option
                                        v-for="item in options4"
                                        :key="item.zhiweiId"
                                        :label="item.zhiweiName"
                                        :value="item.zhiweiName">
                                </el-option>
                            </el-select>
                        </template>
                    </el-col>
                </el-form-item>

                <el-form-item label="基本工资" prop='saJiben' >
                    <template>
                        <el-select v-model="mymodel.saJiben" placeholder="请选择">
                            <el-option
                                    v-for="item in options1"
                                    :key="item.value"
                                    :label="item.label"
                                    :value="item.value">
                            </el-option>
                        </el-select>
                    </template>
                </el-form-item>

                <el-form-item prop='saJiangjin' label="奖金:">
                    <el-col :span="15">
                        <el-input type="string" v-model="mymodel.saJiangjin"></el-input>
                    </el-col>
                </el-form-item>
                <el-form-item prop='saFakuan' label="罚款:">
                    <el-col :span="15">
                        <el-input type="string" v-model="mymodel.saFakuan"></el-input>
                    </el-col>
                </el-form-item>
                <el-form-item prop='saZhuangtai' label="状态:" >
                    <el-radio-group v-model="mymodel.saZhuangtai">
                        <el-radio-button label="已发">已发</el-radio-button>
                        <el-radio-button label="未发">未发</el-radio-button>
                    </el-radio-group>
                </el-form-item>

                <el-form-item prop='saTime' label="发放日期:">
                    <el-date-picker
                            v-model="mymodel.saTime"
                            align="right"
                            type="date"
                            value-format="yyyy-MM-dd"
                            placeholder="选择日期"
                            :picker-options="pickerOptions">
                    </el-date-picker>
                </el-form-item>

                <el-form-item class="text_right">
                    <el-button type="primary" @click='onSubmitEdit("myformedit")'>保 存</el-button>
                    <el-button @click="dialogEdit.show = false">取 消</el-button>
                </el-form-item>

            </el-form>

        </el-dialog>
    </div>

</div>

<!--1 引入vue-->
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
                options1: [{
                    value: '2000',
                    label: '2000'
                }, {
                    value: '4000',
                    label: '4000'
                }, {
                    value: '6000',
                    label: '6000'
                }, {
                    value: '7500',
                    label: '7500'
                }, {
                    value: '9000',
                    label: '9000'
                },
                    {
                        value: '12000',
                        label: '12000'
                    }
                ],
                options2: [{
                    value: '劳务合同',
                    label: '劳务合同'
                }, {
                    value: '劳动合同',
                    label: '劳动合同'
                },
                ],
                options3: [],
                options4: [],
                //定义模型，与表单匹配
                mymodel:{
                    saId: '',
                    userId:'',
                    userName:'',
                    saJiben: '',
                    saShiye:'',
                    saYangliao:'',
                    saShenyu:'',
                    saGongshang:'',
                    saYiliao:'',
                    saJiangjin:'',
                    saFakuan:'',
                    saZongshu:'',
                    saTime:'',
                    saZhuangtai:'',
                    saNashui:'',
                    xingzhi:'',
                    bumen:'',
                    shifa:'',
                    bumenName:'',
                    saGongjijin:'',
                },
                //设置一个变量，保存哪行数据被选中了
                selectItemIndex:-1,
                value1: '',
                value2: '',
            }

        },
        //生命周期函数
        mounted: function () {
            //   初始化表格

            this.initTable();
            this.initTable2();
            this.initTable3();
        },
        methods: {
            //初始化表格
            initTable:function(){
                //通过axios调用服务器json服务
                axios.get("/salary").then(res => {
                    this.tableData = res.data;
                });
                let sum=0;
                sum =this.tableData.shifa

            },

            initTable2:function(){
                //通过axios调用服务器json服务
                axios.get("/bm").then(res => {
                    this.options3 = res.data;
                });
            },
            initTable3:function(){
                //通过axios调用服务器json服务
                axios.get("/zhiwei").then(res => {
                    this.options4 = res.data;
                });

            },

            //获取级联选择器的子值
            handleChange:function (value) {
                this.value1=this.$refs["revalue"].getCheckedNodes()[0].label;
            },
            onAdd:function () {
                this.mymodel = {
                    saId: '',
                    userId:'',
                    userName:'',
                    saJiben: '0',
                    saShiye:'0',
                    saYangliao:'0',
                    saShenyu:'0',
                    saGongshang:'0',
                    saYiliao:'0',
                    saJiangjin:'0',
                    saFakuan:'0',
                    saZongshu:'0',
                    saTime:'',
                    saZhuangtai:'',
                    saNashui:'',
                    xingzhi:'',
                    bumen:'',
                    shifa:'',
                    bumenName:'',
                    saGongjijin:'0',
                };

                //alert("注册用户");
                this.dialog.title="添加员工工资信息";
                this.dialog.show = true;},
            onSubmitAdd:function (form) {
                var sum,x,y;
                x=this.mymodel.xingzhi;
                if(x =='劳动合同'){
                    y=parseFloat(this.mymodel.saJiben);
                    this.mymodel.saYiliao=y*0.02;
                    this.mymodel.saYangliao=y*0.08;
                    this.mymodel.saShiye=y*0.01;
                    this.mymodel.saGongjijin=y*0.03;
                    this.mymodel.saZongshu=parseFloat(this.mymodel.saShiye) +parseFloat(this.mymodel.saYiliao)+
                        parseFloat(this.mymodel.saJiangjin)+parseFloat(this.mymodel.saFakuan)+parseFloat(this.mymodel.saJiben);
                    sum=parseFloat(this.mymodel.saZongshu);
                    if(sum<5000){
                        this.mymodel.saNashui=0;
                        this.mymodel.shifa=sum;
                    }
                    else if(sum<8000 && sum>5000) {
                        this.mymodel.saNashui=(sum-5000)*0.03;
                        sum=sum-(sum-5000)*0.03;
                        this.mymodel.shifa=sum;
                    }
                    else if(sum>8000 && sum<17000){
                        this.mymodel.saNashui = (sum-8000)*0.1+240;
                        sum=sum-(sum-8000)*0.1-240;
                        this.mymodel.shifa=sum;
                    }
                }
                if(x =='劳务合同'){
                    this.mymodel.saYiliao=0;
                    this.mymodel.saYangliao=0;
                    this.mymodel.saShiye=0;
                    this.mymodel.saGongjijin=0;
                    this.mymodel.saZongshu=parseFloat(this.mymodel.saShiye) +parseFloat(this.mymodel.saYiliao)+
                        parseFloat(this.mymodel.saJiangjin)+parseFloat(this.mymodel.saFakuan)+parseFloat(this.mymodel.saJiben);
                    sum=parseFloat(this.mymodel.saZongshu);

                    if(sum>800){
                        this.mymodel.saNashui=(sum-800)*0.2;
                        sum=sum-(sum-800)*0.2;
                        this.mymodel.shifa = sum;
                    }
                    else{
                        this.mymodel.saNashui=0;
                        this.mymodel.shifa=sum;
                    }
                }
                axios.post("/salary", this.mymodel).then(res => {

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
                    saId: this.tableData[index].saId,
                    userId: this.tableData[index].userId,
                    userName: this.tableData[index].userName,
                    saJiben: this.tableData[index].saJiben,
                    saShiye:this.tableData[index].saShiye,
                    saYangliao:this.tableData[index].saYangliao,
                    saShenyu:'0',
                    saGongshang:'0',
                    saYiliao:this.tableData[index].saYiliao,
                    saJiangjin:this.tableData[index].saJiangjin,
                    saFakuan:this.tableData[index].saFakuan,
                    saZongshu:this.tableData[index].saZongshu,
                    saZhuangtai:this.tableData[index].saZhuangtai,
                    saTime:this.tableData[index].saTime,
                    bumen:this.tableData[index].bumen,
                    xingzhi:this.tableData[index].xingzhi,
                    saNashui:this.tableData[index].saNashui,
                    shifa:this.tableData[index].shifa,
                    bumenName:this.tableData[index].bumenName,
                    saGongjijin:this.tableData[index].saGongjijin
                };

                //保存被选中的行 索引值
                this.selectItemIndex = index;

                //设置对话框可见
                this.dialogEdit.title = '修改员工工资信息';
                this.dialogEdit.show = true;

            },
            addClass({row,cilumn,rowIndex,columnIndex}){
                if(columnIndex == 1){
                    if(row.saZhuangtai == '未发'){
                        return 'background:red';
                    }
                }
            },
            onSubmitEdit:function (form) {
                var sum,x,y;
                x=this.mymodel.xingzhi;
                if(x =='劳动合同'){
                    y=parseFloat(this.mymodel.saJiben);
                    this.mymodel.saYiliao=y*0.02;
                    this.mymodel.saYangliao=y*0.08;
                    this.mymodel.saShiye=y*0.01;
                    this.mymodel.saGongjijin=y*0.03;
                    this.mymodel.saZongshu=parseFloat(this.mymodel.saShiye) +parseFloat(this.mymodel.saYiliao)+
                        parseFloat(this.mymodel.saJiangjin)+parseFloat(this.mymodel.saFakuan)+parseFloat(this.mymodel.saJiben);
                    sum=parseFloat(this.mymodel.saZongshu);
                    if(sum<5000){
                        this.mymodel.saNashui=0;
                        this.mymodel.shifa=sum;
                    }
                    else if(sum<8000 && sum>5000) {
                        this.mymodel.saNashui=(sum-5000)*0.03;
                        sum=sum-(sum-5000)*0.03;
                        this.mymodel.shifa=sum;
                    }
                    else if(sum>8000 && sum<17000){
                        this.mymodel.saNashui = (sum-8000)*0.1+240;
                        sum=sum-(sum-8000)*0.1-240;
                        this.mymodel.shifa=sum;
                    }
                }
                if(x =='劳务合同'){
                    this.mymodel.saYiliao=0;
                    this.mymodel.saYangliao=0;
                    this.mymodel.saShiye=0;
                    this.mymodel.saGongjijin=0;
                    this.mymodel.saZongshu=parseFloat(this.mymodel.saShiye) +parseFloat(this.mymodel.saYiliao)+
                        parseFloat(this.mymodel.saJiangjin)+parseFloat(this.mymodel.saFakuan)+parseFloat(this.mymodel.saJiben);
                    sum=parseFloat(this.mymodel.saZongshu);

                    if(sum>800){
                        this.mymodel.saNashui=(sum-800)*0.2;
                        sum=sum-(sum-800)*0.2;
                        this.mymodel.shifa = sum;
                    }
                    else{
                        this.mymodel.saNashui=0;
                        this.mymodel.shifa=sum;
                    }
                }
                //保存到数据库
                axios.put("/salary/", this.mymodel).then(res =>{
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
            //分页
            handleSizeChange(val) {
                this.pagesize=val;
            },
            handleCurrentChange(val) {
                this.currpage=val;
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
                    axios.delete("/salary/" + this.tableData[index].saId).then(res => {
                        if (res.data == 200){
                            this.$message("删除成功");
                            // 删除table起始下标为1，长度为1的一个值
                            this.tableData.splice(index, 1);
                        }
                    });
                }).catch(() => {

                });

            },
            getSummaries(param) {
                const { columns, data } = param;
                const sums = [];
                columns.forEach((column, index) => {
                    if (index === 0) {
                        sums[index] = '总价';
                        return;
                    }
                    const values = data.map(item => Number(item[column.property]));
                    if (
                        column.property == "saJiben" ||
                        column.property == "saShiye" ||
                        column.property == "saGongjijin" ||
                        column.property == "saYangliao" ||
                        column.property == "saShenyu" ||
                        column.property == "saGongshang" ||
                        column.property == "saYiliao" ||
                        column.property == "saJiangjin" ||
                        column.property == "saFakuan" ||
                        column.property == "saNashui" ||
                        column.property == "saZongshu" ||
                        column.property == "shifa"
                    ) {
                        sums[index] = values.reduce((prev, curr) => {
                            const value = Number(curr);
                            if (!isNaN(value)) {
                                return prev + curr;
                            } else {
                                return prev;
                            }
                        }, 0);
                        sums[index];
                    } else {
                    }
                });
                return sums;
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
