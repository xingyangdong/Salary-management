<%@ page import="java.net.URLEncoder" %>
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
                </el-col>

                <el-col :span="10">
                    <el-input v-model="search"  placeholder="请输入搜索内容"></el-input>
                </el-col>
                <i title="导出工资信息" >
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
                    show-summary
                    :summary-method="getSummaries"
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
                        prop="bumen"
                        label="职称"
                        sortable
                        fixed
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
                        prop="saShenyu "
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
            </el-table>
            <a href="${pageContext.request.contextPath }/download?filename=<%=URLEncoder.encode("附件1-公司工资机制.xlsx", "UTF-8")%>">
                附件1-公司工资机制
            </a>
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
                //定义模型，与表单匹配
                //设置一个变量，保存哪行数据被选中了
                selectItemIndex:-1,
                value1: '',
                value2: '',
                userId:'',
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
                let userInfo = JSON.parse(localStorage.getItem('userInfo'));

                //通过axios调用服务器json服务
                axios.get("/seesalary/"+ userInfo.userId).then(res => {
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
