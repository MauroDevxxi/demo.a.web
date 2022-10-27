package com.unpaz.web.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unpaz.web.model.TipoElectrodomestico;
import com.unpaz.web.repository.TipoElectrodomesticoRepository;
import com.unpaz.web.service.TipoElectrodomesticoService;
@Service
public class TipoElectrodomesticoServiceImp implements TipoElectrodomesticoService {
	@Autowired
	private TipoElectrodomesticoRepository tipoElectrodomesticoRepository;

	@Override
	public List<TipoElectrodomestico> getAll() {

		return (List<TipoElectrodomestico>) tipoElectrodomesticoRepository.findAll();
	}

	@Override
	public TipoElectrodomestico createTipoElectrodomestico(TipoElectrodomestico tipoElectrodomestico) {
		// TODO Auto-generated method stub
		return tipoElectrodomesticoRepository.save(tipoElectrodomestico);
	}

	@Override
	public TipoElectrodomestico deleteById(Long id) {
		tipoElectrodomesticoRepository.deleteById(id);
		return tipoElectrodomesticoRepository.findById(id).get();
	}

	@Override
	public TipoElectrodomestico updateById(TipoElectrodomestico tipoElectrodomestico) {
		TipoElectrodomestico tipo = tipoElectrodomesticoRepository.findById(tipoElectrodomestico.getIdTipoElectrodomestico()).get();
		tipo.setDescripcion(tipoElectrodomestico.getDescripcion());
		return tipoElectrodomesticoRepository.save(tipo);
	}
	
	
	
}
