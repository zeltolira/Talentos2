package com.lira.talento.application.infra;

import org.springframework.stereotype.Repository;

import com.lira.talento.application.api.request.AdolescenteRequest;
import com.lira.talento.application.repository.AdolescenteRepository;
import com.lira.talento.domain.Adolescente;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class AdolescenteInfraRepository implements AdolescenteRepository {

	@Override
	public Adolescente criaAdolescente(AdolescenteRequest adolescenteRequest) {
		log.info("[inicia] AdolescenteInfraRepository - criaAdolescente");
		
		log.info("[finaliza] AdolescenteInfraRepository - criaAdolescente");
		return null;
	}

}
