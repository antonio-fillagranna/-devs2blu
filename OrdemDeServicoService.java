package com.seuprojeto.osg.ordemdeservico;

import com.seuprojeto.osg.tecnico.Tecnico;
import com.seuprojeto.osg.tecnico.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import com.seuprojeto.osg.tecnico.Especialidade;

@Service
public class OrdemDeServicoService {

    @Autowired
    private OrdemDeServicoRepository ordemDeServicoRepository;

    @Autowired
    private TecnicoService tecnicoService;

    public List<OrdemDeServico> findAll() {
        return ordemDeServicoRepository.findAll();
    }

    public Optional<OrdemDeServico> findById(UUID id) {
        return ordemDeServicoRepository.findById(id);
    }

    public OrdemDeServico save(OrdemDeServico ordemDeServico) {
        return ordemDeServicoRepository.save(ordemDeServico);
    }

    public void deleteById(UUID id) {
        ordemDeServicoRepository.deleteById(id);
    }

    public Map<Especialidade, Set<TipoServico>> getAssociacaoServicoEspecialidade() {
        Map<Especialidade, Set<TipoServico>> associacao = new HashMap<>();

        // Associações para ESPECIALIDADE1
        Set<TipoServico> servicosEspecialidade1 = new HashSet<>();
        servicosEspecialidade1.add(TipoServico.TIPO1);
        servicosEspecialidade1.add(TipoServico.TIPO2);
        servicosEspecialidade1.add(TipoServico.TIPO3);
        servicosEspecialidade1.add(TipoServico.TIPO4);
        associacao.put(Especialidade.ESPECIALIDADE1, servicosEspecialidade1);

        // Associações para ESPECIALIDADE2
        Set<TipoServico> servicosEspecialidade2 = new HashSet<>();
        servicosEspecialidade2.add(TipoServico.TIPO5);
        servicosEspecialidade2.add(TipoServico.TIPO6);
        servicosEspecialidade2.add(TipoServico.TIPO7);
        servicosEspecialidade2.add(TipoServico.TIPO8);
        associacao.put(Especialidade.ESPECIALIDADE2, servicosEspecialidade2);

        // Associações para ESPECIALIDADE3
        Set<TipoServico> servicosEspecialidade3 = new HashSet<>();
        servicosEspecialidade3.add(TipoServico.TIPO9);
        servicosEspecialidade3.add(TipoServico.TIPO10);
        servicosEspecialidade3.add(TipoServico.TIPO11);
        servicosEspecialidade3.add(TipoServico.TIPO12);
        associacao.put(Especialidade.ESPECIALIDADE3, servicosEspecialidade3);

        // Associações para ESPECIALIDADE4
        Set<TipoServico> servicosEspecialidade4 = new HashSet<>();
        servicosEspecialidade4.add(TipoServico.TIPO13);
        servicosEspecialidade4.add(TipoServico.TIPO14);
        servicosEspecialidade4.add(TipoServico.TIPO15);
        servicosEspecialidade4.add(TipoServico.TIPO16);
        associacao.put(Especialidade.ESPECIALIDADE4, servicosEspecialidade4);

        return associacao;
    }

    public List<Tecnico> findTecnicosDisponiveis(TipoServico tipoServico) {
        Map<Especialidade, Set<TipoServico>> associacao = getAssociacaoServicoEspecialidade();

        Especialidade encontradaEspecialidade = null;
        for (Map.Entry<Especialidade, Set<TipoServico>> entry : associacao.entrySet()) {
            if (entry.getValue().contains(tipoServico)) {
                encontradaEspecialidade = entry.getKey();
                break;
            }
        }

        if (encontradaEspecialidade == null) {
            return List.of();
        }

        final Especialidade especialidadeFinal = encontradaEspecialidade;

        List<Tecnico> tecnicos = tecnicoService.findAll().stream()
                .filter(tecnico -> tecnico.getEspecialidade() == especialidadeFinal)
                .collect(Collectors.toList());

        tecnicos.sort((tecnico1, tecnico2) -> {
            LocalDateTime termino1 = getHorarioTerminoUltimaOS(tecnico1);
            LocalDateTime termino2 = getHorarioTerminoUltimaOS(tecnico2);
            return termino1.compareTo(termino2);
        });

        return tecnicos;
    }


    private LocalDateTime getHorarioTerminoUltimaOS(Tecnico tecnico) {
        // Obter todas as OS abertas do técnico
        List<OrdemDeServico> osAbertas = ordemDeServicoRepository.findByTecnicoAndDataDeFechamentoIsNull(tecnico);

        if (osAbertas.isEmpty()) {
            // Se não houver OS abertas, retornar um horário "muito cedo"
            return LocalDateTime.MIN;
        }

        // Encontrar a OS com o horário de término mais tarde
        return osAbertas.stream()
                .map(OrdemDeServico::getDataDeFechamento)
                .max(LocalDateTime::compareTo)
                .orElse(LocalDateTime.MIN);
    }
}