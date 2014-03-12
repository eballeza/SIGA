package  com.SiGA.persistencia.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;



import com.SiGA.common.VO.TiposAnomaliaVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertTiposAnomaliaPOJOToVO;
import com.SiGA.core.HibernateUtil;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.common.constantes.ConstantesQuerys;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.TiposAnomaliaDAO;
import com.SiGA.persistencia.pojo.TiposAnomaliaPOJO;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Clase de tipo DAO utilizada para persistir objetos de tipo TiposAnomaliaVO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_TIPOS_ANOMALIA)
public class TiposAnomaliaDAOImpl implements TiposAnomaliaDAO{

	private Session session; 
	private static String OBJETO_ABSTRACTO = "tiposAnomalia";
	private static String OBJETO_ABSTRACTO_POJO = "TiposAnomaliaPOJO";
	private static String OBJETO_ABSTRACTO_VO = "TiposAnomaliaVO";
	
	private static String QUERY_SELECT_FROM_ACCIONES_ALL = ConstantesQuerys.QUERY_FROM + " " + OBJETO_ABSTRACTO_POJO;
	
	
	/**
	 * Constructor de la clase.
	 */
	public TiposAnomaliaDAOImpl(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}
	
	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.TiposAnomaliaDAO#findTipoAnomaliaByID(java.lang.Integer)
	 */
	@Override
	public TiposAnomaliaVO findTipoAnomaliaByID(Integer idTipoAnomalia) {
		TiposAnomaliaPOJO tiposAnomaliaPOJO = null;
		if(session != null){
			try{
				session.beginTransaction();
				tiposAnomaliaPOJO = (TiposAnomaliaPOJO) session.get(TiposAnomaliaPOJO.class, idTipoAnomalia);
			}catch(Exception e){
				//System.err.println("Error al tratar de buscar Acciones con id = " + idAccion);
				System.err.println(ConstantesMensajesDeError.ERROR_FIND_BY + OBJETO_ABSTRACTO + ConstantesQuerys.ID_IGUAL  + idTipoAnomalia);
				e.printStackTrace();
			}					
		}
		return ConvertTiposAnomaliaPOJOToVO.convertTiposAnomaliaPOJOToVO( tiposAnomaliaPOJO );
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.TiposAnomaliaDAO#saveTiposAnomalia( VO.TiposAnomaliaVO)
	 */
	@Override
	public void saveTiposAnomalia(TiposAnomaliaVO tipoAnomaliaVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.save((Object) ConvertTiposAnomaliaPOJOToVO.convertTiposAnomaliaVOToPOJO(tipoAnomaliaVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_INSERT + tipoAnomaliaVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.TiposAnomaliaDAO#updateTiposAnomalia( VO.TiposAnomaliaVO)
	 */
	@Override
	public void updateTiposAnomalia(TiposAnomaliaVO tipoAnomaliaVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.update((Object) ConvertTiposAnomaliaPOJOToVO.convertTiposAnomaliaVOToPOJO(tipoAnomaliaVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_UPDATE + tipoAnomaliaVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}	
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.TiposAnomaliaDAO#deleteTiposAnomalia( VO.TiposAnomaliaVO)
	 */
	@Override
	public void deleteTiposAnomalia(TiposAnomaliaVO tipoAnomaliaVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.delete((Object) ConvertTiposAnomaliaPOJOToVO.convertTiposAnomaliaVOToPOJO(tipoAnomaliaVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_DELETE + tipoAnomaliaVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.TiposAnomaliaDAO#getAllTiposAnomalia()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TiposAnomaliaVO> getAllTiposAnomalia() {
		List<TiposAnomaliaPOJO> lstTiposAnomaliaPOJOs = null;
		List<TiposAnomaliaVO> lstTiposAnomaliaVOs = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				Query q = session.createQuery(QUERY_SELECT_FROM_ACCIONES_ALL);
				lstTiposAnomaliaPOJOs = q.list();
				lstTiposAnomaliaVOs = new ArrayList<TiposAnomaliaVO>();
				for(TiposAnomaliaPOJO unTipoAnomalia: lstTiposAnomaliaPOJOs){
					lstTiposAnomaliaVOs.add(ConvertTiposAnomaliaPOJOToVO.convertTiposAnomaliaPOJOToVO(unTipoAnomalia));
				}
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_SELECT_ALL + OBJETO_ABSTRACTO_VO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
		return lstTiposAnomaliaVOs;
	}

}
