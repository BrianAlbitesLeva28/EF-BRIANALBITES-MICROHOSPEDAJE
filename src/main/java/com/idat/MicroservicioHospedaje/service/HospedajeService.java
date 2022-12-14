package com.idat.MicroservicioHospedaje.service;

import java.util.List;

import com.idat.MicroservicioHospedaje.DTO.HospedajeDTO;


public interface HospedajeService {
	
	List<HospedajeDTO> listar();
	void guardar(HospedajeDTO hospedajeDTO);

}
