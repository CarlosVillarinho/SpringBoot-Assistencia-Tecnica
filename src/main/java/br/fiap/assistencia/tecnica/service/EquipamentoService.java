package br.fiap.assistencia.tecnica.service;

import br.fiap.assistencia.tecnica.domain.Equipamento;
import br.fiap.assistencia.tecnica.repository.EquipamentoRepository;
import br.fiap.assistencia.tecnica.web.dto.EquipamentoDTO;
import org.springframework.stereotype.Service;

@Service
public class EquipamentoService {
    private final EquipamentoRepository repository;

    //CONSTRUROR (para inicializar a variavel)
    public EquipamentoService(EquipamentoRepository repository) {
        this.repository = repository;
    }

    //METODO
    public Equipamento cadastrar(EquipamentoDTO equipamentoDTO){
        Equipamento equipamento = new Equipamento(); //CRIA COMO JPA PARA CONVERSAR COM O REPOSITORY
        equipamento.setTipo(equipamentoDTO.getTipo());
        equipamento.setMarca(equipamentoDTO.getMarca());
        equipamento.setModelo(equipamentoDTO.getModelo());
        equipamento.setNumeroSerie(equipamentoDTO.getNumeroSerie());
        equipamento.setDataCadastro(equipamentoDTO.getDataCadastro());

        return repository.save(equipamento);
    }
}
