<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/jquery/3.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>  
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="/favicon.ico" >
<link rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/mystyle/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/mystyle/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/mystyle/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/mystyle/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/mystyle/static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<!--/meta 作为公共模版分离出去-->

<title>添加用户 - H-ui.admin 3.0</title>
</head>
<body>
<article class="page-container">
	<form action="" method="post" class="form form-horizontal" id="form-member-add">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>编号：</label>
			<div class="formControls col-xs-8 col-sm-4">
				<input type="text" class="input-text" value="" placeholder="" id="sectionNo"  name="username">
			</div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>上课时间(周)：</label>
			<div class="formControls col-xs-8 col-sm-4">
				<input type="text" class="input-text" value="" placeholder="" id="dayOfWeek" name="username">
			</div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>上课时间(天)：</label>
			<div class="formControls col-xs-8 col-sm-4">
				<input type="text" class="input-text" value="" placeholder="" id="timeOfDay" name="username">
			</div>
		</div>
	
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>教室：</label>
			<div class="formControls col-xs-8 col-sm-4">
				<input type="text" onclick="addProfessor()" class="input-text" value="" placeholder="" id="room" name="username">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>容量：</label>
			<div class="formControls col-xs-8 col-sm-4">
				<input type="text" onclick="addProfessor()" class="input-text" value="" placeholder="" iid="seatingCapacity" name="username">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>教师：</label>
			<div class="formControls col-xs-8 col-sm-4">
				<input type="text" onclick="addProfessor()" class="input-text" value="" placeholder="" id="professor"  name="username">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>学期：</label>
			<div class="formControls col-xs-8 col-sm-4">
				<input type="text" onclick="addProfessor()" class="input-text" value="" placeholder="" iid="semester" name="username">
			</div>
		</div>
		

		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<input onclick="aaddSection()" class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;添加&nbsp;&nbsp;">
			</div>
		</div>
	</form>
</article>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="<%=request.getContextPath()%>/mystyle/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本--> 
<script type="text/javascript" src="<%=request.getContextPath()%>/mystyle/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/mystyle/lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/mystyle/lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/mystyle/lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript">
var str=location.href;
var cc = str.substr(str.indexOf("?")+1);
function addSection(){
	$.ajax({
		url:'${pageContext.request.contextPath}/sectionAction_addSection',
		type:'POST',
		dataType : 'json',
		data:{courseNo:cc,sectionNo:$("#sectionNo").val(),dayOfWeek:$("#dayOfWeek").val(),timeOfDay:$("#timeOfDay").val(),room:$("#room").val(),seatingCapacity:$("#seatingCapacity").val(),professorSsn:$("#professor").val(),semester:$("#semester").val()},
		success:function(data){
			if(data.status=="ok"){
				alert("添加成功！");
				window.location.href='${pageContext.request.contextPath}/admin';
			}
		}
	});
}
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-member-add").validate({
		rules:{
			username:{
				required:true,
				minlength:2,
				maxlength:16
			},
			sex:{
				required:true,
			},
			mobile:{
				required:true,
				isMobile:true,
			},
			email:{
				required:true,
				email:true,
			},
			uploadfile:{
				required:true,
			},
			
		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			//$(form).ajaxSubmit();
			var index = parent.layer.getFrameIndex(window.name);
			//parent.$('.btn-refresh').click();
			parent.layer.close(index);
		}
	});
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>