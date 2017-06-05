<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>
<script type="text/javascript">

	$(document).ready(function() {		
			$.ajax({
				type : "post",
				url : "/SampleMavenProject/selAllInter",
				dataType: "json",
				success : function(data) {
									for (var i = 0; i < data.length; i++) {
										var tab1 = "<tr><td>" + data[i].inter_id
												+ "</td><td>" + data[i].pro_name
												+ "</td><td>" + data[i].inter_name
												+ "</td><td>" + data[i].inter_author
												+ "</td><td>" + data[i].inter_features
												+ "</td><td>" + data[i].inter_path
												+ "</td><td>" + data[i].inter_coding
												+ "</td><td>" + data[i].inter_param
												+ "</td><td>" + data[i].out_param
												+ "</td><td><input type='button' id='"+data[i].inter_id+"' onclick='deleteid(id)' value='删除'></td></tr>";
										$("#tab1").append(tab1);
									}
								}
							})
			})
			
			function deleteid(id){
				var inter_id= id;//接口id
				alert(inter_id);
				$.ajax({
					type:"post",
					url : "/SampleMavenProject/delInter",
					data: {inter_id : inter_id},
					dataType: "json",
				
					success:function(data){
						if (data!=null) {
							window.location.reload();
							alert("删除成功");
						}else{
							alert("删除失败");
						}
					}
				})
			}
	
</script>
</head>
<body>
<table id="tab1" border="1px">
<thead>
<tr>
<th>接口id</th>
<th>项目名</th>
<th>接口名</th>
<th>接口的作者</th>
<th>接口的描述</th>
<th>接口的路径</th>
<th>接口的编码</th>
<th>接口的入参</th>
<th>接口的出参</th>
<th>管理</th>
</tr>
</thead>
<tbody id="tab1">
    <tr>
		
	</tr>
</tbody>	
</table>
<br>

<input type="button" id="add" value="新增" onclick="location.href='jsp/add.jsp'">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" id="update" value="修改" onclick="location.href='jsp/update.jsp'">

</body>
</html>