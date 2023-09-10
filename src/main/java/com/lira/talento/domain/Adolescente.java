package com.lira.talento.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import com.lira.talento.application.api.request.AdolescenteRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "adolescente")
public class Adolescente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idAdolescente;
	@NotBlank
	@Column(unique = true)
	private String documento;
	@NotBlank
	private String nomeAdolescente;
	@NotNull
	private LocalDate dataNascimento;
	@NotBlank
	private String celular;
	@NotNull
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraultimaAlteracao;
	

	public Adolescente(AdolescenteRequest adolescenteRequest) {
		this.nomeAdolescente = adolescenteRequest.getNomeAdolescente();
		this.documento = adolescenteRequest.getDocumento();
		this.dataNascimento = adolescenteRequest.getDataNascimento();
		this.celular = adolescenteRequest.getCelular();
		this.sexo = adolescenteRequest.getSexo();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
	
	
}
