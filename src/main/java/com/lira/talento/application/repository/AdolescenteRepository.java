package com.lira.talento.application.repository;

import com.lira.talento.application.api.request.AdolescenteRequest;
import com.lira.talento.domain.Adolescente;

public interface AdolescenteRepository {
	Adolescente criaAdolescente(AdolescenteRequest adolescenteRequest);
}