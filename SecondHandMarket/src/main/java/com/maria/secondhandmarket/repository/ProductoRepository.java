package com.maria.secondhandmarket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maria.secondhandmarket.model.Compra;
import com.maria.secondhandmarket.model.Producto;
import com.maria.secondhandmarket.model.Usuario;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

	List<Producto> findByPropietario(Usuario propietario);
	
	List<Producto> findByCompra(Compra compra);
	
	List<Producto> findByCompraIsNull();
	
	List<Producto> findByNombreContainsIgnoreCaseAndCompraIsNull(String nombre);
	
	List<Producto> findByNombreContainsIgnoreCaseAndPropietario(String nombre, Usuario propietario);
}
