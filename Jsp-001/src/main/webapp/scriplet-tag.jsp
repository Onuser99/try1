<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>scriptlet-tag</title>
</head>
<body>
<%
    for (int i = 0; i < 20; i++) {
        response.getWriter().println(i);
    }

%>
</body>
</html>