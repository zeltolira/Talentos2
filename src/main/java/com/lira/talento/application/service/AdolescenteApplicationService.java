package com.lira.talento.application.service;

import org.springframework.stereotype.Service;

import com.lira.talento.application.api.request.AdolescenteRequest;
import com.lira.talento.application.api.response.AdolescenteResponse;
import com.lira.talento.application.repository.AdolescenteRepository;
import com.lira.talento.domain.Adolescente;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class AdolescenteApplicationService implements AdolescenteService {

	private final AdolescenteRepository adolescenteRepository;

	@Override
	public AdolescenteResponse criaAdolescente(AdolescenteRequest adolescenteRequest) {
		log.info("[inicia] AdolescenteApplicationService - criaAdolescente"); 
		Adolescente adolescente = adolescenteRepository.salva(new Adolescente(adolescenteRequest));
		log.info("[finaliza] AdolescenteApplicationService - criaAdolescente"); 
		return AdolescenteResponse.builder()
				.idAdolescente(adolescente.getIdAdolescente())
				.build();
	}

}
