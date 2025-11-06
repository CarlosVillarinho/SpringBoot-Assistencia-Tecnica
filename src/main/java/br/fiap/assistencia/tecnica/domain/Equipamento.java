package br.fiap.assistencia.tecnica.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

//@Data //GERA AUTOMATICAMENTE OS GETS, SETS, TooSTRING...
@Getter //GERA AUTOMATICAMENTE OS GETS
@Setter //GERA AUTOMATICAMENTE OS SETS
@Entity
@Table(name = "JAVA_EQUIPAMENTO")
public class Equipamento {
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EQUIP")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER) //DIGO A RELAÇAO ENTRE 'EQUIPAMENTOS' E 'CLIENTE' (muito para um)
    @JoinColumn(name = "ID_CLIENTE", foreignKey = @ForeignKey(name = "FK_EQUIP_CLIENTE")) //JUNTA AS DUAS TABELAS 'JAVA_EQUIPAMENTO' COM 'JAVA_CLIENTE'
    private Cliente cliente;

    @Column(name = "TIPO", length = 50, nullable = false)
    private String tipo;

    @Column(name = "MARCA", length = 50)
    private String marca;

    @Column(name = "MODELO", length = 50)
    private String modelo;

    @Column(name = "NUMERO_SERIE", length = 80, unique = true)
    private String numeroSerie;

    @Column(name = "DATA_CADASTRO", nullable = false)
    private LocalDate dataCadastro;
}

