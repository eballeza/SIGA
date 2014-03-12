package com.SiGA.services;

import java.util.List;

import com.SiGA.common.VO.AccionesVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 19/04/2013
 * @descripcion Interface de tipo Service que interactua con el DAO accionesDAO
 *
 */
public interface AccionesService {

	/**
	 * Encuentra una AccionesAnomalia por id de esta
	 * @param idAccionAnomalia es el id a buscar
	 * @return AccionesVO es la AccionesAnomalia encontrado
	 */
	public AccionesVO encuentraAccionesAnomaliaXId(Integer idAccionAnomalia);
	
	/**
	 * Inserta una AccionesAnomaliaa la tabla siga_accionesAnomalia
	 * @param AccionesVO es el AccionesAnomalia a insertar
	 */
	public void insertaAccionesAnomalia(AccionesVO accionAnomaliaVO);

	/**
	 * Actualiza una AccionesAnomalia
	 * @param AccionesVO es la AccionesAnomaliaa actualizar
	 */
	public void actualizaAccionesAnomalia(AccionesVO accionAnomaliaVO);
	
	/**
	 * Borra una AccionesAnomalia de la tabla siga_AccionesAnomalia
	 * @param AccionesVO es la AccionesAnomaliaa borrar
	 */
	public void deleteEstatus(AccionesVO accionAnomaliaVO);
	
	/**
	 * Obtiene todas las EstatusesAnomalia de la tabla siga_accionesAnomalia
	 * @return
	 */
	public List<AccionesVO> obtenTodosAccionesAnomalia();
}
