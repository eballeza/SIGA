package  com.SiGA.common.convert.pojo_to_vo;

import com.SiGA.common.VO.TiposUsuarioVO;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.persistencia.pojo.TiposUsuarioPOJO;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 18/02/2013
 * @descripcion Clase utileria que convierte un objeto TiposUsuarioPOJOToVO
 *
 */
public class ConvertTiposUsuarioPOJOToVO {
	
	/**
	 * Metodo que convierte un objeto TiposUsuarioPOJO en TiposUsuarioVO
	 * @param tiposUsuarioPOJO es el POJO a convertir
	 * @return TiposUsuarioVO es el objeto VO convertido
	 */
	public static TiposUsuarioVO convertTiposUsuarioPOJOToVO(TiposUsuarioPOJO tiposUsuarioPOJO){
		TiposUsuarioVO tiposUsuarioVO = null;
		if(tiposUsuarioPOJO != null){
			try{
				tiposUsuarioVO = new TiposUsuarioVO();
				tiposUsuarioVO.setIdTipoUsuario(tiposUsuarioPOJO.getIdTipoUsuario());
				tiposUsuarioVO.setNombreTipoUsuario(tiposUsuarioPOJO.getNombreTipoUsuario());
				tiposUsuarioVO.setDescripcionTipoUSuario(tiposUsuarioPOJO.getDescripcionTipoUSuario());				
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_POJO_VO + tiposUsuarioPOJO);
				e.printStackTrace();
			}
		}
		return tiposUsuarioVO;
	}
	
	/**
	 * Metodo que convierte un objeto TiposUsuarioVO en TiposUsuarioPOJO
	 * @param tiposUsuarioVO es el VO a convertir
	 * @return TiposUsuarioPOJO es el objeto POJO convertido
	 */
	public static TiposUsuarioPOJO convertTiposUsuarioVOToPOJO(TiposUsuarioVO tiposUsuarioVO){
		TiposUsuarioPOJO tiposUsuarioPOJO = null;
		if(tiposUsuarioVO != null){
			try{
				tiposUsuarioPOJO = new TiposUsuarioPOJO();
				tiposUsuarioPOJO.setIdTipoUsuario(tiposUsuarioVO.getIdTipoUsuario());
				tiposUsuarioPOJO.setNombreTipoUsuario(tiposUsuarioVO.getNombreTipoUsuario());
				tiposUsuarioPOJO.setDescripcionTipoUSuario(tiposUsuarioVO.getDescripcionTipoUSuario());				
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_VO_POJO + tiposUsuarioVO);
				e.printStackTrace();
			}
		}
		return tiposUsuarioPOJO;
	}

}
