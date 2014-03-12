package  com.SiGA.persistencia.pojo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.SiGA.common.constantes.ConstantesMapeoTablas;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 18/02/2013
 * @descripcion Clase de tipo POJO que mapea sus atributos con las columnas de la tabla SiGA_accionesPorAnomalia
 *
 */
@Entity
@Table(name = ConstantesMapeoTablas.SIGA_TABLA_ACCIONES_POR_ANOMALIA)
public class AccionesAnomaliaPOJO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3410482154804261883L;
	
	@Id
	@Column(name = "idAccionPorAnomalia", nullable = false, unique = true)
	private Integer idAccionPorAnomalia;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "noReporteAnomalia")
	private AnomaliasPOJO anomaliasPOJO;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "idAccion")
	private AccionesPOJO accionesPOJO;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "idUsuario")
	private UsuariosPOJO usuariosPOJO;
	
	/**
	 * Constructor de la clase.
	 */
	public AccionesAnomaliaPOJO() {
		
	}

	public AccionesAnomaliaPOJO(Integer idAccionPorAnomalia,
			AnomaliasPOJO anomaliasPOJO, AccionesPOJO accionesPOJO,
			UsuariosPOJO usuariosPOJO) {
		super();
		this.idAccionPorAnomalia = idAccionPorAnomalia;
		this.anomaliasPOJO = anomaliasPOJO;
		this.accionesPOJO = accionesPOJO;
		this.usuariosPOJO = usuariosPOJO;
	}

	/**
	 * @return the idAccionPorAnomalia
	 */
	public Integer getIdAccionPorAnomalia() {
		return idAccionPorAnomalia;
	}

	/**
	 * @param idAccionPorAnomalia the idAccionPorAnomalia to set
	 */
	public void setIdAccionPorAnomalia(Integer idAccionPorAnomalia) {
		this.idAccionPorAnomalia = idAccionPorAnomalia;
	}

	/**
	 * @return the anomaliasPOJO
	 */
	public AnomaliasPOJO getAnomaliasPOJO() {
		return anomaliasPOJO;
	}

	/**
	 * @param anomaliasPOJO the anomaliasPOJO to set
	 */
	public void setAnomaliasPOJO(AnomaliasPOJO anomaliasPOJO) {
		this.anomaliasPOJO = anomaliasPOJO;
	}

	/**
	 * @return the accionesPOJO
	 */
	public AccionesPOJO getAccionesPOJO() {
		return accionesPOJO;
	}

	/**
	 * @param accionesPOJO the accionesPOJO to set
	 */
	public void setAccionesPOJO(AccionesPOJO accionesPOJO) {
		this.accionesPOJO = accionesPOJO;
	}

	/**
	 * @return the usuariosPOJO
	 */
	public UsuariosPOJO getUsuariosPOJO() {
		return usuariosPOJO;
	}

	/**
	 * @param usuariosPOJO the usuariosPOJO to set
	 */
	public void setUsuariosPOJO(UsuariosPOJO usuariosPOJO) {
		this.usuariosPOJO = usuariosPOJO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccionesAnomalia [idAccionPorAnomalia=" + idAccionPorAnomalia
				+ ", anomaliasPOJO=" + anomaliasPOJO + ", accionesPOJO="
				+ accionesPOJO + ", usuariosPOJO=" + usuariosPOJO + "]";
	}
	
		
}
