<%@ page language="java" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>学生管理信息系统--学生</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <link href="css/mycss.css" rel="stylesheet">
    <link href="plugin/easyui/themes/bootstrap/easyui.css" rel="stylesheet">
    <link href="plugin/easyui/themes/icon.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="#">学生信息管理系统--学生</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                        欢迎您：<%=request.getSession().getAttribute("userName")%><span class="caret"></span></a>
                    <input type="hidden" id="userId" value="<%=request.getSession().getAttribute("userId")%>">
                    <ul class="dropdown-menu">
                        <li><a href="/stu/user/userLogout.do">退出系统</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<div class="container-fluid">
    <div class="col-md-2">
        <ul class="nav nav-pills nav-stacked">
            <li role="presentation"><a href="stuMsg.jsp">个人资料</a></li>
            <li role="presentation" class="active"><a href="stuDormitory.jsp">住宿信息</a></li>
            <li role="presentation"><a href="stuChooseClasses.jsp">选课系统</a></li>
            <li role="presentation"><a href="stuGrade.jsp">成绩管理</a></li>
            <li role="presentation"><a href="stuReward.jsp">奖励信息</a></li>
            <li role="presentation"><a href="stuPunish.jsp">处罚信息</a></li>
            <li role="presentation"><a href="stuAFL.jsp">学生请假</a></li>
        </ul>
    </div>

    <div class="col-md-10">
        <div>
            <ol class="breadcrumb">
                <li><a href="javascript:void(0)">首页</a></li>
                <li class="active">住宿信息</li>
            </ol>
        </div>
        <div class="form-horizontal col-md-8">
            <div class="form-group">
                <label for="name" class="col-md-2 control-label">姓名:</label>
                <div class="col-md-8">
                    <input type="text" class="form-control" disabled id="name" name="Name" value="<%=request.getSession().getAttribute("userName")%>">
                </div>
            </div>
            <div class="form-group">
                <label for="zone" class="col-md-2 control-label">园区:</label>
                <div class="col-md-8">
                    <input type="text" class="form-control" id="zone" name="Idcard">
                </div>
            </div>
            <div class="form-group">
                <label for="building" class="col-md-2 control-label">楼栋:</label>
                <div class="col-md-8">
                    <input type="text" class="form-control" id="building" name="Phone">
                </div>
            </div>
            <div class="form-group">
                <label for="room" class="col-md-2 control-label">房间:</label>
                <div class="col-md-8">
                    <input type="text" class="form-control" id="room" name="QQ">
                </div>
            </div>
        </div>
    </div>
</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-2.1.1.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
<script src="plugin/easyui/jquery.easyui.min.js"></script>
<script src="plugin/easyui/locale/easyui-lang-zh_CN.js"></script>
<script src="js/stuDormitory.js"></script>

</body>
</html>