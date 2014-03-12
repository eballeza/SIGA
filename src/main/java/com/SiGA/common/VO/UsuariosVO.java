package  com.SiGA.common.VO;

import java.util.Calendar;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 15/02/2013
 * @descripcion Clase de tipo VO que mapea sus atributos con las columnas de la tabla SiGA_usuarios
 *
 */
public class UsuariosVO {

	
	private Integer idUsuario;
	
	
	private TiposUsuarioVO tiposUsuarioVO;
	
	
	private EstatusVO estatusVO;
	
	
	private String nombreUsuario;
	
	
	private String telefonoUsuario;
	
	
	private String extensionUsuario;
	
	
	private String emailUsuario;
	
	
	private Calendar fechaCreacionUsuario;
	
	
	private EmpresasVO empresasVO;
	
	/**
	 * Constructor de la clase.
	 */
	public UsuariosVO() {
		// TODO Auto-generated constructor stub
	}

	public UsuariosVO(Integer idUsuario, TiposUsuarioVO tiposUsuarioVO,
			EstatusVO estatusVO, String nombreUsuario, String telefonoUsuario,
			String extensionUsuario, String emailUsuario,
			Calendar fechaCreacionUsuario, EmpresasVO empresasVO) {
		super();
		this.idUsuario = idUsuario;
		this.tiposUsuarioVO = tiposUsuarioVO;
		this.estatusVO = estatusVO;
		this.nombreUsuario = nombreUsuario;
		this.telefonoUsuario = telefonoUsuario;
		this.extensionUsuario = extensionUsuario;
		this.emailUsuario = emailUsuario;
		this.fechaCreacionUsuario = fechaCreacionUsuario;
		this.empresasVO = empresasVO;
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
	 * @return the tiposUsuarioVO
	 */
	public TiposUsuarioVO getTiposUsuarioVO() {
		return tiposUsuarioVO;
	}

	/**
	 * @param tiposUsuarioVO the tiposUsuarioVO to set
	 */
	public void setTiposUsuarioVO(TiposUsuarioVO tiposUsuarioVO) {
		this.tiposUsuarioVO = tiposUsuarioVO;
	}

	/**
	 * @return the estatusVO
	 */
	public EstatusVO getEstatusVO() {
		return estatusVO;
	}

	/**
	 * @param estatusVO the estatusVO to set
	 */
	public void setEstatusVO(EstatusVO estatusVO) {
		this.estatusVO = estatusVO;
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
	 * @return the empresasVO
	 */
	public EmpresasVO getEmpresasVO() {
		return empresasVO;
	}

	/**
	 * @param empresasVO the empresasVO to set
	 */
	public void setEmpresasVO(EmpresasVO empresasVO) {
		this.empresasVO = empresasVO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UsuariosVO [idUsuario=" + idUsuario + ", tiposUsuarioVO="
				+ tiposUsuarioVO + ", estatusVO=" + estatusVO
				+ ", nombreUsuario=" + nombreUsuario + ", telefonoUsuario="
				+ telefonoUsuario + ", extensionUsuario=" + extensionUsuario
				+ ", emailUsuario=" + emailUsuario + ", fechaCreacionUsuario="
				+ fechaCreacionUsuario + ", empresasVO=" + empresasVO + "]";
	}
		
}
