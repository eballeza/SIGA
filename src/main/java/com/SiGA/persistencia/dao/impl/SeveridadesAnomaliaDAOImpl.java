package  com.SiGA.persistencia.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.SiGA.common.VO.SeveridadesAnomaliaVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertSeveridadesAnomaliaPOJOToVO;
import com.SiGA.core.HibernateUtil;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.common.constantes.ConstantesQuerys;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.SeveridadesAnomaliaDAO;
import com.SiGA.persistencia.pojo.SeveridadesAnomaliaPOJO;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Clase de tipo DAO utilizada para persistir objetos de tipo SeveridadesAnomaliaVO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_SEVERIDADES_ANOMALIA)
public class SeveridadesAnomaliaDAOImpl implements SeveridadesAnomaliaDAO{
	
	private Session session; 
	private static String OBJETO_ABSTRACTO = "severidadAnomalia";
	private static String OBJETO_ABSTRACTO_POJO = "SeveridadesAnomaliaPOJO";
	private static String OBJETO_ABSTRACTO_VO = "SeveridadesAnomaliaVO";
	
	private static String QUERY_SELECT_FROM_ACCIONES_ALL = ConstantesQuerys.QUERY_FROM + " " + OBJETO_ABSTRACTO_POJO;
	
	
	/**
	 * Constructor de la clase.
	 */
	public SeveridadesAnomaliaDAOImpl(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.SeveridadesAnomaliaDAO#findSeveridadAnomaliaByID(java.lang.Integer)
	 */
	@Override
	public SeveridadesAnomaliaVO findSeveridadAnomaliaByID(
			Integer idSeveridadAnomalia) {
		SeveridadesAnomaliaPOJO severidadesAnomaliaPOJO = null;
		if(session != null){
			Transaction tx = null;
			try{
				session.beginTransaction();
				severidadesAnomaliaPOJO = (SeveridadesAnomaliaPOJO) session.get(SeveridadesAnomaliaPOJO.class, idSeveridadAnomalia);
				tx.commit();
			}catch(Exception e){
				//System.err.println("Error al tratar de buscar Acciones con id = " + idAccion);
				System.err.println(ConstantesMensajesDeError.ERROR_FIND_BY + OBJETO_ABSTRACTO + ConstantesQuerys.ID_IGUAL  + idSeveridadAnomalia);
				e.printStackTrace();
			}					
		}
		return ConvertSeveridadesAnomaliaPOJOToVO.convertSeveridadesAnomaliaPOJOToVO(severidadesAnomaliaPOJO);
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.SeveridadesAnomaliaDAO#saveSeveridadAnomalia( VO.SeveridadesAnomaliaVO)
	 */
	@Override
	public void saveSeveridadAnomalia(
			SeveridadesAnomaliaVO severidadesAnomaliaVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.save((Object) ConvertSeveridadesAnomaliaPOJOToVO.convertSeveridadesAnomaliaVOToPOJO(severidadesAnomaliaVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_INSERT + severidadesAnomaliaVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.SeveridadesAnomaliaDAO#updateSeveridadAnomalia( VO.SeveridadesAnomaliaVO)
	 */
	@Override
	public void updateSeveridadAnomalia(
			SeveridadesAnomaliaVO severidadesAnomaliaVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.update((Object) ConvertSeveridadesAnomaliaPOJOToVO.convertSeveridadesAnomaliaVOToPOJO(severidadesAnomaliaVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_UPDATE + severidadesAnomaliaVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.SeveridadesAnomaliaDAO#deleteSeveridadAnomalia( VO.SeveridadesAnomaliaVO)
	 */
	@Override
	public void deleteSeveridadAnomalia(
			SeveridadesAnomaliaVO severidadesAnomaliaVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.delete((Object) ConvertSeveridadesAnomaliaPOJOToVO.convertSeveridadesAnomaliaVOToPOJO(severidadesAnomaliaVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_DELETE + severidadesAnomaliaVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.SeveridadesAnomaliaDAO#getAllSeveridadesAnomalia()
	 */
	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<SeveridadesAnomaliaVO> getAllSeveridadesAnomalia() {
		List<SeveridadesAnomaliaPOJO> lsSeveridadesAnomaliaPOJOs = null;
		List<SeveridadesAnomaliaVO> lstSeveridadesAnomaliaVOs = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				Query q = session.createQuery(QUERY_SELECT_FROM_ACCIONES_ALL);
				lsSeveridadesAnomaliaPOJOs = q.list();
				lstSeveridadesAnomaliaVOs = new ArrayList<SeveridadesAnomaliaVO>();
				for(SeveridadesAnomaliaPOJO unaSeveridadAnomalia: lsSeveridadesAnomaliaPOJOs){
					lstSeveridadesAnomaliaVOs.add(ConvertSeveridadesAnomaliaPOJOToVO.convertSeveridadesAnomaliaPOJOToVO(unaSeveridadAnomalia));
				}
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_SELECT_ALL + OBJETO_ABSTRACTO_VO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
		return lstSeveridadesAnomaliaVOs;
	}

}
