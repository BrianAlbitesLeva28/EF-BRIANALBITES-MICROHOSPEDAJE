package com.idat.MicroservicioHospedaje.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MicroservicioHospedaje.DTO.HospedajeDTO;
import com.idat.MicroservicioHospedaje.model.Hospedaje;
import com.idat.MicroservicioHospedaje.repository.HospedajeRepository;

@Service
public class HospedajeServiceImp implements HospedajeService {
	
	@Autowired
	private HospedajeRepository repository;

	@Override
	public List<HospedajeDTO> listar() {
		
		List<HospedajeDTO> listadto = new ArrayList<>();
		HospedajeDTO dto = null;
		
		for (Hospedaje hospedaje : repository.findAll()) {
			dto = new HospedajeDTO();
			dto.setCod(hospedaje.getIdHospedaje());
			dto.setNom(hospedaje.getNombre());
			listadto.add(dto);
		}
		
		return listadto;
	}

	@Override
	public void guardar(HospedajeDTO hospedaje) {
		Hospedaje hos = new Hospedaje();
		hos.setIdHospedaje(hospedaje.getCod());
		hos.setNombre(hospedaje.getNom());
		
		repository.save(hos);
		
	}

}
