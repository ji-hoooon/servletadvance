<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("pageData", "1111"); //page scope
    request.setAttribute("requestData", "2222"); // request scope
    session.setAttribute("sessionData", "3333"); // session scope
    application.setAttribute("applicationData", "4444"); // application scope
%>
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
<h1>Servlet Scope</h1>
<hr/>
${pageScope.pageData} <br/>
${requestScope.requestData} <br/>
${sessionScope.sessionData} <br/>
${applicationScope.applicationData} <br/>
</body>
</html>
