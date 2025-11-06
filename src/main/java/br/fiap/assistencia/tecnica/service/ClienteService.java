package br.fiap.assistencia.tecnica.service;

import br.fiap.assistencia.tecnica.domain.Cliente;
import br.fiap.assistencia.tecnica.domain.Equipamento;
import br.fiap.assistencia.tecnica.repository.ClienteRepository;
import br.fiap.assistencia.tecnica.repository.EquipamentoRepository;
import br.fiap.assistencia.tecnica.web.config.SenhaConfig;
import br.fiap.assistencia.tecnica.web.dto.ClienteDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//REALIZA AS OPREAÇOES
@Service
public class ClienteService {
    private final ClienteRepository repository;
    private final EquipamentoRepository equipamentoRepository;
    private final SenhaConfig senhaConfig;

    //CONSTRUROR (para inicializar a variavel)
    public ClienteService(ClienteRepository repository, EquipamentoRepository equipamentoRepository, SenhaConfig senhaConfig) {
        this.repository = repository;
        this.equipamentoRepository = equipamentoRepository;
        this.senhaConfig = senhaConfig;
    }

    //METODO
    public Cliente cadastrar(ClienteDTO clienteDTO){
        Cliente cliente = new Cliente(); //CRIA COMO JPA PARA CONVERSAR COM O REPOSITORY
        cliente.setNome(clienteDTO.getNome());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setTelefone(clienteDTO.getTelefone());
        cliente.setSenha(senhaConfig.enconder().encode(clienteDTO.getSenha()));

        return repository.save(cliente);
    }

    public List<Cliente> listar(){
        return repository.findAll();
    }

    public Cliente buscarPorId(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Equipamento> listarEquipamentoPorCliente(@PathVariable Long id){
        return equipamentoRepository.findByClienteId(id);
    }
}
