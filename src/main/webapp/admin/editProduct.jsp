<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/4/2022
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: trang
  Date: 10/31/2022
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: trang
  Date: 10/31/2022
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit product</h1>
<form action="/edits" method="post">
    <table>
        <tr>
            <td>Nhập id</td>
            <td><input name="id" value="${p.id}"readonly>
        </tr>
        <tr>
            <td>Nhập name</td>
            <td><input name="name" value="${p.name}">
        </tr>
        <tr>
            <td>Nhập img</td>
            <td><input name="img" value="${p.img}">
        </tr>
        <tr>
            <td>Nhập price</td>
            <td><input name="price" value="${p.price}">
        </tr>

    </table>
    <button type="submit">Submit</button>
</form>
</body>
</html>
