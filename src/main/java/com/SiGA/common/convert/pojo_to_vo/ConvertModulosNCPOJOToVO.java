package  com.SiGA.common.convert.pojo_to_vo;

import com.SiGA.common.VO.ModulosNCVO;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.persistencia.pojo.ModulosNCPOJO;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 18/02/2013
 * @descripcion Clase utileria que convierte un objeto ModulosNCPOJOToVO
 *
 */
public class ConvertModulosNCPOJOToVO {
	
	/**
	 * Metodo que convierte un objeto ModulosNCPOJO en ModulosNCVO
	 * @param modulosNCPOJO es el POJO a convertir
	 * @return ModulosNCVO es el objeto VO convertido
	 */
	public static ModulosNCVO convertModulosNCPOJOToVO(ModulosNCPOJO modulosNCPOJO){
		ModulosNCVO modulosNCVO = null;
		if(modulosNCPOJO != null){
			try{
				modulosNCVO = new ModulosNCVO();
				modulosNCVO.setDescripcionModuloNC(modulosNCPOJO.getDescripcionModuloNC());
				modulosNCVO.setEstatusVO(ConvertEstatusPOJOtoVO.convertEstatusPOJOToVO(modulosNCPOJO.getEstatusPOJO()));
				modulosNCVO.setFechaCreacionModuloNC(modulosNCPOJO.getFechaCreacionModuloNC());
				modulosNCVO.setIdModuloNC(modulosNCPOJO.getIdModuloNC());
				modulosNCVO.setNombreModuloNC(modulosNCPOJO.getNombreModuloNC());
				modulosNCVO.setSistemasNCVO(ConvertSistemasNCPOJOToVO.convertSistemasNCPOJOToVO(modulosNCPOJO.getSistemasNCPOJO()));
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_POJO_VO + modulosNCPOJO);
				e.printStackTrace();
			}
		}
		return modulosNCVO;
	}

	
	/**
	 * Metodo que convierte un objeto ModulosNCVO en ModulosNCPOJO
	 * @param modulosNCVO es el VO a convertir
	 * @return ModulosNCPOJO es el objeto POJO convertido
	 */
	public static ModulosNCPOJO convertModulosNCVOToPOJO(ModulosNCVO modulosNCVO){
		ModulosNCPOJO modulosNCPOJO = null;
		if(modulosNCVO != null){
			try{
				modulosNCPOJO = new ModulosNCPOJO();
				modulosNCPOJO.setDescripcionModuloNC(modulosNCVO.getDescripcionModuloNC());
				modulosNCPOJO.setEstatusPOJO(ConvertEstatusPOJOtoVO.convertEstatusVOToPOJO(modulosNCVO.getEstatusVO()));
				modulosNCPOJO.setFechaCreacionModuloNC(modulosNCVO.getFechaCreacionModuloNC());
				modulosNCPOJO.setIdModuloNC(modulosNCVO.getIdModuloNC());
				modulosNCPOJO.setNombreModuloNC(modulosNCVO.getNombreModuloNC());
				modulosNCPOJO.setSistemasNCPOJO(ConvertSistemasNCPOJOToVO.convertSistemasNCVOToPOJO(modulosNCVO.getSistemasNCVO()));
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_VO_POJO + modulosNCVO);
				e.printStackTrace();
			}
		}
		return modulosNCPOJO;
	}
}
