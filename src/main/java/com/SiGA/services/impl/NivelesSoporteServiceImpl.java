package com.SiGA.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.SiGA.common.VO.NivelesSoporteVO;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.NivelesSoporteDAO;
import com.SiGA.services.NivelesSoporteService;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 19/04/2013
 * @descripcion Clase de tipo Service que interactua con el DAO NivelesSoporteDAO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_IMPL_NIVELES_SOPORTE)
public class NivelesSoporteServiceImpl  implements NivelesSoporteService{

	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_NIVELES_SOPORTE)
	private NivelesSoporteDAO nivelesSoporteDAO;
	
	@Override
	public NivelesSoporteVO encuentranivelSoporteXId(Integer idNivelSoporte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertanivelSoporte(NivelesSoporteVO nivelesSoporteVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizanivelSoporte(NivelesSoporteVO nivelesSoporteVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletenivelSoporte(NivelesSoporteVO nivelesSoporteVO) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.SiGA.services.NivelesSoporteService#obtenTodosnivelSoportes()
	 */
	@Override
	public List<NivelesSoporteVO> obtenTodosnivelSoportes() {
		return nivelesSoporteDAO.getAllNivelesSoporte();
	}

}
