<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<script src="https://cdn.bootcss.com/jquery/3.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>  
<meta http-equiv="Pragma" content="no-cache"> 
<meta http-equiv="Cache-Control" content="no-cache"> 
<meta http-equiv="Expires" content="0"> 
<title>后台登录</title> 
<link href="css/login.css" type="text/css" rel="stylesheet"> 

</head> 
<body> 

<div class="login">
    <div class="message">选课系统登录</div>
    <div id="darkbannerwrap"></div>
    
      <form method="post">
		 <input type="text" class="form-control" id="ssn" placeholder="请输用户名" required autofcus/>
		<hr class="hr15">
		 <input type="password" class="form-control" id="password" placeholder="请输入密码" required autofocus/>
		<hr class="hr15">
		
                <select id="select">
                	<option>Student</option>
                	<option>Professor</option>
                	<option>admin</option>
                </select>
             
 
		<hr class="hr20">
		<hr class="hr15">
		  <button type="button" class="btn btn-success col-lg-12" onclick="login()">登录</button>
		<hr class="hr20">
		
		
	</form>

	
</div>

</body>
<script type="text/javascript">
	function login(){
		var ssn = $("#ssn").val();
		$.ajax({
			url:'${pageContext.request.contextPath}/userAction_login',
			type:'POST',
			dataType:'json',
			data:{ssn:ssn,password:$("#password").val(),type:$("select").val()},
			success:function(data){
				if(data.status=="ok"){
					if($("#select").val()=="Student"){
						window.location.href='${pageContext.request.contextPath}/sresult?name='+ ssn +'';
					}else if($("#select").val()=="Professor"){
						window.location.href='${pageContext.request.contextPath}/tresult?name='+ ssn +''
					}else{
						window.location.href='${pageContext.request.contextPath}/aresult';
					}
				}else{
					alert("账号或密码错误！或者身份错误！");
				}
			}
		}); 
		
	}
</script>
</html>