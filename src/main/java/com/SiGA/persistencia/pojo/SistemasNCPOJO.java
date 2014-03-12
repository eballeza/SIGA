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
@Table(name = ConstantesMapeoTablas.SIGA_TABLA_SISTEMAS_NC)
public class SistemasNCPOJO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7842616689267545108L;

	@Id
	@Column(name = "idSistemaNC", nullable = false, unique = true )
	private Integer idSistemaNC;
	
	@Column(name = "nombreSistemaNC", nullable = false, unique = false, length = 50)
	private String nombreSistemaNC;
	
	@Column(name = "areaSistemaNC", nullable = false, unique = false, length = 50)
	private String areaSistemaNC;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaCreacionSistemaNC",  nullable = false, unique = false)
	private Calendar fechaCreacionSistemaNC;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "idEstatus")
	private EstatusPOJO estatusPOJO;
	
	/**
	 * 
	 */
	public SistemasNCPOJO() {
		
	}

	public SistemasNCPOJO(Integer idSistemaNC, String nombreSistenaNC,
			String areaSistemaNC, Calendar fechaCreacionSistemaNC,
			EstatusPOJO estatusPOJO) {
		super();
		this.idSistemaNC = idSistemaNC;
		this.nombreSistemaNC = nombreSistenaNC;
		this.areaSistemaNC = areaSistemaNC;
		this.fechaCreacionSistemaNC = fechaCreacionSistemaNC;
		this.estatusPOJO = estatusPOJO;
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
	 * @return the nombreSistenaNC
	 */
	public String getNombreSistenaNC() {
		return nombreSistemaNC;
	}

	/**
	 * @param nombreSistenaNC the nombreSistenaNC to set
	 */
	public void setNombreSistenaNC(String nombreSistenaNC) {
		this.nombreSistemaNC = nombreSistenaNC;
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
		return "SistemasNCPOJO [idSistemaNC=" + idSistemaNC
				+ ", nombreSistenaNC=" + nombreSistemaNC + ", areaSistemaNC="
				+ areaSistemaNC + ", fechaCreacionSistemaNC="
				+ fechaCreacionSistemaNC + ", estatusPOJO=" + estatusPOJO + "]";
	}
	
	

}
