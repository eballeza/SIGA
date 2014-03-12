package com.SiGA.services;

import java.util.List;

import com.SiGA.common.VO.SistemasNCVO;




/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 10/04/2013
 * @descripcion Interface de tipo Service que interactua con el DAO SistemasNCDAO
 *
 */
public interface SistemasNCService {
	
	/**
	 * Encuentra una SistemaNC por id de esta
	 * @param idSistemaNC es el id a buscar
	 * @return SistemasNCVO es la SistemaNC encontrado
	 */
	public SistemasNCVO encuentraSistemaNCXId(Integer idSistemaNC);
	
	/**
	 * Inserta una SistemaNC a la tabla siga_SistemaNC
	 * @param sistemasNCVO es el sistema a insertar
	 */
	public void insertaSistemaNC(SistemasNCVO sistemaNCVO);

	/**
	 * Actualiza una SistemaNC
	 * @param sistemaNCVO es la sistema a actualizar
	 */
	public void actualizaSistemaNC(SistemasNCVO sistemaNCVO);
	
	/**
	 * Borra una SistemaNC de la tabla siga_SistemaNC
	 * @param sistemaNCVO es la SistemaNC a borrar
	 */
	public void deleteSistemaNC(SistemasNCVO sistemaNCVO);
	
	/**
	 * Obtiene todas los SistemasNC de la tabla siga_SistemaNC
	 * @return
	 */
	public List<SistemasNCVO> obtenTodosSistemasNC();

}
