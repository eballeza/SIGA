package com.SiGA.services;

import java.util.List;

import com.SiGA.common.VO.AnomaliasVO;
import com.SiGA.common.VO.EstatusAnomaliaVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 15/04/2013
 * @descripcion Interface de tipo Service que interactua con el DAO AnomaliasDAO
 *
 */
public interface AnomaliasService {

	/**
	 * Encuentra una Anomalia por id de esta
	 * @param idAnomalia es el id a buscar
	 * @return AnomaliasVO es la Anomalia encontrado
	 */
	public AnomaliasVO encuentraAnomaliaXId(Integer idAnomalia);
	
	/**
	 * Inserta una Anomalia a la tabla siga_Anomalia
	 * @param AnomaliasVO es la anomalia a insertar
	 */
	public void insertaAnomalia(AnomaliasVO anomaliaVO);

	/**
	 * Actualiza una Anomalia
	 * @param AnomaliasVO es la Anomalia a actualizar
	 */
	public void actualizaAnomalia(AnomaliasVO anomaliasVO);
	
	/**
	 * Borra una Anomalia de la tabla siga_Anomalia
	 * @param AnomaliasVO es la Anomalia a borrar
	 */
	public void deleteAnomalia(AnomaliasVO AnomaliaVO);
	
	/**
	 * Obtiene todas las AnomaliaesAnomalia de la tabla siga_Anomalia
	 * @return
	 */
	public List<AnomaliasVO> obtenTodosAnomalia();

	
	/**
	 * Obtiene las anomalias filtradas por todas las columnas en la tabla siga_anomalias.
	 * @param estatusAnomaliaVO
	 * @return List<EstatusAnomaliaVO> es la lista de anomalias encontradas.
	 */
	public List<AnomaliasVO> filtrarAnomaliasPorTodosCampos(AnomaliasVO anomaliasVO/*EstatusAnomaliaVO estatusAnomaliaVO*/);
	
}
