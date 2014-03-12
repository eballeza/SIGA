package  com.SiGA.persistencia.dao;

import java.util.List;

import com.SiGA.common.VO.EstatusAnomaliaVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Interfaz de tipo DAO utilizada para persistir objetos de tipo EstatuAnomaliaVO
 *
 */
public interface EstatusAnomaliaDAO {

	
	/**
	 * Metodo que hace un SELECT * FROM [PRIMARY KEY] = idEstatusAnomalia en la tabla siga_estatusAnomalia
	 * @param idEstatusAnomalia Es el id a buscar
	 * @return EstatusAnomaliaVO es la el objeto VO encontrado
	 */
	public EstatusAnomaliaVO findEstatusAnomaliaByID(Integer idEstatusAnomalia);
	
	/**
	 * Metodo que inserta un registro en la tabla siga_estatusAnomalia
	 * @param estatusAnomaliaVO Es el VO a insertar
	 */
	public void saveEstatusAnomalia(EstatusAnomaliaVO estatusAnomaliaVO);
	
	/**
	 * Metodo que actualiza un registro en la tabla siga_estatusAnomalia
	 * @param estatusAnomaliaVO Es el VO a actualizar
	 */
	public void updateEstatusAnomalia(EstatusAnomaliaVO estatusAnomaliaVO);
	
	/**
	 * Metodo que borra un registro en la tabla siga_estatusAnomalia
	 * @param estatusAnomaliaVO Es el VO a borrar.
	 */
	public void deleteEstatusAnomalia(EstatusAnomaliaVO estatusAnomaliaVO);
	
	/**
	 * Metodo que consulta todos los registros existentes de la tabla siga_estatusAnomalia
	 * @return List<EstatusAnomaliaVO> Es la lista de EstatusAnomalia encontradas.
	 */
	public List<EstatusAnomaliaVO> getAllEstatusAnomalia();
	
	
}
