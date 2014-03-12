package  com.SiGA.common.VO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 15/02/2013
 * @descripcion Clase de tipo VO que mapea sus atributos con las columnas de la tabla SiGA_acciones
 *
 */
public class AccionesVO {

	
	
	private Integer idAccion;
	
	
	private String nombreAccion;
	
	
	private String descripcionAccion;
	
	
	private NivelesSoporteVO nivelesSoporteVO;
	
	public AccionesVO() {
		// TODO Auto-generated constructor stub
	}

	public AccionesVO(Integer idAccion, String nombreAccion,
			String descripcionAccion, NivelesSoporteVO nivelesSoporteVO) {
		super();
		this.idAccion = idAccion;
		this.nombreAccion = nombreAccion;
		this.descripcionAccion = descripcionAccion;
		this.nivelesSoporteVO = nivelesSoporteVO;
	}

	/**
	 * @return the idAccion
	 */
	public Integer getIdAccion() {
		return idAccion;
	}

	/**
	 * @param idAccion the idAccion to set
	 */
	public void setIdAccion(Integer idAccion) {
		this.idAccion = idAccion;
	}

	/**
	 * @return the nombreAccion
	 */
	public String getNombreAccion() {
		return nombreAccion;
	}

	/**
	 * @param nombreAccion the nombreAccion to set
	 */
	public void setNombreAccion(String nombreAccion) {
		this.nombreAccion = nombreAccion;
	}

	/**
	 * @return the descripcionAccion
	 */
	public String getDescripcionAccion() {
		return descripcionAccion;
	}

	/**
	 * @param descripcionAccion the descripcionAccion to set
	 */
	public void setDescripcionAccion(String descripcionAccion) {
		this.descripcionAccion = descripcionAccion;
	}

	/**
	 * @return the nivelesSoporteVO
	 */
	public NivelesSoporteVO getNivelesSoporteVO() {
		return nivelesSoporteVO;
	}

	/**
	 * @param nivelesSoporteVO the nivelesSoporteVO to set
	 */
	public void setNivelesSoporteVO(NivelesSoporteVO nivelesSoporteVO) {
		this.nivelesSoporteVO = nivelesSoporteVO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccionesVO [idAccion=" + idAccion + ", nombreAccion="
				+ nombreAccion + ", descripcionAccion=" + descripcionAccion
				+ ", nivelesSoporteVO=" + nivelesSoporteVO + "]";
	}
	
	
	
}
