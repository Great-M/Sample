<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>update</title>
<script type="text/javascript" src="../js/jquery-3.1.0.min.js"></script>
<script type="text/javascript">
function update(){
	
	var inter_id= $("#inter_id").val();//接口id

	var pro_name= $("#pro_name").val();//项目名
	
	var inter_name= $("#inter_name").val();//接口名
	
	var inter_author= $("#inter_author").val();//接口作者
	
	var inter_features= $("#inter_features").val();//接口描述

	var inter_path= $("#inter_path").val();//接口路径
	
	var inter_coding= $("#inter_coding").val();//接口编码
	
	var inter_param= $("#inter_param").val();//接口入参
	
	var out_param= $("#out_param").val();//接口出参
	
	
	$.ajax({
		type : "post",
		url : "/SampleMavenProject/updateInter",
		dataType: "json",
		data:{
			inter_id:inter_id,
			pro_name:pro_name,
			inter_name:inter_name,
			inter_author:inter_author,
			inter_features:inter_features,
			inter_path:inter_path,
			inter_coding:inter_coding,
			inter_param:inter_param,
			out_param:out_param
		},
		
		success : function(data) {
			if (data.flg=="ok") {
				alert(data.msg);
			}else{
				alert(data.msg);
			}
			
		}
		
	})

}
</script>
</head>
<body>
修改<br>
接口id<input id="inter_id" type="text"><br>
项目名<input id="pro_name" type="text"><br>
接口名<input id="inter_name" type="text"><br>
接口的作者<input id="inter_author" type="text"><br>
接口的描述<input id="inter_features" type="text"><br>
接口的路径<input id="inter_path" type="text"><br>
接口的编码<input id="inter_coding" type="text"><br>
接口的入参<input id="inter_param" type="text"><br>
接口的出参<input id="out_param" type="text"><br>
<input type="button" id="add" value="修改" onclick="update()">
&nbsp;&nbsp;
<input type="button" id="return" value="返回" onclick="location.href='../index.jsp'">
</body>
</html>