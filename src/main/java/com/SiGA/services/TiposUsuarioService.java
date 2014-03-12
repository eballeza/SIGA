package com.SiGA.services;

import java.util.List;

import com.SiGA.common.VO.TiposUsuarioVO;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 23/04/2013
 * @descripcion Interface de tipo Service que interactua con el DAO TiposUsuarioDAO
 *
 */
public interface TiposUsuarioService {

	/**
	 * Encuentra una TipoUsuario por id de esta
	 * @param idTiposUsuarioVO es el id a buscar
	 * @return TiposUsuarioVO es la TipoUsuario encontrado
	 */
	public TiposUsuarioVO encuentraTipoUsuarioXId(Integer idTiposUsuarioVO);
	
	/**
	 * Inserta una TipoUsuario a la tabla siga_TiposUsuario
	 * @param TiposUsuarioVO es el tipo de usuario a insertar
	 */
	public void insertaTipoUsuario(TiposUsuarioVO tipoUsuarioVO);

	/**
	 * Actualiza una TipoUsuario
	 * @param TiposUsuarioVO es la TipoUsuario a actualizar
	 */
	public void actualizaTipoUsuario(TiposUsuarioVO tipoUsuarioVO);
	
	/**
	 * Borra una TipoUsuario de la tabla siga_TiposUsuario
	 * @param TiposUsuarioVO es la TipoUsuario a borrar
	 */
	public void deleteTipoUsuario(TiposUsuarioVO tipoUsuarioVO);
	
	/**
	 * Obtiene todas las TipoUsuarioesAnomalia de la tabla siga_TipoUsuario
	 * @return
	 */
	public List<TiposUsuarioVO> obtenTodosTiposUsuario();
	
}
