<%--
  Created by IntelliJ IDEA.
  User: rbraga
  Date: 5/18/23
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Usuário</title>
    <h1>Login Usuário</h1>
    <form action="<%=request.getContextPath()%>/login" method="post">
        <table>
            <tr>
                <td>Usuario</td>
                <td><input value="username" name="username"></td>
            </tr>
            <tr>
                <td>Senha</td>
                <td><input value="password" name="password"></td>
            </tr>
        </table>
        <input type="submit" value="Confirmar"/>
    </form>
</head>
<body>

</body>
</html>
