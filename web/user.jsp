<%@ page import="java.io.PrintWriter" %>
<%--JSP 페이지라는 표식--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h1>User 페이지</h1>
    <hr/>
<%-- JSP 선언문 : 메서드 정의 가능--%>
    <%!
       String getUsername(){
           return "ssar";
       }
    %>
<%-- 자바 코드만 가능--%>
    <%-- request,response 내장 객체--%>
    <%
        String name="cos";
        PrintWriter pw = response.getWriter();
        pw.println(getUsername());
    %>
<%-- 표현식: 출력하겠다--%>
    <h3><%=getUsername()%></h3>
    <h3><%=name%></h3>

</body>
</html>