package com.SiGA.services;

import java.util.List;

import com.SiGA.common.VO.AccionesAnomaliaVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Interface de tipo Service que interactua con el DAO AccionesAnomaliaDAO
 *
 */
public interface AccionesAnomaliaService {
	
	
	/**
	 * Encuentra una accionAnomalia por id de esta
	 * @param idAccionAnomalia es el id a buscar
	 * @return AccionesAnomaliaVO es la AccionAnomalia encontrada
	 */
	public AccionesAnomaliaVO encuentraAccionXId(Integer idAccionAnomalia);
	
	/**
	 * Inserta una accionAnomalia a la tabla siga_accionesAnomalia
	 * @param accionAnomaliaVO es la anomalia a insertar
	 */
	public void insertaAnomalia(AccionesAnomaliaVO accionAnomaliaVO);

	/**
	 * Actualiza una accionAnomalia
	 * @param accionAnomaliaVO es la accionAnomalia a actualizar
	 */
	public void actualizaAnomalia(AccionesAnomaliaVO accionAnomaliaVO);
	
	/**
	 * Borra una AccionAnomalia de la tabla siga_accionesAnomalia
	 * @param accionAnomaliaVO es la accionAnomalia a borrar
	 */
	public void deleteAccionAnomalia(AccionesAnomaliaVO accionAnomaliaVO);
	
	/**
	 * Obtiene todas las accionesAnomalia de la tabla siga_accionesAnomalia
	 * @return
	 */
	public List<AccionesAnomaliaVO> obtenTodasAccionesAnomalia();
}
