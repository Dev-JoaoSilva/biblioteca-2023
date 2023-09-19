<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Gêneros</title>
        <!-- Inclusão do arquivo CSS Bootstrap para estilização -->
        <link href="/css/bootstrap.min.css" rel="stylesheet" />
    </head>
    <body>
        <div class="container">
        <h1>Gêneros</h1>
        <!-- Botão "Novo Gênero" para criar um novo gênero -->
            <a href="/genero/insert" class="btn btn-primary">Novo Gênero</a>
            <!-- Tabela para exibir os gêneros -->
            <table class="table">
                <tr>
                    <th>Id</th>
                    <th>Nome</th>
                    <th>&nbsp;</th>
                </tr>
                <!-- Loop para exibir os gêneros recuperados do banco de dados -->
                <c:forEach var="item" items="${generos}">
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.nome}</td>
                        <td>
                            <!-- Links "Editar" e "Excluir" para cada gênero -->
                            <a href="/genero/update?id=${item.id}" class="btn btn-warning">Editar</a>
                            <a href="/genero/delete?id=${item.id}" class="btn btn-danger">Excluir</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
