package  com.SiGA.persistencia.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;



import com.SiGA.common.VO.UsuariosVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertUsuariosPOJOToVO;
import com.SiGA.core.HibernateUtil;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.common.constantes.ConstantesQuerys;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.UsuariosDAO;
import com.SiGA.persistencia.pojo.EstatusPOJO;
import com.SiGA.persistencia.pojo.UsuariosPOJO;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Clase de tipo DAO utilizada para persistir objetos de tipo UsuariosVO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_USUARIOS)
public class UsuariosDAOImpl implements UsuariosDAO{

	private Session session; 
	private static String OBJETO_ABSTRACTO = "usuario";
	private static String OBJETO_ABSTRACTO_POJO = "UsuariosPOJO";
	private static String OBJETO_ABSTRACTO_VO = "UsuariosVO";
	
	private static String QUERY_SELECT_FROM_ACCIONES_ALL = ConstantesQuerys.QUERY_FROM + " " + OBJETO_ABSTRACTO_POJO;
	
	
	/**
	 * Constructor de la clase.
	 */
	public UsuariosDAOImpl(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}
	
	
	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.UsuariosDAO#findUsuarioByID(java.lang.Integer)
	 */
	@Override
	public UsuariosVO findUsuarioByID(Integer idUsuario) {
		UsuariosPOJO usuariosPOJO = null;
		if(session != null){
			try{
				session.beginTransaction();
				usuariosPOJO = (UsuariosPOJO) session.get(EstatusPOJO.class, idUsuario);
			}catch(Exception e){
				//System.err.println("Error al tratar de buscar Acciones con id = " + idAccion);
				System.err.println(ConstantesMensajesDeError.ERROR_FIND_BY + OBJETO_ABSTRACTO + ConstantesQuerys.ID_IGUAL  + idUsuario);
				e.printStackTrace();
			}					
		}
		return ConvertUsuariosPOJOToVO.convertUsuariosPOJOToVO( usuariosPOJO );
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.UsuariosDAO#saveUsuario( VO.UsuariosVO)
	 */
	@Override
	public void saveUsuario(UsuariosVO usuarioVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.save((Object) ConvertUsuariosPOJOToVO.convertUsuariosVOToPOJO(usuarioVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_INSERT + usuarioVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.UsuariosDAO#updateUsuario( VO.UsuariosVO)
	 */
	@Override
	public void updateUsuario(UsuariosVO usuarioVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.update((Object) ConvertUsuariosPOJOToVO.convertUsuariosVOToPOJO(usuarioVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_UPDATE + usuarioVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.UsuariosDAO#deleteUsuario( VO.UsuariosVO)
	 */
	@Override
	public void deleteUsuario(UsuariosVO usuarioVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.delete((Object) ConvertUsuariosPOJOToVO.convertUsuariosVOToPOJO(usuarioVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_DELETE + usuarioVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.UsuariosDAO#getAllUsuarios()
	 */
	@Override
	public List<UsuariosVO> getAllUsuarios() {
		List<UsuariosPOJO> lstUsuariosPOJOs = null;
		List<UsuariosVO> lstUsuariosVOs = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				Query q = session.createQuery(QUERY_SELECT_FROM_ACCIONES_ALL);
				lstUsuariosPOJOs = q.list();
				lstUsuariosVOs = new ArrayList<UsuariosVO>();
				for(UsuariosPOJO unUsuario: lstUsuariosPOJOs){
					lstUsuariosVOs.add(ConvertUsuariosPOJOToVO.convertUsuariosPOJOToVO(unUsuario));
				}
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_SELECT_ALL + OBJETO_ABSTRACTO_VO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
		return lstUsuariosVOs;
	}

}
