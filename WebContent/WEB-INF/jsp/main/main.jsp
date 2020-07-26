<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script
  src="https://code.jquery.com/jquery-3.5.1.js"
  integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
  crossorigin="anonymous"></script>
  
<script type="text/javascript">
$(document).ready(function(){
	console.log('main.jsp ready123');
})

function fnGoPaperPage(){
	var f = document.frm;
	f.action = "/fctry/indvdlz/posesPapers.do"
	f.submit();
}
</script>

</head>
<body>
	<form name="frm" action="">
		<input type="hidden" id="fctryManageNo" name="fctryManageNo" value="1"/>
		<input type="hidden" id="cvplManageNo" name="cvplManageNo" value="1"/>
	</form>

	<a href="javascript://" onclick="javascript:fnGoPaperPage();">구비서류 작성</a>
</body>
</html>