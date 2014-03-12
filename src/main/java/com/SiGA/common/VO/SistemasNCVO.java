package  com.SiGA.common.VO;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 15/02/2013
 * @descripcion Clase de tipo VO que mapea sus atributos con las columnas de la tabla SiGA_sistemas
 *
 */
public class SistemasNCVO {
	
	
	private Integer idSistemaNC;
	
	
	private String nombreSistemaNC;
	
	
	private String areaSistemaNC;
	
	
	private Calendar fechaCreacionSistemaNC;
	
	
	private EstatusVO estatusVO;
	
	/**
	 * 
	 */
	public SistemasNCVO() {
		
	}

	public SistemasNCVO(Integer idSistemaNC, String nombreSistemaNC,
			String areaSistemaNC, Calendar fechaCreacionSistemaNC,
			EstatusVO estatusVO) {
		super();
		this.idSistemaNC = idSistemaNC;
		this.nombreSistemaNC = nombreSistemaNC;
		this.areaSistemaNC = areaSistemaNC;
		this.fechaCreacionSistemaNC = fechaCreacionSistemaNC;
		this.estatusVO = estatusVO;
	}

	/**
	 * @return the idSistemaNC
	 */
	public Integer getIdSistemaNC() {
		return idSistemaNC;
	}

	/**
	 * @param idSistemaNC the idSistemaNC to set
	 */
	public void setIdSistemaNC(Integer idSistemaNC) {
		this.idSistemaNC = idSistemaNC;
	}

	/**
	 * @return the nombreSistemaNC
	 */
	public String getNombreSistemaNC() {
		return nombreSistemaNC;
	}

	/**
	 * @param nombreSistemaNC the nombreSistemaNC to set
	 */
	public void setNombreSistemaNC(String nombreSistemaNC) {
		this.nombreSistemaNC = nombreSistemaNC;
	}

	/**
	 * @return the areaSistemaNC
	 */
	public String getAreaSistemaNC() {
		return areaSistemaNC;
	}

	/**
	 * @param areaSistemaNC the areaSistemaNC to set
	 */
	public void setAreaSistemaNC(String areaSistemaNC) {
		this.areaSistemaNC = areaSistemaNC;
	}

	/**
	 * @return the fechaCreacionSistemaNC
	 */
	public Calendar getFechaCreacionSistemaNC() {
		return fechaCreacionSistemaNC;
	}

	/**
	 * @param fechaCreacionSistemaNC the fechaCreacionSistemaNC to set
	 */
	public void setFechaCreacionSistemaNC(Calendar fechaCreacionSistemaNC) {
		this.fechaCreacionSistemaNC = fechaCreacionSistemaNC;
	}

	/**
	 * @return the estatusVO
	 */
	public EstatusVO getEstatusVO() {
		return estatusVO;
	}

	/**
	 * @param estatusVO the estatusVO to set
	 */
	public void setEstatusVO(EstatusVO estatusVO) {
		this.estatusVO = estatusVO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SistemasVO [idSistemaNC=" + idSistemaNC + ", nombreSistemaNC="
				+ nombreSistemaNC + ", areaSistemaNC=" + areaSistemaNC
				+ ", fechaCreacionSistemaNC=" + fechaCreacionSistemaNC
				+ ", estatusVO=" + estatusVO + "]";
	}

	
}
