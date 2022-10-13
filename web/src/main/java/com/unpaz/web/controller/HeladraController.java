package com.unpaz.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unpaz.web.model.Heladera;
import com.unpaz.web.service.HeladeraService;

@RestController
@RequestMapping("v1/heladera")
public class HeladraController {
	
	@Autowired
	private HeladeraService heladeraService;

	
	@GetMapping("/read")
	public List<Heladera> lee () {
		return heladeraService.getAll();
	}
	
	@PostMapping("/crear")
	public Heladera crearHeladera(@RequestBody Heladera heladera) {
		return heladeraService.createHeladera(heladera);
	}
}
