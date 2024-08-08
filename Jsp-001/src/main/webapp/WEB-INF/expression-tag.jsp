<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>expression tag</title>
</head>
<body>
<h1>expression tag </h1>
<%!
    public int getInt(){return 100;}
%>
<%=10 * 20 %> <br/>
<%="abc" + 10 %> <br/>
<%=1000 %> <br/>
<%="this will be printed on client side" %> <br/>
<%="Method defined being called "+getInt()%> <br/>
</body>
</html>