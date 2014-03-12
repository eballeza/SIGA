package  com.SiGA.persistencia.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;



import com.SiGA.common.VO.NivelesSoporteVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertEstatusPOJOtoVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertNivelesSoportePOJOToVO;
import com.SiGA.core.HibernateUtil;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.common.constantes.ConstantesQuerys;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.NivelesSoporteDAO;
import com.SiGA.persistencia.pojo.NivelesSoportePOJO;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Clase de tipo DAO utilizada para persistir objetos de tipo NivelesSoporteVO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_NIVELES_SOPORTE)
public class NivelesSoporteDAOImpl implements NivelesSoporteDAO {

	private Session session; 
	private static String OBJETO_ABSTRACTO = "nivelSoporte";
	private static String OBJETO_ABSTRACTO_POJO = "NivelesSoportePOJO";
	private static String OBJETO_ABSTRACTO_VO = "NivelesSoporteVO";
	
	private static String QUERY_SELECT_FROM_ACCIONES_ALL = ConstantesQuerys.QUERY_FROM + " " + OBJETO_ABSTRACTO_POJO;
	
	
	/**
	 * Constructor de la clase.
	 */
	public NivelesSoporteDAOImpl(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}
	
	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.NivelesSoporteDAO#findNivelSoporteByID(java.lang.Integer)
	 */
	@Override
	public NivelesSoporteVO findNivelSoporteByID(Integer idNivelSoporte) {
		NivelesSoportePOJO nivelesSoportePOJO = null;
		if(session != null){
			try{
				session.beginTransaction();
				nivelesSoportePOJO = (NivelesSoportePOJO) session.get(NivelesSoportePOJO.class, idNivelSoporte);
			}catch(Exception e){
				//System.err.println("Error al tratar de buscar Acciones con id = " + idAccion);
				System.err.println(ConstantesMensajesDeError.ERROR_FIND_BY + OBJETO_ABSTRACTO + ConstantesQuerys.ID_IGUAL  + idNivelSoporte);
				e.printStackTrace();
			}					
		}
		return ConvertNivelesSoportePOJOToVO.convertNivelesSoportePOJOToVO( nivelesSoportePOJO );
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.NivelesSoporteDAO#saveNivelSoporte( VO.NivelesSoporteVO)
	 */
	@Override
	public void saveNivelSoporte(NivelesSoporteVO nivelSoporteVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.save((Object) ConvertNivelesSoportePOJOToVO.convertNivelesSoporteVOToPOJO(nivelSoporteVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_INSERT + nivelSoporteVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.NivelesSoporteDAO#updateNivelSoporte( VO.NivelesSoporteVO)
	 */
	@Override
	public void updateNivelSoporte(NivelesSoporteVO nivelSoporteVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.update((Object) ConvertNivelesSoportePOJOToVO.convertNivelesSoporteVOToPOJO(nivelSoporteVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_UPDATE + nivelSoporteVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.NivelesSoporteDAO#deleteNivelSoporte( VO.NivelesSoporteVO)
	 */
	@Override
	public void deleteNivelSoporte(NivelesSoporteVO nivelSoporteVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.delete((Object) ConvertNivelesSoportePOJOToVO.convertNivelesSoporteVOToPOJO(nivelSoporteVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_DELETE + nivelSoporteVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.NivelesSoporteDAO#getAllNivelesSoporte()
	 */
	@Override
	public List<NivelesSoporteVO> getAllNivelesSoporte() {
		List<NivelesSoportePOJO> lstNivelesSoportePOJOs = null;
		List<NivelesSoporteVO> lstNivelesSoporteVOs = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				Query q = session.createQuery(QUERY_SELECT_FROM_ACCIONES_ALL);
				lstNivelesSoportePOJOs = q.list();
				lstNivelesSoporteVOs = new ArrayList<NivelesSoporteVO>();
				for(NivelesSoportePOJO unNivelSoporte: lstNivelesSoportePOJOs){
					lstNivelesSoporteVOs.add(ConvertNivelesSoportePOJOToVO.convertNivelesSoportePOJOToVO(unNivelSoporte));
				}
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_SELECT_ALL + OBJETO_ABSTRACTO_VO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
		return lstNivelesSoporteVOs;
	}

}
