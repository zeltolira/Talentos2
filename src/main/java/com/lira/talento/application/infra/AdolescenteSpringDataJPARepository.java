package com.lira.talento.application.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lira.talento.domain.Adolescente;

public interface AdolescenteSpringDataJPARepository extends JpaRepository <Adolescente, UUID>{

}
