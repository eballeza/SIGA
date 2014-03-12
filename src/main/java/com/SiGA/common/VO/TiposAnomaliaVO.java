package  com.SiGA.common.VO;

import javax.persistence.Column;
import javax.persistence.Id;

public class TiposAnomaliaVO {
	
	
	private Integer idTipoAnomalia;
	
	
	private String nombreTipoAnomalia;
	
	
	private String descripcionTipoAnomalia;

	public TiposAnomaliaVO() {
		// TODO Auto-generated constructor stub
	}
	
	public TiposAnomaliaVO(Integer idTipoAnomalia, String nombreTipoAnomalia,
			String descripcionTipoAnomalia) {
		super();
		this.idTipoAnomalia = idTipoAnomalia;
		this.nombreTipoAnomalia = nombreTipoAnomalia;
		this.descripcionTipoAnomalia = descripcionTipoAnomalia;
	}

	/**
	 * @return the idTipoAnomalia
	 */
	public Integer getIdTipoAnomalia() {
		return idTipoAnomalia;
	}

	/**
	 * @param idTipoAnomalia the idTipoAnomalia to set
	 */
	public void setIdTipoAnomalia(Integer idTipoAnomalia) {
		this.idTipoAnomalia = idTipoAnomalia;
	}

	/**
	 * @return the nombreTipoAnomalia
	 */
	public String getNombreTipoAnomalia() {
		return nombreTipoAnomalia;
	}

	/**
	 * @param nombreTipoAnomalia the nombreTipoAnomalia to set
	 */
	public void setNombreTipoAnomalia(String nombreTipoAnomalia) {
		this.nombreTipoAnomalia = nombreTipoAnomalia;
	}

	/**
	 * @return the descripcionTipoAnomalia
	 */
	public String getDescripcionTipoAnomalia() {
		return descripcionTipoAnomalia;
	}

	/**
	 * @param descripcionTipoAnomalia the descripcionTipoAnomalia to set
	 */
	public void setDescripcionTipoAnomalia(String descripcionTipoAnomalia) {
		this.descripcionTipoAnomalia = descripcionTipoAnomalia;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TiposAnomalia [idTipoAnomalia=" + idTipoAnomalia
				+ ", nombreTipoAnomalia=" + nombreTipoAnomalia
				+ ", descripcionTipoAnomalia=" + descripcionTipoAnomalia + "]";
	}

}
