package com.kamillafaust.minhasviagens;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //permitir que o framework use essa classe pra responder requisições http
public class InicioController {

    @GetMapping("/") // ou por padrão, somente  @GetMapping()
    public String exibirTelaRaiz() {
        return "Olá Mundo no Spring na rota raiz!";
    }

    @GetMapping("/inicio") //esse metodo vai ser lido quando a gente mandar uma requisição get para /inicio
    public String exibirTelaInicial() {
        return "Olá Mundo no Spring!";
    }

}
