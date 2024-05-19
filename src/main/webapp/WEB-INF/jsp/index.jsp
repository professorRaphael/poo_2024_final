<%--
  Created by IntelliJ IDEA.
  User: Raphael
  Date: 18/05/2024
  Time: 09:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Página Principal</title>
    <link rel="stylesheet" href="<c:url value='/css/style.css' />">
</head>
<body>
<h1>Bem-vindo ao Sistema de Contatos</h1>
<nav>
    <ul>
        <li><a class="link" href="<c:url value='/contatos/novo' />">Incluir Contato</a></li>
        <li><a class="link" href="<c:url value='/contatos' />">Listar Contatos</a></li>
    </ul>
</nav>
</body>
</html>
