<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>日历</title>
    <link rel="stylesheet"
          href="../static/element-ui/index.css">
    <style>
        .is-selected {
            color: #1989FA;
        }
    </style>
</head>
<body>
<div id="app">
    <el-calendar>
        <template
                slot="dateCell"
                slot-scope="{date, data}">
            <p :class="data.isSelected ? 'is-selected' : ''">
                {{ data.day.split('-').slice(1).join('-') }} {{ data.isSelected ? '✔️' : ''}}
            </p>
        </template>
    </el-calendar>
</div>


<!--1 引入vue-->
<script src="../static/vue/vue.min.js"></script>
<!--2.2 引入element ui-->
<script src="../static/element-ui/index.js"></script>
<!--3 引入axios-->
<script src="../static/axios/axios.min.js"></script>
<script src="../static/mx-config.js"></script>
<script>
    const myapp=new Vue({
        el:'#app',
        data:function () {
            return{


            }
        },
        methods:{


        }
    });

</script>
</body>
</html>
