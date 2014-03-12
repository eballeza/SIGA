package  com.SiGA.persistencia.dao;

import java.util.List;

import com.SiGA.common.VO.ModulosNCVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Interfaz de tipo DAO utilizada para persistir objetos de tipo ModulosNCVO
 *
 */
public interface ModulosNCDAO {

	/**
	 * Metodo que hace un SELECT * FROM [PRIMARY KEY] = idModuloNC en la tabla siga_ModulosNC
	 * @param idModuloNC Es el id a buscar
	 * @return ModulosNCVO es la el objeto VO encontrado
	 */
	public ModulosNCVO findModuloNCByID(Integer idModuloNC);
	
	/**
	 * Metodo que inserta un registro en la tabla siga_ModulosNC
	 * @param moduloNCVO Es el VO a insertar
	 */
	public void saveModuloNC(ModulosNCVO moduloNCVO);
	
	/**
	 * Metodo que actualiza un registro en la tabla siga_ModulosNC
	 * @param moduloNCVO Es el VO a actualizar
	 */
	public void updateModuloNC(ModulosNCVO moduloNCVO);
	
	/**
	 * Metodo que borra un registro en la tabla siga_ModulosNC
	 * @param moduloNCVO Es el VO a borrar.
	 */
	public void deleteModuloNC(ModulosNCVO moduloNCVO);
	
	/**
	 * Metodo que consulta todos los registros existentes de la tabla siga_ModulosNC
	 * @return List<ModulosNCVO> Es la lista de ModuloNC encontradas.
	 */
	public List<ModulosNCVO> getAllModulosNC();
	
}
