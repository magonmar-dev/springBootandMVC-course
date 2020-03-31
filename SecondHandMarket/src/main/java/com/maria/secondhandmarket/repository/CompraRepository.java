package com.maria.secondhandmarket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maria.secondhandmarket.model.Compra;
import com.maria.secondhandmarket.model.Usuario;

public interface CompraRepository extends JpaRepository<Compra, Long> {

	List<Compra> findByPropietario(Usuario propietario);
}
