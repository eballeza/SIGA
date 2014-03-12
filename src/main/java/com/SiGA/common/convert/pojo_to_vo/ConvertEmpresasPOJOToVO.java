package  com.SiGA.common.convert.pojo_to_vo;

import com.SiGA.common.VO.EmpresasVO;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.persistencia.pojo.EmpresasPOJO;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 18/02/2013
 * @descripcion Clase utileria que convierte un objeto EmpresasPOJOToVO
 *
 */
public class ConvertEmpresasPOJOToVO {
	
	/**
	 * Metodo que convierte un objeto EmpresasPOJO en EmpresasVO
	 * @param empresasPOJO es el POJO a convertir
	 * @return EmpresasVO es el objeto VO convertido
	 */
	public static EmpresasVO convertEmpresasPOJOToVO(EmpresasPOJO empresasPOJO){
		EmpresasVO empresasVO = null;
		if(empresasPOJO != null){
			try{
				empresasVO = new EmpresasVO();
				empresasVO.setEstatusVO(ConvertEstatusPOJOtoVO.convertEstatusPOJOToVO(empresasPOJO.getEstatusPOJO()));
				empresasVO.setFechaCreacionEmpresa(empresasPOJO.getFechaCreacionEmpresa());
				empresasVO.setIdEmpresa(empresasPOJO.getIdEmpresa());
				empresasVO.setNombreEmpresa(empresasPOJO.getNombreEmpresa());
				empresasVO.setTelefonoEmpresa(empresasPOJO.getTelefonoEmpresa());
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_POJO_VO + empresasPOJO);
				e.printStackTrace();
			}
		}
		return empresasVO;
	}
	
	/**
	 * Metodo que convierte un objeto EmpresasVO en EmpresasPOJO
	 * @param empresasVO es el VO a convertir
	 * @return EmpresasPOJO es el objeto POJO convertido
	 */
	public static EmpresasPOJO convertEmpresasVOToPOJO(EmpresasVO empresasVO){
		EmpresasPOJO empresasPOJO = null;
		if(empresasVO != null){
			try{
				empresasPOJO = new EmpresasPOJO();
				empresasPOJO.setEstatusPOJO(ConvertEstatusPOJOtoVO.convertEstatusVOToPOJO(empresasVO.getEstatusVO()));
				empresasPOJO.setFechaCreacionEmpresa(empresasVO.getFechaCreacionEmpresa());
				empresasPOJO.setIdEmpresa(empresasVO.getIdEmpresa());
				empresasPOJO.setNombreEmpresa(empresasVO.getNombreEmpresa());
				empresasPOJO.setTelefonoEmpresa(empresasVO.getTelefonoEmpresa());
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_VO_POJO + empresasVO);
				e.printStackTrace();
			}
		}
		return empresasPOJO;
	}
	
}
