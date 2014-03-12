package  com.SiGA.common.VO;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 15/02/2013
 * @descripcion Clase de tipo VO que mapea sus atributos con las columnas de la tabla SiGA_tiposUsuario
 *
 */
public class TiposUsuarioVO {

	
	
	private Integer idTipoUsuario;
	
	
	private String nombreTipoUsuario;
	
	
	private String descripcionTipoUSuario;
	
	/**
	 * 
	 */
	public TiposUsuarioVO() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param idTipoUsuario
	 * @param nombreTipoUsuario
	 * @param descripcionTipoUSuario
	 */
	public TiposUsuarioVO(Integer idTipoUsuario, String nombreTipoUsuario,
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

	
	@Override
	public String toString() {
		return "TiposUsuarioPOJO [idTipoUsuario=" + idTipoUsuario
				+ ", nombreTipoUsuario=" + nombreTipoUsuario
				+ ", descripcionTipoUSuario=" + descripcionTipoUSuario + "]";
	}
	
	
}
