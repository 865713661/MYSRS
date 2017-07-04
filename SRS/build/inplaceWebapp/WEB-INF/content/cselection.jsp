<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
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
<title>用户管理</title>
</head>
<body>
	
		<table class="table table-bordered table-hover">
		<thead>
			<tr class="text-c">
				<th width="80" bgcolor="#E0FFFF">编号</th>
				<th width="100" bgcolor="#E0FFFF">课程名</th>
				<th width="90" bgcolor="#E0FFFF">上课时间(周)</th>
				<th width="90" bgcolor="#E0FFFF">上课时间(天)</th>
				<th width="150" bgcolor="#E0FFFF">教室</th>
				<th width="" bgcolor="#E0FFFF">剩余容量</th>
				<th width="130" bgcolor="#E0FFFF">老师</th>
				<th bgcolor="#FFDAB9">操作</th>
			</tr>
		</thead>
		<tbody id="allSection">
	
			
		</tbody>
	</table>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="<%=request.getContextPath()%>/mystyle/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/mystyle/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/mystyle/static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/mystyle/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="<%=request.getContextPath()%>/mystyle/lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/mystyle/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/mystyle/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
var str=location.href;
var aa = str.substr(str.indexOf("?")+6);
$(function() {
	$.ajax({
		url : '${pageContext.request.contextPath}/sectionAction_findAllSection',
		type : 'POST',
		dataType : 'json',
		data : {},
		success : function(data) {
			$("#allSection").empty();
			for (var i = 0; i < data.length; i++) {
				var s = data[i];
				var se ="'" + s.sectionNo + "'";
				var html = '<tr><td>'
					+ s.sectionNo
					+ '</td><td>'
					+ s.course
					+ '</td><td>'
					+ s.dayOfWeek
					+ '</td><td>'
					+ s.timeOfDay
					+ '</td><td>'
					+ s.room
					+ '</td><td>'
					+ s.seatingCapacity
					+ '</td><td>'
					+ s.professor
					+ '</td><td><a href="javascript:void(0);"  onclick="addTranscript('+ se +')">选课</a></td></tr>';
					$("#allSection").append(html);
			}	
		}
	});
})

function addTranscript(val){
		$.ajax({
			url:'${pageContext.request.contextPath}/sectionAction_addTranscript',
			type:'POST',
			dataType : 'json',
			data:{ssn:aa,sectionNo:val},
			success:function(data){
				if(data.status=="ok"){
					alert("添加成功！");
					window.location.reload();
				}else if(data.status=="no"){
					alert("不在选课计划中！");
					window.location.reload();
					}else if(data.status=="two"){
						alert("已经选了该课程");
						window.location.reload();
						}else if(data.status=="cant"){
							alert("不满足条件");
							}
						else if(data.status=="full"){
							alert("容量满了");
							}
						
			}
		});
	}



$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,8,9]}// 制定列不参与排序
		]
	});
	
});
/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*用户-查看*/
function member_show(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*用户-停用*/
function member_stop(obj,id){
	layer.confirm('确认要停用吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '',
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe6e1;</i></a>');
				$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
				$(obj).remove();
				layer.msg('已停用!',{icon: 5,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}

/*用户-启用*/
function member_start(obj,id){
	layer.confirm('确认要启用吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '',
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>');
				$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
				$(obj).remove();
				layer.msg('已启用!',{icon: 6,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});
	});
}
/*用户-编辑*/
function member_edit(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*密码-修改*/
function change_password(title,url,id,w,h){
	layer_show(title,url,w,h);	
}
/*用户-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '',
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").remove();
				layer.msg('已删除!',{icon:1,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}
</script> 
</body>
</html>