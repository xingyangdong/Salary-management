<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>绩效管理</title>
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
                        <font size="6pt">员工绩效信息&nbsp;&nbsp;&nbsp;&nbsp;</font>
                        <el-button type="primary" size="mini" @click="onAdd()">添加</el-button>
                    </el-col>

                    <el-col :span="10">
                        <el-input v-model="search"  placeholder="请输入搜索内容"></el-input>
                    </el-col>
                    <i title="导出员工绩效信息" >
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
                            prop="name"
                            label="姓名"
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
                            prop="year"
                            label="年份"
                            sortable
                            width="120">
                    </el-table-column>
                    <el-table-column
                            prop="jidu"
                            label="季度"
                            sortable
                            width="120">
                    </el-table-column>
                    <el-table-column
                            prop="pingji"
                            label="评绩"
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
                //设置一个变量，保存哪行数据被选中了
                selectItemIndex:-1,
                //选择时间
                value1: '',
                value2: '',
            }

        },
        //生命周期函数
        mounted: function () {
            //   初始化表格
            this.initTable();
        },
        methods: {
            //变换颜色
            addClass({row,cilumn,rowIndex,columnIndex}){
                if(columnIndex == 5){
                    if(row.pingji == 'A'){
                        return 'background:red';
                    }
                    if(row.pingji == 'B'){
                        return 'background:yellow';
                    }
                    else{
                        return 'background:#999999';
                    }
                }
            },
            //初始化表格
            initTable:function(){
                let userInfo = JSON.parse(localStorage.getItem('userInfo'));
                //通过axios调用服务器json服务
                axios.get("/jixiao/"+ userInfo.userId).then(res => {
                    this.tableData = res.data;
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
