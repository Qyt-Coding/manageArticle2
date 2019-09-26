<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<link rel="stylesheet" href="<%=basePath%>/layui/css/layui.css">
<!-- Bootstrap -->
<link href="<%=basePath%>/css/bootstrap.min.css" rel="stylesheet">
<style>
.listTitle {
	font-weight: 700;
	color: #299A74;
}

.float-left {
	float: left;
}

.width-nine {
	width: 90px;
}

.width-ten {
	width: 100px;
}
.layui-table-view .layui-table {
	width:100%;
	}
</style>

</head>

<body>
	<div class="container" style="width: 90%;">
		<fieldset class=" ">
			<legend style="">
				<strong>文章信息列表</strong>
			</legend>
		</fieldset>
		<br />

		<div>
			<div>
				<span class="listTitle">输入查询信息</span>
				<hr />
				<div>
					<!-- 这个功能后面在实现 -->
					<h2 style="color: #0B9F29;">该功能暂不开放！敬请期待！</h2>
					
				</div>
				<!--查询结果展示-->
				<span class="listTitle">查询结果展示</span>
				<hr />
				<button type="button" class="layui-btn layui-btn-danger"  onclick="deleteAll()" >批量删除</button>

				<table class="layui-hide" id="demo" lay-filter="test"></table>
			</div>
		</div>
	</div>

	</div>
	</div>

	<script src="<%=basePath%>/js/jquery-3.3.1.min.js"></script>
	<script src="<%=basePath%>/js/bootstrap.js"></script>
	<script src="<%=basePath%>/layui/layui.js"></script>
	
	<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
	</script>




  
	<!-- 是否审核 -->
	<script type="text/html" id="bVerify">
 		 {{#  if(d.bVerify == 1){ }}
  			  已审核
 		 {{#  } else { }}
  			 没审核
  		 {{#  } }}
	</script>
	<!--是否发布  -->
	<script type="text/html" id="bPublish">
 		 {{#  if(d.bPublish == 1){ }}
  			  已发布
 		 {{#  } else { }}
  			 没发布
  		 {{#  } }}
	</script>
	<!--  -->
	<script type="text/html" id="bStatus">
 		 {{#  if(d.bStatus == 1){ }}
  			  存在
 		 {{#  } else { }}
  			 不存在
  		 {{#  } }}
	</script>
<script>
layui.config({
  version: '1560414887305' //为了更新 js 缓存，可忽略
});
 
 
/* 
 var table=layui.table;
 console.log(table); */
 
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
    ,url: '<%=basePath%>/article/demo/table/item.action' //数据接口
    ,title: '用户表'
    ,page: true //开启分页
    ,toolbar: true //开启工具栏，此处显示默认图标，可以自定义模板，详见文档
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
      ,{toolbar:'#barDemo',fixed: 'right',width:200}
    ]]
  });
  
  
  //监听行工具事件
  table.on('tool(test)', function(obj){ //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
    var data = obj.data //获得当前行数据
    ,layEvent = obj.event; //获得 lay-event 对应的值
    if(layEvent === 'detail'){
    	console.log(data.bId);
    	console.log(layEvent +"    layEvent");
    	window.location.href="<%=basePath%>/article/"+data.bId+".action";  
    } else if(layEvent === 'del'){
      layer.confirm('真的删除行么', function(index){
        obj.del(); //删除对应行（tr）的DOM结构

        //var checkStatus = table.checkStatus('idTest'); //idTest 即为基础参数 id 对应的值
       // console.log(checkStatus.data) //获取选中行的数据
       // console.log(checkStatus.data.length) //获取选中行数量，可作为是否有选中行的条件
       // console.log(checkStatus.isAll ) //表格是否全选
       //开始ajax传数据
       $.get("<%=basePath%>/article/updateArticleWhereVerify.action",
    		   {"bId":data.bId},
    		   function(){});
       layer.close(index);
       window.location.href="<%=basePath%>/article/toArticleList.action"; 
      });
    } else if(layEvent === 'edit'){
      layer.msg('编辑操作');
      var bId=data.bId;
      window.location.href="<%=basePath%>/article/toArticleWrite.action?bId="+bId; 
    }
  }); 
});   
</script>
<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-xs" lay-event="detail">查看</a>
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<script>
	function deleteAll(){
		layui.use(['table'], function(){
			 var table=layui.table;
			 var checkStatus = table.checkStatus('idTest');
			 
			 var  checkDate=checkStatus.data;
			 
			 for(j in checkDate) {
				 console.log(j);
				 console.log(checkDate[j]);
				 console.log('结束');
			 }
		    		  layer.confirm('真的删除行么', function(index){
		    			$.ajax({//几个参数需要注意一下
			                type: "POST",//方法类型
			                dataType: "json",//预期服务器返回的数据类型
			                url: "<%=basePath%>/article/updateManyArticleWhereVerify.action",
							data : JSON.stringify(checkDate),
							contentType: "application/json; charset=utf-8",  
							success : function(result) {
							if (result.status == 200) {
								 //alert('批量删除成功');
								 
								 layer.close(index);
								 window.location.href="<%=basePath%>/article/toArticleList.action"; 
							}else{
			    				   alert('批量删除失败');
			    			   };
						},
						error : function() {
							alert("异常！");
						}
					});
		    		  });
		    		   
		    		   
			 
			// console.log(checkStatus.data);
			//alert(checkStatus.data);
		});
	     	//var checkStatus = table.checkStatus('idTest'); //idTest 即为基础参数 id 对应的值
	     	// console.log("-----------------------------") ;
	     //	console.log(checkStatus.data); //获取选中行的数据
	       // console.log(checkStatus.data.length) //获取选中行数量，可作为是否有选中行的条件
	       // console.log(checkStatus.isAll ) //表格是否全选
	}
</script>



</body>

</html>