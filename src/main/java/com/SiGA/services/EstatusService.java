package com.SiGA.services;

import java.util.List;

import com.SiGA.common.VO.EstatusVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Interface de tipo Service que interactua con el DAO EstatusDAO
 *
 */
public interface EstatusService {

	/**
	 * Encuentra una Estatus por id de esta
	 * @param idEstatus es el id a buscar
	 * @return EstatusVO es la Estatus encontrado
	 */
	public EstatusVO encuentraEstatusXId(Integer idEstatus);
	
	/**
	 * Inserta una Estatus a la tabla siga_estatus
	 * @param estatusVO es la anomalia a insertar
	 */
	public void insertaEstatus(EstatusVO estatusVO);

	/**
	 * Actualiza una Estatus
	 * @param estatusVO es la Estatus a actualizar
	 */
	public void actualizaEstatus(EstatusVO estatusVO);
	
	/**
	 * Borra una Estatus de la tabla siga_estatus
	 * @param estatusVO es la Estatus a borrar
	 */
	public void deleteEstatus(EstatusVO estatusVO);
	
	/**
	 * Obtiene todas las EstatusesAnomalia de la tabla siga_estatus
	 * @return
	 */
	public List<EstatusVO> obtenTodosEstatus();
}
