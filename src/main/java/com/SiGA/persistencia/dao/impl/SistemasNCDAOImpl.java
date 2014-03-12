package  com.SiGA.persistencia.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;



import com.SiGA.common.VO.SistemasNCVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertEstatusPOJOtoVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertSistemasNCPOJOToVO;
import com.SiGA.core.HibernateUtil;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.common.constantes.ConstantesQuerys;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.SistemasNCDAO;
import com.SiGA.persistencia.pojo.SistemasNCPOJO;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Clase de tipo DAO utilizada para persistir objetos de tipo SistemasNCVO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_SISTEMAS_NC)
public class SistemasNCDAOImpl implements SistemasNCDAO{
	
	private Session session; 
	private static String OBJETO_ABSTRACTO = "sistemasNC";
	private static String OBJETO_ABSTRACTO_POJO = "SistemasNCPOJO";
	private static String OBJETO_ABSTRACTO_VO = "SistemasNCVO";
	
	private static String QUERY_SELECT_FROM_ACCIONES_ALL = ConstantesQuerys.QUERY_FROM + " " + OBJETO_ABSTRACTO_POJO;
	
	
	/**
	 * Constructor de la clase.
	 */
	public SistemasNCDAOImpl(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.SistemasNCDAO#findSistemaNCByID(java.lang.Integer)
	 */
	@Override
	public SistemasNCVO findSistemaNCByID(Integer idSistemaNC) {
		SistemasNCPOJO sistemasNCPOJO = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				sistemasNCPOJO = (SistemasNCPOJO) session.get(SistemasNCPOJO.class, idSistemaNC);
				tx.commit();
			}catch(Exception e){
				//System.err.println("Error al tratar de buscar Acciones con id = " + idAccion);
				System.err.println(ConstantesMensajesDeError.ERROR_FIND_BY + OBJETO_ABSTRACTO + ConstantesQuerys.ID_IGUAL  + idSistemaNC);
				e.printStackTrace();
			}					
		}
		return ConvertSistemasNCPOJOToVO.convertSistemasNCPOJOToVO( sistemasNCPOJO );
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.SistemasNCDAO#saveSistemaNC( VO.SistemasNCVO)
	 */
	@Override
	public void saveSistemaNC(SistemasNCVO sistemaNCVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.save((Object) ConvertSistemasNCPOJOToVO.convertSistemasNCVOToPOJO(sistemaNCVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_INSERT + sistemaNCVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.SistemasNCDAO#updateSistemaNC( VO.SistemasNCVO)
	 */
	@Override
	public void updateSistemaNC(SistemasNCVO sistemaNCVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.update((Object) ConvertSistemasNCPOJOToVO.convertSistemasNCVOToPOJO(sistemaNCVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_UPDATE + sistemaNCVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.SistemasNCDAO#deleteSistemaNC( VO.SistemasNCVO)
	 */
	@Override
	public void deleteSistemaNC(SistemasNCVO sistemaNCVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.delete((Object) ConvertSistemasNCPOJOToVO.convertSistemasNCVOToPOJO(sistemaNCVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_DELETE + sistemaNCVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.SistemasNCDAO#getAllSistemaNC()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SistemasNCVO> getAllSistemaNC() {
		List<SistemasNCPOJO> lstSistemasNCPOJOs = null;
		List<SistemasNCVO> lstSistemasNCVOs = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				Query q = session.createQuery(QUERY_SELECT_FROM_ACCIONES_ALL);
				lstSistemasNCPOJOs = q.list();
				lstSistemasNCVOs = new ArrayList<SistemasNCVO>();
				for(SistemasNCPOJO unSistema: lstSistemasNCPOJOs){
					lstSistemasNCVOs.add(ConvertSistemasNCPOJOToVO.convertSistemasNCPOJOToVO(unSistema));
				}
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_SELECT_ALL + OBJETO_ABSTRACTO_VO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
		return lstSistemasNCVOs;
	}

}
