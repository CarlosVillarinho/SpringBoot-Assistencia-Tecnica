package br.fiap.assistencia.tecnica.web.controller;

import br.fiap.assistencia.tecnica.domain.Equipamento;
import br.fiap.assistencia.tecnica.service.EquipamentoService;
import br.fiap.assistencia.tecnica.web.dto.EquipamentoDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {
    private final EquipamentoService service;

    //CONSTRUTOR
    public EquipamentoController(EquipamentoService service) {this.service = service;}

    @PostMapping
    public Equipamento cadastrar(@RequestBody EquipamentoDTO equipamentoDTO){
        return service.cadastrar(equipamentoDTO); //CHAMA O CADASTRAR DO 'SERVICE' E INSERE NA BASE DE DADOS
    }
}
