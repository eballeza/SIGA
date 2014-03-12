package  com.SiGA.common.VO;



public class AccionesAnomaliaVO {

	private Integer idAccionPorAnomalia;
	private AnomaliasVO anomaliasVO;
	private AccionesVO accionesVO;
	private UsuariosVO usuariosVO;
	
	public AccionesAnomaliaVO() {
		// TODO Auto-generated constructor stub
	}

	public AccionesAnomaliaVO(Integer idAccionPorAnomalia,
			AnomaliasVO anomaliasVO, AccionesVO accionesVO,
			UsuariosVO usuariosVO) {
		super();
		this.idAccionPorAnomalia = idAccionPorAnomalia;
		this.anomaliasVO = anomaliasVO;
		this.accionesVO = accionesVO;
		this.usuariosVO = usuariosVO;
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
	 * @return the anomaliasVO
	 */
	public AnomaliasVO getAnomaliasVO() {
		return anomaliasVO;
	}

	/**
	 * @param anomaliasVO the anomaliasVO to set
	 */
	public void setAnomaliasVO(AnomaliasVO anomaliasVO) {
		this.anomaliasVO = anomaliasVO;
	}

	/**
	 * @return the accionesVO
	 */
	public AccionesVO getAccionesVO() {
		return accionesVO;
	}

	/**
	 * @param accionesVO the accionesVO to set
	 */
	public void setAccionesVO(AccionesVO accionesVO) {
		this.accionesVO = accionesVO;
	}

	/**
	 * @return the usuariosVO
	 */
	public UsuariosVO getUsuariosVO() {
		return usuariosVO;
	}

	/**
	 * @param usuariosVO the usuariosVO to set
	 */
	public void setUsuariosVO(UsuariosVO usuariosVO) {
		this.usuariosVO = usuariosVO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccionesAnomaliaVO [idAccionPorAnomalia=" + idAccionPorAnomalia
				+ ", anomaliasVO=" + anomaliasVO + ", accionesVO=" + accionesVO
				+ ", usuariosVO=" + usuariosVO + "]";
	}
		
}
