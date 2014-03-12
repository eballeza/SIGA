package  com.SiGA.persistencia.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



import com.SiGA.common.VO.EstatusAnomaliaVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertEstatusAnomaliaPOJOToVO;
import com.SiGA.core.HibernateUtil;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.common.constantes.ConstantesQuerys;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.EstatusAnomaliaDAO;
import com.SiGA.persistencia.pojo.EstatusAnomaliaPOJO;
/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Clase de tipo DAO utilizada para persistir objetos de tipo EstatusAnomaliaVO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_ESTATUS_ANOMALIA)
public class EstatusAnomaliaDAOImpl implements EstatusAnomaliaDAO {
	
	private Session session; 
	private static String OBJETO_ABSTRACTO = "estatusAnomalia";
	private static String OBJETO_ABSTRACTO_POJO = "EstatusAnomaliaPOJO";
	private static String OBJETO_ABSTRACTO_VO = "EstatusAnomaliaVO";
	
	private static String QUERY_SELECT_FROM_ACCIONES_ALL = ConstantesQuerys.QUERY_FROM + " " + OBJETO_ABSTRACTO_POJO;
	
	
	/**
	 * Constructor de la clase.
	 */
	public EstatusAnomaliaDAOImpl(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}
	
	
	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.EstatusAnomaliaDAO#findEstatusAnomaliaByID(java.lang.Integer)
	 */
	@Override
	public EstatusAnomaliaVO findEstatusAnomaliaByID(Integer idEstatusAnomalia) {
		EstatusAnomaliaPOJO estatusAnomaliaPOJO = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				estatusAnomaliaPOJO = (EstatusAnomaliaPOJO) session.get(EstatusAnomaliaPOJO.class, idEstatusAnomalia);
				tx.commit();
			}catch(Exception e){
				//System.err.println("Error al tratar de buscar Acciones con id = " + idAccion);
				System.err.println(ConstantesMensajesDeError.ERROR_FIND_BY + OBJETO_ABSTRACTO + ConstantesQuerys.ID_IGUAL  + idEstatusAnomalia);
				e.printStackTrace();
			}					
		}
		return ConvertEstatusAnomaliaPOJOToVO.convertEstatusAnomaliaPOJOToVO( estatusAnomaliaPOJO );
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.EstatusAnomaliaDAO#saveEstatusAnomalia( VO.EstatusAnomaliaVO)
	 */
	@Override
	public void saveEstatusAnomalia(EstatusAnomaliaVO estatusAnomaliaVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.save((Object) ConvertEstatusAnomaliaPOJOToVO.convertEstatusAnomaliaVOToPOJO(estatusAnomaliaVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_INSERT + estatusAnomaliaVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.EstatusAnomaliaDAO#updateEstatusAnomalia( VO.EstatusAnomaliaVO)
	 */
	@Override
	public void updateEstatusAnomalia(EstatusAnomaliaVO estatusAnomaliaVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.update((Object) ConvertEstatusAnomaliaPOJOToVO.convertEstatusAnomaliaVOToPOJO(estatusAnomaliaVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_UPDATE + estatusAnomaliaVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.EstatusAnomaliaDAO#deleteEstatusAnomalia( VO.EstatusAnomaliaVO)
	 */
	@Override
	public void deleteEstatusAnomalia(EstatusAnomaliaVO estatusAnomaliaVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.delete((Object) ConvertEstatusAnomaliaPOJOToVO.convertEstatusAnomaliaVOToPOJO(estatusAnomaliaVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_DELETE + estatusAnomaliaVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.EstatusAnomaliaDAO#getAllEstatusAnomalia()
	 */
	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<EstatusAnomaliaVO> getAllEstatusAnomalia() {
		List<EstatusAnomaliaPOJO> lstEstatusAnomaliaPOJOs = null;
		List<EstatusAnomaliaVO> lstEstatusAnomaliaVOs = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				Query q = session.createQuery(QUERY_SELECT_FROM_ACCIONES_ALL);
				lstEstatusAnomaliaPOJOs = q.list();
				lstEstatusAnomaliaVOs = new ArrayList<EstatusAnomaliaVO>();
				for(EstatusAnomaliaPOJO unEstatusAnomalia: lstEstatusAnomaliaPOJOs){
					lstEstatusAnomaliaVOs.add(ConvertEstatusAnomaliaPOJOToVO.convertEstatusAnomaliaPOJOToVO(unEstatusAnomalia));
				}
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_SELECT_ALL + OBJETO_ABSTRACTO_VO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
		return lstEstatusAnomaliaVOs;
	}

}
