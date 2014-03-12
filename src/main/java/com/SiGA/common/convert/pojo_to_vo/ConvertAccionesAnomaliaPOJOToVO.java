package  com.SiGA.common.convert.pojo_to_vo;

import com.SiGA.common.VO.AccionesAnomaliaVO;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.persistencia.pojo.AccionesAnomaliaPOJO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 18/02/2013
 * @descripcion Clase utileria que convierte un objeto AccionesAnomaliaPOJOToVO
 *
 */
public class ConvertAccionesAnomaliaPOJOToVO {

	/**
	 * Metodo que convierte un objeto AccionesAnomaliaPOJO en AccionesAnomaliaVO
	 * @param accionesAnomaliaPOJO es el POJO a convertir
	 * @return AccionesAnomaliaVO es el objeto VO convertido
	 */
	public static AccionesAnomaliaVO convertAccionesAnomaliaPOJOToVO(AccionesAnomaliaPOJO accionesAnomaliaPOJO){
		AccionesAnomaliaVO accionesAnomaliaVO = null;
		if(accionesAnomaliaPOJO != null){
			try{
				accionesAnomaliaVO = new AccionesAnomaliaVO();
				accionesAnomaliaVO.setIdAccionPorAnomalia(accionesAnomaliaPOJO.getIdAccionPorAnomalia());
				accionesAnomaliaVO.setAccionesVO(ConvertAccionesPOJOToVO.convertAccionesPOJOToVO(accionesAnomaliaPOJO.getAccionesPOJO()));
				accionesAnomaliaVO.setAnomaliasVO(ConvertAnomaliasPOJOToVO.convertAnomaliasPOJOToVO(accionesAnomaliaPOJO.getAnomaliasPOJO()));
				accionesAnomaliaVO.setUsuariosVO(ConvertUsuariosPOJOToVO.convertUsuariosPOJOToVO(accionesAnomaliaPOJO.getUsuariosPOJO()));
				
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_POJO_VO + accionesAnomaliaPOJO);
				e.printStackTrace();
			}
		}
		return accionesAnomaliaVO;
	}
	
	/**
	 * Metodo que convierte un objeto AccionesAnomaliaVO en AccionesAnomaliaPOJO
	 * @param accionesAnomaliaVO es el VO a convertir
	 * @return AccionesAnomaliaPOJO es el objeto POJO convertido
	 */
	public static AccionesAnomaliaPOJO convertAccionesAnomaliaVOToPOJO(AccionesAnomaliaVO accionesAnomaliaVO){
		AccionesAnomaliaPOJO accionesAnomaliaPOJO = null;
		if(accionesAnomaliaVO != null){
			try{
				accionesAnomaliaPOJO = new AccionesAnomaliaPOJO();
				accionesAnomaliaPOJO.setIdAccionPorAnomalia(accionesAnomaliaVO.getIdAccionPorAnomalia());
				accionesAnomaliaPOJO.setAccionesPOJO(ConvertAccionesPOJOToVO.convertAccionesVOToPOJO(accionesAnomaliaVO.getAccionesVO()));
				accionesAnomaliaPOJO.setAnomaliasPOJO(ConvertAnomaliasPOJOToVO.convertAnomaliasVOToPOJO(accionesAnomaliaVO.getAnomaliasVO()));
				accionesAnomaliaPOJO.setUsuariosPOJO(ConvertUsuariosPOJOToVO.convertUsuariosVOToPOJO(accionesAnomaliaVO.getUsuariosVO()));
				
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_VO_POJO + accionesAnomaliaVO);
				e.printStackTrace();
			}
		}
		return accionesAnomaliaPOJO;
	}
}
