package  com.SiGA.common.convert.pojo_to_vo;

import com.SiGA.common.VO.AccionesVO;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.persistencia.pojo.AccionesPOJO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 18/02/2013
 * @descripcion Clase utileria que convierte un objeto AccionesPOJOToVO
 *
 */
public class ConvertAccionesPOJOToVO {
	
	/**
	 * Metodo que convierte un objeto AccionesPOJO en AccionesVO
	 * @param accionesPOJO es el POJO a convertir
	 * @return AccionesVO es el objeto VO convertido
	 */
	public static AccionesVO convertAccionesPOJOToVO(AccionesPOJO accionesPOJO){
		AccionesVO accionesVO = null;
		if(accionesPOJO != null){
			try{
				accionesVO = new AccionesVO();
				accionesVO.setIdAccion(accionesPOJO.getIdAccion());
				accionesVO.setDescripcionAccion(accionesPOJO.getDescripcionAccion());
				accionesVO.setNivelesSoporteVO(ConvertNivelesSoportePOJOToVO.convertNivelesSoportePOJOToVO(accionesPOJO.getNivelesSoportePOJO()));
				accionesVO.setNombreAccion(accionesPOJO.getNombreAccion());
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_POJO_VO + accionesPOJO);
				e.printStackTrace();
			}
		}
		return accionesVO;
	}
	
	/**
	 * Metodo que convierte un objeto AccionesVO en AccionesPOJO
	 * @param accionesVO es el VO a convertir
	 * @return AccionesPOJO es el objeto POJO convertido
	 */
	public static AccionesPOJO convertAccionesVOToPOJO(AccionesVO accionesVO){
		AccionesPOJO accionesPOJO = null;
		if(accionesVO != null){
			try{
				accionesPOJO = new AccionesPOJO();
				accionesPOJO.setIdAccion(accionesVO.getIdAccion());
				accionesPOJO.setDescripcionAccion(accionesVO.getDescripcionAccion());
				accionesPOJO.setNivelesSoportePOJO(ConvertNivelesSoportePOJOToVO.convertNivelesSoporteVOToPOJO(accionesVO.getNivelesSoporteVO()));
				accionesPOJO.setNombreAccion(accionesVO.getNombreAccion());
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_VO_POJO + accionesVO);
				e.printStackTrace();
			}
		}
		return accionesPOJO;
	}

}
