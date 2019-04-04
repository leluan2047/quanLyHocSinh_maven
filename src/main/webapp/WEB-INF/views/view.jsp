<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/2/2019
  Time: 9:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student information</title>
</head>
<body>
<h1>Student information</h1>
<a href="http://localhost:8080/"><p>back to student list</p></a>
<table>
    <tr>
        <td>Name:</td>
        <td>${Student.name}</td>
    </tr>

    <tr>
        <td>Age:</td>
        <td>${Student.age}</td>
    </tr>
    <tr>
        <td>Address:</td>
        <td>${Student.address}</td>
    </tr>
    <tr>
        <td>Sex:</td>
        <td>${Student.sex}</td>
    </tr>
    <tr>
        <td>Classroom:</td>
        <td>${Student.classroom}</td>
    </tr>
</table>

</body>
</html>
