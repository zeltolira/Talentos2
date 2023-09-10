package com.lira.talento.application.api.request;

import java.time.LocalDate;

import com.lira.talento.domain.Sexo;

import lombok.Value;

@Value
public class AdolescenteRequest {
	private String nomeAdolescente;
	private String documento;
	private LocalDate dataNascimento;
	private String celular;
	private Sexo sexo;
}
