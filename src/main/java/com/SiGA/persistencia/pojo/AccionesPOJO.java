package  com.SiGA.persistencia.pojo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.SiGA.common.constantes.ConstantesMapeoTablas;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 14/02/2013
 * @descripcion Clase de tipo POJO que mapea sus atributos con las columnas de la tabla SiGA_acciones
 *
 */
@Entity
@Table(name = ConstantesMapeoTablas.SIGA_TABLA_ACCIONES)
public class AccionesPOJO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3838596145580283733L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idAccion", nullable = false, unique = true)
	private Integer idAccion;
	
	@Column(name = "nombreAccion", nullable = false, unique = false, length = 100)
	private String nombreAccion;
	
	@Column(name = "descripcionAccion", nullable = true, unique = false, length = 200)
	private String descripcionAccion;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "idNivelSoporte", nullable = false)
	private NivelesSoportePOJO nivelesSoportePOJO;
	
	public AccionesPOJO() {
		// TODO Auto-generated constructor stub
	}

	public AccionesPOJO(Integer idAccion, String nombreAccion,
			String descripcionAccion, NivelesSoportePOJO nivelesSoportePOJO) {
		super();
		this.idAccion = idAccion;
		this.nombreAccion = nombreAccion;
		this.descripcionAccion = descripcionAccion;
		this.nivelesSoportePOJO = nivelesSoportePOJO;
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
	 * @return the nivelesSoportePOJO
	 */
	public NivelesSoportePOJO getNivelesSoportePOJO() {
		return nivelesSoportePOJO;
	}

	/**
	 * @param nivelesSoportePOJO the nivelesSoportePOJO to set
	 */
	public void setNivelesSoportePOJO(NivelesSoportePOJO nivelesSoportePOJO) {
		this.nivelesSoportePOJO = nivelesSoportePOJO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AcccionesPOJO [idAccion=" + idAccion + ", nombreAccion="
				+ nombreAccion + ", descripcionAccion=" + descripcionAccion
				+ ", nivelesSoportePOJO=" + nivelesSoportePOJO + "]";
	}
	
	
}
