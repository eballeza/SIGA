package  com.SiGA.persistencia.dao;

import java.util.List;

import com.SiGA.common.VO.AccionesAnomaliaVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 19/02/2013
 * @descripcion Interfaz de tipo DAO utilizada para persistir objetos de tipo AccionesAnomaliaVO
 *
 */
public interface AccionesAnomaliaDAO {

	/**
	 * Metodo que hace un SELECT * FROM [PRIMARY KEY] = idAccionAnomalia en la tabla siga_accionesAnomalia
	 * @param idAccionAnomalia Es el id a buscar
	 * @return AccionesAnomaliaVO es la el objeto VO encontrado
	 */
	public AccionesAnomaliaVO findAccionAnomaliaByID(Integer idAccionAnomalia);
	
	/**
	 * Metodo que inserta un registro en la tabla siga_accionesAnomalia
	 * @param accionAnomaliaVO Es el VO a insertar
	 */
	public void saveAccionAnomalia(AccionesAnomaliaVO accionAnomaliaVO);
	
	/**
	 * Metodo que actualiza un registro en la tabla siga_accionesAnomalia
	 * @param accionAnomaliaVO Es el VO a actualizar
	 */
	public void updateAccionAnomalia(AccionesAnomaliaVO accionAnomaliaVO);
	
	/**
	 * Metodo que borra un registro en la tabla siga_accionesAnomalia
	 * @param accionAnomaliaVO Es el VO a borrar.
	 */
	public void deleteAccionAnomalia(AccionesAnomaliaVO accionAnomaliaVO);
	
	/**
	 * Metodo que consulta todos los registros existentes de la tabla siga_accionesAnomalia
	 * @return List<AccionesAnomaliaVO> Es la lista de AccionesAnomalia encontradas.
	 */
	public List<AccionesAnomaliaVO> getAllAccionesAnomalia();
}
