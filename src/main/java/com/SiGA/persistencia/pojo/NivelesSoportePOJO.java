/**
 * 
 */
package  com.SiGA.persistencia.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.SiGA.common.constantes.ConstantesMapeoTablas;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 7/01/2013
 * @descripcion Clase de tipo POJO que mapea sus atributos con las columnas de la tabla SiGA_nivelesSoporte
 *
 */
@Entity
@Table(name = ConstantesMapeoTablas.SIGA_TABLA_NIVELES_SOPORTE)
public class NivelesSoportePOJO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 622177208017425153L;

	@Id
	@Column(name = "idNivelSoporte", nullable = false, unique = true)
	private Integer idNivelSoporte;
	
	@Column(name = "nombreNivelSoporte", nullable = false, unique = false, length = 50)
	private String nombreNivelSoporte;
	
	@Column(name = "descripcionNivelSoporte", nullable = true, unique = false, length = 200)
	private String descripcionNivelSoporte;
	
	@Column(name = "noNivelSoporte", nullable = false, unique = false)
	private Integer noNivelSoporte;
	
	/**
	 * Constructor de la clase.
	 */
	public NivelesSoportePOJO() {
		// TODO Auto-generated constructor stub
	}

	public NivelesSoportePOJO(Integer idNivelSoporte,
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
