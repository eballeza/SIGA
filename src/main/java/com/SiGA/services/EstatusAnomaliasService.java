package com.SiGA.services;

import java.util.List;

import com.SiGA.common.VO.EstatusAnomaliaVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 17/04/2013
 * @descripcion Interface de tipo Service que interactua con el DAO EstatusAnomaliasDAO
 *
 */
public interface EstatusAnomaliasService {

	/**
	 * Encuentra una EstatusAnomalia por id de esta
	 * @param idEstatusAnomalia es el id a buscar
	 * @return EstatusAnomaliaVO es la EstatusAnomalia encontrado
	 */
	public EstatusAnomaliaVO encuentraEstatusAnomaliaXId(Integer idEstatusAnomalia);
	
	/**
	 * Inserta una EstatusAnomaliaa la tabla siga_estatus
	 * @param EstatusAnomaliaVO es el estatusAnomalia a insertar
	 */
	public void insertaEstatusAnomalia(EstatusAnomaliaVO estatusAnomaliaVO);

	/**
	 * Actualiza una EstatusAnomalia
	 * @param EstatusAnomaliaVO es la estatusAnomaliaa actualizar
	 */
	public void actualizaEstatusAnomalia(EstatusAnomaliaVO estatusAnomaliaVO);
	
	/**
	 * Borra una EstatusAnomalia de la tabla siga_estatusAnomalia
	 * @param EstatusAnomaliaVO es la EstatusAnomaliaa borrar
	 */
	public void deleteEstatus(EstatusAnomaliaVO estatusAnomaliaVO);
	
	/**
	 * Obtiene todas las EstatusesAnomalia de la tabla siga_estatus
	 * @return
	 */
	public List<EstatusAnomaliaVO> obtenTodosEstatusAnomalia();
}
