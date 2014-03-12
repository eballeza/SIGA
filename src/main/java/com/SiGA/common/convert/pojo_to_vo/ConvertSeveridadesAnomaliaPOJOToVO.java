package  com.SiGA.common.convert.pojo_to_vo;

import com.SiGA.common.VO.SeveridadesAnomaliaVO;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.persistencia.pojo.SeveridadesAnomaliaPOJO;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 18/02/2013
 * @descripcion Clase utileria que convierte un objeto SeveridadesAnomaliaPOJOToVO
 *
 */
public class ConvertSeveridadesAnomaliaPOJOToVO {
	
	/**
	 * Metodo que convierte un objeto SeveridadesAnomaliaPOJO en SeveridadesAnomaliaVO
	 * @param severidadesAnomaliaPOJO es el POJO a convertir
	 * @return SeveridadesAnomaliaVO es el objeto VO convertido
	 */
	public static SeveridadesAnomaliaVO convertSeveridadesAnomaliaPOJOToVO(SeveridadesAnomaliaPOJO severidadesAnomaliaPOJO){
		SeveridadesAnomaliaVO severidadesAnomaliaVO = null;
		if(severidadesAnomaliaPOJO != null){
			try{
				severidadesAnomaliaVO = new SeveridadesAnomaliaVO();
				severidadesAnomaliaVO.setDescripcionSeveridadAnomalia(severidadesAnomaliaPOJO.getDescripcionSeveridadAnomalia());
				severidadesAnomaliaVO.setHorasRespuestaSeveridadAnomalia(severidadesAnomaliaPOJO.getHorasRespuestaSeveridadAnomalia());
				severidadesAnomaliaVO.setIdSeveridadAnomalia(severidadesAnomaliaPOJO.getIdSeveridadAnomalia());
				severidadesAnomaliaVO.setNombreSeveridadAnomalia(severidadesAnomaliaPOJO.getNombreSeveridadAnomalia());
				}catch(NullPointerException e){
					System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_POJO_VO + severidadesAnomaliaPOJO);
					e.printStackTrace();
			}
		}
		return severidadesAnomaliaVO;
	}
	
	/**
	 * Metodo que convierte un objeto SeveridadesAnomaliaVO en SeveridadesAnomaliaPOJO
	 * @param severidadesAnomaliaVO es el VO a convertir
	 * @return SeveridadesAnomaliaPOJO es el objeto POJO convertido
	 */
	public static SeveridadesAnomaliaPOJO convertSeveridadesAnomaliaVOToPOJO(SeveridadesAnomaliaVO severidadesAnomaliaVO){
		SeveridadesAnomaliaPOJO severidadesAnomaliaPOJO = null;
		if(severidadesAnomaliaVO != null){
			try{
				severidadesAnomaliaPOJO = new SeveridadesAnomaliaPOJO();
				severidadesAnomaliaPOJO.setDescripcionSeveridadAnomalia(severidadesAnomaliaVO.getDescripcionSeveridadAnomalia());
				severidadesAnomaliaPOJO.setHorasRespuestaSeveridadAnomalia(severidadesAnomaliaVO.getHorasRespuestaSeveridadAnomalia());
				severidadesAnomaliaPOJO.setIdSeveridadAnomalia(severidadesAnomaliaVO.getIdSeveridadAnomalia());
				severidadesAnomaliaPOJO.setNombreSeveridadAnomalia(severidadesAnomaliaVO.getNombreSeveridadAnomalia());
				}catch(NullPointerException e){
					System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_VO_POJO + severidadesAnomaliaVO);
					e.printStackTrace();
			}
		}
		return severidadesAnomaliaPOJO;
	}

}
