package application; // Define o pacote onde a classe WebApplication está localizada.

import org.springframework.boot.SpringApplication; // Importa a classe SpringApplication do Spring Boot.
import org.springframework.boot.autoconfigure.SpringBootApplication; // Importa a anotação SpringBootApplication do Spring Boot.

@SpringBootApplication // Anotação que indica que esta classe é a classe principal de uma aplicação Spring Boot.
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args); // Inicia a aplicação Spring Boot.
    }
}
