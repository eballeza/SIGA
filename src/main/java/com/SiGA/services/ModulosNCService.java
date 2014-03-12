package com.SiGA.services;

import java.util.List;

import com.SiGA.common.VO.ModulosNCVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 10/04/2013
 * @descripcion Interface de tipo Service que interactua con el DAO ModulosNCDAO
 *
 */
public interface ModulosNCService {
	
	/**
	 * Encuentra una ModuloNC por id de esta
	 * @param idModuloNC es el id a buscar
	 * @return ModulosNCVO es la ModuloNC encontrado
	 */
	public ModulosNCVO encuentraModuloNCXId(Integer idModuloNC);
	
	/**
	 * Inserta una ModuloNC a la tabla siga_ModuloNC
	 * @param modulosNCVO es el modulo a insertar
	 */
	public void insertaModuloNC(ModulosNCVO moduloNCVO);

	/**
	 * Actualiza una ModuloNC
	 * @param moduloNCVO es la modulo a actualizar
	 */
	public void actualizaModuloNC(ModulosNCVO moduloNCVO);
	
	/**
	 * Borra una ModuloNC de la tabla siga_ModuloNC
	 * @param moduloNCVO es la ModuloNC a borrar
	 */
	public void deleteModuloNC(ModulosNCVO moduloNCVO);
	
	/**
	 * Obtiene todas los ModulosNC de la tabla siga_ModulosNC
	 * @return
	 */
	public List<ModulosNCVO> obtenTodosModulosNC();
	

}
