package com.kamillafaust.minhasviagens;

import org.springframework.http.ResponseEntity; //responseEntity é um json
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/viagem")
public class ViagemController {

    //retorna um json do tipo viagem
    @GetMapping //se nao passar nada, quando acessarmos a rota /viagem, ele já será acessado
    public ResponseEntity<Viagem> mostrarViagem() {
        Viagem viagem = new Viagem("João Pessoa", "Maldivas");

        return ResponseEntity.ok().body(viagem);
        //ResponseEntity.status(HttpStatus.OK).body(viagem);
        //  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(viagem);
    }
}
