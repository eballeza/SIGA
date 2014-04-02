package com.SiGA.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.SiGA.common.VO.EmpresasVO;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.EmpresasDAO;
import com.SiGA.services.EmpresasService;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 19/04/2013
 * @descripcion Clase de tipo Service que interactua con el DAO EmpresasDAO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_IMPL_EMPRESAS)
public class EmpresasServiceImpl implements EmpresasService {

	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_EMPRESAS)
	private EmpresasDAO empresasDAO;
	
	@Override
	public EmpresasVO encuentraEmpresaXId(Integer idEmpresa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertaEmpresa(EmpresasVO empresaVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizaEmpresa(EmpresasVO empresaVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmpresa(EmpresasVO empresaVO) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.SiGA.services.EmpresasService#obtenTodosEmpresas()
	 */
	@Override
	public List<EmpresasVO> obtenTodosEmpresas() {
		return empresasDAO.getAllEmpresa();
	}

}
