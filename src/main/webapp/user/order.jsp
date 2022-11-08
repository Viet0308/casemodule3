<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/7/2022
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<form action="/Product">
    <div class="container mt-3">
        <h2>Basic Table</h2>
        <p>The .table class adds basic styling (light padding and horizontal dividers) to a table:</p>
        <table class="table">
            <thead>
            <tr>
                <th>id</th>
                <th>name</th>
                <th>img</th>
                <th>price</th>
                <th>amount</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach items="${sanphams}" var="sp">
                <tr>
                    <td>${sp.id}</td>
                    <td>${sp.name}</td>
                    <td><img src="${sp.img}" height="200" width="250"></td>
                    <td> ${sp.price}</td>
                    <td>
                        <div class="buttons_added">
                            <input class="minus is-form" type="button" value="-">
                            <input aria-label="quantity" class="input-qty" max="Số tối đa" min="Số tối thiểu" name="" type="number" value="">
                            <input class="plus is-form" type="button" value="+">
                        </div>
                    </td>
                    <td>
                        <a type="button" class="btn btn-success" href="/orders?id=${sp.id}">Order</a>

                    </td>
                </tr>
            </c:forEach>
            </tbody>

        </table>
        <p>Tong so tien phai thanh toan la : </p>
    </div>
</form>
</body>
</html>