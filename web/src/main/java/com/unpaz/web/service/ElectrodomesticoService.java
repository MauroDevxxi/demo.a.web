package com.unpaz.web.service;

import java.util.List;

import com.unpaz.web.model.Electrodomestico;

public interface ElectrodomesticoService {
	public List<Electrodomestico> getAll ();
	public Electrodomestico createHeladera(Electrodomestico electrodomestico);
	public Electrodomestico deleteById(Long id);
	public Electrodomestico updateById(Electrodomestico electrodomestico);
	
}
