<%@ page import="com.example.demo.model.Employee" %><%--
  Created by IntelliJ IDEA.
  User: rbraga
  Date: 5/18/23
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Dados Empregado</h1>
    <table>
        <% Employee employee = (Employee) request.getAttribute("employee"); %>
        <tr>
            <td>Primeiro nome</td>
            <td><%= employee.getFirstName() %> </td>
        </tr>
        <tr>
            <td>Sobrenome</td>
            <td><%= employee.getLastName() %></td>
        </tr>
        <tr>
            <td>Usuario</td>
            <td><%= employee.getUsername() %></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><%= employee.getPassword() %></td>
        </tr>
        <tr>
            <td>Endereço</td>
            <td><%= employee.getAddress() %></td>
        </tr>
        <tr>
            <td>Contato</td>
            <td><%= employee.getContact() %></td>
        </tr>
    </table>
</body>
</html>
