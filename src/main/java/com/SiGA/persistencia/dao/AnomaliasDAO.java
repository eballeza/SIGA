package  com.SiGA.persistencia.dao;

import java.util.List;

import com.SiGA.common.VO.AnomaliasVO;
import com.SiGA.common.VO.EstatusAnomaliaVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Interfaz de tipo DAO utilizada para persistir objetos de tipo AnomaliasVO
 *
 */
public interface AnomaliasDAO {

	/**
	 * Metodo que hace un SELECT * FROM [PRIMARY KEY] = idAnomalia en la tabla siga_anomalias
	 * @param idAnomalia Es el id a buscar
	 * @return AnomaliasVO es la el objeto VO encontrado
	 */
	public AnomaliasVO findAnomaliaByID(Integer idAnomalia);
	
	/**
	 * Metodo que inserta un registro en la tabla siga_anomalias
	 * @param anomaliaVO Es el VO a insertar
	 */
	public void saveAnomalia(AnomaliasVO anomaliaVO);
	
	/**
	 * Metodo que actualiza un registro en la tabla siga_anomalias
	 * @param AnomaliasVO Es el VO a actualizar
	 */
	public void updateAnomalia(AnomaliasVO anomaliasVO);
	
	/**
	 * Metodo que borra un registro en la tabla siga_anomalias
	 * @param anomaliaVO Es el VO a borrar.
	 */
	public void deleteAnomalia(AnomaliasVO anomaliaVO);
	
	/**
	 * Metodo que consulta todos los registros existentes de la tabla siga_anomalias
	 * @return List<AnomaliasVO> Es la lista de Anomaliaes encontradas.
	 */
	public List<AnomaliasVO> getAllAnomalias();
	
	/**
	 * Metodo que buscara anomalias filtradas por todos sus campos.
	 * @return
	 */
	public List<AnomaliasVO> getAnomaliasByAllFilters(AnomaliasVO anomaliasVO/*EstatusAnomaliaVO estatusAnomaliaVO*/);
	
}
