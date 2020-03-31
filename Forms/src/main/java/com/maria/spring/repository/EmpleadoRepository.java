package com.maria.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.maria.spring.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> { 
	
	// Consulta derivada del nombre del método
	List<Empleado> findByNombreContainsIgnoreCaseOrEmailContainsIgnoreCaseOrTelefonoContainsIgnoreCase(String nombre, String email, String telefono);
	
	// Consulta JPQL (Java Persistence Query Language) pertenece a JPA
	@Query("select e from Empleado e where lower(e.nombre) like %?1% or lower(e.email) like %?1% or lower(e.telefono) like %?1%")
	List<Empleado> encuentraPorNombreEmailOTelefono(String cadena);
	
	// Consulta nativa SQL
	// Con consultas muy complejas podemos perder la posibilidad del mapeo objeto-relacional
	@Query(value="SELECT * FROM EMPLEADO WHERE LOWER(NOMBRE) LIKE CONCAT('%',?1,'%') OR LOWER(EMAIL) LIKE CONCAT('%',?1,'%') OR LOWER(TELEFONO) LIKE CONCAT('%',?1,'%')", nativeQuery=true)
	List<Empleado> encuentraPorNombreEmailOTelefonoNativa(String cadena);
}
