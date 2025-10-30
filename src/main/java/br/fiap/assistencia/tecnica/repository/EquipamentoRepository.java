package br.fiap.assistencia.tecnica.repository;

import br.fiap.assistencia.tecnica.domain.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {
}
