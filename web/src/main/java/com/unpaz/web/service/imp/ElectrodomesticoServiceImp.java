package com.unpaz.web.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unpaz.web.model.Heladera;
import com.unpaz.web.repository.HeladeraRepository;
import com.unpaz.web.service.HeladeraService;


@Service
public class HeladeraServiceImp implements HeladeraService{
@Autowired
private HeladeraRepository HelaRepo;
	@Override
	public List<Heladera> getAll() {
		
		return (List<Heladera>) HelaRepo.findAll();
	}
	@Override
	public Heladera createHeladera(Heladera heladera) {
		// TODO Auto-generated method stub
		return HelaRepo.save(heladera);
	}
	
	@Override
	public Heladera deleteById(Long id) {
		HelaRepo.deleteById(id);
		return HelaRepo.findById(id).get();
	}
	
	@Override
	public Heladera updateById(Heladera heladera) {
		Heladera helaNew = HelaRepo.findById(heladera.getId()).get();
		helaNew.setDescripcion(heladera.getDescripcion());
		
		return HelaRepo.save(helaNew);
	}
}
