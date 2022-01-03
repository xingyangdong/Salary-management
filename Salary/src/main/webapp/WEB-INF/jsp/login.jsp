<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset=UTF-8">
    <title>薪酬管理系统</title>
    <link rel="stylesheet"  href="../static/element-ui/index.css">
    <link href="../static/Font-Awesome-3.2.1/css/font-awesome.css"
          rel="stylesheet">
    <style>
        html, body{
            margin: 0;
            padding: 0;
            height:100%;
            font-size: 14px;
            /* html默认高度只有一行, 需要显式声明高度*/
        }
        .login {
            width:100%;
            height: 100%;
            margin:0;
            padding: 0;

            background-image: url("/static/images/登录界面.jpg");
            background-size: cover;
        }
        .loginCard {
            box-sizing: border-box;
            border: 0px;
            position: relative;
            top: 150px;
            width: 500px;
            margin: 0 auto;
            padding: 0 20px;
            box-shadow:0 0 10px #000;
            background-color: rgba(255, 255, 255, 0.3);

        }

        .el-card:hover{
            box-shadow:0 0 20px #1263ee;
        }
        /* 更改element-UI按钮样式 */
        .el-button--info{
            color: #003cee;
            outline: none;
            border: 0px;
            padding: 0px;

            background-color: transparent;
        }
        .el-button--info:focus{
            background-color:transparent;
            color: orange;
        }
        .el-button--info:hover{
            background:rgba(99,123,115,0.1);
            color: orange;
        }
        .el-button--info:active{
            background: rgba(99,123,115,0.1);
            color: #003cee;
        }
    </style>
</head>
<body style="background-color: #f6f8f7">
<div id="app" class="login">
    <!--登录框div的样式-->
    <el-card class="loginCard" shadow="alw ays" >
        <el-form :model="mymodel"
                 :rules="myrule"
                 ref="loginForm">
            <h2 style="text-align: center">薪酬管理系统</h2>
            <el-form-item prop="userId">
                <el-input
                        prefix-icon="icon-user"
                        type="text"
                        v-model="mymodel.userId"
                        auto-complete="off"
                        placeholder="登录账号">
                </el-input>
            </el-form-item>

            <el-form-item prop="currentPassword" >
                <el-input
                        prefix-icon="icon-key"
                        type="password"
                        v-model="mymodel.currentPassword"
                        auto-complete="off"
                        placeholder="登录密码">
                </el-input>
            </el-form-item>
            <el-col>测试账号：20210001/1； 20210002/1</el-col>
            <el-form-item>
                <el-button
                        type="primary"
                        @click="login('loginForm')"
                        style="width: 100%">
                    登 录
                </el-button>
            </el-form-item>

            <el-button @click="click()" type="info">忘记密码</el-button>
        </el-form>
    </el-card>

    <el-dialog
            width="40%"
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
                :rules="rememberrule"
                label-width="150px"
                style="margin:10px;width:auto;">
            <el-form-item required prop='userId' label="帐号:">
                <el-col :span="15">
                    <el-input type="string" v-model="mymodel.userId"></el-input>
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
<script src="../static/vue/vue.js"></script>
<!--2.2 引入element ui-->
<script src="../static/element-ui/index.js"></script>
<!--3 引入axios-->
<script src="../static/axios/axios.js"></script>
<script src="../static/mx-config.js"></script>

