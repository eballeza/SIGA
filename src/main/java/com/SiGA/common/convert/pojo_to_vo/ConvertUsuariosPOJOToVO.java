package  com.SiGA.common.convert.pojo_to_vo;

import com.SiGA.common.VO.UsuariosVO;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.persistencia.pojo.UsuariosPOJO;




/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 18/02/2013
 * @descripcion Clase utileria que convierte un objeto UsuariosPOJOToVO
 *
 */
public class ConvertUsuariosPOJOToVO {
	
	/**
	 * Metodo que convierte un objeto UsuariosPOJO en UsuariosVO
	 * @param UsuariosPOJO es el POJO a convertir
	 * @return EmpresasVO es el objeto VO convertido
	 */
	public static UsuariosVO convertUsuariosPOJOToVO(UsuariosPOJO usuariosPOJO){
		UsuariosVO usuariosVO = null;
		if(usuariosPOJO != null){
			try{
				usuariosVO = new UsuariosVO();
				usuariosVO.setEmailUsuario(usuariosPOJO.getEmailUsuario());
				usuariosVO.setEmpresasVO(ConvertEmpresasPOJOToVO.convertEmpresasPOJOToVO(usuariosPOJO.getEmpresasPOJO()));
				usuariosVO.setEstatusVO(ConvertEstatusPOJOtoVO.convertEstatusPOJOToVO(usuariosPOJO.getEstatusPOJO()));
				usuariosVO.setExtensionUsuario(usuariosPOJO.getExtensionUsuario());
				usuariosVO.setFechaCreacionUsuario(usuariosPOJO.getFechaCreacionUsuario());
				usuariosVO.setIdUsuario(usuariosPOJO.getIdUsuario());
				usuariosVO.setNombreUsuario(usuariosPOJO.getNombreUsuario());
				usuariosVO.setTelefonoUsuario(usuariosPOJO.getTelefonoUsuario());
				usuariosVO.setTiposUsuarioVO(ConvertTiposUsuarioPOJOToVO.convertTiposUsuarioPOJOToVO(usuariosPOJO.getTiposUsuarioPOJO()));
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_POJO_VO + usuariosPOJO);
				e.printStackTrace();
			}
		}
		return usuariosVO;
	}
	
	/**
	 * Metodo que convierte un objeto UsuariosVO en UsuariosPOJO
	 * @param usuariosVO es el VO a convertir
	 * @return UsuariosPOJO es el objeto POJO convertido
	 */
	public static UsuariosPOJO convertUsuariosVOToPOJO(UsuariosVO usuariosVO){
		UsuariosPOJO usuariosPOJO = null;
		if(usuariosVO != null){
			try{
				usuariosPOJO = new UsuariosPOJO();
				usuariosPOJO.setEmailUsuario(usuariosVO.getEmailUsuario());
				usuariosPOJO.setEmpresasPOJO(ConvertEmpresasPOJOToVO.convertEmpresasVOToPOJO(usuariosVO.getEmpresasVO()));
				usuariosPOJO.setEstatusPOJO(ConvertEstatusPOJOtoVO.convertEstatusVOToPOJO(usuariosVO.getEstatusVO()));
				usuariosPOJO.setExtensionUsuario(usuariosVO.getExtensionUsuario());
				usuariosPOJO.setFechaCreacionUsuario(usuariosVO.getFechaCreacionUsuario());
				usuariosPOJO.setIdUsuario(usuariosVO.getIdUsuario());
				usuariosPOJO.setNombreUsuario(usuariosVO.getNombreUsuario());
				usuariosPOJO.setTelefonoUsuario(usuariosVO.getTelefonoUsuario());
				usuariosPOJO.setTiposUsuarioPOJO(ConvertTiposUsuarioPOJOToVO.convertTiposUsuarioVOToPOJO(usuariosVO.getTiposUsuarioVO()));
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_VO_POJO + usuariosVO);
				e.printStackTrace();
			}
		}
		return usuariosPOJO;
	}

}
