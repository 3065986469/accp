$(function(){
	
//窗体模式框
	var div="<div id='windowDialog' class='modal fade' data-backdrop='static' data-keyboard='false'>"
			+"<div class='modal-dialog modal-lg'><div class='modal-content'><div class='modal-header'>"
			+"<button class='close' id='cols' data-dismiss='modal'>&times;</button><h3 class='modal-title  text-danger'>模块提示</h3></div>"
			+"<div class='modal-body'><div style='height:500px;overflow:auto; ' id='contet'></div></div></div></div></div>";
		
//消息提示框			
	 var div1="<div id='alertDialog' class='modal fade' data-backdrop='static' data-keyboard='false'><div class='modal-dialog modal-sm'>"
				+"<div class='modal-content'><div class='modal-header'><button class='close' data-dismiss='modal'>&times;</button>"
				+"<h3 class='modal-title text-danger'>系统提示</h3></div><div class='modal-body'><h3 class='text-center'>message</h3></div>"
				+"<div class='modal-footer' style='text-align: center;'><button class='btn btn-info' data-dismiss='modal'>确认</button></div></div></div></div>";
				
/*	//条件判断框			
	 var div2="<div id='confirmDialog' class='modal fade' data-backdrop='static' data-keyboard='false'><div class='modal-dialog modal-sm'>"
				+"<div class='modal-content'><div class='modal-header'><button class='close' data-dismiss='modal'>&times;</button>"
				+"<h3 class='modal-title text-danger'>系统确认提示</h3></div><div class='modal-body'><h3 class='text-center'>message</h3></div>"
				+"<div class='modal-footer' style='text-align: center;'><button class='btn btn-info' datain='pass'  data-dismiss='modal'>确认</button><span style='margin:20px;'></span><button class='btn btn-info'  datain='cancel'  data-dismiss='modal'>取消</button></div></div></div></div>";
			*/				
				$("body").append($(div)).append($(div1));

})
//显示窗体
function showWindowDialog(url, title) {
	if($("#contet").html()==""){
		$("#windowDialog").find(".modal-title").text(title);
		$("#windowDialog").find(".modal-body>div").load(url); 
	}
	$("#windowDialog").modal();
}

//显示提示框
function showAlertDialog(msg) {
	$("#alertDialog").find(".modal-body h3").text(msg);
	$("#alertDialog").modal(); 
}

