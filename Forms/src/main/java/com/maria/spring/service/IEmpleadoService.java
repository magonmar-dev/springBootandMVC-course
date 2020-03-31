package com.maria.spring.service;

import java.util.List;

import com.maria.spring.model.Empleado;

public interface IEmpleadoService {

	public Empleado add(Empleado e);
	public List<Empleado> findAll();
	public Empleado findById(long id);
	public Empleado edit(Empleado e);
	public List<Empleado> buscador(String cadena);
}
