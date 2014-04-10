package com.SiGA.services;

import java.util.List;

import com.SiGA.common.VO.EmpresasVO;
import com.SiGA.common.VO.EstatusAnomaliaVO;
import com.SiGA.common.VO.EstatusVO;
import com.SiGA.common.VO.ModulosNCVO;
import com.SiGA.common.VO.NivelesSoporteVO;
import com.SiGA.common.VO.SeveridadesAnomaliaVO;
import com.SiGA.common.VO.SistemasNCVO;
import com.SiGA.common.VO.UsuariosVO;
import com.SiGA.manageBean.converters.EstatusAnomaliaConverter;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 10/04/2014
 * @descripcion Interface de tipo Service que interactua con el DAO AnomaliasDAO
 *
 */
public interface CommonService {
	
	public List<SistemasNCVO> obtieneSistemas();
	
	public List<ModulosNCVO> obtieneModulos();
	
	public List<EstatusAnomaliaVO> obtieneEstatusAnomalias();
	
	public List<SeveridadesAnomaliaVO> obtieneSeveridades();
	
	public List<NivelesSoporteVO> obtieneNivelesSoporte();
	
	public List<UsuariosVO> obtieneUsuariosPorEmpresa(EmpresasVO empresasVO);
	
	public List<EmpresasVO> obtieneEmpresas();

}
