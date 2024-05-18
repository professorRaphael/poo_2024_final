<%--
  Created by IntelliJ IDEA.
  User: Raphael
  Date: 17/05/2024
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Editar Contato</title>
    <link rel="stylesheet" href="<c:url value='/css/style.css' />">
</head>
<body>
<h1>Editar Contato</h1>

<form action="${pageContext.request.contextPath}/contatos/editar/${contato.id}" method="post">
    <input type="hidden" id="id" name="id" value="${contato.id}">

    <label for="nome">Nome:</label>
    <input type="text" id="nome" name="nome" value="${contato.nome}" required>

    <label for="telefone">Telefone:</label>
    <input type="text" id="telefone" name="telefone" value="${contato.telefone}" required>

    <button type="submit">Atualizar</button>
</form>

<a href="${pageContext.request.contextPath}/contatos">Voltar para a Lista</a>
</body>
</html>


