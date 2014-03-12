package  com.SiGA.common.VO;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 15/02/2013
 * @descripcion Clase de tipo VO que mapea sus atributos con las columnas de la tabla SiGA_nivelesSoporte
 *
 */
public class NivelesSoporteVO {
	
	
	private Integer idNivelSoporte;
	
	
	private String nombreNivelSoporte;
	
	
	private String descripcionNivelSoporte;
	
	
	private Integer noNivelSoporte;
	
	/**
	 * Constructor de la clase.
	 */
	public NivelesSoporteVO() {
		// TODO Auto-generated constructor stub
	}

	public NivelesSoporteVO(Integer idNivelSoporte,
			String nombreNivelSoporte, String desripcionNivelSoporte,
			Integer noNivelSoporte) {
		super();
		this.idNivelSoporte = idNivelSoporte;
		this.nombreNivelSoporte = nombreNivelSoporte;
		this.descripcionNivelSoporte = desripcionNivelSoporte;
		this.noNivelSoporte = noNivelSoporte;
	}

	/**
	 * @return the idNivelSoporte
	 */
	public Integer getIdNivelSoporte() {
		return idNivelSoporte;
	}

	/**
	 * @param idNivelSoporte the idNivelSoporte to set
	 */
	public void setIdNivelSoporte(Integer idNivelSoporte) {
		this.idNivelSoporte = idNivelSoporte;
	}

	/**
	 * @return the nombreNivelSoporte
	 */
	public String getNombreNivelSoporte() {
		return nombreNivelSoporte;
	}

	/**
	 * @param nombreNivelSoporte the nombreNivelSoporte to set
	 */
	public void setNombreNivelSoporte(String nombreNivelSoporte) {
		this.nombreNivelSoporte = nombreNivelSoporte;
	}

	/**
	 * @return the desripcionNivelSoporte
	 */
	public String getDesripcionNivelSoporte() {
		return descripcionNivelSoporte;
	}

	/**
	 * @param desripcionNivelSoporte the desripcionNivelSoporte to set
	 */
	public void setDesripcionNivelSoporte(String desripcionNivelSoporte) {
		this.descripcionNivelSoporte = desripcionNivelSoporte;
	}

	/**
	 * @return the noNivelSoporte
	 */
	public Integer getNoNivelSoporte() {
		return noNivelSoporte;
	}

	/**
	 * @param noNivelSoporte the noNivelSoporte to set
	 */
	public void setNoNivelSoporte(Integer noNivelSoporte) {
		this.noNivelSoporte = noNivelSoporte;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NivelesSoportePOJO [idNivelSoporte=" + idNivelSoporte
				+ ", nombreNivelSoporte=" + nombreNivelSoporte
				+ ", desripcionNivelSoporte=" + descripcionNivelSoporte
				+ ", noNivelSoporte=" + noNivelSoporte + "]";
	}
	
}
