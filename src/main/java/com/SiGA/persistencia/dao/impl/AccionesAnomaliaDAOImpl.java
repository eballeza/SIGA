package  com.SiGA.persistencia.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



import com.SiGA.common.VO.AccionesAnomaliaVO;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.common.constantes.ConstantesQuerys;
import  com.SiGA.common.convert.pojo_to_vo.ConvertAccionesAnomaliaPOJOToVO;
import com.SiGA.core.HibernateUtil;
import com.SiGA.persistencia.dao.AccionesAnomaliaDAO;
import com.SiGA.persistencia.pojo.AccionesAnomaliaPOJO;
import com.SiGA.common.constantes.ConstantesServicios;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Clase de tipo DAO utilizada para persistir objetos de tipo AccionesAnomaliaVO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_ACCIONES_ANOMALIA)
public class AccionesAnomaliaDAOImpl implements AccionesAnomaliaDAO {

	private Session session; 
	private static String OBJETO_ABSTRACTO = "accionAnomalia";
	private static String OBJETO_ABSTRACTO_POJO = "AccionesAnomaliaPOJO";
	private static String OBJETO_ABSTRACTO_VO = "AccionesAnomaliaVO";
	
	private static String QUERY_SELECT_FROM_ACCIONES_ALL = ConstantesQuerys.QUERY_FROM + " " + OBJETO_ABSTRACTO_POJO;
	
	
	/**
	 * Constructor de la clase.
	 */
	public AccionesAnomaliaDAOImpl(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}
	
	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.AccionesAnomaliaDAO#findAccionAnomaliaByID(java.lang.Integer)
	 */
	@Transactional
	@Override
	public AccionesAnomaliaVO findAccionAnomaliaByID(Integer idAccionAnomalia) {
		AccionesAnomaliaPOJO accionesAnomaliaPOJO = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				accionesAnomaliaPOJO = (AccionesAnomaliaPOJO) session.get(AccionesAnomaliaPOJO.class, idAccionAnomalia);
				tx.commit();
			}catch(Exception e){
				//System.err.println("Error al tratar de buscar Acciones con id = " + idAccion);
				System.err.println(ConstantesMensajesDeError.ERROR_FIND_BY + OBJETO_ABSTRACTO + ConstantesQuerys.ID_IGUAL  + idAccionAnomalia);
				e.printStackTrace();
			}					
		}
		return ConvertAccionesAnomaliaPOJOToVO.convertAccionesAnomaliaPOJOToVO( accionesAnomaliaPOJO );
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.AccionesAnomaliaDAO#saveAccionAnomalia( VO.AccionesAnomaliaVO)
	 */
	@Transactional
	@Override
	public void saveAccionAnomalia(AccionesAnomaliaVO accionAnomaliaVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.save((Object) ConvertAccionesAnomaliaPOJOToVO.convertAccionesAnomaliaVOToPOJO(accionAnomaliaVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_INSERT + accionAnomaliaVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.AccionesAnomaliaDAO#updateAccionAnomalia( VO.AccionesAnomaliaVO)
	 */
	@Transactional
	@Override
	public void updateAccionAnomalia(AccionesAnomaliaVO accionAnomaliaVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.update((Object) ConvertAccionesAnomaliaPOJOToVO.convertAccionesAnomaliaVOToPOJO(accionAnomaliaVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_UPDATE + accionAnomaliaVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.AccionesAnomaliaDAO#deleteAccionAnomalia( VO.AccionesAnomaliaVO)
	 */
	@Transactional
	@Override
	public void deleteAccionAnomalia(AccionesAnomaliaVO accionAnomaliaVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.delete((Object)  ConvertAccionesAnomaliaPOJOToVO.convertAccionesAnomaliaVOToPOJO(accionAnomaliaVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_DELETE + accionAnomaliaVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}	
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.AccionesAnomaliaDAO#getAllAccionesAnomalia()
	 */
	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<AccionesAnomaliaVO> getAllAccionesAnomalia() {
		List<AccionesAnomaliaPOJO> lstAccionesAnomaliaPOJOs = null;
		List<AccionesAnomaliaVO> lstAccionesAnomaliaVOs = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				Query q = session.createQuery(QUERY_SELECT_FROM_ACCIONES_ALL);
				lstAccionesAnomaliaPOJOs = q.list();
				lstAccionesAnomaliaVOs = new ArrayList<AccionesAnomaliaVO>();
				for(AccionesAnomaliaPOJO unaAccionAnomalia: lstAccionesAnomaliaPOJOs){
					lstAccionesAnomaliaVOs.add(ConvertAccionesAnomaliaPOJOToVO.convertAccionesAnomaliaPOJOToVO(unaAccionAnomalia));
				}
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_SELECT_ALL + OBJETO_ABSTRACTO_VO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
		return lstAccionesAnomaliaVOs;
	}

}
