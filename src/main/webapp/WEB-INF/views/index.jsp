<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1>Studen list</h1>
<a href="/create">Create new student</a>
<p></p>
<form method="post" action="find">
    <table>
        <tr>
            <td><input type="text" name="nameKey" placeholder="input correctly fullname"></td>
            <td><input type="submit" value="Search"></td>
        </tr>
    </table>
</form>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Age</td>
        <td>Address</td>
        <td>Sex</td>
        <td>ClassRoom</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["Student"]}' var="student">
        <tr>
            <td name ="${student.id}"><a href="/view?id=${student.id}">${student.name}</a></td>
            <td>${student.age}</td>
            <td>${student.address}</td>
            <td>${student.sex}</td>
            <td>${student.classroom}</td>
            <td><a href="/edit?id=${student.id}">edit</a></td>
            <td><a href="/delete?id=${student.id}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
