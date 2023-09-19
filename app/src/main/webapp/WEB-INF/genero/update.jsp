<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Editar Gênero</title>
        <!-- Inclusão do arquivo CSS Bootstrap para estilização -->
        <link href="/css/bootstrap.min.css" rel="stylesheet" />
    </head>
    <body>
        <div class="container">
            <h1>Editar Gênero</h1>
            <!-- Formulário para editar informações do gênero -->
            <form action="/genero/update" method="post">
                <!-- Campo oculto para enviar o ID do gênero a ser editado -->
                <input type="hidden" name="id" value="${genero.id}" />
                <div class="form-group">
                    <label for="nome">Nome:</label>
                    <!-- Campo de entrada para editar o nome do gênero, com o valor inicial preenchido com o nome atual do gênero -->
                    <input type="text" name="nome" class="form-control" value="${genero.nome}" />
                </div>
                <br />
                <!-- Link "Voltar" para retornar à lista de gêneros -->
                <a href="/genero/list" class="btn btn-primary" >Voltar</a>
                <!-- Botão "Salvar" para submeter o formulário e salvar as alterações no gênero -->
                <button type="submit" class="btn btn-success">Salvar</button>
            </form>
            <!-- Fim do formulário -->
        </div>
    </body>
</html>
