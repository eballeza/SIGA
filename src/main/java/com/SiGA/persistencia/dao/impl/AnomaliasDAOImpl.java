package  com.SiGA.persistencia.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



import com.SiGA.common.VO.AnomaliasVO;
import com.SiGA.common.VO.EstatusAnomaliaVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertAnomaliasPOJOToVO;
import com.SiGA.core.HibernateUtil;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.common.constantes.ConstantesQuerys;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.AnomaliasDAO;
import com.SiGA.persistencia.pojo.AnomaliasPOJO;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Clase de tipo DAO utilizada para persistir objetos de tipo AnomaliasVO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_ANOMALIAS)
public class AnomaliasDAOImpl implements AnomaliasDAO {

	private Session session; 
	private static String OBJETO_ABSTRACTO = "anomalia";
	private static String OBJETO_ABSTRACTO_POJO = "AnomaliasPOJO";
	private static String OBJETO_ABSTRACTO_VO = "AnomaliasVO";
	
	private static String QUERY_SELECT_FROM_ACCIONES_ALL = ConstantesQuerys.QUERY_FROM + " " + OBJETO_ABSTRACTO_POJO;
	private static String QUERY_SELECT_FROM_ACCIONES_WHERE_ALL_FILTERS = ConstantesQuerys.QUERY_FROM + " " + OBJETO_ABSTRACTO_POJO + " " +ConstantesQuerys.QUERY_WHERE + " " +
	"idEstatusAnomalia = :idEstatusAnomalia" ;
	
	
	/**
	 * Constructor de la clase.
	 */
	public AnomaliasDAOImpl(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}
	
	
	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.AnomaliasDAO#findAnomaliaByID(java.lang.Integer)
	 */
	@Override
	public AnomaliasVO findAnomaliaByID(Integer idAnomalia) {
		AnomaliasPOJO anomaliasPOJO = null;
		if(session != null){
			Transaction tx = null;
			try{
				session.beginTransaction();
				anomaliasPOJO = (AnomaliasPOJO) session.get(AnomaliasPOJO.class, idAnomalia);
				tx.commit();
			}catch(Exception e){
				//System.err.println("Error al tratar de buscar Acciones con id = " + idAccion);
				System.err.println(ConstantesMensajesDeError.ERROR_FIND_BY + OBJETO_ABSTRACTO + ConstantesQuerys.ID_IGUAL  + idAnomalia);
				e.printStackTrace();
			}					
		}
		return ConvertAnomaliasPOJOToVO.convertAnomaliasPOJOToVO( anomaliasPOJO );
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.AnomaliasDAO#saveAnomalia( VO.AnomaliasVO)
	 */
	@Override
	public void saveAnomalia(AnomaliasVO anomaliaVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.save((Object) ConvertAnomaliasPOJOToVO.convertAnomaliasVOToPOJO(anomaliaVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_INSERT + anomaliaVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.AnomaliasDAO#updateAnomalia( VO.AnomaliasVO)
	 */
	@Override
	public void updateAnomalia(AnomaliasVO anomaliasVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.update((Object) ConvertAnomaliasPOJOToVO.convertAnomaliasVOToPOJO(anomaliasVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_UPDATE + anomaliasVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.AnomaliasDAO#deleteAnomalia( VO.AnomaliasVO)
	 */
	@Override
	public void deleteAnomalia(AnomaliasVO anomaliaVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.delete((Object) ConvertAnomaliasPOJOToVO.convertAnomaliasVOToPOJO(anomaliaVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_DELETE + anomaliaVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.AnomaliasDAO#getAllAnomalias()
	 */
	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<AnomaliasVO> getAllAnomalias() {
		List<AnomaliasPOJO> lstAnomaliasPOJOs = null;
		List<AnomaliasVO> lstAnomaliasVOs = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				Query q = session.createQuery(QUERY_SELECT_FROM_ACCIONES_ALL);
				lstAnomaliasPOJOs = q.list();
				lstAnomaliasVOs = new ArrayList<AnomaliasVO>();
				for(AnomaliasPOJO unaAnomalia: lstAnomaliasPOJOs){
					lstAnomaliasVOs.add(ConvertAnomaliasPOJOToVO.convertAnomaliasPOJOToVO(unaAnomalia));
				}
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_SELECT_ALL + OBJETO_ABSTRACTO_VO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
		return lstAnomaliasVOs;
	}


	/* (non-Javadoc)
	 * @see  dao.AnomaliasDAO#getAnomaliasByAllFilters( VO.EstatusAnomaliaVO)
	 */
	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<AnomaliasVO> getAnomaliasByAllFilters(AnomaliasVO anomaliasVO
			/*EstatusAnomaliaVO estatusAnomaliaVO*/) {
			
			List<AnomaliasPOJO> lstAnomaliaPOJOs = null;
			List<AnomaliasVO> anomaliasVOs = null;
			if(session != null){
				Transaction tx = null;
				try{
					tx = session.beginTransaction();
					Query q = session.createQuery(QUERY_SELECT_FROM_ACCIONES_WHERE_ALL_FILTERS);
					q.setParameter("idEstatusAnomalia", anomaliasVO.getEstatusAnomaliaVO().getIdEstatusAnomalia());
					lstAnomaliaPOJOs = q.list();
					anomaliasVOs = new ArrayList<AnomaliasVO>();
					for(AnomaliasPOJO unaAnomnaliaPojo: lstAnomaliaPOJOs){
						anomaliasVOs.add(ConvertAnomaliasPOJOToVO.convertAnomaliasPOJOToVO(unaAnomnaliaPojo));
					}
					tx.commit();
				}catch(Exception e){
					System.err.println(ConstantesMensajesDeError.ERROR_SELECT_BY_ALL_FILTERS + OBJETO_ABSTRACTO_VO);
					e.printStackTrace();
					tx.rollback();
				}
			}
			
		return anomaliasVOs;
	}



}
