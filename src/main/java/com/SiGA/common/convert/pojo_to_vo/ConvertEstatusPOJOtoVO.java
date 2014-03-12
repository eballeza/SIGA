package  com.SiGA.common.convert.pojo_to_vo;

import com.SiGA.common.VO.EstatusVO;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.persistencia.pojo.EstatusPOJO;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 18/02/2013
 * @descripcion Clase utileria que convierte un objeto EstatusPOJOToVO
 *
 */
public class ConvertEstatusPOJOtoVO {

	/**
	 * Metodo que convierte un objeto EstatusPOJO en EstatusVO
	 * @param estatusPOJO es el POJO a convertir
	 * @return EstatusVO es el objeto VO convertido
	 */
	public static EstatusVO convertEstatusPOJOToVO(EstatusPOJO estatusPOJO){
		EstatusVO estatusVO = null;
		if(estatusPOJO != null){
			try{
				estatusVO = new EstatusVO();
				estatusVO.setIdEstatus(estatusPOJO.getIdEstatus());
				estatusVO.setClaveEstatus(estatusPOJO.getClaveEstatus());
				estatusVO.setDescripcionEstatus(estatusPOJO.getDescripcionEstatus());
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_POJO_VO + estatusPOJO);
				e.printStackTrace();
			}
		}
		return estatusVO;
	}
	
	/**
	 * Metodo que convierte un objeto EstatusVO en EstatusPOJO
	 * @param estatusVO es el VO a convertir
	 * @return EstatusPOJO es el objeto POJO convertido
	 */
	public static EstatusPOJO convertEstatusVOToPOJO(EstatusVO estatusVO){
		EstatusPOJO estatusPOJO = null;
		if(estatusVO != null){
			try{
				estatusPOJO = new EstatusPOJO();
				estatusPOJO.setIdEstatus(estatusVO.getIdEstatus());
				estatusPOJO.setClaveEstatus(estatusVO.getClaveEstatus());
				estatusPOJO.setDescripcionEstatus(estatusVO.getDescripcionEstatus());
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_VO_POJO + estatusVO);
				e.printStackTrace();
			}			
		}
		return estatusPOJO;
	}
}
