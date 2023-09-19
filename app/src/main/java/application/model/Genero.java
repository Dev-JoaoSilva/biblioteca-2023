package application.model; // Define o pacote onde a classe Genero está localizada.

import jakarta.persistence.Entity; // Importa a anotação Entity do Jakarta Persistence.
import jakarta.persistence.GeneratedValue; // Importa a anotação GeneratedValue do Jakarta Persistence.
import jakarta.persistence.GenerationType; // Importa a enumeração GenerationType do Jakarta Persistence.
import jakarta.persistence.Id; // Importa a anotação Id do Jakarta Persistence.
import jakarta.persistence.Table; // Importa a anotação Table do Jakarta Persistence.

@Entity // Anotação que indica que esta classe é uma entidade persistente.
@Table(name="generos") // Anotação que especifica o nome da tabela no banco de dados onde esta entidade será mapeada.

public class Genero {
    @Id // Anotação que marca o campo 'id' como a chave primária da entidade.
    @GeneratedValue(strategy=GenerationType.IDENTITY) // Anotação que configura a geração automática do valor da chave primária.
    private int id; // Campo que representa o ID do gênero.
    private String nome; // Campo que representa o nome do gênero.

    // Métodos getters e setters para os campos 'id' e 'nome'.
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
