package  com.SiGA.common.VO;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 15/02/2013
 * @descripcion Clase de tipo VO que mapea sus atributos con las columnas de la tabla SiGA_severidadesAnomalia
 *
 */
public class SeveridadesAnomaliaVO {

	
	private Integer idSeveridadAnomalia;
	
	
	private String descripcionSeveridadAnomalia;
	
	
	private String nombreSeveridadAnomalia;
	
	
	private Integer horasRespuestaSeveridadAnomalia;
	
	/**
	 * 
	 */
	public SeveridadesAnomaliaVO() {
		// TODO Auto-generated constructor stub
	}

	public SeveridadesAnomaliaVO(Integer idSeveridadAnomalia,
			String descripcionSeveridadAnomalia,
			String nombreSeveridadAnomalia,
			Integer horasRespuestaSeveridadAnomalia) {
		super();
		this.idSeveridadAnomalia = idSeveridadAnomalia;
		this.descripcionSeveridadAnomalia = descripcionSeveridadAnomalia;
		this.nombreSeveridadAnomalia = nombreSeveridadAnomalia;
		this.horasRespuestaSeveridadAnomalia = horasRespuestaSeveridadAnomalia;
	}

	/**
	 * @return the idSeveridadAnomalia
	 */
	public Integer getIdSeveridadAnomalia() {
		return idSeveridadAnomalia;
	}

	/**
	 * @param idSeveridadAnomalia the idSeveridadAnomalia to set
	 */
	public void setIdSeveridadAnomalia(Integer idSeveridadAnomalia) {
		this.idSeveridadAnomalia = idSeveridadAnomalia;
	}

	/**
	 * @return the descripcionSeveridadAnomalia
	 */
	public String getDescripcionSeveridadAnomalia() {
		return descripcionSeveridadAnomalia;
	}

	/**
	 * @param descripcionSeveridadAnomalia the descripcionSeveridadAnomalia to set
	 */
	public void setDescripcionSeveridadAnomalia(String descripcionSeveridadAnomalia) {
		this.descripcionSeveridadAnomalia = descripcionSeveridadAnomalia;
	}

	/**
	 * @return the nombreSeveridadAnomalia
	 */
	public String getNombreSeveridadAnomalia() {
		return nombreSeveridadAnomalia;
	}

	/**
	 * @param nombreSeveridadAnomalia the nombreSeveridadAnomalia to set
	 */
	public void setNombreSeveridadAnomalia(String nombreSeveridadAnomalia) {
		this.nombreSeveridadAnomalia = nombreSeveridadAnomalia;
	}

	/**
	 * @return the horasRespuestaSeveridadAnomalia
	 */
	public Integer getHorasRespuestaSeveridadAnomalia() {
		return horasRespuestaSeveridadAnomalia;
	}

	/**
	 * @param horasRespuestaSeveridadAnomalia the horasRespuestaSeveridadAnomalia to set
	 */
	public void setHorasRespuestaSeveridadAnomalia(
			Integer horasRespuestaSeveridadAnomalia) {
		this.horasRespuestaSeveridadAnomalia = horasRespuestaSeveridadAnomalia;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SeveridadesAnomaliPOJO [idSeveridadAnomalia="
				+ idSeveridadAnomalia + ", descripcionSeveridadAnomalia="
				+ descripcionSeveridadAnomalia + ", nombreSeveridadAnomalia="
				+ nombreSeveridadAnomalia
				+ ", horasRespuestaSeveridadAnomalia="
				+ horasRespuestaSeveridadAnomalia + "]";
	}

	
}
