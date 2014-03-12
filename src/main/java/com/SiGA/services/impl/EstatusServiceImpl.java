package com.SiGA.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.SiGA.common.VO.EstatusVO;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.EstatusDAO;
import com.SiGA.services.EstatusService;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Clase de tipo Service que interactua con el DAO EstatusDAO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_IMPL_ESTATUS)
public class EstatusServiceImpl implements EstatusService {

	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_ESTATUS)
	private EstatusDAO estatusDAO;
	
	@Override
	public EstatusVO encuentraEstatusXId(Integer idEstatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertaEstatus(EstatusVO estatusVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizaEstatus(EstatusVO estatusVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEstatus(EstatusVO estatusVO) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.SiGA.services.EstatusService#obtenTodosEstatus()
	 */
	@Override
	public List<EstatusVO> obtenTodosEstatus() {
		return estatusDAO.getAllEstatus();
	}

	/**
	 * @return the estatusDAO
	 */
	public EstatusDAO getEstatusDAO() {
		return estatusDAO;
	}

	/**
	 * @param estatusDAO the estatusDAO to set
	 */
	public void setEstatusDAO(EstatusDAO estatusDAO) {
		this.estatusDAO = estatusDAO;
	}

	
	
}
