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
 * @descripcion Clase de tipo POJO que mapea sus atributos con las columnas de la tabla SiGA_severidadesAnomalia
 *
 */
@Entity
@Table(name = ConstantesMapeoTablas.SIGA_TABLA_SEVERIDADES_ANOMALIA)
public class SeveridadesAnomaliaPOJO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7540329073850132208L;
	
	@Id
	@Column(name = "idSeveridadAnomalia", nullable = false, unique = true)
	private Integer idSeveridadAnomalia;
	
	@Column(name = "descripcionSeveridadAnomalia", nullable = true, unique = false, length = 200)
	private String descripcionSeveridadAnomalia;
	
	@Column(name = "nombreSeveridadAnomalia", nullable = false, unique = false, length = 50)
	private String nombreSeveridadAnomalia;
	
	@Column(name = "horasRespuestaSeveridadAnomalia", nullable = false, unique = false)
	private Integer horasRespuestaSeveridadAnomalia;
	
	/**
	 * 
	 */
	public SeveridadesAnomaliaPOJO() {
		// TODO Auto-generated constructor stub
	}

	public SeveridadesAnomaliaPOJO(Integer idSeveridadAnomalia,
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
