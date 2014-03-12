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
 * @descripcion Clase de tipo POJO que mapea sus atributos con las columnas de la tabla SiGA_usuarios
 *
 */
@Entity
@Table(name = ConstantesMapeoTablas.SIGA_TABLA_USUARIOS)
public class UsuariosPOJO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 984709718392196272L;

	@Id
	@Column(name = "idUsuario", nullable = false, unique = true)
	private Integer idUsuario;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "idTipoUsuario")
	private TiposUsuarioPOJO tiposUsuarioPOJO;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "idEstatus")
	private EstatusPOJO estatusPOJO;
	
	@Column(name = "nombreUsuario",  nullable = false, unique = false, length = 100)
	private String nombreUsuario;
	
	@Column(name = "telefonoUsuario", nullable = true, unique = false, length = 50)
	private String telefonoUsuario;
	
	@Column(name = "extensionUsuario", nullable = true, unique = false, length = 10)
	private String extensionUsuario;
	
	@Column(name = "emailUsuario", nullable = true, unique = false, length = 100)
	private String emailUsuario;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaCreacionUsuario", nullable = false)
	private Calendar fechaCreacionUsuario;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "idEmpresa")
	private EmpresasPOJO empresasPOJO;
	
	/**
	 * Constructor de la clase.
	 */
	public UsuariosPOJO() {
		// TODO Auto-generated constructor stub
	}

	public UsuariosPOJO(Integer idUsuario, TiposUsuarioPOJO tiposUsuarioPOJO,
			EstatusPOJO estatusPOJO, String nombreUsuario,
			String telefonoUsuario, String extensionUsuario,
			String emailUsuario, Calendar fechaCreacionUsuario,
			EmpresasPOJO empresasPOJO) {
		super();
		this.idUsuario = idUsuario;
		this.tiposUsuarioPOJO = tiposUsuarioPOJO;
		this.estatusPOJO = estatusPOJO;
		this.nombreUsuario = nombreUsuario;
		this.telefonoUsuario = telefonoUsuario;
		this.extensionUsuario = extensionUsuario;
		this.emailUsuario = emailUsuario;
		this.fechaCreacionUsuario = fechaCreacionUsuario;
		this.empresasPOJO = empresasPOJO;
	}

	/**
	 * @return the idUsuario
	 */
	public Integer getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * @return the tiposUsuarioPOJO
	 */
	public TiposUsuarioPOJO getTiposUsuarioPOJO() {
		return tiposUsuarioPOJO;
	}

	/**
	 * @param tiposUsuarioPOJO the tiposUsuarioPOJO to set
	 */
	public void setTiposUsuarioPOJO(TiposUsuarioPOJO tiposUsuarioPOJO) {
		this.tiposUsuarioPOJO = tiposUsuarioPOJO;
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

	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * @return the telefonoUsuario
	 */
	public String getTelefonoUsuario() {
		return telefonoUsuario;
	}

	/**
	 * @param telefonoUsuario the telefonoUsuario to set
	 */
	public void setTelefonoUsuario(String telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}

	/**
	 * @return the extensionUsuario
	 */
	public String getExtensionUsuario() {
		return extensionUsuario;
	}

	/**
	 * @param extensionUsuario the extensionUsuario to set
	 */
	public void setExtensionUsuario(String extensionUsuario) {
		this.extensionUsuario = extensionUsuario;
	}

	/**
	 * @return the emailUsuario
	 */
	public String getEmailUsuario() {
		return emailUsuario;
	}

	/**
	 * @param emailUsuario the emailUsuario to set
	 */
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	/**
	 * @return the fechaCreacionUsuario
	 */
	public Calendar getFechaCreacionUsuario() {
		return fechaCreacionUsuario;
	}

	/**
	 * @param fechaCreacionUsuario the fechaCreacionUsuario to set
	 */
	public void setFechaCreacionUsuario(Calendar fechaCreacionUsuario) {
		this.fechaCreacionUsuario = fechaCreacionUsuario;
	}

	/**
	 * @return the empresasPOJO
	 */
	public EmpresasPOJO getEmpresasPOJO() {
		return empresasPOJO;
	}

	/**
	 * @param empresasPOJO the empresasPOJO to set
	 */
	public void setEmpresasPOJO(EmpresasPOJO empresasPOJO) {
		this.empresasPOJO = empresasPOJO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UsuariosPOJO [idUsuario=" + idUsuario + ", tiposUsuarioPOJO="
				+ tiposUsuarioPOJO + ", estatusPOJO=" + estatusPOJO
				+ ", nombreUsuario=" + nombreUsuario + ", telefonoUsuario="
				+ telefonoUsuario + ", extensionUsuario=" + extensionUsuario
				+ ", emailUsuario=" + emailUsuario + ", fechaCreacionUsuario="
				+ fechaCreacionUsuario + ", empresasPOJO=" + empresasPOJO + "]";
	}
	
	
}
