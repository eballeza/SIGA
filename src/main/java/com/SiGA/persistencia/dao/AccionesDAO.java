package  com.SiGA.persistencia.dao;

import java.util.List;

import com.SiGA.common.VO.AccionesVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 19/02/2013
 * @descripcion Interfaz de tipo DAO utilizada para persistir objetos de tipo AccionesVO
 *
 */
public interface AccionesDAO {

	
	/**
	 * Metodo que hace un SELECT * FROM [PRIMARY KEY] = idAccion en la tabla siga_acciones
	 * @param idAccion Es el id a buscar
	 * @return AccionesVO es la el objeto VO encontrado
	 */
	public AccionesVO findAccionByID(Integer idAccion);
	
	/**
	 * Metodo que inserta un registro en la tabla siga_acciones
	 * @param accionesVO Es el VO a insertar
	 */
	public void saveAccion(AccionesVO accionesVO);
	
	/**
	 * Metodo que actualiza un registro en la tabla siga_acciones
	 * @param accionesVO Es el VO a actualizar
	 */
	public void updateAccion(AccionesVO accionesVO);
	
	/**
	 * Metodo que borra un registro en la tabla siga_acciones
	 * @param accionesVO Es el VO a borrar.
	 */
	public void deleteAccion(AccionesVO accionesVO);
	
	/**
	 * Metodo que consulta todos los registros existentes de la tabla siga_acciones
	 * @return List<AccionesVO> Es la lista de acciones encontradas.
	 */
	public List<AccionesVO> getAllAcciones();	
}
