<%--
  Created by IntelliJ IDEA.
  User: ahmed
  Date: 5/29/2017
  Time: 6:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3 >${message}</h3><br>

<h5 style="color: red;">

    <form:errors path="user.*"></form:errors>
</h5>
<form action="/saveUser" method="post">


    <table>
        <tr>
            <td>Username :</td>
            <td><input type="text" placeholder="UserName" name="username"></td>


        </tr>
        <tr>
            <td>password :</td>
            <td><input type="text" placeholder="password" name="password"></td>


        </tr>

        <tr>
            <td>address :</td>
            <td><input type="text" placeholder="address" name="address"></td>


        </tr>
        <tr>
            <td>Mobile :</td>
            <td><input type="number" placeholder="mobile" name="mobile"></td>


        </tr>
        <tr>
            <td>BirthDate :</td>
            <td><input type="text" placeholder="birthdate" name="birthdate"></td>


        </tr>
        <tr>
            <td><input type="submit" name="save" value="Save User"></td>


        </tr>
    </table>


</form>

</body>
</html>
