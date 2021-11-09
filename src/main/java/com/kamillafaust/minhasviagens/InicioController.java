package com.kamillafaust.minhasviagens;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //permitir que o framework use essa classe pra responder requisições http, um endpoint
public class InicioController {

    @GetMapping("/") // ou por padrão, somente  @GetMapping(), é a raiz.
    public String exibirTelaInicial() {
        return "Uma API para planejamento de viagens"; //É comum tbm encontrarmos na raiz uma descrição da API
    }

    @GetMapping("/retorno-html")
    public String testaRetornoHtml() {
        String cabecalho = "<h1 style='color:red'>Aplicação Clássica</h1>";
        String paragrafo = "<p>Esta mensagem é um parágrafo</p>";
        return  cabecalho + paragrafo;
    }
}


//("/inicio") esse metodo vai ser lido quando a gente mandar uma requisição get para /inicio
