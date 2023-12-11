<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@page import="java.util.*"%>

<html>  
<body>  
<a href="helloagain">Javatpoint Tutorials</a>  

<%
	String name = (String)request.getAttribute("name");
	Integer id = (Integer)request.getAttribute("id");
	List<String> friends = (List<String>) request.getAttribute("f");
%>
 
<h1>Name is : <%=name%> And Id is: <%= id %></h1>

<%
	for (String s :friends){
%>

<h1><%=s%></h1>

<% 
	} 
%>


</body>  
</html>  