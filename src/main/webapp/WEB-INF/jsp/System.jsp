<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%> 
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>QYT-CODING</title>

  <link rel="stylesheet" href="<%=basePath%>/layui/css/layui.css">
  <link rel="stylesheet" href="<%=basePath%>/font-awesome-4.7.0/css/font-awesome.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">文章管理系统</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
      <li class="layui-nav-item"><a href="">首页</a></li>
    </ul>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="<%=basePath%>/img/me.jpg" class="layui-nav-img">
          ${admin.aName }
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">基本资料</a></dd>
          <dd><a href="">安全设置</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="<%=basePath%>/index.action" style="text-decoration: none;;"><strong>退出</strong></a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
        <li class="layui-nav-item layui-nav-itemed">
          <a class="" href="javascript:;"><span class="fa fa-leaf fa-fw"></span> &nbsp; &nbsp; &nbsp;文章管理</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:;"  onclick="javascript: toArticleList();">文章列表</a></dd>
            <dd><a href="javascript:;"  onclick="javascript: toArticleWrite();">撰写文章</a></dd>
            <dd><a href="javascript:;"  onclick="javascript: toArticleTrash();" >回收站</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;"><span class="fa fa-twitter fa-fw"></span> &nbsp; &nbsp; &nbsp;关于我们</a>
        </li>
        <li class="layui-nav-item"><a href="javascript:;"><span class="fa fa-send-o fa-fw"></span> &nbsp; &nbsp; &nbsp;联系我们</a></li>
      </ul>
    </div>
  </div>
  
  <div class="layui-body">
    <!-- 内容主体区域 -->
  <!--   <div style="padding: 15px;"> -->
    	<div id="content" style="height: 550px;margin-top:50px">
    		<div style="font-size: 45px;color: #1D9D73;margin-top: 200px;text-align:center;" class="text-center"><strong>欢迎登录后台管理系统</strong></div>
            <p class="text-center">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<strong style="color: #1D9D73;text-align:center;">本系统由各种Copy来的代码实现功能以及页面的美化</strong>
            </p>
    	
    	</div>
    <!-- </div> -->
  </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    qyt-coding
  </div>
</div>
<script src="<%=basePath%>/layui/layui.js"></script>
<script>
//JavaScript代码区域
layui.use('element', function(){
  var element = layui.element;
  
});
/*切换主题页面的内容 */
  function toArticleWrite() {
        document.getElementById("content").innerHTML = "<object type=\"text/html\" data=\"<%=basePath%>/article/toArticleWrite.action\" width=\"100%\" height=\"100%\"></object>";
    }
    function toArticleList() {
        document.getElementById("content").innerHTML = "<object type=\"text/html\" data=\"<%=basePath%>/article/toArticleList.action\" width=\"100%\" height=\"100%\"></object>";
    }
    function toArticleTrash() {
        document.getElementById("content").innerHTML = "<object type=\"text/html\" data=\"<%=basePath%>/article/toArticleTrash.action\" width=\"100%\" height=\"100%\"></object>";
    }




</script>
</body>
</html>