<script>
    //验证重复密码

    // 定义vue实例
    const app = new Vue({
        el: "#app",
        data:function()  {
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
            return{
                dialogEdit:{
                    title:'忘记密码',
                    show: false
                },

                mymodel:{
                    userId:'',
                    mobile:'',
                    currentPassword:'',
                    currentPassword2:'',
                    userName:''
                },
                tableData:[],
                myrule:{
                    userId: [
                        { required: true, message: '请输入登录账号', trigger: 'blur' },
                    ],
                    currentPassword: [
                        { required: true, message: '请输入登录密码', trigger: 'blur' },
                    ]
                },
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

            }
        },
        mounted: function () {
            //   初始化表格
            this.initTable();
            let cishu=0;
            localStorage.setItem("cishu",JSON.stringify(cishu));

        },
        methods:{

            initTable:function(){
                //通过axios调用服务器json服务
                axios.get("/user/"+this.mymodel.userId).then(res => {
                    this.tableData = res.data;
                });
            },
            login:function (formName) {
                this.$refs[formName].validate((valid) => {
                    if (valid) {
                        //到后台验证用户
                        axios.post('/login',this.mymodel).then(res =>{
                            let loginInfo = res.data;
                            if(loginInfo.loginStatus == '200') {
                                //验证成功
                                //创建一个本地会话，存放用户信息
                                let userInfo = loginInfo.userInfo;
                                localStorage.setItem("userInfo",JSON.stringify(userInfo));
                                //如果是字符串，可以直接作为key-value设置
                                localStorage.setItem("userName",userInfo.userName);
                                localStorage.setItem("userId",userInfo.userId);
                                localStorage.setItem("mobile",userInfo.userId);
                                //路由跳转:根据角色跳转到不同的入口
                                if(userInfo.userType == '0'){
                                    window.location.href='/admin/index';
                                }else if(userInfo.userType == '1'){
                                    window.location.href='/app/index';
                                }
                            } else {
                                //验证失败
                                this.$message({
                                    message:'登录账号或密码错误，请重新登录！',
                                    type:'error'
                                })
                                return false;
                            }
                        })

                    } else {
                        this.$message({
                            message:'登录账号和密码不能为空！',
                            type:'error'
                        })
                        return false;
                    }
                });
            },
            click:function () {
                this.dialogEdit.show = true;
            },
            onSubmitEdit:function (form) {
                this.$refs[form].validate(valid => {
                    if (!valid) {
                        this.$message({
                            message: "输入项有错误！",
                            type: "error"
                        });
                        return false;
                    } else {
                        axios.post('/login',this.mymodel).then(res =>{
                        let loginInfo = res.data;
                        let userInfo = loginInfo.userInfo;
                        if (this.mymodel.userId == userInfo.userId &&
                            this.mymodel.mobile == userInfo.mobile) {
                            axios.put("/user", this.mymodel).then(res => {
                                this.$message({
                                    message: "修改成功，请登录！",
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
                        })
                    }

                })
            },
        }
    })
</script>
<%--<script type="text/javascript" src="https://cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script>　--%>
<%--//登陆界面动态背景--%>
<%--<script>--%>
<%--    !function() {--%>
<%--            function n(n, e, t) {--%>
<%--                return n.getAttribute(e) || t--%>
<%--            }--%>
<%--            function e(n) {--%>
<%--                return document.getElementsByTagName(n)--%>
<%--            }--%>
<%--            function t() {--%>
<%--                var t = e("script"),--%>
<%--                    o = t.length,--%>
<%--                    i = t[o - 1];--%>
<%--                return {--%>
<%--                    l: o,--%>
<%--                    z: n(i, "zIndex", -1),--%>
<%--                    o: n(i, "opacity", .5),--%>
<%--                    c: n(i, "color", "0,0,0"),--%>
<%--                    n: n(i, "count", 99)--%>
<%--                }--%>
<%--            }--%>
<%--            function o() {--%>
<%--                a = m.width = window.innerWidth || document.documentElement.clientWidth || document.body.clientWidth,--%>
<%--                    c = m.height = window.innerHeight || document.documentElement.clientHeight || document.body.clientHeight--%>
<%--            }--%>
<%--            function i() {--%>
<%--                r.clearRect(0, 0, a, c);--%>
<%--                var n, e, t, o, m, l;--%>
<%--                s.forEach(function(i, x) {--%>
<%--                    for (i.x += i.xa, i.y += i.ya, i.xa *= i.x > a || i.x < 0 ? -1 : 1, i.ya *= i.y > c || i.y < 0 ? -1 : 1, r.fillRect(i.x - .5, i.y - .5, 1, 1), e = x + 1; e < u.length; e++) n = u[e],--%>
<%--                    null !== n.x && null !== n.y && (o = i.x - n.x, m = i.y - n.y, l = o * o + m * m, l < n.max && (n === y && l >= n.max / 2 && (i.x -= .03 * o, i.y -= .03 * m), t = (n.max - l) / n.max, r.beginPath(), r.lineWidth = t / 2, r.strokeStyle = "rgba(" + d.c + "," + (t + .2) + ")", r.moveTo(i.x, i.y), r.lineTo(n.x, n.y), r.stroke()))--%>
<%--                }),--%>
<%--                    x(i)--%>
<%--            }--%>
<%--            var a, c, u, m = document.createElement("canvas"),--%>
<%--                d = t(),--%>
<%--                l = "c_n" + d.l,--%>
<%--                r = m.getContext("2d"),--%>
<%--                x = window.requestAnimationFrame || window.webkitRequestAnimationFrame || window.mozRequestAnimationFrame || window.oRequestAnimationFrame || window.msRequestAnimationFrame ||--%>
<%--                    function(n) {--%>
<%--                        window.setTimeout(n, 1e3 / 45)--%>
<%--                    },--%>
<%--                w = Math.random,--%>
<%--                y = {--%>
<%--                    x: null,--%>
<%--                    y: null,--%>
<%--                    max: 2e4--%>
<%--                };--%>
<%--            m.id = l,--%>
<%--                m.style.cssText = "position:fixed;top:0;left:0;z-index:" + d.z + ";opacity:" + d.o,--%>
<%--                e("body")[0].appendChild(m),--%>
<%--                o(),--%>
<%--                window.onresize = o,--%>
<%--                window.onmousemove = function(n) {--%>
<%--                    n = n || window.event,--%>
<%--                        y.x = n.clientX,--%>
<%--                        y.y = n.clientY--%>
<%--                },--%>
<%--                window.onmouseout = function() {--%>
<%--                    y.x = null,--%>
<%--                        y.y = null--%>
<%--                };--%>
<%--            for (var s = [], f = 0; d.n > f; f++) {--%>
<%--                var h = w() * a,--%>
<%--                    g = w() * c,--%>
<%--                    v = 2 * w() - 1,--%>
<%--                    p = 2 * w() - 1;--%>
<%--                s.push({--%>
<%--                    x: h,--%>
<%--                    y: g,--%>
<%--                    xa: v,--%>
<%--                    ya: p,--%>
<%--                    max: 6e3--%>
<%--                })--%>
<%--            }--%>
<%--            u = s.concat([y]),--%>
<%--                setTimeout(function() {--%>
<%--                        i()--%>
<%--                    },--%>
<%--                    100)--%>
<%--        } ();--%>
<%--</script>--%>
</body>
</html>