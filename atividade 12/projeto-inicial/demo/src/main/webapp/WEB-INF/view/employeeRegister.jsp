<%--
  Created by IntelliJ IDEA.
  User: rbraga
  Date: 5/11/23
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Registro de Empregados</h1>
<form action="<%=request.getContextPath()%>/register" method="post">
    <table>
        <tr>
            <td>Primeiro nome</td>
            <td><input type="text" name="firstName"/></td>
        </tr>
        <tr>
            <td>Sobrenome</td>
            <td><input type="text" name="lastName"/></td>
        </tr>
        <tr>
            <td>Usuario</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td>Endereço</td>
            <td><input type="text" name="address"/></td>
        </tr>
            <td>Contato</td>
            <td><input type="text" name="contact"/></td>
        </tr>
    </table>
    <input type="submit" value="Confirmar">

</form>

</body>
</html>
