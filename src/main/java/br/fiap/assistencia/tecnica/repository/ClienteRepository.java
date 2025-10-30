package br.fiap.assistencia.tecnica.repository;

import br.fiap.assistencia.tecnica.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

//CHEGA COMO JPA
//CRIA CRUD - CHAMA OS METODOS DO 'JPAREPOSITORY' NO SERVICE
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
