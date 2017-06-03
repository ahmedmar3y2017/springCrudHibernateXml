<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ahmed
  Date: 5/29/2017
  Time: 3:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a  href="http://localhost:8080/siteLanguage=en">English ... </a><a  href="http://localhost:8080/siteLanguage=ar">Arabic  ... </a>
<br>
<h3 >${message}</h3><br>

<a href="/addEmployee">
    <spring:message code="addEmployee" ></spring:message> </a>
<a href="/viewEmployees"><spring:message  code="viwEmployees"></spring:message> </a>


</body>
</html>
