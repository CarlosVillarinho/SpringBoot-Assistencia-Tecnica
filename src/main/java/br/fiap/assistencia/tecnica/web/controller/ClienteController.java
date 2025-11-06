package br.fiap.assistencia.tecnica.web.controller;

import br.fiap.assistencia.tecnica.domain.Cliente;
import br.fiap.assistencia.tecnica.domain.Equipamento;
import br.fiap.assistencia.tecnica.service.ClienteService;
import br.fiap.assistencia.tecnica.web.dto.ClienteDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//CHEGA COMO JSON
//CONTROL / DELEGA, NAO REALIZA NENUMA OPRECAÇAO
@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private final ClienteService service;

    //CONSTRUTOR
    public ClienteController(ClienteService service) {
        this.service = service;
    }

    //TRANSFORMA PARA UM DTO (@RequestBody é quem faz isso)
    @PostMapping
    public Cliente cadastrar(@RequestBody ClienteDTO clienteDTO){
        return service.cadastrar(clienteDTO); //CHAMA O CADASTRAR DO 'SERVICE' E INSERE NA BASE DE DADOS
    }

    //LISTAR TODOS OS CLIENTES
    @GetMapping
    public List<Cliente> listar(){
        return service.listar();
    }

    //BUSCAR OELO ID DO CLIENTE
    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @GetMapping("/{id}/equipamento")
    public List<Equipamento> listarEquipamentoPorCliente(@PathVariable Long id){return service.listarEquipamentoPorCliente(id);}
}
