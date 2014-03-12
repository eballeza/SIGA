package com.SiGA.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.SiGA.common.VO.EstatusAnomaliaVO;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.EstatusAnomaliaDAO;
import com.SiGA.services.EstatusAnomaliasService;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 17/04/2013
 * @descripcion Clase de tipo Service que interactua con el DAO EstatusAnomaliasDAO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_IMPL_ESTATUS_ANOMALIAS)
public class EstatusAnomaliasServiceImpl implements EstatusAnomaliasService{

	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_ESTATUS_ANOMALIA)
	private EstatusAnomaliaDAO estatusAnomaliaDAO;
	
	@Override
	public EstatusAnomaliaVO encuentraEstatusAnomaliaXId(
			Integer idEstatusAnomalia) {
		return estatusAnomaliaDAO.findEstatusAnomaliaByID(idEstatusAnomalia);
	}

	@Override
	public void insertaEstatusAnomalia(EstatusAnomaliaVO estatusAnomaliaVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizaEstatusAnomalia(EstatusAnomaliaVO estatusAnomaliaVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEstatus(EstatusAnomaliaVO estatusAnomaliaVO) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.SiGA.services.EstatusAnomaliasService#obtenTodosEstatusAnomalia()
	 */
	@Override
	public List<EstatusAnomaliaVO> obtenTodosEstatusAnomalia() {
		return estatusAnomaliaDAO.getAllEstatusAnomalia();
	}

}
