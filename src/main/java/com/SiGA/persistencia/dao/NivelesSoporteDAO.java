package  com.SiGA.persistencia.dao;

import java.util.List;

import com.SiGA.common.VO.NivelesSoporteVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Interfaz de tipo DAO utilizada para persistir objetos de tipo NivelesSoporteVO
 *
 */
public interface NivelesSoporteDAO {

	/**
	 * Metodo que hace un SELECT * FROM [PRIMARY KEY] = idNivelSoporte en la tabla siga_NivelesSoporte
	 * @param idNivelSoporte Es el id a buscar
	 * @return NivelesSoporteVO es la el objeto VO encontrado
	 */
	public NivelesSoporteVO findNivelSoporteByID(Integer idNivelSoporte);
	
	/**
	 * Metodo que inserta un registro en la tabla siga_NivelesSoporte
	 * @param nivelSoporteVO Es el VO a insertar
	 */
	public void saveNivelSoporte(NivelesSoporteVO nivelSoporteVO);
	
	/**
	 * Metodo que actualiza un registro en la tabla siga_NivelesSoporte
	 * @param nivelSoporteVO Es el VO a actualizar
	 */
	public void updateNivelSoporte(NivelesSoporteVO nivelSoporteVO);
	
	/**
	 * Metodo que borra un registro en la tabla siga_NivelesSoporte
	 * @param nivelSoporteVO Es el VO a borrar.
	 */
	public void deleteNivelSoporte(NivelesSoporteVO nivelSoporteVO);
	
	/**
	 * Metodo que consulta todos los registros existentes de la tabla siga_NivelesSoporte
	 * @return List<NivelesSoporteVO> Es la lista de NivelSoportees encontradas.
	 */
	public List<NivelesSoporteVO> getAllNivelesSoporte();
	
}
