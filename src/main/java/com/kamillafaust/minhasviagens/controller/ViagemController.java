package com.kamillafaust.minhasviagens.controller;

import com.kamillafaust.minhasviagens.model.Viagem;
import com.kamillafaust.minhasviagens.repository.ViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/viagem")
public class ViagemController {

    @Autowired //injeta os recursos da interface ViagemRepository dentro dessa controller
    private ViagemRepository repository;

    @GetMapping
    public ResponseEntity<List<Viagem>> obterPlanosViagem() {

        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
        //torna o objeto java em http -> ResponseEntity
    }

    @PostMapping
    public void cadastrarViagem(@RequestBody Viagem viagem) {
        repository.save(viagem);
    }
}
