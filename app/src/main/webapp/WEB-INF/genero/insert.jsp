<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Novo Gênero</title>
        <!-- Inclusão do arquivo CSS Bootstrap para estilização -->
        <link href="/css/bootstrap.min.css" rel="stylesheet" />
    </head>
    <body>
        <div class="container">
            <h1>Novo Gênero</h1>
            <!-- Formulário para adicionar um novo gênero -->
            <form action="/genero/insert" method="post">
                <div class="form-group">
                    <label for="nome">Nome:</label>
                    <!-- Campo de entrada para inserir o nome do gênero -->
                    <input type="text" name="nome" class="form-control" />
                </div>
                <br />
                <!-- Link "Voltar" para retornar à lista de gêneros -->
                <a href="/genero/list" class="btn btn-primary" >Voltar</a>
                <!-- Botão "Salvar" para submeter o formulário e adicionar o gênero -->
                <button type="submit" class="btn btn-success">Salvar</button>
            </form>
            <!-- Fim do formulário -->
        </div>
    </body>
</html>
