package com.lira.talento.application.api;

import org.springframework.stereotype.Controller;

import com.lira.talento.application.api.request.AdolescenteRequest;
import com.lira.talento.application.api.response.AdolescenteResponse;
import com.lira.talento.application.service.AdolescenteService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequiredArgsConstructor
public class AdolescenteRestController implements AdolescenteAPI {

	private final AdolescenteService adolescenteService;

	@Override
	public AdolescenteResponse PostAdolescente(AdolescenteRequest adolescenteRequest) {
		log.info("[inicia] AdolescenteRestController - PostAdolescente");
		AdolescenteResponse adolescente = adolescenteService.criaAdolescente(adolescenteRequest);
		log.info("[finaliza] AdolescenteRestController - PostAdolescente");
		return adolescente;
	}

}
