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
 * @descripcion Clase de tipo POJO que mapea sus atributos con las columnas de la tabla SiGA_tiposAnomalia
 *
 */
@Entity
@Table(name = ConstantesMapeoTablas.SIGA_TABLA_TIPOS_ANOMALIA)
public class TiposAnomaliaPOJO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6551290321064588990L;
	
	@Id
	@Column(name = "idTipoAnomalia", nullable = false, unique = true )
	private Integer idTipoAnomalia;
	
	@Column(name = "nombreTipoAnomalia", nullable = false, unique = false, length = 100 )
	private String nombreTipoAnomalia;
	
	@Column(name = "descripcionTipoAnomalia", nullable = true, unique = false, length = 200)
	private String descripcionTipoAnomalia;

	public TiposAnomaliaPOJO() {
		// TODO Auto-generated constructor stub
	}
	
	public TiposAnomaliaPOJO(Integer idTipoAnomalia, String nombreTipoAnomalia,
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
