package com.SiGA.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.SiGA.common.VO.SeveridadesAnomaliaVO;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.SeveridadesAnomaliaDAO;
import com.SiGA.services.SeveridadesAnomaliaService;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 18/04/2013
 * @descripcion Clase de tipo Service que interactua con el DAO SeveridadesAnomaliaDAO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_IMPL_SEVERIDADES_ANOMALIA)
public class SeveridadesAnomaliaServiceImpl implements SeveridadesAnomaliaService {

	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_SEVERIDADES_ANOMALIA)
	private SeveridadesAnomaliaDAO severidadesAnomaliaDAO;
	
	@Override
	public SeveridadesAnomaliaVO encuentraSeveridadAnomaliaXId(
			Integer idSeveridadAnomalia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertaSeveridadAnomalia(
			SeveridadesAnomaliaVO severidadAnomaliaVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizaSeveridadAnomalia(
			SeveridadesAnomaliaVO severidadAnomaliaVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSeveridadAnomalia(
			SeveridadesAnomaliaVO severidadAnomaliaVO) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.SiGA.services.SeveridadesAnomaliaService#obtenTodosSeveridadAnomalia()
	 */
	@Override
	public List<SeveridadesAnomaliaVO> obtenTodosSeveridadAnomalia() {
		return severidadesAnomaliaDAO.getAllSeveridadesAnomalia();
	}

	/**
	 * @return the severidadesAnomaliaDAO
	 */
	public SeveridadesAnomaliaDAO getSeveridadesAnomaliaDAO() {
		return severidadesAnomaliaDAO;
	}

	/**
	 * @param severidadesAnomaliaDAO the severidadesAnomaliaDAO to set
	 */
	public void setSeveridadesAnomaliaDAO(
			SeveridadesAnomaliaDAO severidadesAnomaliaDAO) {
		this.severidadesAnomaliaDAO = severidadesAnomaliaDAO;
	}
	
	
}
