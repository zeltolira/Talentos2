package com.lira.talento.application.api.response;

import java.util.UUID;

import jakarta.validation.Valid;
import lombok.Builder;

@Valid
@Builder
public class AdolescenteResponse {
	private UUID idAdolescente;
}
