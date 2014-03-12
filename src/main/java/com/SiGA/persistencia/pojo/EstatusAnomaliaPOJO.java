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
 * @descripcion Clase de tipo POJO que mapea sus atributos con las columnas de la tabla SiGA_estatusAnomalia
 *
 */
@Entity
@Table(name = ConstantesMapeoTablas.SIGA_TABLA_ESTATUS_ANOMALIA)
public class EstatusAnomaliaPOJO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6405355524263610304L;
	
	@Id
	@Column(name = "idEstatusAnomalia", nullable = false, unique = true)
	private Integer idEstatusAnomalia;
	
	@Column(name = "claveEstatusAnomalia", nullable = false, unique = false, length = 1)
	private char claveEstatusAnomalia;
	
	@Column(name = "descripcionEstatusAnomalia", nullable = true, unique = false, length = 100)
	private String descripcionEstatusAnomalia;
	
	public EstatusAnomaliaPOJO() {
		// TODO Auto-generated constructor stub
	}

	public EstatusAnomaliaPOJO(Integer idEstatusAnomalia,
			char claveEstatusAnomalia, String descripcionEstatusAnomalia) {
		super();
		this.idEstatusAnomalia = idEstatusAnomalia;
		this.claveEstatusAnomalia = claveEstatusAnomalia;
		this.descripcionEstatusAnomalia = descripcionEstatusAnomalia;
	}

	/**
	 * @return the idEstatusAnomalia
	 */
	public Integer getIdEstatusAnomalia() {
		return idEstatusAnomalia;
	}

	/**
	 * @param idEstatusAnomalia the idEstatusAnomalia to set
	 */
	public void setIdEstatusAnomalia(Integer idEstatusAnomalia) {
		this.idEstatusAnomalia = idEstatusAnomalia;
	}

	/**
	 * @return the claveEstatusAnomalia
	 */
	public char getClaveEstatusAnomalia() {
		return claveEstatusAnomalia;
	}

	/**
	 * @param claveEstatusAnomalia the claveEstatusAnomalia to set
	 */
	public void setClaveEstatusAnomalia(char claveEstatusAnomalia) {
		this.claveEstatusAnomalia = claveEstatusAnomalia;
	}

	/**
	 * @return the descripcionEstatusAnomalia
	 */
	public String getDescripcionEstatusAnomalia() {
		return descripcionEstatusAnomalia;
	}

	/**
	 * @param descripcionEstatusAnomalia the descripcionEstatusAnomalia to set
	 */
	public void setDescripcionEstatusAnomalia(String descripcionEstatusAnomalia) {
		this.descripcionEstatusAnomalia = descripcionEstatusAnomalia;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EstatusAnomalia [idEstatusAnomalia=" + idEstatusAnomalia
				+ ", claveEstatusAnomalia=" + claveEstatusAnomalia
				+ ", descripcionEstatusAnomalia=" + descripcionEstatusAnomalia
				+ "]";
	}
	
}
