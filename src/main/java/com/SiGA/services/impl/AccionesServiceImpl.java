package com.SiGA.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.SiGA.common.VO.AccionesAnomaliaVO;
import com.SiGA.common.VO.AccionesVO;
import com.SiGA.persistencia.dao.AccionesDAO;
import com.SiGA.services.AccionesService;
import com.SiGA.common.constantes.ConstantesServicios;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 19/04/2013
 * @descripcion Clase de tipo Service que interactua con el DAO AccionesDAO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_IMPL_ACCIONES)
public class AccionesServiceImpl implements AccionesService {

	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_ACCIONES)
	private AccionesDAO accionesDAO;
	
	@Override
	public AccionesVO encuentraAccionesAnomaliaXId(Integer idAccionAnomalia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertaAccionesAnomalia(AccionesVO accionAnomaliaVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizaAccionesAnomalia(AccionesVO accionAnomaliaVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEstatus(AccionesVO accionAnomaliaVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AccionesVO> obtenTodosAccionesAnomalia() {
		return accionesDAO.getAllAcciones();
	}

	

}
