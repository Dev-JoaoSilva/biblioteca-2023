package application.model; // Define o pacote onde a interface GeneroRepository está localizada.

import org.springframework.data.repository.CrudRepository; // Importa a interface CrudRepository do Spring Data.

public interface GeneroRepository extends CrudRepository<Genero, Integer> {
    
}
