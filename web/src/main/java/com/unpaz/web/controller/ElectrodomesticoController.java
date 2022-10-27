package com.unpaz.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unpaz.web.model.Electrodomestico;
import com.unpaz.web.service.ElectrodomesticoService;

@RestController
@RequestMapping("v1/Electrodomestico")
public class ElectrodomesticoController {
	
	@Autowired
	private ElectrodomesticoService electrodomesticoService;

	
	@GetMapping("/read")
	public List<Electrodomestico> getAllElectrodomesticos() {
		return electrodomesticoService.getAll();
	}
	
	@PostMapping("/crear")
	public Electrodomestico crearHeladera(@RequestBody Electrodomestico electrodomestico) {
		return electrodomesticoService.createHeladera(electrodomestico);
	}
}
