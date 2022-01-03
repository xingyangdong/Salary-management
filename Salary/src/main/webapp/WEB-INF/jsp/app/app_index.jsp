<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>薪酬管理系统</title>
  <!--2.1 引入element ui-->
  <link rel="stylesheet"
        href="../static/element-ui/index.css">
  <!--在element-UI中使用fontawesome-->
  <link href="../static/fontawesome/css/all.min.css"
        rel="stylesheet">
  <link href="../static/Font-Awesome-3.2.1/css/font-awesome.css"
        rel="stylesheet">
  <link  href="../static/font-icon/all.css" rel="stylesheet">

  <style>
    /*在element-UI中使用fontawesome*/
    [class^="el-icon-fa"], [class*=" el-icon-fa"] {
      display:inline-block;
      font-family:"FontAwesome"!important;
      font-style:normal;
      font-weight:normal;
      line-height:1;
      -webkit-font-smoothing:antialiased;
      -moz-osx-font-smoothing:grayscale
    }
    html, body {
      margin: 0;
      padding: 0;
      height: 100%;
      font-size: 14px;
      /* html默认高度只有一行, 需要显式声明高度*/
    }

    /*布局开始*/
    .body-container {
      box-sizing: border-box;
      height: 100vh;
      width: 1600px;
      margin: auto;
      padding: 0;
      border-style: solid;
      border-color: #eee;
      border-width: 0;
    }

    .el-header {
      box-sizing: border-box;
      margin: 0;
      padding: 0;
      border: 0;
      background-color: rgb(48, 65, 86);
      color: rgb(191, 203, 217);
      text-align: right;
      line-height: 56px;
    }

    .main-container {
      box-sizing: border-box;
      height: calc(100% - 56px);
      width: 100%;
      margin: 0;
      padding: 0;
      border: 0;
    }

    .el-aside {
      margin: 0;
      padding: 0;
      height: 100%;
      box-sizing: border-box;
      border: 0;
    }

    .el-main {
      box-sizing: border-box;
      margin: 0;
      padding: 10px 0 0 10px;
      height: 100%;
      width: calc(100% - 230px);
      border-right: 1px solid #eee;
    }

    /*布局结束*/
    /*菜单导航开始*/
    /*logo*/
    .logo-title {
      width: 230px;
      height: 56px;
      line-height: 56px;
      text-align: center;
      background-color: rgb(48, 65, 86);
      color: rgb(191, 203, 217);
    }

    .el-menu {
      margin: 0;
      padding: 0;
      width: 100%;
      height: 100%;
      border: 0;
      background-color: #304156
    }

    .el-submenu {
      margin: 0;
      padding: 0;
      border: 0;
    }

    /*打开,选中子菜单*/
    .el-submenu.is-opened, .el-submenu.is-active {
      background-color: #000000;
    !important /*!important使得优先级最大*/
    }

    /*鼠标滑过子菜单标题*/
    .el-submenu__title:hover {
      background-color: #000000;
    !important /*!important使得优先级最大*/
    }

    /*鼠标滑过菜单项*/
    .el-menu-item:hover {
      cursor: pointer;
      background-color: #009688;
    }

    /*选中激活菜单项*/
    .el-menu-item.is-active {
      cursor: pointer;
      background-color: #009688;
    }

    /*菜单导航结束*/
    /*内容框架定义*/
    .mx-iframe {
      width: 100%;
      height: 100%;
    }

    /*内容框架定义结束*/
    /*定义标签页*/
    .el-tabs {
      width: 100%;
      height: 100%;
    }

    .el-tabs__content {
      width: calc(100% - 10px);
      height: calc(100% - 61px);
    }

    .el-tab-pane {
      height: 100%;
      overflow: auto;
    }
  </style>
