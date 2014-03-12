package com.SiGA.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.SiGA.common.VO.SistemasNCVO;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.SistemasNCDAO;
import com.SiGA.services.SistemasNCService;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 10/04/2013
 * @descripcion Clase de tipo Service que interactua con el DAO SistemasNCDAO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_IMPL_SISTEMAS_NC)
public class SistemasNCServiceImpl implements SistemasNCService{

	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_SISTEMAS_NC)
	private SistemasNCDAO sistemasNCDAO;

	@Override
	public SistemasNCVO encuentraSistemaNCXId(Integer idSistemaNC) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertaSistemaNC(SistemasNCVO sistemaNCVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizaSistemaNC(SistemasNCVO sistemaNCVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSistemaNC(SistemasNCVO sistemaNCVO) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.SiGA.services.SistemasNCService#obtenTodosSistemasNC()
	 */
	@Override
	public List<SistemasNCVO> obtenTodosSistemasNC() {
		return sistemasNCDAO.getAllSistemaNC();
	}

	/**
	 * @return the sistemasNCDAO
	 */
	public SistemasNCDAO getSistemasNCDAO() {
		return sistemasNCDAO;
	}

	/**
	 * @param sistemasNCDAO the sistemasNCDAO to set
	 */
	public void setSistemasNCDAO(SistemasNCDAO sistemasNCDAO) {
		this.sistemasNCDAO = sistemasNCDAO;
	}
	
	

}
