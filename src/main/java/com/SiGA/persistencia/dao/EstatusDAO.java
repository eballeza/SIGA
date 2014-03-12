package  com.SiGA.persistencia.dao;

import java.util.List;

import com.SiGA.common.VO.EstatusVO;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 19/02/2013
 * @descripcion Interfaz de tipo DAO utilizada para persistir objetos de tipo EstatusVO
 *
 */
public interface EstatusDAO {

	/**
	 * Metodo que hace un SELECT * FROM [PRIMARY KEY] = idEstatus en la tabla siga_estatus
	 * @param idEstatus Es el id a buscar
	 * @return EstatusVO es la el objeto VO encontrado
	 */
	public EstatusVO findEstatusByID(Integer idEstatus);
	
	/**
	 * Metodo que inserta un registro en la tabla siga_estatus
	 * @param estatusVO Es el VO a insertar
	 */
	public void saveEstatus(EstatusVO estatusVO);
	
	/**
	 * Metodo que actualiza un registro en la tabla siga_estatus
	 * @param estatusVO Es el VO a actualizar
	 */
	public void updateEstatus(EstatusVO estatusVO);
	
	/**
	 * Metodo que borra un registro en la tabla siga_estatus
	 * @param estatusVO Es el VO a borrar.
	 */
	public void deleteEstatus(EstatusVO estatusVO);
	
	/**
	 * Metodo que consulta todos los registros existentes de la tabla siga_estatus
	 * @return List<EstatusVO> Es la lista de Estatuses encontradas.
	 */
	public List<EstatusVO> getAllEstatus();
	
}
