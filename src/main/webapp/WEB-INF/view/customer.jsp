<%--
  Created by IntelliJ IDEA.
  User: guanxiaoda
  Date: 17/5/19
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="BASE" value="${pageContext.reuqest.contextPath}"/>

<html>
<head>
    <title>客户管理</title>

</head>
<body>

<h1>客户管理</h1>
<table>
    <tr>
        <th>客户名称</th>
        <th>联系人</th>
        <th>电话</th>
        <th>邮箱</th>
        <th>操作</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.contact}</td>
            <td>${customer.telephone}</td>
            <td>${customer.email}</td>
            <td>
                <a href="${BASE}/customer_edit?id=${customer.id}">编辑</a>
                <a href="${BASE}/customer_delete?id=${customer.id}">删除</a>
            </td>

        </tr>
    </c:forEach>
</table>




</body>
</html>
