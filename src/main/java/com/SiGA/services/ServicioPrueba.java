package com.SiGA.services;

import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.SiGA.common.VO.TiposUsuarioVO;
import com.SiGA.persistencia.dao.TiposUsuarioDAO;
import com.SiGA.persistencia.dao.impl.TiposUsuarioDAOImpl;



@Service(value = "a")
public class ServicioPrueba {
	
	@Autowired
	@Qualifier(value="TiposUsuarioDAOImpl")
	public TiposUsuarioDAO tiposUsuarioDAO;
	
	public String hola(){
		return "hola";
	}
	
	public void insertarTipoUSuario(TiposUsuarioVO tipoUsuarioVO){
		tiposUsuarioDAO.saveTipoUsuario(tipoUsuarioVO);
	}

	/**
	 * @return the tiposUsuarioDAO
	 */
	public TiposUsuarioDAO getTiposUsuarioDAO() {
		return tiposUsuarioDAO;
	}

	/**
	 * @param tiposUsuarioDAO the tiposUsuarioDAO to set
	 */
	public void setTiposUsuarioDAO(TiposUsuarioDAOImpl tiposUsuarioDAO) {
		this.tiposUsuarioDAO = tiposUsuarioDAO;
	}
	
	

}
