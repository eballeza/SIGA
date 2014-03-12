package  com.SiGA.common.convert.pojo_to_vo;

import com.SiGA.common.VO.AnomaliasVO;
import com.SiGA.common.constantes.ConstantesMensajesDeError;
import com.SiGA.persistencia.pojo.AnomaliasPOJO;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 18/02/2013
 * @descripcion Clase utileria que convierte un objeto AnomaliasPOJOToVO
 *
 */
public class ConvertAnomaliasPOJOToVO {
	
	/**
	 * Metodo que convierte un objeto AnomaliasPOJO en AnomaliasVO
	 * @param anomaliasPOJO es el POJO a convertir
	 * @return AnomaliasVO es el objeto VO convertido
	 */
	public static AnomaliasVO convertAnomaliasPOJOToVO(AnomaliasPOJO anomaliasPOJO){
		AnomaliasVO anomaliasVO = new AnomaliasVO();
		if(anomaliasPOJO != null){
			try{
				anomaliasVO.setDescripcionAnomalia(anomaliasPOJO.getDescripcionAnomalia());
				anomaliasVO.setEstatusAnomaliaVO(ConvertEstatusAnomaliaPOJOToVO.convertEstatusAnomaliaPOJOToVO(anomaliasPOJO.getEstatusAnomaliaPOJO()));
				anomaliasVO.setFechaCierreAnomalia(anomaliasPOJO.getFechaCierreAnomalia());
				anomaliasVO.setFechaInicioAnomalia(anomaliasPOJO.getFechaInicioAnomalia());
				anomaliasVO.setFechaReporteAnomalia(anomaliasPOJO.getFechaReporteAnomalia());
				anomaliasVO.setModulosNCVO(ConvertModulosNCPOJOToVO.convertModulosNCPOJOToVO(anomaliasPOJO.getModulosNCPOJO()));
				anomaliasVO.setNoReporteAnomalia(anomaliasPOJO.getNoReporteAnomalia());
				anomaliasVO.setNoReporteCliente(anomaliasPOJO.getNoReporteCliente());
				anomaliasVO.setNoReporteNC(anomaliasPOJO.getNoReporteNC());
				anomaliasVO.setPasosReproduccionAnomalia(anomaliasPOJO.getPasosReporduccionAnomalia());
				anomaliasVO.setSeveridadAnomaliaVO(ConvertSeveridadesAnomaliaPOJOToVO.convertSeveridadesAnomaliaPOJOToVO(anomaliasPOJO.getSeveridadesAnomaliaPOJO()));
				anomaliasVO.setSistemasNCVO(ConvertSistemasNCPOJOToVO.convertSistemasNCPOJOToVO(anomaliasPOJO.getSistemasNCPOJO()));
				anomaliasVO.setTiposAnomaliaVO(ConvertTiposAnomaliaPOJOToVO.convertTiposAnomaliaPOJOToVO(anomaliasPOJO.getTiposAnomaliaPOJO()));
				anomaliasVO.setUrlAnomalia(anomaliasPOJO.getUrlAnomalia());
				anomaliasVO.setUsuariosClienteVO(ConvertUsuariosPOJOToVO.convertUsuariosPOJOToVO(anomaliasPOJO.getUsuariosPOJO_Cliente()));
				anomaliasVO.setUsuariosReportaVO(ConvertUsuariosPOJOToVO.convertUsuariosPOJOToVO(anomaliasPOJO.getUsuariosPOJO_Reporta()));
			}catch(Exception e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_POJO_VO + anomaliasPOJO);
				e.printStackTrace();
			}
			
		}		
		return anomaliasVO;
	}
	
	/**
	 * Metodo que convierte un objeto AnomaliasVO en AnomaliasPOJO
	 * @param anomaliasVO es el VO a convertir
	 * @return AnomaliasPOJO es el objeto POJO convertido
	 */
	public static AnomaliasPOJO convertAnomaliasVOToPOJO(AnomaliasVO anomaliasVO){
		AnomaliasPOJO anomaliasPOJO = null;
		if(anomaliasVO != null){
			try{
				anomaliasPOJO = new AnomaliasPOJO();
				anomaliasPOJO.setDescripcionAnomalia(anomaliasVO.getDescripcionAnomalia());
				anomaliasPOJO.setEstatusAnomaliaPOJO(ConvertEstatusAnomaliaPOJOToVO.convertEstatusAnomaliaVOToPOJO(anomaliasVO.getEstatusAnomaliaVO()));
				anomaliasPOJO.setFechaCierreAnomalia(anomaliasVO.getFechaCierreAnomalia());
				anomaliasPOJO.setFechaInicioAnomalia(anomaliasVO.getFechaInicioAnomalia());
				//anomaliasPOJO.setFechaReporteAnomalia(anomaliasVO.getFechaReporteAnomalia());
				anomaliasPOJO.setFechaReporteAnomalia(anomaliasVO.getFechaReporteAnomalia());
				anomaliasPOJO.setModulosNCPOJO(ConvertModulosNCPOJOToVO.convertModulosNCVOToPOJO(anomaliasVO.getModulosNCVO()));
				anomaliasPOJO.setNoReporteAnomalia(anomaliasVO.getNoReporteAnomalia());
				anomaliasPOJO.setNoReporteCliente(anomaliasVO.getNoReporteCliente());
				anomaliasPOJO.setNoReporteNC(anomaliasVO.getNoReporteNC());
				anomaliasPOJO.setPasosReporduccionAnomalia(anomaliasVO.getPasosReproduccionAnomalia());
				anomaliasPOJO.setSeveridadesAnomaliaPOJO(ConvertSeveridadesAnomaliaPOJOToVO.convertSeveridadesAnomaliaVOToPOJO(anomaliasVO.getSeveridadAnomaliaVO()));
				anomaliasPOJO.setSistemasNCPOJO(ConvertSistemasNCPOJOToVO.convertSistemasNCVOToPOJO(anomaliasVO.getSistemasNCVO()));
				anomaliasPOJO.setTiposAnomaliaPOJO(ConvertTiposAnomaliaPOJOToVO.convertTiposAnomaliaVOToPOJO(anomaliasVO.getTiposAnomaliaVO()));
				anomaliasPOJO.setUrlAnomalia(anomaliasVO.getUrlAnomalia());
				anomaliasPOJO.setUsuariosPOJO_Cliente(ConvertUsuariosPOJOToVO.convertUsuariosVOToPOJO(anomaliasVO.getUsuariosClienteVO()));
				anomaliasPOJO.setUsuariosPOJO_Reporta(ConvertUsuariosPOJOToVO.convertUsuariosVOToPOJO(anomaliasVO.getUsuariosReportaVO()));
			}catch(NullPointerException e){
				System.err.println(ConstantesMensajesDeError.ERROR_CONVERSION_VO_POJO + anomaliasVO);
				e.printStackTrace();
			}			
		}		
		return anomaliasPOJO;
	}

}
