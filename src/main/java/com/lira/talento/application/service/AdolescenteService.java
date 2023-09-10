package com.lira.talento.application.service;

import com.lira.talento.application.api.request.AdolescenteRequest;
import com.lira.talento.application.api.response.AdolescenteResponse;

public interface AdolescenteService {
	AdolescenteResponse criaAdolescente(AdolescenteRequest adolescenteRequest);
}