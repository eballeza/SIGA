package  com.SiGA.common.VO;

import java.util.Calendar;




/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 15/02/2013
 * @descripcion Clase de tipo VO que mapea sus atributos con las columnas de la tabla SiGA_anomalias
 *
 */
public class AnomaliasVO {
	
		
	private Integer noReporteAnomalia;
	
	
	private EstatusAnomaliaVO estatusAnomaliaVO;
	
	
	private UsuariosVO usuariosReportaVO;
	
	
	private UsuariosVO usuariosClienteVO;
	
	
	private SistemasNCVO sistemasNCVO;
	
	
	private ModulosNCVO modulosNCVO;
	
	
	private String urlAnomalia;
	
	
	private Calendar fechaInicioAnomalia;
	
	
	private Calendar fechaReporteAnomalia;
	
	
	private Calendar fechaCierreAnomalia;
	
	
	private SeveridadesAnomaliaVO severidadAnomaliaVO;
	
		
	private String descripcionAnomalia;
	
	
	private String noReporteCliente;
	
	
	private String noReporteNC;
	
	
	private String pasosReproduccionAnomalia;
	
	
	private TiposAnomaliaVO tiposAnomaliaVO;
	
	/**
	 * Constructor de la clase.
	 */
	public AnomaliasVO() {
		// TODO Auto-generated constructor stub
	}

	public AnomaliasVO(Integer noReporteAnomalia,
			EstatusAnomaliaVO estatusAnomaliaVO, UsuariosVO usuariosReportaVO,
			UsuariosVO usuariosClienteVO, SistemasNCVO sistemasNCVO,
			ModulosNCVO modulosNCVO, String urlAnomalia,
			Calendar fechaInicioAnomalia, Calendar fechaReporteAnomalia,
			Calendar fechaCierreAnomalia, SeveridadesAnomaliaVO seveAnomaliaVO,
			String descripcionAnomalia, String noReporteCliente,
			String noReporteNC, String pasosReproduccionAnomalia,
			TiposAnomaliaVO tiposAnomaliaVO) {
		super();
		this.noReporteAnomalia = noReporteAnomalia;
		this.estatusAnomaliaVO = estatusAnomaliaVO;
		this.usuariosReportaVO = usuariosReportaVO;
		this.usuariosClienteVO = usuariosClienteVO;
		this.sistemasNCVO = sistemasNCVO;
		this.modulosNCVO = modulosNCVO;
		this.urlAnomalia = urlAnomalia;
		this.fechaInicioAnomalia = fechaInicioAnomalia;
		this.fechaReporteAnomalia = fechaReporteAnomalia;
		this.fechaCierreAnomalia = fechaCierreAnomalia;
		this.severidadAnomaliaVO = seveAnomaliaVO;
		this.descripcionAnomalia = descripcionAnomalia;
		this.noReporteCliente = noReporteCliente;
		this.noReporteNC = noReporteNC;
		this.pasosReproduccionAnomalia = pasosReproduccionAnomalia;
		this.tiposAnomaliaVO = tiposAnomaliaVO;
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
	 * @return the estatusAnomaliaVO
	 */
	public EstatusAnomaliaVO getEstatusAnomaliaVO() {
		return estatusAnomaliaVO;
	}

	/**
	 * @param estatusAnomaliaVO the estatusAnomaliaVO to set
	 */
	public void setEstatusAnomaliaVO(EstatusAnomaliaVO estatusAnomaliaVO) {
		this.estatusAnomaliaVO = estatusAnomaliaVO;
	}

	/**
	 * @return the usuariosReportaVO
	 */
	public UsuariosVO getUsuariosReportaVO() {
		return usuariosReportaVO;
	}

	/**
	 * @param usuariosReportaVO the usuariosReportaVO to set
	 */
	public void setUsuariosReportaVO(UsuariosVO usuariosReportaVO) {
		this.usuariosReportaVO = usuariosReportaVO;
	}

	/**
	 * @return the usuariosClienteVO
	 */
	public UsuariosVO getUsuariosClienteVO() {
		return usuariosClienteVO;
	}

	/**
	 * @param usuariosClienteVO the usuariosClienteVO to set
	 */
	public void setUsuariosClienteVO(UsuariosVO usuariosClienteVO) {
		this.usuariosClienteVO = usuariosClienteVO;
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
	 * @return the modulosNCVO
	 */
	public ModulosNCVO getModulosNCVO() {
		return modulosNCVO;
	}

	/**
	 * @param modulosNCVO the modulosNCVO to set
	 */
	public void setModulosNCVO(ModulosNCVO modulosNCVO) {
		this.modulosNCVO = modulosNCVO;
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
		//return UtileriasFechas.devuelveCalendarEnTexto(fechaReporteAnomalia);
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
	 * @return the seveAnomaliaVO
	 */
	public SeveridadesAnomaliaVO getSeveridadAnomaliaVO() {
		return severidadAnomaliaVO;
	}

	/**
	 * @param seveAnomaliaVO the seveAnomaliaVO to set
	 */
	public void setSeveridadAnomaliaVO(SeveridadesAnomaliaVO seveAnomaliaVO) {
		this.severidadAnomaliaVO = seveAnomaliaVO;
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
	 * @return the pasosReproduccionAnomalia
	 */
	public String getPasosReproduccionAnomalia() {
		return pasosReproduccionAnomalia;
	}

	/**
	 * @param pasosReproduccionAnomalia the pasosReproduccionAnomalia to set
	 */
	public void setPasosReproduccionAnomalia(String pasosReproduccionAnomalia) {
		this.pasosReproduccionAnomalia = pasosReproduccionAnomalia;
	}

	/**
	 * @return the tiposAnomaliaVO
	 */
	public TiposAnomaliaVO getTiposAnomaliaVO() {
		return tiposAnomaliaVO;
	}

	/**
	 * @param tiposAnomaliaVO the tiposAnomaliaVO to set
	 */
	public void setTiposAnomaliaVO(TiposAnomaliaVO tiposAnomaliaVO) {
		this.tiposAnomaliaVO = tiposAnomaliaVO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AnomaliasVO [noReporteAnomalia=" + noReporteAnomalia
				+ ", estatusAnomaliaVO=" + estatusAnomaliaVO
				+ ", usuariosReportaVO=" + usuariosReportaVO
				+ ", usuariosClienteVO=" + usuariosClienteVO
				+ ", sistemasNCVO=" + sistemasNCVO + ", modulosNCVO="
				+ modulosNCVO + ", urlAnomalia=" + urlAnomalia
				+ ", fechaInicioAnomalia=" + fechaInicioAnomalia
				+ ", fechaReporteAnomalia=" + fechaReporteAnomalia
				+ ", fechaCierreAnomalia=" + fechaCierreAnomalia
				+ ", seveAnomaliaVO=" + severidadAnomaliaVO
				+ ", descripcionAnomalia=" + descripcionAnomalia
				+ ", noReporteCliente=" + noReporteCliente + ", noReporteNC="
				+ noReporteNC + ", pasosReproduccionAnomalia="
				+ pasosReproduccionAnomalia + ", tiposAnomaliaVO="
				+ tiposAnomaliaVO + "]";
	}
	
		
}
