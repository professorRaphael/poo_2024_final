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
    <title>Lista de Contatos</title>
</head>
<body>
<h1>Lista de Contatos</h1>
<a href="/contatos/novo">Novo Contato</a>
<ul>
    <c:forEach var="contato" items="${contatos}">
        <li>${contato.nome} - ${contato.telefone}
            <a href="/contatos/editar/${contato.id}">Editar</a>
            <a href="/contatos/excluir/${contato.id}">Excluir</a>
        </li>
    </c:forEach>
</ul>
</body>
</html>
