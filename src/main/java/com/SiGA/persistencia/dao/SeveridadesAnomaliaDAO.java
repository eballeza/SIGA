package  com.SiGA.persistencia.dao;

import java.util.List;

import com.SiGA.common.VO.SeveridadesAnomaliaVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 19/02/2013
 * @descripcion Interfaz de tipo DAO utilizada para persistir objetos de tipo SeveridadesAnomaliaVO
 *
 */
public interface SeveridadesAnomaliaDAO {

	/**
	 * Metodo que hace un SELECT * FROM [PRIMARY KEY] = idSeveridadAnomalia en la tabla siga_severidadesAnomalia
	 * @param idSeveridadAnomalia Es el id a buscar
	 * @return SeveridadesAnomaliaVO es la el objeto VO encontrado
	 */
	public SeveridadesAnomaliaVO findSeveridadAnomaliaByID(Integer idSeveridadAnomalia);
	
	/**
	 * Metodo que inserta un registro en la tabla siga_severidadesAnomalia
	 * @param severidadesAnomaliaVO Es el VO a insertar
	 */
	public void saveSeveridadAnomalia(SeveridadesAnomaliaVO severidadesAnomaliaVO);
	
	/**
	 * Metodo que actualiza un registro en la tabla siga_severidadesAnomalia
	 * @param severidadesAnomaliaVO Es el VO a actualizar
	 */
	public void updateSeveridadAnomalia(SeveridadesAnomaliaVO severidadesAnomaliaVO);
	
	/**
	 * Metodo que borra un registro en la tabla siga_severidadesAnomalia
	 * @param severidadesAnomaliaVO Es el VO a borrar.
	 */
	public void deleteSeveridadAnomalia(SeveridadesAnomaliaVO severidadesAnomaliaVO);
	
	/**
	 * Metodo que consulta todos los registros existentes de la tabla siga_severidadesAnomalia
	 * @return List<SeveridadesAnomaliaVO> Es la lista de SeveridadAnomaliaes encontradas.
	 */
	public List<SeveridadesAnomaliaVO> getAllSeveridadesAnomalia();
}
