package com.SiGA.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.SiGA.common.VO.TiposUsuarioVO;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.TiposUsuarioDAO;
import com.SiGA.services.TiposUsuarioService;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 23/04/2013
 * @descripcion Clase de tipo Service que interactua con el DAO TiposUsuarioDAO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_IMPL_TIPOS_USUARIO)
public class TiposUsuarioServiceImpl implements TiposUsuarioService {

	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_TIPOS_USUARIO)
	private TiposUsuarioDAO tiposUsuarioDAO;
	
	@Override
	public TiposUsuarioVO encuentraTipoUsuarioXId(Integer idTiposUsuarioVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertaTipoUsuario(TiposUsuarioVO tipoUsuarioVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizaTipoUsuario(TiposUsuarioVO tipoUsuarioVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTipoUsuario(TiposUsuarioVO tipoUsuarioVO) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.SiGA.services.TiposUsuarioService#obtenTodosTiposUsuario()
	 */
	@Override
	public List<TiposUsuarioVO> obtenTodosTiposUsuario() {
		return tiposUsuarioDAO.getAllTiposUsuario();
	}

}
