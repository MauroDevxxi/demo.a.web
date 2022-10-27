package com.unpaz.web.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unpaz.web.model.Electrodomestico;
import com.unpaz.web.repository.ElectrodomesticoRepository;
import com.unpaz.web.service.ElectrodomesticoService;


@Service
public class ElectrodomesticoServiceImp implements ElectrodomesticoService{
@Autowired
private ElectrodomesticoRepository electrodomesticoRepository;
	@Override
	public List<Electrodomestico> getAll() {
		
		return (List<Electrodomestico>) electrodomesticoRepository.findAll();
	}
	@Override
	public Electrodomestico createHeladera(Electrodomestico electrodomestico) {
		// TODO Auto-generated method stub
		return electrodomesticoRepository.save(electrodomestico);
	}
	
	@Override
	public Electrodomestico deleteById(Long id) {
		electrodomesticoRepository.deleteById(id);
		return electrodomesticoRepository.findById(id).get();
	}
	
	@Override
	public Electrodomestico updateById(Electrodomestico electrodomestico) {
		Electrodomestico helaNew = electrodomesticoRepository.findById(electrodomestico.getId()).get();
		helaNew.setPrecio(electrodomestico.getPrecio());
		
		return electrodomesticoRepository.save(helaNew);
	}
}
