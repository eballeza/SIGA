package com.SiGA.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.SiGA.common.VO.ModulosNCVO;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.ModulosNCDAO;
import com.SiGA.services.ModulosNCService;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 10/04/2013
 * @descripcion Clase de tipo Service que interactua con el DAO ModulosDAO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_IMPL_MODULOS_NC)
public class ModulosNCServiceImpl implements ModulosNCService {

	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_MODULOS_NC)
	private ModulosNCDAO modulosNCDAO;
	
	@Override
	public ModulosNCVO encuentraModuloNCXId(Integer idModuloNC) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void insertaModuloNC(ModulosNCVO moduloNCVO) {
		System.out.println(moduloNCVO);
		modulosNCDAO.saveModuloNC(moduloNCVO);
	}

	@Override
	public void actualizaModuloNC(ModulosNCVO moduloNCVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteModuloNC(ModulosNCVO moduloNCVO) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.SiGA.services.ModulosNCService#obtenTodosModulosNC()
	 */
	@Override
	public List<ModulosNCVO> obtenTodosModulosNC() {
		return modulosNCDAO.getAllModulosNC();
	}

	/**
	 * @return the modulosNCDAO
	 */
	public ModulosNCDAO getModulosNCDAO() {
		return modulosNCDAO;
	}

	/**
	 * @param modulosNCDAO the modulosNCDAO to set
	 */
	public void setModulosNCDAO(ModulosNCDAO modulosNCDAO) {
		this.modulosNCDAO = modulosNCDAO;
	}

	

}

