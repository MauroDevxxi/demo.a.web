package com.unpaz.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unpaz.web.model.Electrodomestico;
import com.unpaz.web.model.TipoElectrodomestico;
import com.unpaz.web.service.ElectrodomesticoService;
import com.unpaz.web.service.TipoElectrodomesticoService;

@RestController
@RequestMapping("v1/TipoElectrodomestico")
public class TipoElectrodomesticoContrller {
	@Autowired
	private TipoElectrodomesticoService tipoElectrodomesticoService;
	
	@GetMapping("/readd")
	public List<TipoElectrodomestico> getAllElectrodomesticos() {
		return tipoElectrodomesticoService.getAll();
	}
	
}
