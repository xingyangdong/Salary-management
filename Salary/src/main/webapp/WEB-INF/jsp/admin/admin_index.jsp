<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>薪酬系统管理控制台首页</title>
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
      <div id="j" style="width:100%;box-sizing:border-box;margin: 0;padding: 0;">
        <el-row :gutter="20">
          <el-col :span="5" style="color: white;text-align: center;font-size: large">
            薪酬系统管理控制台
          </el-col>
          <el-col :span="15">&nbsp;</el-col>
          <el-col :span="4" style="color: white">
            <span style="text-align: right; font-size: 12px; padding-right:10px;">
                <i class="fa fa-user-circle"></i>
                {{ userInfo.userName }}&nbsp;&nbsp;
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
      <el-aside width="auto">
        <el-menu text-color="back"
                 active-text-color="#00FFFF"
                 background-color="#e0dfdf"
                 :default-active="activeMenuItem">
          <template v-for="(menu, menuIndex) in menuList">
            <el-submenu :index="menu.menuId" style="background-color: #e0dfdf">
              <template slot="title"><i :class="menu.menuIcon"></i>&nbsp;&nbsp;{{menu.menuName}}</template>
              <template v-for="(menuItem, menuItemIndex) in menu.menuItemList">
                <el-menu-item :index="menuItem.menuItemId" @click="menuItemClick(menu,menuItem)"><i :class="menuItem.menuItemIcon"></i>&nbsp;&nbsp;{{menuItem.menuItemName}}</el-menu-item>
              </template>
            </el-submenu>
          </template>
        </el-menu>
      </el-aside>

      <el-main v-if="mytabs.length<=0" >
        <iframe name="mxiframe" id="mxiframe1" class="mx-iframe"
                src="/admin/home"
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
      return {
        menuList: [
          {
            menuId: '1',
            menuIcon: 'icon-user',
            menuCode: '员工管理',
            menuName: '员工管理',
            menuItemList: [
              {
                menuItemId: '1-1',
                menuItemIcon: 'iconfont icon-iconyggl',
                menuItemCode: '员工管理',
                menuItemName: '员工信息',
                menuItemUrl: '/personinformation'
              },
              {
                menuItemId: '1-2',
                menuItemIcon: 'iconfont icon-xiashujixiaoguanli',
                menuItemCode: '员工管理',
                menuItemName: '出勤管理',
                menuItemUrl: '/adminchuqinlist'
              },
              {
                menuItemId: '1-3',
                menuItemIcon: 'iconfont icon-gongziguanli',
                menuItemCode: '员工管理',
                menuItemName: '工资管理',
                menuItemUrl: '/usersalary'
              },
              {
                menuItemId: '1-4',
                menuItemIcon: 'icon-trophy',
                menuItemCode: '员工管理',
                menuItemName: '绩效管理',
                menuItemUrl: '/jixiaolist'
              }
            ]
          },
          {
            menuId: '2',
            menuIcon: 'iconfont icon-xitongguanli',
            menuCode: '系统管理',
            menuName: '系统管理',
            menuItemList: [
              {
                menuItemId: '2-1',
                menuItemIcon: 'iconfont icon-zhanghuguanli',
                menuItemCode: '系统管理',
                menuItemName: '账户管理',
                menuItemUrl: '/userlist'
              }
            ]
          },
          {
            menuId: '3',
            menuIcon: 'iconfont icon-huaban37',
            menuCode: '部门管理',
            menuName: '部门管理',
            menuItemList: [
              {
                menuItemId: '3-1',
                menuItemIcon: 'icon-sitemap',
                menuItemCode: '部门管理',
                menuItemName: '部门信息',
                menuItemUrl: '/bumenlist'
              },
            ]
          },
          {
            menuId: '4',
            menuIcon: 'iconfont icon-qita',
            menuCode: '其他',
            menuName: '其他',
            menuItemList:
                    [
                      {
                        menuItemId: '4-1',
                        menuItemIcon: 'iconfont icon-shensu',
                        menuItemCode: '其他',
                        menuItemName: '员工申诉',
                        menuItemUrl: '/seeshensulist'
                      },
                    ]
          }
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
          userName: ''
        }
      }
    },
    mounted() {


      this.userInfo = JSON.parse(localStorage.getItem('userInfo'))
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