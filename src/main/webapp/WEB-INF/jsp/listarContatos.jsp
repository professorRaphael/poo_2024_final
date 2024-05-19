<%--
  Created by IntelliJ IDEA.
  User: Raphael
  Date: 17/05/2024
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Contatos</title>
    <link rel="stylesheet" href="<c:url value='/css/style.css' />">
</head>
<body>
<h1>Lista de Contatos</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Nome</th>
        <th>Telefone</th>
        <th>Editar - Excluir</th>
    </tr>
    <c:forEach var="contato" items="${contatos}">
        <tr>
            <td>${contato.id}</td>
            <td>${contato.nome}</td>
            <td>${contato.telefone}</td>
            <td>
                <a class="editar" href="${pageContext.request.contextPath}/contatos/editar/${contato.id}">Editar</a>
                <a class="excluir" href="${pageContext.request.contextPath}/contatos/excluir/${contato.id}">Excluir</a>
            </td>
        </tr>
    </c:forEach>
</table>

<a class="criar" href="${pageContext.request.contextPath}/contatos/novo">Adicionar Novo Contato</a><br><br>
<a class="link" href="${pageContext.request.contextPath}/">Voltar para Home</a>
</body>
</html>

