package com.SiGA.services.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.SiGA.common.VO.AccionesAnomaliaVO;


import com.SiGA.persistencia.dao.AccionesAnomaliaDAO;
import com.SiGA.services.AccionesAnomaliaService;
import com.SiGA.common.constantes.ConstantesServicios;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Clase de tipo Service que interactua con el DAO AccionesAnomaliaDAO
 *
 */
@Service(ConstantesServicios.SIGA_SERVICE_IMPL_ACCIONES_ANOMALIA)
public class AccionesAnomaliaServiceImpl implements AccionesAnomaliaService{

	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_ACCIONES_ANOMALIA )
	private AccionesAnomaliaDAO accionesAnomaliaDAO;
	
	/**
	 * Constructor de la clase.
	 */
	public AccionesAnomaliaServiceImpl() {
		
	}
	
	@Override
	public AccionesAnomaliaVO encuentraAccionXId(Integer idAccionAnomalia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertaAnomalia(AccionesAnomaliaVO accionAnomaliaVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizaAnomalia(AccionesAnomaliaVO accionAnomaliaVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccionAnomalia(AccionesAnomaliaVO accionAnomaliaVO) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.SiGA.services.AccionesAnomaliaService#obtenTodasAccionesAnomalia()
	 */
	@Override
	public List<AccionesAnomaliaVO> obtenTodasAccionesAnomalia() {
		return accionesAnomaliaDAO.getAllAccionesAnomalia();
	}

	/**
	 * @return the accionesAnomaliaDAO
	 */
	public AccionesAnomaliaDAO getAccionesAnomaliaDAO() {
		return accionesAnomaliaDAO;
	}

	/**
	 * @param accionesAnomaliaDAO the accionesAnomaliaDAO to set
	 */
	public void setAccionesAnomaliaDAO(AccionesAnomaliaDAO accionesAnomaliaDAO) {
		this.accionesAnomaliaDAO = accionesAnomaliaDAO;
	}
	
	

}
