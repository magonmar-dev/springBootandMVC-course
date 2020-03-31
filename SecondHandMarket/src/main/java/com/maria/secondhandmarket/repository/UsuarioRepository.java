package com.maria.secondhandmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maria.secondhandmarket.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario findFirstByEmail(String email);
}
