package com.lira.talento.application.service;

import org.springframework.stereotype.Service;

import com.lira.talento.application.api.request.AdolescenteRequest;
import com.lira.talento.application.api.response.AdolescenteResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class AdolescenteApplicationService implements AdolescenteService {

	@Override
	public AdolescenteResponse criaAdolescente(AdolescenteRequest adolescenteRequest) {
		log.info("[inicia] AdolescenteApplicationService - criaAdolescente"); 
		log.info("[finaliza] AdolescenteApplicationService - criaAdolescente"); 
		return null;
	}

}
