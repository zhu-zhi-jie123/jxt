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
		<form action="<c:url value='/tool/editTools'/>" method="post" id="test">
			<c:forEach begin="5" end="7" var="i" step="1">
				<input name="toolList[${i-5 }].id" value="${i }"/>
				<input name="toolList[${i-5 }].createDate" value="2017-01-01"/>
				<input name="toolList[${i-5 }].lastTestDate" value="2017-02-01"/>
				<input name="toolList[${i-5 }].modelNumber" value="888"/>
				<input name="toolList[${i-5 }].isQualified" value="1"/>
				<input name="toolList[${i-5 }].number" value="888"/>
				<input name="toolList[${i-5 }].testPeriod" value="888"/>
				<input name="toolList[${i-5 }].toolName" value="888"/>
				<input name="toolList[${i-5 }].validUsePeriod" value="888"/><br/>
			</c:forEach>
			<input type="submit" value="提交"/>
		</form>
	</div>
</body>
</html>