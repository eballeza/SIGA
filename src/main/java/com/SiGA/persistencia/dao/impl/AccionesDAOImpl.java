package  com.SiGA.persistencia.dao.impl;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



import com.SiGA.common.VO.AccionesVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertAccionesPOJOToVO;
import com.SiGA.core.HibernateUtil;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.common.constantes.ConstantesQuerys;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.AccionesDAO;
import com.SiGA.persistencia.pojo.AccionesPOJO;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 19/02/2013
 * @descripcion Clase de tipo DAO utilizada para persistir objetos de tipo AccionesVO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_ACCIONES)
public class AccionesDAOImpl implements AccionesDAO {
	
	private Session session; 
	private static String OBJETO_ABSTRACTO = "acciones";
	private static String OBJETO_ABSTRACTO_POJO = "AccionesPOJO";
	private static String OBJETO_ABSTRACTO_VO = "AccionesVO";
	
	private static String QUERY_SELECT_FROM_ACCIONES_ALL = ConstantesQuerys.QUERY_FROM + " " + OBJETO_ABSTRACTO_POJO;
	/**
	 * Constructor de la clase.
	 */
	public AccionesDAOImpl() {
		 this.session = HibernateUtil.getSessionFactory().openSession();
		
	}
	
	
	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.AccionesDAO#findAccionByID(java.lang.Integer)
	 */
	@Transactional
	@Override
	public AccionesVO findAccionByID(Integer idAccion){
		AccionesPOJO accionesPOJO = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				accionesPOJO = (AccionesPOJO) session.get(AccionesPOJO.class, idAccion);
				tx.commit();
			}catch(Exception e){
				//System.err.println("Error al tratar de buscar Acciones con id = " + idAccion);
				System.err.println(ConstantesMensajesDeError.ERROR_FIND_BY + OBJETO_ABSTRACTO + ConstantesQuerys.ID_IGUAL  + idAccion);
				e.printStackTrace();
			}					
		}
		return ConvertAccionesPOJOToVO.convertAccionesPOJOToVO( accionesPOJO );
	}
	
	
	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.AccionesDAO#saveAccion( VO.AccionesVO)
	 */
	@Transactional
	@Override
	public void saveAccion(AccionesVO accionesVO){
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.save((Object) ConvertAccionesPOJOToVO.convertAccionesVOToPOJO(accionesVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_INSERT + accionesVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}
	
	
	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.AccionesDAO#updateAccion( VO.AccionesVO)
	 */
	@Transactional
	@Override
	public void updateAccion(AccionesVO accionesVO){
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.update((Object) ConvertAccionesPOJOToVO.convertAccionesVOToPOJO(accionesVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_UPDATE + accionesVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}
	
	
	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.AccionesDAO#deleteAccion( VO.AccionesVO)
	 */
	@Transactional
	@Override
	public void deleteAccion(AccionesVO accionesVO){
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.delete((Object) ConvertAccionesPOJOToVO.convertAccionesVOToPOJO(accionesVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_DELETE + accionesVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	
	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.AccionesDAO#getAllAcciones()
	 */
	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<AccionesVO> getAllAcciones() {
		List<AccionesPOJO> lsAccionesPOJOs = null;
		List<AccionesVO> lstAccionesVOs = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				Query q = session.createQuery(QUERY_SELECT_FROM_ACCIONES_ALL);
				lsAccionesPOJOs = q.list();
				lstAccionesVOs = new ArrayList<AccionesVO>();
				for(AccionesPOJO unaAccionPOJO: lsAccionesPOJOs){
					lstAccionesVOs.add(ConvertAccionesPOJOToVO.convertAccionesPOJOToVO(unaAccionPOJO));
				}
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_SELECT_ALL + OBJETO_ABSTRACTO_VO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
		return lstAccionesVOs;
	}
	
	

}
