<%--
  Created by IntelliJ IDEA.
  User: ahmed
  Date: 5/29/2017
  Time: 11:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>${message}</h3><br>

<h5 style="color: red;">

    <form:errors path="user.*"></form:errors>
</h5>

<form action="/editUser" method="post">

    <table>
        <tr>
            <td><input name="id" type="hidden" value="${user.id}"></td>

        </tr>
        <tr>
            <td>Username :</td>
            <td><input type="text" placeholder="UserName" name="username" value="${user.username}"></td>


        </tr>
        <tr>
            <td>password :</td>
            <td><input type="text" placeholder="password" name="password" value="${user.password}"></td>


        </tr>

        <tr>
            <td>address :</td>
            <td><input type="text" placeholder="address" name="address" value="${user.address}"></td>


        </tr>
        <tr>
            <td>Mobile :</td>
            <td><input type="number" placeholder="mobile" name="mobile" value="${user.mobile}"></td>


        </tr>
        <tr>
            <td>BirthDate :</td>
            <td><input type="text" placeholder="birthdate" name="birthdate" value="${user.birthdate}"></td>


        </tr>
        <tr>
            <td><input type="submit" name="EditUser" value="Edit User"></td>


        </tr>
    </table>


</form>
<br><br>
<a href="/addEmployee">
    AddEmployee ..... </a>
<a href="/viewEmployees">ViewEmployees ..... </a>

</body>
</html>
