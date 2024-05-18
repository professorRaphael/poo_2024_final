<%--
  Created by IntelliJ IDEA.
  User: Raphael
  Date: 17/05/2024
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Editar Contat</title>
</head>
<body>
<h1>Editar Contato</h1>
<form action="/contatos/editar/${contato.id}" method="post">
    <label for="nome">Nome:</label>
    <input type="text" id="nome" name="nome" value="${contato.nome}" required>
    <label for="telefone">Telefone:</label>
    <input type="text" id="telefone" name="telefone" value="${contato.telefone}" required>
    <button type="submit">Atualizar</button>
</form>
</body>
</html>
