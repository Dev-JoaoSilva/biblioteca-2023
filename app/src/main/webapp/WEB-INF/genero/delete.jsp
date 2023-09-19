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
            <!-- pega as informações e  deleta o genero com base no id adquirido-->
            <form action="/genero/delete" method="post">  
                <input type="hidden" name="id" value="${genero.id}" />
                <br />
                <a href="/genero/list" class="btn btn-primary" >Voltar</a>
                <button type="submit" class="btn btn-danger">Excluir</button>
            </form>
        </div>
    </body>
</html>