</head>
<body>
<div id="app">
  <el-container class="body-container">
    <el-header height="56px">
      <div id="j" style="width:100%;box-sizing:border-box;margin: 0;padding: 0">
        <el-row :gutter="20">
          <el-col :span="5" style="color: white;text-align: center;font-size: 20pt">
            薪酬管理系统&nbsp;&nbsp;
            <input id="button1" type="button" value="签到" @click="daka" />
          </el-col>
          <el-col :span="16">&nbsp;</el-col>
          <el-col :span="3">
             <span style="color: white;text-align: right; font-size: 12px; padding-right:10px;">
               <el-dropdown :hide-on-click="false" style="color: white">
                <i class="fa fa-user-circle"></i>
                {{ userInfo.userName }}&nbsp;&nbsp;
                 <el-dropdown-menu slot="dropdown">
                     <el-dropdown-item @click.native="pswEdit">修改密码</el-dropdown-item>
                  </el-dropdown-menu>
              </el-dropdown>
              <el-dropdown :hide-on-click="false" style="color: white">
                  <i class="fa fa-user-secret"></i>&nbsp;&nbsp;
                  <el-dropdown-menu slot="dropdown">
                      <el-dropdown-item @click.native="a">暗青色</el-dropdown-item>
                      <el-dropdown-item @click.native="b">暗紫色</el-dropdown-item>
                      <el-dropdown-item @click.native="c">蓝色</el-dropdown-item>
                  </el-dropdown-menu>
              </el-dropdown>
                <i title="退出系统" @click="logout" style="cursor: pointer" class="fa fa-sign-out-alt"></i>
            </span>
          </el-col>
        </el-row>
      </div>
    </el-header>
    <el-container class="main-container"
                  @mouseenter.native="collapseOpen"
                  @mouseleave.native="collapseClose">
      <!--左侧导航-->
      <el-aside width="auto" >

        <el-menu text-color="back"
                 active-text-color="#00FFFF"
                 background-color="#e0dfdf"
                 :default-active="activeMenuItem">
          <template v-for="(menu, menuIndex) in menuList" style="font-size: 100pt">
            <el-submenu :index="menu.menuId">
              <template slot="title"><i :class="menu.menuIcon"></i>&nbsp;&nbsp;{{menu.menuName}}</template>
              <template v-for="(menuItem, menuItemIndex) in menu.menuItemList">
                <el-menu-item :index="menuItem.menuItemId" @click="menuItemClick(menu,menuItem)"><i :class="menuItem.menuItemIcon"></i>&nbsp;&nbsp;{{menuItem.menuItemName}}</el-menu-item>
              </template>
            </el-submenu>
          </template>
        </el-menu>
      </el-aside>

      <el-main v-if="mytabs.length<=0">
        <iframe name="mxiframe" id="mxiframe1" class="mx-iframe"
                src="/app/home"
                frameborder="0"
                align="left"
                scrolling="auto">
          <p>您的浏览器不支持iframe标签,请换成chrome或firefox浏览器使用本应用</p>
        </iframe>
      </el-main>

      <el-main v-else-if="mytabs.length>0">
        <el-tabs v-model="activeTab"
                 type="card"
                 closable
                 @tab-click="clickTab"
                 @tab-remove="removeTab">
          <el-tab-pane v-for="(menuItem, index) in mytabs"
                       @click=""
                       :key="menuItem.menuItemId"
                       :label="menuItem.menuItemName"
                       :name="menuItem.menuItemId">
            <iframe name="mxiframe" id="mxiframe2" class="mx-iframe"
                    :src="menuItem.menuItemUrl"
                    frameborder="0"
                    align="left"
                    scrolling="auto">
              <p>您的浏览器不支持iframe标签,请换成chrome或firefox浏览器使用本应用</p>
            </iframe>
          </el-tab-pane>
        </el-tabs>
      </el-main>
    </el-container>
  </el-container>
  <el-dialog
          width="40%"
          :title="dialogEdit.title"
          :visible.sync="dialogEdit.show"
          :close-on-click-modal='false'
          :close-on-press-escape='false'
          :modal-append-to-body='false'>
     <el-form
          ref="myformedit"
          :model="mymodel"
          :rules="rememberrule"
          label-width="150px"
          style="margin:10px;width:auto;">
    <el-form-item  prop='userId' hidden label="帐号:">
      <el-col :span="15">
        <el-input type="string" v-model="mymodel.userId" value="{{userInfo.userId}}"></el-input>
      </el-col>
    </el-form-item>

    <el-form-item required prop='mobile' label="手机号码:" >
      <el-col :span="15">
        <el-input type="string" v-model="mymodel.mobile"></el-input>
      </el-col>
    </el-form-item>
    <el-form-item prop='currentPassword' label="密码:">
      <el-col :span="15">
        <el-input type="password" v-model="mymodel.currentPassword"></el-input>
      </el-col>
    </el-form-item>
    <el-form-item required prop='currentPassword2' label="重复密码:">
      <el-col :span="15">
        <el-input type="password" v-model="mymodel.currentPassword2"></el-input>
      </el-col>
    </el-form-item>

    <el-form-item class="text_right">
      <el-button type="primary" @click='onSubmitEdit("myformedit")'>保 存</el-button>
      <el-button @click="dialogEdit.show = false">取 消</el-button>
    </el-form-item>

  </el-form>
  </el-dialog>

