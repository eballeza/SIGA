package com.SiGA.services;

import java.util.List;

import com.SiGA.common.VO.EmpresasVO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 19/04/2013
 * @descripcion Interface de tipo Service que interactua con el DAO EmpresasDAO
 *
 */
public interface EmpresasService {

	/**
	 * Encuentra una empresa por id de esta
	 * @param idEmpresa es el id a buscar
	 * @return EmpresasVO es la empresa encontrado
	 */
	public EmpresasVO encuentraEmpresaXId(Integer idEmpresa);
	
	/**
	 * Inserta una empresaa la tabla siga_empresas
	 * @param EmpresasVO es el empresa a insertar
	 */
	public void insertaEmpresa(EmpresasVO empresaVO);

	/**
	 * Actualiza una empresa
	 * @param EmpresasVO es la empresaa actualizar
	 */
	public void actualizaEmpresa(EmpresasVO empresaVO);
	
	/**
	 * Borra una empresa de la tabla siga_empresas
	 * @param EmpresasVO es la empresaa borrar
	 */
	public void deleteEmpresa(EmpresasVO empresaVO);
	
	/**
	 * Obtiene todas las Empresas de la tabla siga_empresas
	 * @return
	 */
	public List<EmpresasVO> obtenTodosEmpresas();
}
