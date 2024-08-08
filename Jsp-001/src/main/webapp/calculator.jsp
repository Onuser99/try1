<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error-handler.jsp" %>
<html>
<head>
    <title>expression tag</title>
</head>
<body>
<h1>Calculator JSP file </h1>
<%
    int number1 = Integer.parseInt(request.getParameter("number1"));
    int number2 = Integer.parseInt(request.getParameter("number2"));
    String operation = request.getParameter("operation");
    switch (operation) {
        case "+" : out.println("Addition is :" + (number1 + number2));break;
        case "-" : out.println("Subtraction is :" + (number1 - number2));break;
        case "*" : out.println("Multiplication is :" + (number1 * number2));break;
        case "/" : out.println("Division Quotient is :" + (number1 / number2));break;
        case "%" : out.println("Division Remainder is :" + (number1 % number2));break;
        default : out.println("Invalid operation");break;
    }
%>
</body>
</html>