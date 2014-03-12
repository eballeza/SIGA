package  com.SiGA.common.VO;

import java.util.Calendar;


/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 18/02/2013
 * @descripcion Clase de tipo VO que mapea sus atributos con las columnas de la tabla SiGA_modulosNC
 *
 */
public class ModulosNCVO {

		
	private Integer idModuloNC;
	
	
	private String nombreModuloNC;
	
	
	private String descripcionModuloNC;
	
	
	private Calendar fechaCreacionModuloNC;
	
	
	private SistemasNCVO sistemasNCVO;
	
	
	private EstatusVO estatusVO;
	
	/**
	 * 
	 */
	public ModulosNCVO() {
	
	}

	public ModulosNCVO(Integer idModuloNC, String nombreModuloNC,
			String descripcionModuloNC, Calendar fechaCreacionModuloNC,
			SistemasNCVO sistemasNCVO, EstatusVO estatusVO) {
		super();
		this.idModuloNC = idModuloNC;
		this.nombreModuloNC = nombreModuloNC;
		this.descripcionModuloNC = descripcionModuloNC;
		this.fechaCreacionModuloNC = fechaCreacionModuloNC;
		this.sistemasNCVO = sistemasNCVO;
		this.estatusVO = estatusVO;
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
	 * @return the sistemasNCVO
	 */
	public SistemasNCVO getSistemasNCVO() {
		return sistemasNCVO;
	}

	/**
	 * @param sistemasNCVO the sistemasNCVO to set
	 */
	public void setSistemasNCVO(SistemasNCVO sistemasNCVO) {
		this.sistemasNCVO = sistemasNCVO;
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
		return "ModulosNCVO [idModuloNC=" + idModuloNC + ", nombreModuloNC="
				+ nombreModuloNC + ", descripcionModuloNC="
				+ descripcionModuloNC + ", fechaCreacionModuloNC="
				+ fechaCreacionModuloNC + ", sistemasNCVO=" + sistemasNCVO
				+ ", estatusVO=" + estatusVO + "]";
	}
	
	
}
