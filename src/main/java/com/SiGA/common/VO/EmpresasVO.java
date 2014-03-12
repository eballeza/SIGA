package  com.SiGA.common.VO;

import java.util.Calendar;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 15/02/2013
 * @descripcion Clase de tipo VO que mapea sus atributos con las columnas de la tabla SiGA_empresas
 *
 */
public class EmpresasVO {

	
	private Integer idEmpresa;
	
	
	private String nombreEmpresa;
	
	
	private String telefonoEmpresa;
	
	
	private Calendar fechaCreacionEmpresa;
	
	
	private EstatusVO estatusVO;
	/**
	 * 
	 */
	public EmpresasVO() {
		// TODO Auto-generated constructor stub
	}
	public EmpresasVO(Integer idEmpresa, String nombreEmpresa,
			String telefonoEmpresa, Calendar fechaCreacionEmpresa,
			EstatusVO estatusVO) {
		super();
		this.idEmpresa = idEmpresa;
		this.nombreEmpresa = nombreEmpresa;
		this.telefonoEmpresa = telefonoEmpresa;
		this.fechaCreacionEmpresa = fechaCreacionEmpresa;
		this.estatusVO = estatusVO;
	}
	/**
	 * @return the idEmpresa
	 */
	public Integer getIdEmpresa() {
		return idEmpresa;
	}
	/**
	 * @param idEmpresa the idEmpresa to set
	 */
	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	/**
	 * @return the telefonoEmpresa
	 */
	public String getTelefonoEmpresa() {
		return telefonoEmpresa;
	}
	/**
	 * @param telefonoEmpresa the telefonoEmpresa to set
	 */
	public void setTelefonoEmpresa(String telefonoEmpresa) {
		this.telefonoEmpresa = telefonoEmpresa;
	}
	/**
	 * @return the fechaCreacionEmpresa
	 */
	public Calendar getFechaCreacionEmpresa() {
		return fechaCreacionEmpresa;
	}
	/**
	 * @param fechaCreacionEmpresa the fechaCreacionEmpresa to set
	 */
	public void setFechaCreacionEmpresa(Calendar fechaCreacionEmpresa) {
		this.fechaCreacionEmpresa = fechaCreacionEmpresa;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmpresasVO [idEmpresa=" + idEmpresa + ", nombreEmpresa="
				+ nombreEmpresa + ", telefonoEmpresa=" + telefonoEmpresa
				+ ", fechaCreacionEmpresa=" + fechaCreacionEmpresa
				+ ", estatusVO=" + estatusVO + "]";
	}

	
}
