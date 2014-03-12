package  com.SiGA.persistencia.dao;

import java.util.List;

import com.SiGA.common.VO.TiposAnomaliaVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 19/02/2013
 * @descripcion Interfaz de tipo DAO utilizada para persistir objetos de tipo TiposAnomaliaVO
 *
 */
public interface TiposAnomaliaDAO {

	/**
	 * Metodo que hace un SELECT * FROM [PRIMARY KEY] = idTipoAnomalia en la tabla siga_tiposAnomalia
	 * @param idTipoAnomalia Es el id a buscar
	 * @return TiposAnomaliaVO es la el objeto VO encontrado
	 */
	public TiposAnomaliaVO findTipoAnomaliaByID(Integer idTipoAnomalia);
	
	/**
	 * Metodo que inserta un registro en la tabla siga_tiposAnomalia
	 * @param tiposAnomaliaVO Es el VO a insertar
	 */
	public void saveTiposAnomalia(TiposAnomaliaVO tipoAnomaliaVO);
	
	/**
	 * Metodo que actualiza un registro en la tabla siga_tiposAnomalia
	 * @param tipoAnomaliaVO Es el VO a actualizar
	 */
	public void updateTiposAnomalia(TiposAnomaliaVO tipoAnomaliaVO);
	
	/**
	 * Metodo que borra un registro en la tabla siga_tiposAnomalia
	 * @param tipoAnomaliaVO Es el VO a borrar.
	 */
	public void deleteTiposAnomalia(TiposAnomaliaVO tipoAnomaliaVO);
	
	/**
	 * Metodo que consulta todos los registros existentes de la tabla siga_tiposAnomalia
	 * @return List<TiposAnomaliaVO> Es la lista de TiposAnomaliaes encontradas.
	 */
	public List<TiposAnomaliaVO> getAllTiposAnomalia();
	
}
