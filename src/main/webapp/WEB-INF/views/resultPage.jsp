<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/4/2019
  Time: 8:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result list</title>
</head>
<h1>Result list</h1>
<body>
    <table border="1">
        <tr>
            <td>Name</td>
            <td>Age</td>
            <td>Address</td>
            <td>Sex</td>
            <td>Classroom</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
        <c:forEach items='${requestScope["list"]}' var="student">
            <tr>
                <td name ="${student.getId()}"><a href="/view?id=${student.getId()}">${student.getName()}</a></td>
                <td>${student.getAge()}</td>
                <td>${student.getAddress()}</td>
                <td>${student.getSex()}</td>
                <td>${student.getClassroom()}</td>
                <td><a href="/edit?id=${student.getId()}">edit</a></td>
                <td><a href="/delete?id=${student.getId()}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
