package com.SiGA.services;

import java.util.List;

import com.SiGA.common.VO.TiposAnomaliaVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 22/04/2013
 * @descripcion Interface de tipo Service que interactua con el DAO TiposAnomaliaDAO
 *
 */
public interface TiposAnomaliaService {

	
	/**
	 * Encuentra una TiposAnomalia por id de esta
	 * @param idTipoAnomalia es el id a buscar
	 * @return TiposAnomaliaVO es la TipoAnomalia encontrada
	 */
	public TiposAnomaliaVO encuentraTipoAnomaliaXId(Integer idTipoAnomalia);
	
	/**
	 * Inserta una TiposAnomalia a la tabla siga_TiposAnomalia
	 * @param TiposAnomaliaVO es la anomalia a insertar
	 */
	public void insertaTipoAnomalia(TiposAnomaliaVO tipoAnomaliaVO);

	/**
	 * Actualiza una TiposAnomalia
	 * @param TiposAnomaliaVO es la TiposAnomalia a actualizar
	 */
	public void actualizaTipoAnomalia(TiposAnomaliaVO tipoAnomaliaVO);
	
	/**
	 * Borra una TiposAnomalia de la tabla siga_TiposAnomalia
	 * @param TiposAnomaliaVO es la TiposAnomalia a borrar
	 */
	public void deleteTipoAnomalia(TiposAnomaliaVO tipoAnomaliaVO);
	
	/**
	 * Obtiene todas las TiposAnomaliaesAnomalia de la tabla siga_TiposAnomalia
	 * @return
	 */
	public List<TiposAnomaliaVO> obtenTodosTiposAnomalia();
	
}
