<%--
  Created by IntelliJ IDEA.
  User: ahmed
  Date: 5/29/2017
  Time: 6:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>${message}</h3><br>

<table>

    <tr>
        <th>UserName</th>
        <th>Password</th>
        <th>Address</th>
        <th>Mobile</th>
        <th>BirthDate</th>
    </tr>
    <c:forEach var="emp" items="${users}">


        <tr>
            <td>${emp.username}</td>
            <td>${emp.password}</td>
            <td>${emp.address}</td>
            <td>${emp.mobile}</td>
            <td>${emp.birthdate}</td>
            <td><a href="/updateUser/${emp.id}">Edit</a></td>
            <td><a href="/deleteUser/${emp.id}">Delete</a></td>
        </tr>


    </c:forEach>
    <a href="/addEmployee">Add New User ....</a>


</table>


</body>
</html>
