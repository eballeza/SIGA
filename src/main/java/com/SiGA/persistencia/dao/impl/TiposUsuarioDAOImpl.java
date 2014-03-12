package  com.SiGA.persistencia.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;



import com.SiGA.common.VO.TiposUsuarioVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertTiposUsuarioPOJOToVO;
import com.SiGA.core.HibernateUtil;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.common.constantes.ConstantesQuerys;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.TiposUsuarioDAO;
import com.SiGA.persistencia.pojo.TiposUsuarioPOJO;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 19/02/2013
 * @descripcion Interfaz de tipo DAO utilizada para persistir objetos de tipo EstatusVO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_TIPOS_USUARIO)
public class TiposUsuarioDAOImpl implements TiposUsuarioDAO {
	
	private Session session; 
	private static String OBJETO_ABSTRACTO = "tipoUsuario";
	private static String OBJETO_ABSTRACTO_POJO = "TiposUsuarioPOJO";
	private static String OBJETO_ABSTRACTO_VO = "TiposUsuarioVO";
	
	private static String QUERY_SELECT_FROM_ACCIONES_ALL = ConstantesQuerys.QUERY_FROM + " " + OBJETO_ABSTRACTO_POJO;
	
	
	/**
	 * Constructor de la clase.
	 */
	public TiposUsuarioDAOImpl(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}
	
	
	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.TiposUsuarioDAO#findTipoUsuarioByID(java.lang.Integer)
	 */
	@Override
	public TiposUsuarioVO findTipoUsuarioByID(Integer idTipoUsuario) {
		TiposUsuarioPOJO tiposUsuarioPOJO = null;
		if(session != null){
			try{
				session.beginTransaction();
				tiposUsuarioPOJO = (TiposUsuarioPOJO) session.get(TiposUsuarioPOJO.class, idTipoUsuario);
			}catch(Exception e){
				//System.err.println("Error al tratar de buscar Acciones con id = " + idAccion);
				System.err.println(ConstantesMensajesDeError.ERROR_FIND_BY + OBJETO_ABSTRACTO + ConstantesQuerys.ID_IGUAL  + idTipoUsuario);
				e.printStackTrace();
			}					
		}
		return ConvertTiposUsuarioPOJOToVO.convertTiposUsuarioPOJOToVO( tiposUsuarioPOJO );
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.TiposUsuarioDAO#saveTipoUsuario( VO.TiposUsuarioVO)
	 */
	@Override
	public void saveTipoUsuario(TiposUsuarioVO tipoUsuarioVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.save((Object) ConvertTiposUsuarioPOJOToVO.convertTiposUsuarioVOToPOJO(tipoUsuarioVO));				
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_INSERT + tipoUsuarioVO);
				e.printStackTrace();
				tx.rollback();				
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.TiposUsuarioDAO#updateTipoUsuario( VO.TiposUsuarioVO)
	 */
	@Override
	public void updateTipoUsuario(TiposUsuarioVO tipoUsuarioVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.update((Object) ConvertTiposUsuarioPOJOToVO.convertTiposUsuarioVOToPOJO(tipoUsuarioVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_UPDATE + tipoUsuarioVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.TiposUsuarioDAO#deleteTipoUsuario( VO.TiposUsuarioVO)
	 */
	@Override
	public void deleteTipoUsuario(TiposUsuarioVO tipoUsuarioVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.delete((Object) ConvertTiposUsuarioPOJOToVO.convertTiposUsuarioVOToPOJO(tipoUsuarioVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_DELETE + tipoUsuarioVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}	
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.TiposUsuarioDAO#getAllTiposUsuario()
	 */
	@Override
	public List<TiposUsuarioVO> getAllTiposUsuario() {
		List<TiposUsuarioPOJO> lstTiposUsuarioPOJOs = null;
		List<TiposUsuarioVO> lstTiposUsuarioVOs = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				Query q = session.createQuery(QUERY_SELECT_FROM_ACCIONES_ALL);
				lstTiposUsuarioPOJOs = q.list();
				lstTiposUsuarioVOs = new ArrayList<TiposUsuarioVO>();
				for(TiposUsuarioPOJO unTipoUsuario: lstTiposUsuarioPOJOs){
					lstTiposUsuarioVOs.add(ConvertTiposUsuarioPOJOToVO.convertTiposUsuarioPOJOToVO(unTipoUsuario));
				}
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_SELECT_ALL + OBJETO_ABSTRACTO_VO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
		return lstTiposUsuarioVOs;
	}

}
