package  com.SiGA.persistencia.dao;

import java.util.List;

import com.SiGA.common.VO.UsuariosVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Interfaz de tipo DAO utilizada para persistir objetos de tipo UsuariosVO
 *
 */
public interface UsuariosDAO {

	/**
	 * Metodo que hace un SELECT * FROM [PRIMARY KEY] = idUsuario en la tabla siga_usuarios
	 * @param idUsuario Es el id a buscar
	 * @return UsuariosVO es la el objeto VO encontrado
	 */
	public UsuariosVO findUsuarioByID(Integer idUsuario);
	
	/**
	 * Metodo que inserta un registro en la tabla siga_usuarios
	 * @param usuarioVO Es el VO a insertar
	 */
	public void saveUsuario(UsuariosVO usuarioVO);
	
	/**
	 * Metodo que actualiza un registro en la tabla siga_usuarios
	 * @param usuarioVO Es el VO a actualizar
	 */
	public void updateUsuario(UsuariosVO usuarioVO);
	
	/**
	 * Metodo que borra un registro en la tabla siga_usuarios
	 * @param usuarioVO Es el VO a borrar.
	 */
	public void deleteUsuario(UsuariosVO usuarioVO);
	
	/**
	 * Metodo que consulta todos los registros existentes de la tabla siga_usuarios
	 * @return List<UsuariosVO> Es la lista de Usuarios encontradas.
	 */
	public List<UsuariosVO> getAllUsuarios();
	
}
