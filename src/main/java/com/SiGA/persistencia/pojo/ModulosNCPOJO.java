package  com.SiGA.persistencia.pojo;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.SiGA.common.constantes.ConstantesMapeoTablas;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 9/01/2013
 * @descripcion Clase de tipo POJO que mapea sus atributos con las columnas de la tabla SiGA_sistemasNC
 *
 */
@Entity
@Table(name = ConstantesMapeoTablas.SIGA_TABLA_MODULOS_NC)
public class ModulosNCPOJO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1770942053578717005L;

	@Id
	@Column(name = "idModuloNC", nullable = false, unique = true)
	private Integer idModuloNC;
	
	@Column(name = "nombreModuloNC", nullable = false, unique = false, length = 50)
	private String nombreModuloNC;
	
	@Column(name = "descripcionModuloNC", nullable = true, unique = false, length = 200)
	private String descripcionModuloNC;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaCreacionModuloNC", nullable = false)
	private Calendar fechaCreacionModuloNC;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "idSistemaNC")
	private SistemasNCPOJO sistemasNCPOJO;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "idEstatus")
	private EstatusPOJO estatusPOJO;
	
	/**
	 * 
	 */
	public ModulosNCPOJO() {
	
	}

	public ModulosNCPOJO(Integer idModuloNC, String nombreModuloNC,
			String descripcionModuloNC, Calendar fechaCreacionModuloNC,
			SistemasNCPOJO sistemasNCPOJO, EstatusPOJO estatusPOJO) {
		super();
		this.idModuloNC = idModuloNC;
		this.nombreModuloNC = nombreModuloNC;
		this.descripcionModuloNC = descripcionModuloNC;
		this.fechaCreacionModuloNC = fechaCreacionModuloNC;
		this.sistemasNCPOJO = sistemasNCPOJO;
		this.estatusPOJO = estatusPOJO;
	}

	/**
	 * @return the idModuloNC
	 */
	public Integer getIdModuloNC() {
		return idModuloNC;
	}

	/**
	 * @param idModuloNC the idModuloNC to set
	 */
	public void setIdModuloNC(Integer idModuloNC) {
		this.idModuloNC = idModuloNC;
	}

	/**
	 * @return the nombreModuloNC
	 */
	public String getNombreModuloNC() {
		return nombreModuloNC;
	}

	/**
	 * @param nombreModuloNC the nombreModuloNC to set
	 */
	public void setNombreModuloNC(String nombreModuloNC) {
		this.nombreModuloNC = nombreModuloNC;
	}

	/**
	 * @return the descripcionModuloNC
	 */
	public String getDescripcionModuloNC() {
		return descripcionModuloNC;
	}

	/**
	 * @param descripcionModuloNC the descripcionModuloNC to set
	 */
	public void setDescripcionModuloNC(String descripcionModuloNC) {
		this.descripcionModuloNC = descripcionModuloNC;
	}

	/**
	 * @return the fechaCreacionModuloNC
	 */
	public Calendar getFechaCreacionModuloNC() {
		return fechaCreacionModuloNC;
	}

	/**
	 * @param fechaCreacionModuloNC the fechaCreacionModuloNC to set
	 */
	public void setFechaCreacionModuloNC(Calendar fechaCreacionModuloNC) {
		this.fechaCreacionModuloNC = fechaCreacionModuloNC;
	}

	/**
	 * @return the sistemasNCPOJO
	 */
	public SistemasNCPOJO getSistemasNCPOJO() {
		return sistemasNCPOJO;
	}

	/**
	 * @param sistemasNCPOJO the sistemasNCPOJO to set
	 */
	public void setSistemasNCPOJO(SistemasNCPOJO sistemasNCPOJO) {
		this.sistemasNCPOJO = sistemasNCPOJO;
	}

	/**
	 * @return the estatusPOJO
	 */
	public EstatusPOJO getEstatusPOJO() {
		return estatusPOJO;
	}

	/**
	 * @param estatusPOJO the estatusPOJO to set
	 */
	public void setEstatusPOJO(EstatusPOJO estatusPOJO) {
		this.estatusPOJO = estatusPOJO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ModulosNCPOJO [idModuloNC=" + idModuloNC + ", nombreModuloNC="
				+ nombreModuloNC + ", descripcionModuloNC="
				+ descripcionModuloNC + ", fechaCreacionModuloNC="
				+ fechaCreacionModuloNC + ", sistemasNCPOJO=" + sistemasNCPOJO
				+ ", estatusPOJO=" + estatusPOJO + "]";
	}
	

}
