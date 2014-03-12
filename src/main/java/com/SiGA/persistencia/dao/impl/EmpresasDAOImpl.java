package  com.SiGA.persistencia.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;


import com.SiGA.common.VO.EmpresasVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertEmpresasPOJOToVO;
import com.SiGA.core.HibernateUtil;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.common.constantes.ConstantesQuerys;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.persistencia.dao.EmpresasDAO;
import com.SiGA.persistencia.pojo.EmpresasPOJO;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 19/02/2013
 * @descripcion Clase de tipo DAO utilizada para persistir objetos de tipo EmpresasVO
 *
 */
@Repository(value = ConstantesServicios.SIGA_SERVICE_DAO_IMPL_EMPRESAS)
public class EmpresasDAOImpl implements EmpresasDAO{

	private Session session; 
	private static String OBJETO_ABSTRACTO = "empresa";
	private static String OBJETO_ABSTRACTO_POJO = "EmpresasPOJO";
	private static String OBJETO_ABSTRACTO_VO = "EmpresasVO";
	
	private static String QUERY_SELECT_FROM_ACCIONES_ALL = ConstantesQuerys.QUERY_FROM + " " + OBJETO_ABSTRACTO_POJO;
	
	
	/**
	 * Constructor de la clase.
	 */
	public EmpresasDAOImpl(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}
	
	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.EmpresasDAO#findEmpresaByID(java.lang.Integer)
	 */
	@Override
	public EmpresasVO findEmpresaByID(Integer idEmpresa) {
		EmpresasPOJO empresasPOJO = null;
		if(session != null){
			try{
				session.beginTransaction();
				empresasPOJO = (EmpresasPOJO) session.get(EmpresasPOJO.class, idEmpresa);
			}catch(Exception e){
				//System.err.println("Error al tratar de buscar Acciones con id = " + idAccion);
				System.err.println(ConstantesMensajesDeError.ERROR_FIND_BY + OBJETO_ABSTRACTO + ConstantesQuerys.ID_IGUAL  + idEmpresa);
				e.printStackTrace();
			}					
		}
		return ConvertEmpresasPOJOToVO.convertEmpresasPOJOToVO( empresasPOJO );
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.EmpresasDAO#saveEmpresa( VO.EmpresasVO)
	 */
	@Override
	public void saveEmpresa(EmpresasVO empresaVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.save((Object) ConvertEmpresasPOJOToVO.convertEmpresasVOToPOJO(empresaVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_INSERT + empresaVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.EmpresasDAO#updateEmpresa( VO.EmpresasVO)
	 */
	@Override
	public void updateEmpresa(EmpresasVO empresaVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.update((Object) ConvertEmpresasPOJOToVO.convertEmpresasVOToPOJO(empresaVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_UPDATE + empresaVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.EmpresasDAO#deleteEmpresa( VO.EmpresasVO)
	 */
	@Override
	public void deleteEmpresa(EmpresasVO empresaVO) {
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				session.delete((Object) ConvertEmpresasPOJOToVO.convertEmpresasVOToPOJO(empresaVO));
				tx.commit();
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_DELETE + empresaVO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
	}

	/* (non-Javadoc)
	 * @see com.SiGA.presistencia.dao.EmpresasDAO#getAllEmpresa()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<EmpresasVO> getAllEmpresa() {
		List<EmpresasPOJO> lstEmpresasPOJOs = null;
		List<EmpresasVO> lstEmpresasVOs = null;
		if(session != null){
			Transaction tx = null;
			try{
				tx = session.beginTransaction();
				Query q = session.createQuery(QUERY_SELECT_FROM_ACCIONES_ALL);
				lstEmpresasPOJOs = q.list();
				lstEmpresasVOs = new ArrayList<EmpresasVO>();
				for(EmpresasPOJO unaEmpresa: lstEmpresasPOJOs){
					lstEmpresasVOs.add(ConvertEmpresasPOJOToVO.convertEmpresasPOJOToVO(unaEmpresa));
				}
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_SELECT_ALL + OBJETO_ABSTRACTO_VO);
				e.printStackTrace();
				tx.rollback();
			}			
		}
		return lstEmpresasVOs;
	}

}
