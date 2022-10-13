package com.unpaz.web.service;

import java.util.List;

import com.unpaz.web.model.Heladera;

public interface HeladeraService {
	public List<Heladera> getAll ();
	public Heladera createHeladera(Heladera heladera);
	public Heladera deleteById(Long id);
	public Heladera updateById(Heladera heladera);
	
}
