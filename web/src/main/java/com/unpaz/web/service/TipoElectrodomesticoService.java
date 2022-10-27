package com.unpaz.web.service;

import java.util.List;
import com.unpaz.web.model.TipoElectrodomestico;

public interface TipoElectrodomesticoService {
	public List<TipoElectrodomestico> getAll ();
	public TipoElectrodomestico createTipoElectrodomestico(TipoElectrodomestico tipoElectrodomestico);
	public TipoElectrodomestico deleteById(Long id);
	public TipoElectrodomestico updateById(TipoElectrodomestico tipoElectrodomestico);
}
