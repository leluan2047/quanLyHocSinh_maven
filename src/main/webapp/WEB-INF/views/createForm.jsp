<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<h1>Create new student</h1>
<a href="http://localhost:8080/"><p>Back to student list</p></a>
<p>${message}</p>
<form:form action="/create" method="post" modelAttribute ="student">
    <fieldset>
        <table>
            <tr>
                <td><form:label path="name"/>Name:</td>
                <td><form:input path="name"/></td>
            </tr>
            <tr>
                <td><form:label path="age"/>Age:</td>
                <td><form:input path="age"/></td>
            </tr>
            <tr>
                <td><form:label path="address"/>Address:</td>
                <td><form:input path="address"/></td>
            </tr>
            <tr>
                <td><form:label path="sex"/>Sex:</td>
                <td><form:input path="sex"/></td>
            </tr>
            <tr>
                <td><form:label path="classroom"/>Classroom:</td>
                <td><form:input path="classroom"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create"></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
