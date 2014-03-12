package  com.SiGA.persistencia.pojo;

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
 * @fecha 7/01/2013
 * @descripcion Clase de tipo POJO que mapea sus atributos con las columnas de la tabla SiGA_empresas
 *
 */
@Entity
@Table(name = ConstantesMapeoTablas.SIGA_TABLA_EMPRESA)
public class EmpresasPOJO {

	@Id
	@Column(name = "idEmpresa", nullable = false, unique = true)
	private Integer idEmpresa;
	
	@Column(name = "nombreEmpresa", nullable = false, unique = false, length = 50)
	private String nombreEmpresa;
	
	@Column(name = "telefonoEmpresa", nullable = true, unique = false, length = 50)
	private String telefonoEmpresa;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaCreacionEmpresa",  nullable = false, unique = false)
	private Calendar fechaCreacionEmpresa;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "idEstatus")
	private EstatusPOJO estatusPOJO;
	/**
	 * 
	 */
	public EmpresasPOJO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idEmpresa
	 * @param nombreEmpresa
	 * @param telefonoEmpresa
	 * @param fechaCreacionEmpresa
	 */
	public EmpresasPOJO(Integer idEmpresa, String nombreEmpresa,
			String telefonoEmpresa, Calendar fechaCreacionEmpresa) {
		super();
		this.idEmpresa = idEmpresa;
		this.nombreEmpresa = nombreEmpresa;
		this.telefonoEmpresa = telefonoEmpresa;
		this.fechaCreacionEmpresa = fechaCreacionEmpresa;
	}

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getTelefonoEmpresa() {
		return telefonoEmpresa;
	}

	public void setTelefonoEmpresa(String telefonoEmpresa) {
		this.telefonoEmpresa = telefonoEmpresa;
	}

	public Calendar getFechaCreacionEmpresa() {
		return fechaCreacionEmpresa;
	}

	public void setFechaCreacionEmpresa(Calendar fechaCreacionEmpresa) {
		this.fechaCreacionEmpresa = fechaCreacionEmpresa;
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

	@Override
	public String toString() {
		return "EmpresaPOJO [idEmpresa=" + idEmpresa + ", nombreEmpresa="
				+ nombreEmpresa + ", telefonoEmpresa=" + telefonoEmpresa
				+ ", fechaCreacionEmpresa=" + fechaCreacionEmpresa + "]";
	}
	
	
}
