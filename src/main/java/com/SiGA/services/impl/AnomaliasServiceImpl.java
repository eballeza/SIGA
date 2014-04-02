package com.SiGA.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.SiGA.common.VO.AnomaliasVO;
import com.SiGA.common.VO.EstatusAnomaliaVO;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.AnomaliasDAO;
import com.SiGA.services.AnomaliasService;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 15/04/2013
 * @descripcion Clase de tipo Service que interactua con el DAO AnomaliasDAO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_IMPL_ANOMALIAS)
public class AnomaliasServiceImpl implements AnomaliasService{
	
	@Autowired
	@Qualifier(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_ANOMALIAS)
	private AnomaliasDAO anomaliasDAO;

	@Override
	public AnomaliasVO encuentraAnomaliaXId(Integer idAnomalia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertaAnomalia(AnomaliasVO anomaliaVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizaAnomalia(AnomaliasVO anomaliasVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAnomalia(AnomaliasVO AnomaliaVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AnomaliasVO> obtenTodosAnomalia() {
		return anomaliasDAO.getAllAnomalias();
	}

	/* (non-Javadoc)
	 * @see com.SiGA.services.AnomaliasService#filtrarAnomaliasPorTodosCampos( VO.EstatusAnomaliaVO)
	 */
	@Override
	public List<AnomaliasVO> filtrarAnomaliasPorTodosCampos(
			AnomaliasVO anomaliasVO
			/*EstatusAnomaliaVO estatusAnomaliaVO*/) {
		return anomaliasDAO.getAnomaliasByAllFilters(anomaliasVO);
	}

}
