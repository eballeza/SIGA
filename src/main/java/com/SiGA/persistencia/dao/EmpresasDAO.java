package  com.SiGA.persistencia.dao;

import java.util.List;

import com.SiGA.common.VO.EmpresasVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 19/02/2013
 * @descripcion Interfaz de tipo DAO utilizada para persistir objetos de tipo 
 *
 */
public interface EmpresasDAO {

	/**
	 * Metodo que hace un SELECT * FROM [PRIMARY KEY] = idEmpresa en la tabla siga_empresas
	 * @param idEmpresa Es el id a buscar
	 * @return EmpresasVO es la el objeto VO encontrado
	 */
	public EmpresasVO findEmpresaByID(Integer idEmpresa);
	
	/**
	 * Metodo que inserta un registro en la tabla siga_empresas
	 * @param empresaVO Es el VO a insertar
	 */
	public void saveEmpresa(EmpresasVO empresaVO);
	
	/**
	 * Metodo que actualiza un registro en la tabla siga_empresas
	 * @param empresaVO Es el VO a actualizar
	 */
	public void updateEmpresa(EmpresasVO empresaVO);
	
	/**
	 * Metodo que borra un registro en la tabla siga_empresas
	 * @param empresaVO Es el VO a borrar.
	 */
	public void deleteEmpresa(EmpresasVO empresaVO);
	
	/**
	 * Metodo que consulta todos los registros existentes de la tabla siga_empresas
	 * @return List<EmpresasVO> Es la lista de Empresas encontradas.
	 */
	public List<EmpresasVO> getAllEmpresa();
}
