package  com.SiGA.common.convert.pojo_to_vo;

import com.SiGA.common.VO.TiposAnomaliaVO;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.persistencia.pojo.TiposAnomaliaPOJO;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 18/02/2013
 * @descripcion Clase utileria que convierte un objeto TiposAnomaliaPOJOToVO
 *
 */
public class ConvertTiposAnomaliaPOJOToVO {

	/**
	 * Metodo que convierte un objeto TiposAnomaliaPOJO en TiposAnomaliaVO
	 * @param tiposAnomaliaPOJO es el POJO a convertir
	 * @return TiposAnomaliaVO es el objeto VO convertido
	 */
	public static TiposAnomaliaVO convertTiposAnomaliaPOJOToVO(TiposAnomaliaPOJO tiposAnomaliaPOJO){
		TiposAnomaliaVO tiposAnomaliaVO = null;
		if(tiposAnomaliaPOJO != null){
			try{
				tiposAnomaliaVO = new TiposAnomaliaVO();
				tiposAnomaliaVO.setIdTipoAnomalia(tiposAnomaliaPOJO.getIdTipoAnomalia());
				tiposAnomaliaVO.setNombreTipoAnomalia(tiposAnomaliaPOJO.getNombreTipoAnomalia());
				tiposAnomaliaVO.setDescripcionTipoAnomalia(tiposAnomaliaPOJO.getDescripcionTipoAnomalia());				
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_POJO_VO + tiposAnomaliaPOJO);
				e.printStackTrace();
			}
		}
		return tiposAnomaliaVO;
	}
	
	/**
	 * Metodo que convierte un objeto TiposAnomaliaVO en TiposAnomaliaPOJO
	 * @param tiposAnomaliaVO es el VO a convertir
	 * @return TiposAnomaliaPOJO es el objeto POJO convertido
	 */
	public static TiposAnomaliaPOJO convertTiposAnomaliaVOToPOJO(TiposAnomaliaVO tiposAnomaliaVO){
		TiposAnomaliaPOJO tiposAnomaliaPOJO = null;
		if(tiposAnomaliaVO != null){
			try{
				tiposAnomaliaPOJO = new TiposAnomaliaPOJO();
				tiposAnomaliaPOJO.setIdTipoAnomalia(tiposAnomaliaVO.getIdTipoAnomalia());
				tiposAnomaliaPOJO.setNombreTipoAnomalia(tiposAnomaliaVO.getNombreTipoAnomalia());
				tiposAnomaliaPOJO.setDescripcionTipoAnomalia(tiposAnomaliaVO.getDescripcionTipoAnomalia());				
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_VO_POJO + tiposAnomaliaVO);
				e.printStackTrace();
			}
		}
		return tiposAnomaliaPOJO;
	}
}
