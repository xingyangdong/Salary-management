<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>用户管理</title>
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
          <font size="6pt">用户列表&nbsp;&nbsp;&nbsp;&nbsp;</font>
        <el-button type="primary" size="mini" @click="onAdd()">添加</el-button>
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
                label=""
                width="50">
        </el-table-column>
        <el-table-column
                prop="userId"
                label="账号"
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
                prop="userType"
                label="用户类型"
                sortable
                align="center"
                width="200">
          <template slot-scope="scope">
            <span v-if="scope.row.userType == '0'">系统管理员</span>
            <span v-if="scope.row.userType == '1'">普通账号</span>
          </template>
        </el-table-column>
        <el-table-column
                prop="email"
                sortable
                label="邮箱"
                width="200">
        </el-table-column>
        <el-table-column
                prop="mobile"
                sortable
                label="电话号码"
                align="center"
                width="200">
        </el-table-column>
        <el-table-column
                prop="currentStatus"
                label="状态"
                sortable
                align="center"
                width="120">
          <template slot-scope="scope">
            <span v-if="scope.row.currentStatus == '0'">正常</span>
            <span v-if="scope.row.currentStatus == '1'">禁用</span>
          </template>
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
            :rules="myrule"
            :model="mymodel"
            :rules="myrules"
            label-width="150px"
            style="margin:10px;width:auto;">
      <el-form-item hidden prop='userId' label="ID:">
        <el-input type="string" v-model="mymodel.userId"></el-input>
      </el-form-item>
      <el-form-item label="姓名" required>
        <el-col :span="15">
          <el-form-item prop='userName'>
            <el-input type="string"  v-model="mymodel.userName"></el-input>
          </el-form-item>
        </el-col>
      </el-form-item>

      <el-form-item prop='userType' label="账号类型:" required>
        <!--使用label表示值-->
        <el-radio-group v-model="mymodel.userType">
          <el-radio-button label="0">系统管理员</el-radio-button>
          <el-radio-button label="1">普通账号</el-radio-button>
        </el-radio-group>
      </el-form-item>
      <el-form-item prop='mobile' label="手机号码:" required>
        <el-col :span="15">
          <el-input type="string" v-model="mymodel.mobile"></el-input>
        </el-col>
      </el-form-item>
      <el-form-item prop='email' label="电子邮箱:" required>
        <el-col :span="15">
          <el-input type="string" v-model="mymodel.email"></el-input>
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
            :rules="myrule"
            :model="mymodel"
            label-width="150px"
            style="margin:10px;width:auto;">
      <el-form-item  prop='userId' label="帐号:">
        <el-col :span="15">
           <el-input disabled type="string" v-model="mymodel.userId"></el-input>
        </el-col>
      </el-form-item>
      <!--如果是修改,则账号为只读-->
      <el-form-item prop='userType' label="账号类型:">
        <!--使用label表示值-->
        <el-radio-group v-model="mymodel.userType">
          <el-radio-button label="0">系统管理员</el-radio-button>
          <el-radio-button label="1">普通账号</el-radio-button>
        </el-radio-group>
      </el-form-item>
      <el-form-item prop='userName' label="姓名">
        <el-col :span="15">
          <el-form-item prop='userName'>
            <el-input type="string" v-model="mymodel.userName"></el-input>
          </el-form-item>
        </el-col>
      </el-form-item>
      <el-form-item prop='mobile' label="手机号码:">
        <el-col :span="15">
          <el-input type="string" v-model="mymodel.mobile"></el-input>
        </el-col>
      </el-form-item>
      <el-form-item prop='email' label="电子邮箱:">
        <el-col :span="15">
          <el-input type="string" v-model="mymodel.email"></el-input>
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
        dialogSuccess:{
          title:'注册成功',
          show:false
        },
        //定义模型，与表单匹配
        mymodel:{
          userName: '',
          currentPassword:'',
          currentPassword2:'',
          email: '',
          mobile:'',
          userType:'1',
          currentStatus:'0'
        },
        multipleSelection: [],
        //设置一个变量，保存哪行数据被选中了
        selectItemIndex:-1,
        //表单校验规则
        myrules: {
          userName: [
            {required: true, message: '请输入姓名', trigger: 'blur'},
            {min: 2, max: 20, message: '长度在 2 到 20 个字符', trigger: 'blur'}
          ],
          mobile: [
            {required: true, message: '请输入手机号', trigger: 'blur'},
            {min: 11, max: 11, message: '长度为11个数字', trigger: 'blur'}
          ],
        },
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
        axios.get("/user/").then(res => {
          this.tableData = res.data;
        });

      },

      //响应添加按钮
      onAdd:function () {

        //清空表单
        this.mymodel = {
          userId:'',
          userName: '',
          currentPassword:'123456',
          email: '',
          mobile:'',
          userType:'1',
          currentStatus:'0'
        };

        //alert("注册用户");
        this.dialog.title="添加用户";
        this.dialog.show = true;

      },
      //响应注册用户对话框 保存按钮
      onSubmitAdd:function (form) {
        //检查是否拿到了正确的需要验证的form（from是否通过验证）
        this.$refs[form].validate(valid => {
          if (!valid) {
            this.$message({
              message: "输入项有错误！",
              type: "error"
            });
            return false;
          } else {
            //检验成功
            //把表单数据提交给 后台数据库
            axios.post("/user", this.mymodel).then(res => {
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
          }
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
          userId:this.tableData[index].userId,
          userName: this.tableData[index].userName,
          email: this.tableData[index].email,
          mobile:this.tableData[index].mobile,
          userType:this.tableData[index].userType,
          currentStatus:this.tableData[index].currentStatus
        };
        //保存被选中的行 索引值
        this.selectItemIndex = index;
        //设置对话框可见
        this.dialogEdit.title = '修改用户信息';
        this.dialogEdit.show = true;

      },

      //响应修改对话框 保存按钮
      onSubmitEdit:function (form) {
        //保存到数据库
        axios.put("/user/", this.mymodel).then(res =>{
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
          axios.delete("/user/" + this.tableData[index].userId).then(res => {
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