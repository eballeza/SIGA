package com.SiGA.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.SiGA.common.VO.EmpresasVO;
import com.SiGA.common.VO.EstatusAnomaliaVO;
import com.SiGA.common.VO.EstatusVO;
import com.SiGA.common.VO.ModulosNCVO;
import com.SiGA.common.VO.NivelesSoporteVO;
import com.SiGA.common.VO.SeveridadesAnomaliaVO;
import com.SiGA.common.VO.SistemasNCVO;
import com.SiGA.common.VO.UsuariosVO;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.EmpresasDAO;
import com.SiGA.persistencia.dao.EstatusAnomaliaDAO;
import com.SiGA.persistencia.dao.ModulosNCDAO;
import com.SiGA.persistencia.dao.NivelesSoporteDAO;
import com.SiGA.persistencia.dao.SeveridadesAnomaliaDAO;
import com.SiGA.persistencia.dao.SistemasNCDAO;
import com.SiGA.persistencia.dao.UsuariosDAO;
import com.SiGA.services.CommonService;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 10/04/2014
 * @descripcion 
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICES_IMPL_COMMON)
public class CommonServiceImpl implements CommonService {

	
	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_SISTEMAS_NC)
	private SistemasNCDAO sistemasNCDAO;
	
	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_MODULOS_NC)
	private  ModulosNCDAO modulosNCDAO;
	
	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_ESTATUS_ANOMALIA)
	private EstatusAnomaliaDAO estatusAnomaliaDAO;
	
	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_SEVERIDADES_ANOMALIA)
	private SeveridadesAnomaliaDAO severidadesAnomaliaDAO;
	
	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_NIVELES_SOPORTE)
	private NivelesSoporteDAO nivelesSoporteDAO;
	
	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_SEVERIDADES_ANOMALIA)
	private UsuariosDAO usuariosDAO;
	
	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_EMPRESAS)
	private EmpresasDAO empresasDAO;
	

	@Override
	public List<SistemasNCVO> obtieneSistemas() {
		List<SistemasNCVO> ltSistemasNCVOss = null;
		try{
			ltSistemasNCVOss = sistemasNCDAO.getAllSistemaNC();
		}catch(NullPointerException e){
			System.err.println("Ningun sistema encontrado " + e.getStackTrace());
		}			
		return ltSistemasNCVOss;
	}

	@Override
	public List<ModulosNCVO> obtieneModulos() {
		List<ModulosNCVO> lstModulosNCVOs = null;
		try{
			lstModulosNCVOs = modulosNCDAO.getAllModulosNC();
		}catch(NullPointerException e){
			System.err.println("Ningun Modulo encontrado " + e.getStackTrace());
		}			
		return lstModulosNCVOs;
	}

	@Override
	public List<EstatusAnomaliaVO> obtieneEstatusAnomalias() {
		List<EstatusAnomaliaVO> lstEstatusAnomaliaVOs = null;
		try{
			lstEstatusAnomaliaVOs = estatusAnomaliaDAO.getAllEstatusAnomalia();
		}catch(NullPointerException e){
			System.err.println("Ningun EstatusAnomalia encontrado " + e.getStackTrace());
		}			
		return lstEstatusAnomaliaVOs;
	}

	@Override
	public List<SeveridadesAnomaliaVO> obtieneSeveridades() {
		List<SeveridadesAnomaliaVO> lstSeveridadesAnomaliaVOs = null;
		try{
			lstSeveridadesAnomaliaVOs = severidadesAnomaliaDAO.getAllSeveridadesAnomalia();
		}catch(NullPointerException e){
			System.err.println("Ningun Severidad encontrado " + e.getStackTrace());
		}			
		return lstSeveridadesAnomaliaVOs;
	}

	@Override
	public List<NivelesSoporteVO> obtieneNivelesSoporte() {
		List<NivelesSoporteVO> lstNivelesSoporteVOs = null;
		try{
			lstNivelesSoporteVOs = nivelesSoporteDAO.getAllNivelesSoporte();
		}catch(NullPointerException e){
			System.err.println("Ningun Nivele de Soporte encontrado " + e.getStackTrace());
		}			
		return lstNivelesSoporteVOs;
	}

	@Override
	public List<UsuariosVO> obtieneUsuariosPorEmpresa(EmpresasVO empresasVO) {
		List<UsuariosVO> lstUsuariosVOs = null;
		try{
			lstUsuariosVOs = usuariosDAO.buscarUsuarioXEmpresa(empresasVO.getIdEmpresa());
		}catch(NullPointerException e){
			System.err.println("Ningun Usuario encontrado " + e.getStackTrace());
		}			
		return lstUsuariosVOs;
	}

	@Override
	public List<EmpresasVO> obtieneEmpresas() {
		List<EmpresasVO> lstEMEmpresasVOs = null;
		try{
			lstEMEmpresasVOs = empresasDAO.getAllEmpresa();
		}catch(NullPointerException e){
			System.err.println("Ninguna Empresa encontrada " + e.getStackTrace());
		}			
		return lstEMEmpresasVOs;
	}


	/**
	 * @return the sistemasNCDAO
	 */
	public SistemasNCDAO getSistemasNCDAO() {
		return sistemasNCDAO;
	}

	/**
	 * @param sistemasNCDAO the sistemasNCDAO to set
	 */
	public void setSistemasNCDAO(SistemasNCDAO sistemasNCDAO) {
		this.sistemasNCDAO = sistemasNCDAO;
	}

	/**
	 * @return the modulosNCDAO
	 */
	public ModulosNCDAO getModulosNCDAO() {
		return modulosNCDAO;
	}

	/**
	 * @param modulosNCDAO the modulosNCDAO to set
	 */
	public void setModulosNCDAO(ModulosNCDAO modulosNCDAO) {
		this.modulosNCDAO = modulosNCDAO;
	}

	

	/**
	 * @return the estatusAnomaliaDAO
	 */
	public EstatusAnomaliaDAO getEstatusAnomaliaDAO() {
		return estatusAnomaliaDAO;
	}

	/**
	 * @param estatusAnomaliaDAO the estatusAnomaliaDAO to set
	 */
	public void setEstatusAnomaliaDAO(EstatusAnomaliaDAO estatusAnomaliaDAO) {
		this.estatusAnomaliaDAO = estatusAnomaliaDAO;
	}

	/**
	 * @return the severidadesAnomaliaDAO
	 */
	public SeveridadesAnomaliaDAO getSeveridadesAnomaliaDAO() {
		return severidadesAnomaliaDAO;
	}

	/**
	 * @param severidadesAnomaliaDAO the severidadesAnomaliaDAO to set
	 */
	public void setSeveridadesAnomaliaDAO(
			SeveridadesAnomaliaDAO severidadesAnomaliaDAO) {
		this.severidadesAnomaliaDAO = severidadesAnomaliaDAO;
	}

	/**
	 * @return the nivelesSoporteDAO
	 */
	public NivelesSoporteDAO getNivelesSoporteDAO() {
		return nivelesSoporteDAO;
	}

	/**
	 * @param nivelesSoporteDAO the nivelesSoporteDAO to set
	 */
	public void setNivelesSoporteDAO(NivelesSoporteDAO nivelesSoporteDAO) {
		this.nivelesSoporteDAO = nivelesSoporteDAO;
	}

	/**
	 * @return the usuariosDAO
	 */
	public UsuariosDAO getUsuariosDAO() {
		return usuariosDAO;
	}

	/**
	 * @param usuariosDAO the usuariosDAO to set
	 */
	public void setUsuariosDAO(UsuariosDAO usuariosDAO) {
		this.usuariosDAO = usuariosDAO;
	}

	/**
	 * @return the empresasDAO
	 */
	public EmpresasDAO getEmpresasDAO() {
		return empresasDAO;
	}

	/**
	 * @param empresasDAO the empresasDAO to set
	 */
	public void setEmpresasDAO(EmpresasDAO empresasDAO) {
		this.empresasDAO = empresasDAO;
	}
	
	
}
