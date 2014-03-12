package  com.SiGA.persistencia.dao;

import java.util.List;

import com.SiGA.common.VO.SistemasNCVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 19/02/2013
 * @descripcion Interfaz de tipo DAO utilizada para persistir objetos de tipo SistemasNCVO
 *
 */
public interface SistemasNCDAO {

	/**
	 * Metodo que hace un SELECT * FROM [PRIMARY KEY] = idSistemaNC en la tabla siga_sistemasNC
	 * @param idSistemaNC Es el id a buscar
	 * @return SistemasNCVO es la el objeto VO encontrado
	 */
	public SistemasNCVO findSistemaNCByID(Integer idSistemaNC);
	
	/**
	 * Metodo que inserta un registro en la tabla siga_sistemasNC
	 * @param sistemaNCVO Es el VO a insertar
	 */
	public void saveSistemaNC(SistemasNCVO sistemaNCVO);
	
	/**
	 * Metodo que actualiza un registro en la tabla siga_sistemasNC
	 * @param sistemaNCVO Es el VO a actualizar
	 */
	public void updateSistemaNC(SistemasNCVO sistemaNCVO);
	
	/**
	 * Metodo que borra un registro en la tabla siga_sistemasNC
	 * @param sistemaNCVO Es el VO a borrar.
	 */
	public void deleteSistemaNC(SistemasNCVO sistemaNCVO);
	
	/**
	 * Metodo que consulta todos los registros existentes de la tabla siga_sistemasNC
	 * @return List<SistemasNCVO> Es la lista de SistemaNCes encontradas.
	 */
	public List<SistemasNCVO> getAllSistemaNC();
}
