package br.fiap.assistencia.tecnica.service;

import br.fiap.assistencia.tecnica.domain.Equipamento;
import br.fiap.assistencia.tecnica.repository.ClienteRepository;
import br.fiap.assistencia.tecnica.repository.EquipamentoRepository;
import br.fiap.assistencia.tecnica.web.dto.EquipamentoDTO;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class EquipamentoService {
    private final ClienteRepository clienterepository;
    private final EquipamentoRepository repository;

    //CONSTRUROR (para inicializar a variavel)
    public EquipamentoService(ClienteRepository clienterepository, EquipamentoRepository repository) {
        this.clienterepository = clienterepository;
        this.repository = repository;
    }

    //METODO
    public Equipamento cadastrar(EquipamentoDTO equipamentoDTO){
        //BUSCA CLIENTE POR ID (.findById)
        System.out.println(equipamentoDTO.getIdCliente());
        var cliente = clienterepository.findById(equipamentoDTO.getIdCliente())
                .orElseThrow(() -> new NoSuchElementException("Cliente não encontradao"));

        var equipamentoEntity = new Equipamento();
        equipamentoEntity.setCliente(cliente);
        equipamentoEntity.setTipo(equipamentoDTO.getTipo());
        equipamentoEntity.setMarca(equipamentoDTO.getMarca());
        equipamentoEntity.setModelo(equipamentoDTO.getModelo());
        equipamentoEntity.setNumeroSerie(equipamentoDTO.getNumeroSerie());
        equipamentoEntity.setDataCadastro(equipamentoDTO.getDataCadastro());

        return repository.save(equipamentoEntity);
    }
}
