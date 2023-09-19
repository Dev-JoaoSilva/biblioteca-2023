<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Remover Gênero</title>
        <link href="/css/bootstrap.min.css" rel="stylesheet" />
    </head>
    <body>
        <div class="container">
            <h1>Remover Gênero</h1>
            <p>Tem certeza que deseja remover o gênero "${genero.nome}" ?</p>
            <!-- Início do formulário para remoção de gênero -->
            <form action="/genero/delete" method="post">  
                <!-- Campo oculto para enviar o ID do gênero a ser excluído -->
                <input type="hidden" name="id" value="${genero.id}" />
                <br />
                <!-- Link "Voltar" para retornar à lista de gêneros -->
                <a href="/genero/list" class="btn btn-primary" >Voltar</a>
                <!-- Botão "Excluir" para confirmar a exclusão -->
                <button type="submit" class="btn btn-danger">Excluir</button>
            </form>
            <!-- Fim do formulário -->
        </div>
    </body>
</html>
