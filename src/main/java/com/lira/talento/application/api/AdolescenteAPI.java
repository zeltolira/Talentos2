package com.lira.talento.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lira.talento.application.api.request.AdolescenteRequest;
import com.lira.talento.application.api.response.AdolescenteResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/adolescente")
public interface AdolescenteAPI {

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	AdolescenteResponse PostAdolescente(@Valid @RequestBody AdolescenteRequest adolescenteRequest);
}
