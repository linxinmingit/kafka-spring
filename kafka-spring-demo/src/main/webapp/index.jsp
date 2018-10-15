<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.2.1.js"></script>
<body>
	<div align="center">
		<h4>Producer</h4>
		<form action="<%=request.getContextPath()%>/kafka/send" method="post">
			<input  type="text" name="topicName" />
			<input type="submit" value="sub"/>		
		</form>
		<br>
		<hr>
		<a href="">Consumer</a>
	</div>
</body>
</html>