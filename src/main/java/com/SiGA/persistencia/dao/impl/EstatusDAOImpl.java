package  com.SiGA.persistencia.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



import com.SiGA.common.VO.EstatusVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertAccionesPOJOToVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertEstatusPOJOtoVO;
import com.SiGA.core.HibernateUtil;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.common.constantes.ConstantesQuerys;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.EstatusDAO;
import com.SiGA.persistencia.pojo.EstatusPOJO;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 19/02/2013
 * @descripcion Clase de tipo DAO utilizada para persistir objetos de tipo EstatusVO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_ESTATUS)
public class EstatusDAOImpl implements EstatusDAO{

	
	private Session session; 
	private static String OBJETO_ABSTRACTO = "estatus";
	private static String OBJETO_ABSTRACTO_POJO = "EstatusPOJO";
	private static String OBJETO_ABSTRACTO_VO = "EstatusVO";
	
	private static String QUERY_SELECT_FROM_ACCIONES_ALL = ConstantesQuerys.QUERY_FROM + " " + OBJETO_ABSTRACTO_POJO;
	
	
	/**
	 * Constructor de la clase.
	 */
	public EstatusDAOImpl(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}
	
	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.EstatusDAO#findEstatusByID(java.lang.Integer)
	 */
	@Override
	public EstatusVO findEstatusByID(Integer idEstatus) {
		EstatusPOJO estatusPOJO = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				estatusPOJO = (EstatusPOJO) session.get(EstatusPOJO.class, idEstatus);
				tx.commit();
			}catch(Exception e){
				//System.err.println("Error al tratar de buscar Acciones con id = " + idAccion);
				System.err.println(ConstantesMensajesDeError.ERROR_FIND_BY + OBJETO_ABSTRACTO + ConstantesQuerys.ID_IGUAL  + idEstatus);
				e.printStackTrace();
			}					
		}
		return ConvertEstatusPOJOtoVO.convertEstatusPOJOToVO( estatusPOJO );
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.EstatusDAO#saveEstatus( VO.EstatusVO)
	 */
	@Override
	public void saveEstatus(EstatusVO estatusVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.save((Object) ConvertEstatusPOJOtoVO.convertEstatusVOToPOJO(estatusVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_INSERT + estatusVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.EstatusDAO#updateEstatus( VO.EstatusVO)
	 */
	@Override
	public void updateEstatus(EstatusVO estatusVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.update((Object) ConvertEstatusPOJOtoVO.convertEstatusVOToPOJO(estatusVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_UPDATE + estatusVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.EstatusDAO#deleteEstatus( VO.EstatusVO)
	 */
	@Override
	public void deleteEstatus(EstatusVO estatusVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.delete((Object) ConvertEstatusPOJOtoVO.convertEstatusVOToPOJO(estatusVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_DELETE + estatusVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.EstatusDAO#getAllEstatus()
	 */
	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<EstatusVO> getAllEstatus() {
		List<EstatusPOJO> lstEstatusPOJOs = null;
		List<EstatusVO> lsEstatusVOs = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				Query q = session.createQuery(QUERY_SELECT_FROM_ACCIONES_ALL);
				lstEstatusPOJOs = q.list();
				lsEstatusVOs = new ArrayList<EstatusVO>();
				for(EstatusPOJO unEstatus: lstEstatusPOJOs){
					lsEstatusVOs.add(ConvertEstatusPOJOtoVO.convertEstatusPOJOToVO(unEstatus));
				}
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_SELECT_ALL + OBJETO_ABSTRACTO_VO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
		return lsEstatusVOs;
	}

}
