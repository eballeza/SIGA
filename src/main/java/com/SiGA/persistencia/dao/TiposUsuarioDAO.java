package  com.SiGA.persistencia.dao;

import java.util.List;

import com.SiGA.common.VO.TiposUsuarioVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 19/02/2013
 * @descripcion Interfaz de tipo DAO utilizada para persistir objetos de tipo 
 *
 */
public interface TiposUsuarioDAO {

	/**
	 * Metodo que hace un SELECT * FROM [PRIMARY KEY] = idTipoUsuario en la tabla siga_TipoUsuario
	 * @param idTipoUsuario Es el id a buscar
	 * @return TiposUsuarioVO es la el objeto VO encontrado
	 */
	public TiposUsuarioVO findTipoUsuarioByID(Integer idTipoUsuario);
	
	/**
	 * Metodo que inserta un registro en la tabla siga_tiposUsuario
	 * @param tipoUsuarioVO Es el VO a insertar
	 */
	public void saveTipoUsuario(TiposUsuarioVO tipoUsuarioVO);
	
	/**
	 * Metodo que actualiza un registro en la tabla siga_tiposUsuario
	 * @param tipoUsuarioVO Es el VO a actualizar
	 */
	public void updateTipoUsuario(TiposUsuarioVO tipoUsuarioVO);
	
	/**
	 * Metodo que borra un registro en la tabla siga_tiposUsuario
	 * @param tipoUsuarioVO Es el VO a borrar.
	 */
	public void deleteTipoUsuario(TiposUsuarioVO tipoUsuarioVO);
	
	/**
	 * Metodo que consulta todos los registros existentes de la tabla siga_tiposUsuario
	 * @return List<TiposUsuarioVO> Es la lista de TipoUsuarioes encontradas.
	 */
	public List<TiposUsuarioVO> getAllTiposUsuario();
}
