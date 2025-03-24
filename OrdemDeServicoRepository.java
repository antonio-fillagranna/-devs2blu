package com.seuprojeto.osg.ordemdeservico;

import com.seuprojeto.osg.tecnico.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
interface OrdemDeServicoRepository extends JpaRepository<OrdemDeServico, UUID> {
    List<OrdemDeServico> findByTecnicoAndDataDeFechamentoIsNull(Tecnico tecnico);
    int countByTecnicoAndDataDeFechamentoIsNull(Tecnico tecnico);
}