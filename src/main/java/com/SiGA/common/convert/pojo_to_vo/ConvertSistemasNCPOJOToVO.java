package  com.SiGA.common.convert.pojo_to_vo;

import com.SiGA.common.VO.SistemasNCVO;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.persistencia.pojo.SistemasNCPOJO;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 18/02/2013
 * @descripcion Clase utileria que convierte un objeto SistemasPOJOToVO
 *
 */
public class ConvertSistemasNCPOJOToVO {

	/**
	 * Metodo que convierte un objeto SistemasNCPOJO en SistemasNCVO
	 * @param sistemasNCPOJO es el POJO a convertir
	 * @return SistemasNCPOJO es el objeto VO convertido
	 */
	public static SistemasNCVO convertSistemasNCPOJOToVO(SistemasNCPOJO sistemasNCPOJO){
		SistemasNCVO sistemasNCVO = null;
		if(sistemasNCPOJO != null){
			try{
				sistemasNCVO = new SistemasNCVO();
				sistemasNCVO.setAreaSistemaNC(sistemasNCPOJO.getAreaSistemaNC());
				sistemasNCVO.setEstatusVO(ConvertEstatusPOJOtoVO.convertEstatusPOJOToVO(sistemasNCPOJO.getEstatusPOJO()));
				sistemasNCVO.setFechaCreacionSistemaNC(sistemasNCPOJO.getFechaCreacionSistemaNC());
				sistemasNCVO.setIdSistemaNC(sistemasNCPOJO.getIdSistemaNC());
				sistemasNCVO.setNombreSistemaNC(sistemasNCPOJO.getNombreSistenaNC());
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_POJO_VO + sistemasNCPOJO);
				e.printStackTrace();
			}
		}
		return sistemasNCVO;
	}
	
	/**
	 * Metodo que convierte un objeto SistemasNCVO en SistemasNCPOJO
	 * @param sistemasNCVO es el VO a convertir
	 * @return SistemasNCPOJO es el objeto POJO convertido
	 */
	public static SistemasNCPOJO convertSistemasNCVOToPOJO(SistemasNCVO sistemasNCVO){
		SistemasNCPOJO sistemasNCPOJO = null;
		if(sistemasNCVO != null){
			try{
				sistemasNCPOJO = new SistemasNCPOJO();
				sistemasNCPOJO.setAreaSistemaNC(sistemasNCVO.getAreaSistemaNC());
				sistemasNCPOJO.setEstatusPOJO(ConvertEstatusPOJOtoVO.convertEstatusVOToPOJO(sistemasNCVO.getEstatusVO()));
				sistemasNCPOJO.setFechaCreacionSistemaNC(sistemasNCVO.getFechaCreacionSistemaNC());
				sistemasNCPOJO.setIdSistemaNC(sistemasNCVO.getIdSistemaNC());
				sistemasNCPOJO.setNombreSistenaNC(sistemasNCVO.getNombreSistemaNC());
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_VO_POJO + sistemasNCVO);
				e.printStackTrace();
			}
		}
		return sistemasNCPOJO;
	}
}
