function restoreArticle(){
				layui.use(['table'], function(){
					 var table=layui.table;
					 
					 var checkStatus = table.checkStatus('idTest');
					 var  checkDate=checkStatus.data;
					  layer.confirm('是否还原文章', function(index){
			  			$.ajax({//几个参数需要注意一下
				                type: "POST",//方法类型
				                dataType: "json",//预期服务器返回的数据类型
				                url: "/article/updateManyArticleWhereVerify1.action",
								data : JSON.stringify(checkDate),
								contentType: "application/json; charset=utf-8",  
								success : function(result) {
								if (result.status == 200) {
									 //alert('批量删除成功');
									 
									 layer.close(index);
									 window.location.href="/article/toArticleTrash.action"; 
								}else{
				    				   alert('还原文章失败');
				    			   };
							},
							error : function() {
								alert("异常！");
							}
						});
			  		  });
				});
				
			};
			
			
function deleteAll(){
	layui.use(['table'], function(){
		 var table=layui.table;
		 
		 var checkStatus = table.checkStatus('idTest');
		 var  checkDate=checkStatus.data;
		  layer.confirm('是否删除文章', function(index){
 			$.ajax({//几个参数需要注意一下
	                type: "POST",//方法类型
	                dataType: "json",//预期服务器返回的数据类型
	                url: "/article/deleteAll.action",
					data : JSON.stringify(checkDate),
					contentType: "application/json; charset=utf-8",  
					success : function(result) {
					if (result.status == 200) {
						 //alert('批量删除成功');
						 
						 layer.close(index);
						 window.location.href="/article/toArticleTrash.action"; 
					}else{
	    				   alert('删除文章失败');
	    			   };
				},
				error : function() {
					alert("异常！");
				}
			});
 		  });
	});
}