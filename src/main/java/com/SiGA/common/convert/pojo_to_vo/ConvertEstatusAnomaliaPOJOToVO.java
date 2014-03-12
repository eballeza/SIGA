package  com.SiGA.common.convert.pojo_to_vo;

import com.SiGA.common.VO.EstatusAnomaliaVO;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.persistencia.pojo.EstatusAnomaliaPOJO;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 18/02/2013
 * @descripcion Clase utileria que convierte un objeto EstatusAnomaliaPOJOToVO
 *
 */
public class ConvertEstatusAnomaliaPOJOToVO {

	/**
	 * Metodo que convierte un objeto EstatusAnomaliaPOJO en EstatusAnomaliaVO
	 * @param estatusAnomaliaPOJO es el POJO a convertir
	 * @return EstatusAnomaliaVO es el objeto VO convertido
	 */
	public static EstatusAnomaliaVO convertEstatusAnomaliaPOJOToVO(EstatusAnomaliaPOJO estatusAnomaliaPOJO){
		EstatusAnomaliaVO estatusAnomaliaVO = null;
		if(estatusAnomaliaPOJO != null){
			try{
				estatusAnomaliaVO = new EstatusAnomaliaVO();
				estatusAnomaliaVO.setClaveEstatusAnomalia(estatusAnomaliaPOJO.getClaveEstatusAnomalia());
				estatusAnomaliaVO.setDescripcionEstatusAnomalia(estatusAnomaliaPOJO.getDescripcionEstatusAnomalia());
				estatusAnomaliaVO.setIdEstatusAnomalia(estatusAnomaliaPOJO.getIdEstatusAnomalia());
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_POJO_VO + estatusAnomaliaPOJO);
				e.printStackTrace();
			}
		}
		return estatusAnomaliaVO;
	}
	
	/**
	 * Metodo que convierte un objeto EstatusAnomaliaVO en EstatusAnomaliaPOJO
	 * @param estatusAnomaliaVO es el VO a convertir
	 * @return EstatusAnomaliaPOJO es el objeto POJO convertido
	 */
	public static EstatusAnomaliaPOJO convertEstatusAnomaliaVOToPOJO(EstatusAnomaliaVO estatusAnomaliaVO){
		EstatusAnomaliaPOJO estatusAnomaliaPOJO = null;
		if(estatusAnomaliaVO != null){
			try{
				estatusAnomaliaPOJO = new EstatusAnomaliaPOJO();
				estatusAnomaliaPOJO.setClaveEstatusAnomalia(estatusAnomaliaVO.getClaveEstatusAnomalia());
				estatusAnomaliaPOJO.setDescripcionEstatusAnomalia(estatusAnomaliaVO.getDescripcionEstatusAnomalia());
				estatusAnomaliaPOJO.setIdEstatusAnomalia(estatusAnomaliaVO.getIdEstatusAnomalia());
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_VO_POJO + estatusAnomaliaVO);
				e.printStackTrace();
			}
		}
		return estatusAnomaliaPOJO;
	}
}
