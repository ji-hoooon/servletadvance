<%@ page import="java.util.Random" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<h1>Index Page</h1>
<hr/>
<%
    Random r = new Random();
    int num = r.nextInt(5)+1;
%>
<h2>당신의 번호는 : <%=num%></h2>
</body>
</html>
