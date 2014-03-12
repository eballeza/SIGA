package com.SiGA.services;

import java.util.List;

import com.SiGA.common.VO.SeveridadesAnomaliaVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 18/04/2013
 * @descripcion Interface de tipo Service que interactua con el DAO SeveridadesDAO
 *
 */
public interface SeveridadesAnomaliaService {
	
	/**
	 * Encuentra una SeveridadAnomalia por id de esta
	 * @param idSeveridadAnomalia es el id a buscar
	 * @return SeveridadesAnomaliaVO es la SeveridadAnomalia encontrado
	 */
	public SeveridadesAnomaliaVO encuentraSeveridadAnomaliaXId(Integer idSeveridadAnomalia);
	
	/**
	 * Inserta una SeveridadAnomalia a la tabla siga_SeveridadesAnomalia
	 * @param SeveridadesAnomaliaVO es la anomalia a insertar
	 */
	public void insertaSeveridadAnomalia(SeveridadesAnomaliaVO severidadAnomaliaVO);

	/**
	 * Actualiza una SeveridadAnomalia
	 * @param SeveridadesAnomaliaVO es la SeveridadAnomalia a actualizar
	 */
	public void actualizaSeveridadAnomalia(SeveridadesAnomaliaVO severidadAnomaliaVO);
	
	/**
	 * Borra una SeveridadAnomalia de la tabla siga_SeveridadAnomalia
	 * @param SeveridadesAnomaliaVO es la SeveridadAnomalia a borrar
	 */
	public void deleteSeveridadAnomalia(SeveridadesAnomaliaVO severidadAnomaliaVO);
	
	/**
	 * Obtiene todas las SeveridadAnomaliaesAnomalia de la tabla siga_SeveridadAnomalia
	 * @return
	 */
	public List<SeveridadesAnomaliaVO> obtenTodosSeveridadAnomalia();
}
