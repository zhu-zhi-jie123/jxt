<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="<c:url value='/get_tool/addToolGetForm'/>" method="post" id="test">
			<input name="toolids" value="9,10,11"/>
			<input name="noteNum" value="9527"/>
			<input name="getDate" value="2017-02-01"/>
			<input name="returnDate" value="2017-01-01"/>
			<input name="userName" value="佘培培"/>
			<input name="workingPlace" value="蒲江"/>
			<input name="workingContent" value="啦啦啦"/>
			<input name="workBeginDate" value="2017-01-01"/>
			<input name="workEndDate" value="2017-01-01"/>
			<input type="submit" value="提交"/>
		</form>
	</div>
</body>
</html>