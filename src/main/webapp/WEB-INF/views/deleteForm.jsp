<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/3/2019
  Time: 6:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Delete</title>
</head>
<body>
<h1>Student information</h1>
<a href="http://localhost:8080/"><p>Back to student list</p></a>
<p>${message}</p>
<form:form method="post" modelAttribute="student" action="/delete" >
    <fieldset>
        <table>
            <tr>
                <td>ID:</td>
                <td><form:hidden path="id" value="${student.id}"/></td>
            </tr>

            <tr>
                <td>Name:</td>
                <td><form:input path="name" value="${student.name}"/></td>
            </tr>
            <tr>
                <td>Age:</td>
                <td><form:input path="age" value="${student.age}"/></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:input path="address" value="${student.address}"/></td>
            </tr>
            <tr>
                <td>Sex:</td>
                <td><form:input path="sex" value="${student.sex}"/></td>
            </tr>
            <tr>
                <td>Classroom:</td>
                <td><form:input path="classroom" value="${student.classroom}"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Delete"></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
