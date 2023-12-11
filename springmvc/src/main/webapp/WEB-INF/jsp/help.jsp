<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<%
	String name = (String)request.getAttribute("name");
	Integer rollNo = (Integer)request.getAttribute("rollNumber");
	Object time = request.getAttribute("time");
%>


<h1>Hello My name is <%=name %> And Roll no. is <%= rollNo%> and current time is <%= time %></h1>

	${name}
	${rollNo}
	${time }
	
	<c:forEach items="${mark}" var="item">
    	${item}<br>
    </c:forEach>

	
<body>
	<h1>this is help page</h1>
</body>
</html>