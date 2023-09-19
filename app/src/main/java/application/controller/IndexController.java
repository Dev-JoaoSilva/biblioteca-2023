package application.controller; // Define o pacote para a classe IndexController.

import org.springframework.stereotype.Controller; // Importa a anotação Controller do Spring Framework.
import org.springframework.web.bind.annotation.RequestMapping; // Importa a anotação RequestMapping do Spring Framework.

@Controller // Anotação indicando que esta classe é um controlador Spring.

public class IndexController {
    @RequestMapping("/") // Mapeia a URL raiz ("/") para o método home().
    public String home() { // Método para manipular solicitações na URL raiz.
        // return "WEB-INF/home.jsp"; // Poderia retornar o nome de uma view JSP.
        return "home"; // Retorna o nome de uma view chamada "home".
    }
}