</div>
<!--1 引入vue-->
<script src="../static/vue/vue.min.js"></script>
<!--2.2 引入element ui-->
<script src="../static/element-ui/index.js"></script>
<!--3 引入axios-->
<script src="../static/axios/axios.min.js"></script>
<script src="../static/mx-config.js"></script>
<script>
  const app = new Vue({
    el: "#app",
    data: function () {
      let validatePwd2 = (rule, value, callback) => {
        if (value === "") {
          callback(new Error("请输入确认密码"));
        } else if (value !== this.mymodel.currentPassword) {
          callback(new Error("两次输入密码不一致！"));
        } else {
          // 每个分支必须有回调函数
          // 否则this.$refs[myform].validate()不起作用
          callback();
        }
      }
      return {
        mymodel:{
          userId:'',
          mobile:'',
          currentPassword:'',
          currentPassword2:'',
          userName:''
        },
        tableData:[],
        rememberrule: {
          userName: [
            {required: true, message: '请输入帐号', trigger: 'blur'},
            {min: 8, max: 8, message: '长度为8个字符', trigger: 'blur'}
          ],
          mobile: [
            {required: true, message: '请输入手机号', trigger: 'blur'},
            {min: 11, max: 11, message: '长度为11个数字', trigger: 'blur'}
          ],
          currentPassword: [
            {required: true, message: '请输入密码', trigger: 'blur'},
            {min: 1, max: 18, message: '长度在 1 到 18 个字符', trigger: 'blur'}
          ],
          currentPassword2: [
            { validator:validatePwd2,trigger: 'blur'}
          ]
        },
        dialogEdit:{
          title:'忘记密码',
          show: false
        },
        collapseBtnClick: false,
        isCollapse: true,
        mymodel:{
          userName: '',
          userId:'',
          zhuangtai:'',
          dakaTime: '',
          beizhu:'',
          mobile:''
        },
        menuList: [
          {
            menuId: '1',
            menuIcon: 'iconfont icon-gongzi',
            menuCode: '工资',
            menuName: '工资',
            menuItemList: [
              {
                menuItemId: '1-1',
                menuItemIcon: 'icon-eye-open',
                menuItemCode: '工资',
                menuItemName: '工资查看',
                menuItemUrl: '/seesalarylist'
              },
              {
                menuItemId: '1-2',
                menuItemIcon: 'iconfont icon-shensu',
                menuItemCode: '工资',
                menuItemName: '工资申诉',
                menuItemUrl: '/shensulist'
              }
            ]
          },
          {
            menuId: '2',
            menuIcon: 'iconfont icon-chuqinfenxi',
            menuCode: '绩效',
            menuName: '绩效',
            menuItemList: [
              {
                menuItemId: '2-1',
                menuItemIcon: 'icon-calendar',
                menuItemCode: '绩效',
                menuItemName: '考勤查看',
                menuItemUrl: '/appchuqinlist'
              },
              {
                menuItemId: '2-2',
                menuItemIcon: 'icon-sort-by-order',
                menuItemCode: '绩效',
                menuItemName: '绩效查看',
                menuItemUrl: '/seejixiaolist'
              },
            ]
          },
          {
            menuId: '3',
            menuIcon: 'icon-user',
            menuCode: '个人',
            menuName: '个人',
            menuItemList: [
              {
                menuItemId: '3-1',
                menuItemIcon: 'iconfont icon-gerenxinxi',
                menuItemCode: '个人信息',
                menuItemName: '工作日程',
                menuItemUrl: '/personal'
              }]
          },
        ],
        mytabs: [],
        //当前标签
        activeTab: '1',
        //激活的菜单项
        activeMenuItem: "1,1",
        userInfo: {
          userId: '',
          userLoginId: '',
          currentPassword: '',
          userName: '',
          mobile:''
        },
        cishu:''
      }
    },
    mounted() {
      this.userInfo = JSON.parse(localStorage.getItem('userInfo'));
      this.cishu = JSON.parse(localStorage.getItem('cishu'));
      const sum=1;
      this.xianzhi();
    },
    methods: {
      //点击导航菜单项,添加一个标签,加载指定的url页面
      menuItemClick: function (menu,menuItem) {
        let isNewMenu = true;
        //循环已有的标签,判断该菜单是否已经打开过
        for (let i = 0; i < this.mytabs.length; i++) {
          let item = this.mytabs[i];
          if (item.menuItemId == menuItem.menuItemId) {
            isNewMenu = false;
            //通过标签名,激活已打开的标签页
            this.activeTab = item.menuItemId
            break;
          }
        }
        if (isNewMenu) {
          //打开新标签页
          this.addTab(menu, menuItem)
        }
      },
      initTable:function(){
        //通过axios调用服务器json服务
        axios.get("/user/"+this.mymodel.userId).then(res => {
          this.tableData = res.data;
        });
      },
      //修改密码
      pswEdit:function () {
        this.dialogEdit.title = '修改密码';
        this.dialogEdit.show = true;
      },
      onSubmitEdit:function () {
        this.mymodel.userName=this.userInfo.userName;
          if (this.mymodel.mobile == this.userInfo.mobile) {
            axios.put("/user", this.mymodel).then(res => {
              this.$message({
                message: "修改成功！",
                type: "success"
              });
              this.tableData.splice(this.userId, 1, res.data);
            });
            this.dialogEdit.show = false;
          } else {
            this.$message({
              message: "信息输入有误！",
              type: "error"
            });
      }
          },
      //添加新标签
      addTab(menu, menuItem) {
        //限定标签页长度
        if (this.mytabs.length >= 5) {
          this.mytabs.shift()
        }
        this.mytabs.push(menuItem);
        this.activeTab = menuItem.menuItemId;
      },
      //移除标签
      removeTab(targetId) {
        let tabs = this.mytabs;
        let activeMenuItemId = this.activeTab;
        if (activeMenuItemId === targetId) {
          tabs.forEach((tab, index) => {
            if (tab.menuItemId === targetId) {
              let nextTab = tabs[index + 1] || tabs[index - 1];
              if (nextTab) {
                activeMenuItemId = nextTab.menuItemId;
              }
            }
          });
        }
        this.activeTab = activeMenuItemId;
        this.mytabs = tabs.filter(tab => tab.menuItemId !== targetId);
      },
      clickTab: function (tabItem) {
        //tabItem为回调参数
        this.activeMenuItem = tabItem.name;
      },
      logout: function () {
        axios.get("/logout").then(res =>{
          console.log(res.data)
          localStorage.removeItem('userInfo');
          window.location.href = '/login';
        });
      },

      //设置打卡时间限制
      xianzhi:function () {
        let dat = "08:00:00";
        let dat2 = "16:30:00";
        //.split()分割字符串  年月日  时分秒
        const beforeHours = dat.split(":")[0];
        const beforeMinutes = dat.split(":")[1];
        const beforeSeconds = dat.split(":")[2];
        const beforeHours2 = dat2.split(":")[0];
        const beforeMinutes2 = dat2.split(":")[1];
        const beforeSeconds2 = dat2.split(":")[2];

        const myDate = new Date();
        myDate.getHours(); //获取当前小时数(0-23)
        myDate.getMinutes(); //获取当前分钟数(0-59)
        myDate.getSeconds(); //获取当前秒数(0-59)
        console.log(myDate.getHours())
        const  getDifference = (myDate.getHours() - beforeHours )*60*60
                +(myDate.getMinutes() - beforeMinutes  )*60
                +(myDate.getSeconds() - beforeSeconds );
        const  getDifference2 = (beforeHours2-beforeHours)*60*60
                +(beforeMinutes2-beforeMinutes)*60
                +(beforeSeconds2-beforeSeconds);
        if(getDifference>0 && getDifference<getDifference2){
          document.getElementById('button1').disabled=false;
        }else{
          document.getElementById('button1').disabled=true;
        }

      },
      //添加打卡记录
      daka: function () {
        var c;
          document.getElementById('button1').disabled=true;//页面加载后禁用按钮
          setTimeout(function(){
            document.getElementById('button1').disabled=false;
          },7200*6);//24小时后启用
          var a = new Date().toLocaleString();
          var d = '09:30:00';
          console.log(a);
          console.log(d);
          if (a > d) {
            c = '迟到';
            console.log(c);
            alert('您迟到了!');
          }
          else {
            c = '已打卡';
            console.log(c);
            alert('打卡成功!');
          }
        let s = JSON.parse(localStorage.getItem('userInfo'));
        var aData = new Date().toLocaleString();
        this.mymodel={
          zhuangtai:c,
          userId:s.userId,
          userName:s.userName,
          dakaTime:aData,
          beizhu:''
        }

        axios.post("/chuqin/",this.mymodel).then(res => {
          this.tableData.push(res.data);
        });

      },
      collapseStatus() {
        this.collapseBtnClick = this.isCollapse;
        this.isCollapse = !this.isCollapse;
      },
      collapseOpen() {
        if (this.collapseBtnClick) return;
        this.isCollapse = false;
      },
      collapseClose() {
        if (this.collapseBtnClick) return;
        this.isCollapse = true;
      },
      a:function () {
        document.getElementById('j').style.backgroundColor="#008B8B";

      },
      b:function () {
        document.getElementById('j').style.backgroundColor="#DA70D6";

      },
      c:function () {
        document.getElementById('j').style.backgroundColor="#00BFFF";
      },

    }
  });
</script>
</body>
</html>