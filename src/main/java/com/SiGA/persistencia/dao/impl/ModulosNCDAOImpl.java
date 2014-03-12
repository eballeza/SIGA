package  com.SiGA.persistencia.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



import com.SiGA.common.VO.ModulosNCVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertModulosNCPOJOToVO;
import com.SiGA.core.HibernateUtil;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.common.constantes.ConstantesQuerys;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.ModulosNCDAO;
import com.SiGA.persistencia.pojo.ModulosNCPOJO;
/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Clase de tipo DAO utilizada para persistir objetos de tipo EstatusVO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_MODULOS_NC)
public class ModulosNCDAOImpl implements ModulosNCDAO{

	private Session session; 
	private static String OBJETO_ABSTRACTO = "moduloNC";
	private static String OBJETO_ABSTRACTO_POJO = "ModulosNCPOJO";
	private static String OBJETO_ABSTRACTO_VO = "ModulosNCVO";
	
	private static String QUERY_SELECT_FROM_ACCIONES_ALL = ConstantesQuerys.QUERY_FROM + " " + OBJETO_ABSTRACTO_POJO;
	
	
	/**
	 * Constructor de la clase.
	 */
	public ModulosNCDAOImpl(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}	
	
	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.ModulosNCDAO#findModuloNCByID(java.lang.Integer)
	 */
	@Override
	public ModulosNCVO findModuloNCByID(Integer idModuloNC) {
		ModulosNCPOJO modulosNCPOJO = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				modulosNCPOJO = (ModulosNCPOJO) session.get(ModulosNCPOJO.class, idModuloNC);
				tx.commit();
			}catch(Exception e){
				//System.err.println("Error al tratar de buscar Acciones con id = " + idAccion);
				System.err.println(ConstantesMensajesDeError.ERROR_FIND_BY + OBJETO_ABSTRACTO + ConstantesQuerys.ID_IGUAL  + idModuloNC);
				e.printStackTrace();
			}					
		}
		return ConvertModulosNCPOJOToVO.convertModulosNCPOJOToVO( modulosNCPOJO );
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.ModulosNCDAO#saveModuloNC( VO.ModulosNCVO)
	 */
	@Override
	public void saveModuloNC(ModulosNCVO moduloNCVO) {
		if(session != null){
			Transaction tx = null;
			try{
				System.out.println("antes del begin transaction");
				tx = session.beginTransaction();
				System.out.println("despues del begin transaction");
				session.save((Object) ConvertModulosNCPOJOToVO.convertModulosNCVOToPOJO(moduloNCVO));
				System.out.println("antes del save");
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_INSERT + moduloNCVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.ModulosNCDAO#updateModuloNC( VO.ModulosNCVO)
	 */
	@Override
	public void updateModuloNC(ModulosNCVO moduloNCVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.update((Object) ConvertModulosNCPOJOToVO.convertModulosNCVOToPOJO(moduloNCVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_UPDATE + moduloNCVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.ModulosNCDAO#deleteModuloNC( VO.ModulosNCVO)
	 */
	@Override
	public void deleteModuloNC(ModulosNCVO moduloNCVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.delete((Object) ConvertModulosNCPOJOToVO.convertModulosNCVOToPOJO(moduloNCVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_DELETE + moduloNCVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.ModulosNCDAO#getAllModulosNC()
	 */
	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<ModulosNCVO> getAllModulosNC() {
		List<ModulosNCPOJO> lstModulosNCPOJOs = null;
		List<ModulosNCVO> lstModulosNCVOs = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				Query q = session.createQuery(QUERY_SELECT_FROM_ACCIONES_ALL);
				lstModulosNCPOJOs = q.list();
				lstModulosNCVOs = new ArrayList<ModulosNCVO>();
				for(ModulosNCPOJO unModuloNC: lstModulosNCPOJOs){
					lstModulosNCVOs.add(ConvertModulosNCPOJOToVO.convertModulosNCPOJOToVO(unModuloNC));
				}
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_SELECT_ALL + OBJETO_ABSTRACTO_VO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
		return lstModulosNCVOs;
	}

}
