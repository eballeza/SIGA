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
 * @fecha 14/02/2013
 * @descripcion Clase de tipo POJO que mapea sus atributos con las columnas de la tabla SiGA_estatusAnomalia
 *
 */
@Entity
@Table(name = ConstantesMapeoTablas.SIGA_TABLA_ANOMALIAS)
public class AnomaliasPOJO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4022485099745972905L;
	
	@Id
	@Column(name = "noReporteAnomalia", nullable = false, unique = true)
	private Integer noReporteAnomalia;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "idEstatusAnomalia")
	private EstatusAnomaliaPOJO estatusAnomaliaPOJO;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "idUsuarioReporta")
	private UsuariosPOJO usuariosPOJO_Reporta;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "idUsuarioCliente")
	private UsuariosPOJO usuariosPOJO_Cliente;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "idSistemaNC")
	private SistemasNCPOJO sistemasNCPOJO;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "idModuloNC")
	private ModulosNCPOJO modulosNCPOJO;
	
	@Column(name = "urlAnomalia", nullable = true, unique = false, length = 150)
	private String urlAnomalia;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaInicioAnomalia", nullable = true, unique = false)
	private Calendar fechaInicioAnomalia;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaReporteAnomalia", nullable = false, unique = false)
	private Calendar fechaReporteAnomalia;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaCierreAnomalia", nullable = true, unique = false)
	private Calendar fechaCierreAnomalia;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "idSeveridadAnomalia")
	private SeveridadesAnomaliaPOJO severidadesAnomaliaPOJO;
	
	@Column(name = "descripcionAnomalia", nullable = false, unique = false, length = 500)	
	private String descripcionAnomalia;
	
	@Column(name = "noReporteCliente", nullable = true, unique = false, length = 50)
	private String noReporteCliente;
	
	@Column(name = "noReporteNC", nullable = true, unique = false, length = 50)
	private String noReporteNC;
	
	@Column(name = "pasosReproduccionAnomalia", nullable = true, unique = false, length = 500)
	private String pasosReproduccionAnomalia;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "idTipoAnomalia")
	private TiposAnomaliaPOJO tiposAnomaliaPOJO;
	
	/**
	 * Constructor de la clase.
	 */
	public AnomaliasPOJO() {
		// TODO Auto-generated constructor stub
	}

	public AnomaliasPOJO(Integer noReporteAnomalia,
			EstatusAnomaliaPOJO estatusAnomaliaPOJO,
			UsuariosPOJO usuariosPOJO_Reporta,
			UsuariosPOJO usuariosPOJO_Cliente, SistemasNCPOJO sistemasNCPOJO,
			ModulosNCPOJO modulosNCPOJO, String urlAnomalia,
			Calendar fechaInicioAnomalia, Calendar fechaReporteAnomalia,
			Calendar fechaCierreAnomalia,
			SeveridadesAnomaliaPOJO severidadesAnomaliaPOJO,
			String descripcionAnomalia, String noReporteCliente,
			String noReporteNC, String pasosReporduccionAnomalia,
			TiposAnomaliaPOJO tiposAnomaliaPOJO) {
		super();
		this.noReporteAnomalia = noReporteAnomalia;
		this.estatusAnomaliaPOJO = estatusAnomaliaPOJO;
		this.usuariosPOJO_Reporta = usuariosPOJO_Reporta;
		this.usuariosPOJO_Cliente = usuariosPOJO_Cliente;
		this.sistemasNCPOJO = sistemasNCPOJO;
		this.modulosNCPOJO = modulosNCPOJO;
		this.urlAnomalia = urlAnomalia;
		this.fechaInicioAnomalia = fechaInicioAnomalia;
		this.fechaReporteAnomalia = fechaReporteAnomalia;
		this.fechaCierreAnomalia = fechaCierreAnomalia;
		this.severidadesAnomaliaPOJO = severidadesAnomaliaPOJO;
		this.descripcionAnomalia = descripcionAnomalia;
		this.noReporteCliente = noReporteCliente;
		this.noReporteNC = noReporteNC;
		this.pasosReproduccionAnomalia = pasosReporduccionAnomalia;
		this.tiposAnomaliaPOJO = tiposAnomaliaPOJO;
	}

	/**
	 * @return the noReporteAnomalia
	 */
	public Integer getNoReporteAnomalia() {
		return noReporteAnomalia;
	}

	/**
	 * @param noReporteAnomalia the noReporteAnomalia to set
	 */
	public void setNoReporteAnomalia(Integer noReporteAnomalia) {
		this.noReporteAnomalia = noReporteAnomalia;
	}

	/**
	 * @return the estatusAnomaliaPOJO
	 */
	public EstatusAnomaliaPOJO getEstatusAnomaliaPOJO() {
		return estatusAnomaliaPOJO;
	}

	/**
	 * @param estatusAnomaliaPOJO the estatusAnomaliaPOJO to set
	 */
	public void setEstatusAnomaliaPOJO(EstatusAnomaliaPOJO estatusAnomaliaPOJO) {
		this.estatusAnomaliaPOJO = estatusAnomaliaPOJO;
	}

	/**
	 * @return the usuariosPOJO_Reporta
	 */
	public UsuariosPOJO getUsuariosPOJO_Reporta() {
		return usuariosPOJO_Reporta;
	}

	/**
	 * @param usuariosPOJO_Reporta the usuariosPOJO_Reporta to set
	 */
	public void setUsuariosPOJO_Reporta(UsuariosPOJO usuariosPOJO_Reporta) {
		this.usuariosPOJO_Reporta = usuariosPOJO_Reporta;
	}

	/**
	 * @return the usuariosPOJO_Cliente
	 */
	public UsuariosPOJO getUsuariosPOJO_Cliente() {
		return usuariosPOJO_Cliente;
	}

	/**
	 * @param usuariosPOJO_Cliente the usuariosPOJO_Cliente to set
	 */
	public void setUsuariosPOJO_Cliente(UsuariosPOJO usuariosPOJO_Cliente) {
		this.usuariosPOJO_Cliente = usuariosPOJO_Cliente;
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
	 * @return the modulosNCPOJO
	 */
	public ModulosNCPOJO getModulosNCPOJO() {
		return modulosNCPOJO;
	}

	/**
	 * @param modulosNCPOJO the modulosNCPOJO to set
	 */
	public void setModulosNCPOJO(ModulosNCPOJO modulosNCPOJO) {
		this.modulosNCPOJO = modulosNCPOJO;
	}

	/**
	 * @return the urlAnomalia
	 */
	public String getUrlAnomalia() {
		return urlAnomalia;
	}

	/**
	 * @param urlAnomalia the urlAnomalia to set
	 */
	public void setUrlAnomalia(String urlAnomalia) {
		this.urlAnomalia = urlAnomalia;
	}

	/**
	 * @return the fechaInicioAnomalia
	 */
	public Calendar getFechaInicioAnomalia() {
		return fechaInicioAnomalia;
	}

	/**
	 * @param fechaInicioAnomalia the fechaInicioAnomalia to set
	 */
	public void setFechaInicioAnomalia(Calendar fechaInicioAnomalia) {
		this.fechaInicioAnomalia = fechaInicioAnomalia;
	}

	/**
	 * @return the fechaReporteAnomalia
	 */
	public Calendar getFechaReporteAnomalia() {
		return fechaReporteAnomalia;
	}

	/**
	 * @param fechaReporteAnomalia the fechaReporteAnomalia to set
	 */
	public void setFechaReporteAnomalia(Calendar fechaReporteAnomalia) {
		this.fechaReporteAnomalia = fechaReporteAnomalia;
	}

	/**
	 * @return the fechaCierreAnomalia
	 */
	public Calendar getFechaCierreAnomalia() {
		return fechaCierreAnomalia;
	}

	/**
	 * @param fechaCierreAnomalia the fechaCierreAnomalia to set
	 */
	public void setFechaCierreAnomalia(Calendar fechaCierreAnomalia) {
		this.fechaCierreAnomalia = fechaCierreAnomalia;
	}

	/**
	 * @return the severidadesAnomaliaPOJO
	 */
	public SeveridadesAnomaliaPOJO getSeveridadesAnomaliaPOJO() {
		return severidadesAnomaliaPOJO;
	}

	/**
	 * @param severidadesAnomaliaPOJO the severidadesAnomaliaPOJO to set
	 */
	public void setSeveridadesAnomaliaPOJO(
			SeveridadesAnomaliaPOJO severidadesAnomaliaPOJO) {
		this.severidadesAnomaliaPOJO = severidadesAnomaliaPOJO;
	}

	/**
	 * @return the descripcionAnomalia
	 */
	public String getDescripcionAnomalia() {
		return descripcionAnomalia;
	}

	/**
	 * @param descripcionAnomalia the descripcionAnomalia to set
	 */
	public void setDescripcionAnomalia(String descripcionAnomalia) {
		this.descripcionAnomalia = descripcionAnomalia;
	}

	/**
	 * @return the noReporteCliente
	 */
	public String getNoReporteCliente() {
		return noReporteCliente;
	}

	/**
	 * @param noReporteCliente the noReporteCliente to set
	 */
	public void setNoReporteCliente(String noReporteCliente) {
		this.noReporteCliente = noReporteCliente;
	}

	/**
	 * @return the noReporteNC
	 */
	public String getNoReporteNC() {
		return noReporteNC;
	}

	/**
	 * @param noReporteNC the noReporteNC to set
	 */
	public void setNoReporteNC(String noReporteNC) {
		this.noReporteNC = noReporteNC;
	}

	/**
	 * @return the pasosReporduccionAnomalia
	 */
	public String getPasosReporduccionAnomalia() {
		return pasosReproduccionAnomalia;
	}

	/**
	 * @param pasosReporduccionAnomalia the pasosReporduccionAnomalia to set
	 */
	public void setPasosReporduccionAnomalia(String pasosReporduccionAnomalia) {
		this.pasosReproduccionAnomalia = pasosReporduccionAnomalia;
	}

	/**
	 * @return the tiposAnomaliaPOJO
	 */
	public TiposAnomaliaPOJO getTiposAnomaliaPOJO() {
		return tiposAnomaliaPOJO;
	}

	/**
	 * @param tiposAnomaliaPOJO the tiposAnomaliaPOJO to set
	 */
	public void setTiposAnomaliaPOJO(TiposAnomaliaPOJO tiposAnomaliaPOJO) {
		this.tiposAnomaliaPOJO = tiposAnomaliaPOJO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AnomaliasPOJO [noReporteAnomalia=" + noReporteAnomalia
				+ ", estatusAnomaliaPOJO=" + estatusAnomaliaPOJO
				+ ", usuariosPOJO_Reporta=" + usuariosPOJO_Reporta
				+ ", usuariosPOJO_Cliente=" + usuariosPOJO_Cliente
				+ ", sistemasNCPOJO=" + sistemasNCPOJO + ", modulosNCPOJO="
				+ modulosNCPOJO + ", urlAnomalia=" + urlAnomalia
				+ ", fechaInicioAnomalia=" + fechaInicioAnomalia
				+ ", fechaReporteAnomalia=" + fechaReporteAnomalia
				+ ", fechaCierreAnomalia=" + fechaCierreAnomalia
				+ ", severidadesAnomaliaPOJO=" + severidadesAnomaliaPOJO
				+ ", descripcionAnomalia=" + descripcionAnomalia
				+ ", noReporteCliente=" + noReporteCliente + ", noReporteNC="
				+ noReporteNC + ", pasosReporduccionAnomalia="
				+ pasosReproduccionAnomalia + ", tiposAnomaliaPOJO="
				+ tiposAnomaliaPOJO + "]";
	}
	
	
		

}
