<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>出勤管理</title>
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
                    <font size="6pt">出勤管理&nbsp;&nbsp;&nbsp;&nbsp;</font>
                </el-col>

                <el-col :span="10">
                    <el-input v-model="search"  placeholder="请输入搜索内容"></el-input>
                </el-col>
            </el-row>

        </div>
        <div class="el-divider">
            <el-divider></el-divider>
        </div>
        <div align="center">
            <!--      v-if=v-if"tableData.length > 0"-->
            <el-table
                    :cell-style="addClass"
                    id="table1"
                    :data="tables.slice((currpage-1)*pagesize,currpage*pagesize)"
                    stripe
                    border
                    @row-dblclick="dbClickFn">
                <el-table-column
                        type="selection"
                        prop=""
                        fixed
                        width="50">
                </el-table-column>
                <el-table-column
                        prop="zhuangtai"
                        label="状态"
                        sortable
                        fixed
                        width="80px"
                        heigt="300px">
                </el-table-column>
                <el-table-column
                        prop="userName"
                        label="姓名"
                        sortable
                        fixed
                        width="300px">
                </el-table-column>

                <el-table-column
                        prop="userId"
                        label="员工账号"
                        sortable
                        fixed
                        width="300px">
                </el-table-column>
                <el-table-column
                        prop="dakaTime"
                        label="打卡时间"
                        sortable
                        fixed
                        width="300px">
                </el-table-column>
                <el-table-column
                        prop="beizhu"
                        label="备注"
                        sortable
                        fixed
                        width="400px">
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
                tableData:[
                ],
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
            addClass({row,cilumn,rowIndex,columnIndex}){
              if(columnIndex == 1){
                  if(row.zhuangtai == '迟到'){
                      return 'background:red';
                  }
              }
            },


            //初始化表格
            initTable:function(){

                //通过axios调用服务器json服务
                axios.get("/chuqin/").then(res => {
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
