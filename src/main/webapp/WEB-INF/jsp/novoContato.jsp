<%--
  Created by IntelliJ IDEA.
  User: Raphael
  Date: 17/05/2024
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="<c:url value='/css/style.css' />">
</head>
<body>
<h1>Novo Contato</h1>
<form action="/contatos" method="post">
    <label for="nome">Nome:</label>
    <input type="text" id="nome" name="nome" required>
    <label for="telefone">Telefone:</label>
    <input type="text" id="telefone" name="telefone" required>
    <button type="submit">Salvar</button>
    <br>
    <a class="link" href="${pageContext.request.contextPath}/">Voltar para Home</a>
</form>
</body>
</html>
