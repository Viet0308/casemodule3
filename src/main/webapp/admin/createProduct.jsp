<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/4/2022
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create product</h1>
<form action="/create" method="get">
    <table>
        <tr>
            <td>Nhập id</td>
            <td><input name="id" placeholder="nhập id">
        </tr>
        <tr>
            <td>Nhập name</td>
            <td><input name="name" placeholder="nhập name">
        </tr>
        <tr>
            <td>Nhập img</td>
            <td><input name="img" placeholder="nhập img">
        </tr>
        <tr>
            <td>Nhập price</td>
            <td><input name="price" placeholder="nhập price">
        </tr>

    </table>
    <button type="submit">Submit</button>
</form>
</body>
</html>
