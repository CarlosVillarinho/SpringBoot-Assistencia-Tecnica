package br.fiap.assistencia.tecnica.service;

import br.fiap.assistencia.tecnica.domain.Cliente;
import br.fiap.assistencia.tecnica.repository.ClienteRepository;
import br.fiap.assistencia.tecnica.web.dto.ClienteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

//REALIZA AS OPREAÇOES
@Service
public class ClienteService {
    private final ClienteRepository repository;

    //CONSTRUROR (para inicializar a variavel)
    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    //METODO
    public Cliente cadastrar(ClienteDTO clienteDTO){
        Cliente cliente = new Cliente(); //CRIA COMO JPA PARA CONVERSAR COM O REPOSITORY
        cliente.setNome(clienteDTO.getNome());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setTelefone(clienteDTO.getTelefone());
        cliente.setSenha(clienteDTO.getSenha());

        return repository.save(cliente);
    }

    public List<Cliente> listar(){
        return repository.findAll();
    }

    public Cliente buscarPorId(Long id){
        return repository.findById(id).orElse(null);
    }
}
