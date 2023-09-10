package com.lira.talento.application.infra;

import org.springframework.stereotype.Repository;

import com.lira.talento.application.repository.AdolescenteRepository;
import com.lira.talento.domain.Adolescente;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class AdolescenteInfraRepository implements AdolescenteRepository {
	
	private final AdolescenteSpringDataJPARepository adolescenteSpringDataJPARepository;

@Override
	
	public Adolescente salva(Adolescente adolescente) {
	log.info("[inicia] AdolescenteInfraRepository - salva");
	adolescenteSpringDataJPARepository.save(adolescente);
	log.info("[finaliza] AdolescenteInfraRepository - salva");
	return adolescente;
	}
}