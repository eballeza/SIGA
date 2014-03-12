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
 * @descripcion Clase de tipo POJO que mapea sus atributos con las columnas de la tabla SiGA_tiposUsuario
 *
 */
@Entity
@Table(name = ConstantesMapeoTablas.SIGA_TABLA_TIPOS_USUARIO)
public class TiposUsuarioPOJO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7907823211822556082L;
	
	@Id
	@Column(name = "idTipoUsuario", unique = true, nullable = false )
	private Integer idTipoUsuario;
	
	@Column(name = "nombreTipoUsuario", unique = false, nullable = true )
	private String nombreTipoUsuario;
	
	@Column(name = "descripcionTipoUSuario", unique = false, nullable = true )
	private String descripcionTipoUSuario;
	
	/**
	 * 
	 */
	public TiposUsuarioPOJO() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param idTipoUsuario
	 * @param nombreTipoUsuario
	 * @param descripcionTipoUSuario
	 */
	public TiposUsuarioPOJO(Integer idTipoUsuario, String nombreTipoUsuario,
			String descripcionTipoUSuario) {
		super();
		this.idTipoUsuario = idTipoUsuario;
		this.nombreTipoUsuario = nombreTipoUsuario;
		this.descripcionTipoUSuario = descripcionTipoUSuario;
	}

	public Integer getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public void setIdTipoUsuario(Integer idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	public String getNombreTipoUsuario() {
		return nombreTipoUsuario;
	}

	public void setNombreTipoUsuario(String nombreTipoUsuario) {
		this.nombreTipoUsuario = nombreTipoUsuario;
	}

	public String getDescripcionTipoUSuario() {
		return descripcionTipoUSuario;
	}

	public void setDescripcionTipoUSuario(String descripcionTipoUSuario) {
		this.descripcionTipoUSuario = descripcionTipoUSuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "TiposUsuarioPOJO [idTipoUsuario=" + idTipoUsuario
				+ ", nombreTipoUsuario=" + nombreTipoUsuario
				+ ", descripcionTipoUSuario=" + descripcionTipoUSuario + "]";
	}
		
}
