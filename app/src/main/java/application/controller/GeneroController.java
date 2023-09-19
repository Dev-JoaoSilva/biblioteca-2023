package application.controller; // Define o pacote para a classe GeneroController.

import java.util.Optional; // Importa a classe Optional do Java para lidar com valores opcionais.

import org.springframework.beans.factory.annotation.Autowired; // Importa as anotações e classes do Spring Framework.
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import application.model.Genero; // Importa a classe Genero do pacote application.model.
import application.model.GeneroRepository; // Importa a classe GeneroRepository do pacote application.model.

@Controller // Anotação indicando que esta classe é um controlador Spring.
@RequestMapping("/genero") // Define um mapeamento de URL base para este controlador.

public class GeneroController {
    @Autowired // Injeção de dependência do GeneroRepository.
    private GeneroRepository generoRepo;

    @RequestMapping("/list") // Mapeia a URL "/genero/list" para este método.
    public String list(Model model) { // Método que lista os gêneros.
        model.addAttribute("generos", generoRepo.findAll()); // Adiciona uma lista de gêneros ao modelo.
        return "/genero/list"; // Retorna o nome da view a ser renderizada.
    }

    @RequestMapping("/insert") // Mapeia a URL "/genero/insert" para este método.
    public String insert() { // Método para exibir um formulário de inserção de gênero.
        return "/genero/insert"; // Retorna o nome da view a ser renderizada.
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST) // Mapeia a URL "/genero/insert" com o método POST para este método.
    public String insert(@RequestParam("nome") String nome) { // Método para processar o formulário de inserção de gênero.
        Genero genero = new Genero(); // Cria uma nova instância de Genero.
        genero.setNome(nome); // Define o nome do gênero com base no parâmetro recebido.

        generoRepo.save(genero); // Salva o novo gênero no repositório.

        return "redirect:/genero/list"; // Redireciona para a lista de gêneros após a inserção.
    }

    @RequestMapping("/update") // Mapeia a URL "/genero/update" para este método.
    public String update(Model model, @RequestParam("id") int id) { // Método para exibir um formulário de atualização de gênero.
        Optional<Genero> genero = generoRepo.findById(id); // Busca o gênero pelo ID fornecido.

        if (genero.isPresent()) { // Verifica se o gênero existe.
            model.addAttribute("genero", genero.get()); // Adiciona o gênero ao modelo.
            return "/genero/update"; // Retorna o nome da view para atualização.
        }

        return "redirect:/genero/list"; // Redireciona para a lista de gêneros se o gênero não existir.
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST) // Mapeia a URL "/genero/update" com o método POST para este método.
    public String update(@RequestParam("id") int id, @RequestParam("nome") String nome) { // Método para processar o formulário de atualização de gênero.
        Optional<Genero> genero = generoRepo.findById(id); // Busca o gênero pelo ID fornecido.

        if (genero.isPresent()) { // Verifica se o gênero existe.
            genero.get().setNome(nome); // Atualiza o nome do gênero com base no parâmetro recebido.
            generoRepo.save(genero.get()); // Salva a atualização no repositório.
        }

        return "redirect:/genero/list"; // Redireciona para a lista de gêneros após a atualização.
    }

    @RequestMapping("/delete") // Mapeia a URL "/genero/delete" para este método.
    public String delete(Model model, @RequestParam("id") int id) { // Método para exibir um formulário de exclusão de gênero.
        Optional<Genero> genero = generoRepo.findById(id); // Busca o gênero pelo ID fornecido.

        if (genero.isPresent()) { // Verifica se o gênero existe.
            model.addAttribute("genero", genero.get()); // Adiciona o gênero ao modelo.
            return "/genero/delete"; // Retorna o nome da view para exclusão.
        }

        return "redirect:/genero/list"; // Redireciona para a lista de gêneros se o gênero não existir.
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST) // Mapeia a URL "/genero/delete" com o método POST para este método.
    public String delete(@RequestParam("id") int id) { // Método para processar a exclusão de um gênero.
        generoRepo.deleteById(id); // Exclui o gênero com o ID fornecido do repositório.

        return "redirect:/genero/list"; // Redireciona para a lista de gêneros após a exclusão.
    }
}
