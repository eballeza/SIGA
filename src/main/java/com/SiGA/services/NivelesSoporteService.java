package com.SiGA.services;

import java.util.List;

import com.SiGA.common.VO.NivelesSoporteVO;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 19/04/2013
 * @descripcion Interface de tipo Service que interactua con el DAO NivelesSoporteDAO
 *
 */
public interface NivelesSoporteService {
	
	/**
	 * Encuentra una nivelSoporte por id de esta
	 * @param idNivelSoporte es el id a buscar
	 * @return NivelesSoporteVO es la nivelSoporte encontrado
	 */
	public NivelesSoporteVO encuentranivelSoporteXId(Integer idNivelSoporte);
	
	/**
	 * Inserta una nivelSoportea la tabla siga_nivelesSoportes
	 * @param NivelesSoporteVO es el nivelesSoporte a insertar
	 */
	public void insertanivelSoporte(NivelesSoporteVO nivelesSoporteVO);

	/**
	 * Actualiza una nivelSoporte
	 * @param NivelesSoporteVO es la nivelSoporte a actualizar
	 */
	public void actualizanivelSoporte(NivelesSoporteVO nivelesSoporteVO);
	
	/**
	 * Borra una nivelSoporte de la tabla siga_nivelesSoportes
	 * @param NivelesSoporteVO es nivelSoporte a borrar
	 */
	public void deletenivelSoporte(NivelesSoporteVO nivelesSoporteVO);
	
	/**
	 * Obtiene todas las nivelesSoportes de la tabla siga_nivelesSoportes
	 * @return
	 */
	public List<NivelesSoporteVO> obtenTodosnivelSoportes();
	
}
