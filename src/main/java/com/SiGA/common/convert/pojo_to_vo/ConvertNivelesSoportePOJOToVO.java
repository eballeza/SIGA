package  com.SiGA.common.convert.pojo_to_vo;

import com.SiGA.common.VO.NivelesSoporteVO;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.persistencia.pojo.NivelesSoportePOJO;




/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 18/02/2013
 * @descripcion Clase utileria que convierte un objeto NIvelesSOportePOJOToVO
 *
 */
public class ConvertNivelesSoportePOJOToVO {

	/**
	 * Metodo que convierte un objeto NivelesSoportePOJO en NivelesSoporteVO
	 * @param nivelesSoportePOJO es el POJO a convertir
	 * @return NivelesSoporteVO es el objeto VO convertido
	 */
	public static NivelesSoporteVO convertNivelesSoportePOJOToVO(NivelesSoportePOJO nivelesSoportePOJO){
		NivelesSoporteVO nivelesSoporteVO = null;
		if(nivelesSoportePOJO != null){
			try{
				nivelesSoporteVO = new NivelesSoporteVO();
				nivelesSoporteVO.setDesripcionNivelSoporte(nivelesSoportePOJO.getDesripcionNivelSoporte());
				nivelesSoporteVO.setIdNivelSoporte(nivelesSoportePOJO.getIdNivelSoporte());
				nivelesSoporteVO.setNombreNivelSoporte(nivelesSoportePOJO.getNombreNivelSoporte());
				nivelesSoporteVO.setNoNivelSoporte(nivelesSoportePOJO.getNoNivelSoporte());
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_POJO_VO + nivelesSoportePOJO);
				e.printStackTrace();
			}
		}
		return nivelesSoporteVO;
	}
	
	
	/**
	 * Metodo que convierte un objeto NivelesSoporteVO en NivelesSoportePOJO
	 * @param nivelesSoporteVO es el VO a convertir
	 * @return NivelesSoportePOJO es el objeto POJO convertido
	 */
	public static NivelesSoportePOJO convertNivelesSoporteVOToPOJO(NivelesSoporteVO nivelesSoporteVO){
		NivelesSoportePOJO nivelesSoportePOJO = null;
		if(nivelesSoporteVO != null){
			try{
				nivelesSoportePOJO = new NivelesSoportePOJO();
				nivelesSoportePOJO.setDesripcionNivelSoporte(nivelesSoporteVO.getDesripcionNivelSoporte());
				nivelesSoportePOJO.setIdNivelSoporte(nivelesSoporteVO.getIdNivelSoporte());
				nivelesSoportePOJO.setNombreNivelSoporte(nivelesSoporteVO.getNombreNivelSoporte());
				nivelesSoportePOJO.setNoNivelSoporte(nivelesSoporteVO.getNoNivelSoporte());
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_VO_POJO + nivelesSoporteVO);
				e.printStackTrace();
			}
		}
		return nivelesSoportePOJO;
	}
}
