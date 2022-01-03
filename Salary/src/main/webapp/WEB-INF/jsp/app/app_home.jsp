<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>薪酬管理系统首页</title>
  <!--2.1 引入element ui-->
  <link rel="stylesheet"
        href="../static/element-ui/index.css">
  <!--在element-UI中使用fontawesome-->
  <link href="../static/fontawesome/css/all.min.css"
        rel="stylesheet">
  <link href="../static/Font-Awesome-3.2.1/css/font-awesome.css"
        rel="stylesheet">
  <link  href="../static/font-icon/all.css" rel="stylesheet">

</head>
<body>
<div id="app">
  <i class="icon-volume-up fa-2x" style="position: absolute;color: #0a0a0a;padding-bottom: 8px"></i>
  <marquee  scrollAmount=10 height="25px" width=100% style="color: red;font-size: 15pt;margin-left: 31px">
    2021.4.17工资已发,工资级别表及晋升表见【附件1】，有任何疑问可以填写申诉单进行申诉</marquee>
  <img src="../static/images/首页.jpg">

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

    },

  });
</script>
</body>
</html>