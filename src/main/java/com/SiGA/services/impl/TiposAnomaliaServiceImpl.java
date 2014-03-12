package com.SiGA.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.SiGA.common.VO.TiposAnomaliaVO;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.TiposAnomaliaDAO;
import com.SiGA.services.TiposAnomaliaService;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 22/04/2013
 * @descripcion Clase de tipo Service que interactua con el DAO TiposAnomaliaDAO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_IMPL_TIPOS_ANOMALIA)
public class TiposAnomaliaServiceImpl implements TiposAnomaliaService {

	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_TIPOS_ANOMALIA)
	private TiposAnomaliaDAO tiposAnomaliaDAO;
	
	@Override
	public TiposAnomaliaVO encuentraTipoAnomaliaXId(Integer idTipoAnomalia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertaTipoAnomalia(TiposAnomaliaVO tipoAnomaliaVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizaTipoAnomalia(TiposAnomaliaVO tipoAnomaliaVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTipoAnomalia(TiposAnomaliaVO tipoAnomaliaVO) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.SiGA.services.TiposAnomaliaService#obtenTodosTiposAnomalia()
	 */
	@Override
	public List<TiposAnomaliaVO> obtenTodosTiposAnomalia() {
		return tiposAnomaliaDAO.getAllTiposAnomalia();
	}

	/**
	 * @return the tiposAnomaliaDAO
	 */
	public TiposAnomaliaDAO getTiposAnomaliaDAO() {
		return tiposAnomaliaDAO;
	}

	/**
	 * @param tiposAnomaliaDAO the tiposAnomaliaDAO to set
	 */
	public void setTiposAnomaliaDAO(TiposAnomaliaDAO tiposAnomaliaDAO) {
		this.tiposAnomaliaDAO = tiposAnomaliaDAO;
	}

	
	
}

