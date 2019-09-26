<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%> 
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<!DOCTYPE html>
<html lang="zh-CN">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Bootstrap 101 Template</title>
		<link href="<%=basePath%>/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" href="<%=basePath%>/layui/css/layui.css">
	<style type="text/css">
		.bColorRed {
			color:red
		}
		
	</style>
	</head>

	<body>
		<div class="container" style="width: 90%;">
			<fieldset class=" ">
				<legend style=""><strong>回收站信息列表</strong>
				</legend>
			</fieldset>
			<br />
			<h6 style="color: #009688;font-weight: bold;">**每天晚上12点准时清空回收站**</h6>
			<hr />
			<button type="button" class="layui-btn layui-btn-danger" onclick="deleteAll()" >批量删除</button>
			<button type="button" class="layui-btn" style="margin-left: 0px;"  onclick="restoreArticle()" >还原文章</button>
			<!--表格-->
			<table class="layui-hide" id="demo" lay-filter="test"></table>
			
			
			
			<div id="test1"></div>
			<div/>

			<script src="<%=basePath%>/js/jquery-3.3.1.min.js"></script>
			<script src="<%=basePath%>/js/bootstrap.js"></script>
			<script src="<%=basePath%>/js/articleTrash.js"></script>
			<script src="<%=basePath%>/layui/layui.js"></script>
			<script>
			layui.config({
				  version: '1560414887305' //为了更新 js 缓存，可忽略
				});
				 
				layui.use(['laydate', 'laypage', 'layer', 'table', 'carousel', 'upload', 'element', 'slider'], function(){
					var laydate = layui.laydate //日期
					,laypage = layui.laypage //分页
					,layer = layui.layer //弹层
					,table = layui.table //表格
					,carousel = layui.carousel //轮播
					,upload = layui.upload //上传
					,element = layui.element //元素操作
					,slider = layui.slider //滑块
				  

				  
				  //执行一个 table 实例
				  table.render({
					 id:'idTest' 
				    ,elem: '#demo'
				    ,height: 420
				    ,url: '<%=basePath%>/article/demo/table/item2.action' //数据接口
				    ,title: '用户表'
				    ,page: true //开启分页
				   // ,totalRow: true //开启合计行
				    ,cols: [[ //表头
				      {type: 'checkbox', fixed: 'left'}
				      ,{field: 'bId', title: '文章编号' }
				      ,{field: 'bSummary', title: '文章简介名' }
				      ,{field: 'bAuthor', title: '文章作者' }
				      ,{field: 'bDate', title: '发表日期'}
				      ,{field: 'bVerify', title: '审核状态', templet: '#bVerify'}
				      ,{field: 'bPublish', title: '发布状态', templet: '#bPublish'} 
				      ,{field: 'bStatus', title: '存在状态',templet: '#bStatus',width:100}
				    ]]
				  });
					
				});
				
			</script>
				<!-- 是否审核 -->
	<script type="text/html" id="bVerify">
 		 {{#  if(d.bVerify == 1){ }}
  			  已审核
 		 {{#  } else { }}
  			 <b class="bColorRed">未审核 </b>
  		 {{#  } }}
	</script>
	<!--是否发布  -->
	<script type="text/html" id="bPublish">
 		 {{#  if(d.bPublish == 1){ }}
  			  已发布
 		 {{#  } else { }}
  			 <b class="bColorRed">未发布 </b>
  		 {{#  } }}
	</script>
	<!--  -->
	<script type="text/html" id="bStatus">
 		 {{#  if(d.bStatus == 1){ }}
  			  <b >存在</b>
 		 {{#  } else { }}
  			   <b class="bColorRed">不存在 </b>
  		 {{#  } }}
	</script>
			
	</body>

</html>