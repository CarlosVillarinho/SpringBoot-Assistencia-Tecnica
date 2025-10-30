package br.fiap.assistencia.tecnica.web.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EquipamentoDTO {
    //ATRIBUTOS
    private Long id;
    private long Idcliente;
    private String tipo, marca, modelo, numeroSerie;
    private LocalDate dataCadastro;
}
