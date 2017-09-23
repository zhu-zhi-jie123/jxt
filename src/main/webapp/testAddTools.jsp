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
		<form action="<c:url value='/tool/addTools'/>" method="post" id="test">
			<c:forEach var="i" begin="0" end="1">
				<input name="toolList[${i }].cid" value="2"/>
				<input name="toolList[${i }].createDate" value="2017-09-22"/>
				<input name="toolList[${i }].lastTestDate" value="2017-09-22"/>
				<input name="toolList[${i }].modelNumber" value="888"/>
				<input name="toolList[${i }].number" value="888"/>
				<input name="toolList[${i }].testPeriod" value="3"/>
				<input name="toolList[${i }].toolName" value="888"/>
				<input name="toolList[${i }].validUsePeriod" value="3"/>
			</c:forEach>
			<input type="submit" value="提交"/>
		</form>
	</div>
</body>
</html>