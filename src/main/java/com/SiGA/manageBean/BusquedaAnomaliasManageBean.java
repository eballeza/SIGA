package com.SiGA.manageBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import com.SiGA.common.VO.AnomaliasVO;
import com.SiGA.common.VO.EmpresasVO;
import com.SiGA.common.VO.EstatusAnomaliaVO;
import com.SiGA.common.VO.SeveridadesAnomaliaVO;
import com.SiGA.common.VO.SistemasNCVO;
import com.SiGA.common.constantes.ConstantesManageBeans;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.common.utilerias.UtileriasFechas;
import com.SiGA.core.SpringUtil;
import com.SiGA.services.AnomaliasService;
import com.SiGA.services.EmpresasService;
import com.SiGA.services.EstatusAnomaliasService;
import com.SiGA.services.SeveridadesAnomaliaService;
import com.SiGA.services.SistemasNCService;
import com.SiGA.services.impl.AnomaliasServiceImpl;
import com.SiGA.services.impl.EmpresasServiceImpl;
import com.SiGA.services.impl.EstatusAnomaliasServiceImpl;
import com.SiGA.services.impl.SeveridadesAnomaliaServiceImpl;
import com.SiGA.services.impl.SistemasNCServiceImpl;

@ManagedBean(name = ConstantesManageBeans.MANAGE_BEAN_BUSQUEDA_ANOMALIAS)
@ViewScoped
// @ApplicationScoped
// @RequestScoped
public class BusquedaAnomaliasManageBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1955257440354260445L;

	/** Utilizado para llenar el combo de estatus */
	private List<SelectItem> comboBoxEstatusAnomalia;
	private List<EstatusAnomaliaVO> lstEstatusAnomaliaVOs;
	private EstatusAnomaliaVO selectedEstatusAnomaliaVO;

	/** Utilizado para llenar el combo de empresa */
	private List<SelectItem> comboBoxSistemasNC;
	private List<SistemasNCVO> lstSistemasNCVOs;
	private SistemasNCVO selectedSistemasNCVO;

	/** Utilizado para llenar el combo de fechas Inicio */
	private List<SelectItem> comboBoxFechasI;
	private List<AnomaliasVO> lstFechasIVOs;
	private Calendar selectedFechasIVO;

	public List<SelectItem> getComboBoxSistemasNC() {
		return comboBoxSistemasNC;
	}

	public void setComboBoxSistemasNC(List<SelectItem> comboBoxSistemasNC) {
		this.comboBoxSistemasNC = comboBoxSistemasNC;
	}

	public List<SistemasNCVO> getLstSistemasNCVOs() {
		return lstSistemasNCVOs;
	}

	public void setLstSistemasNCVOs(List<SistemasNCVO> lstSistemasNCVOs) {
		this.lstSistemasNCVOs = lstSistemasNCVOs;
	}

	public SistemasNCVO getSelectedSistemasNCVO() {
		return selectedSistemasNCVO;
	}

	public void setSelectedSistemasNCVO(SistemasNCVO selectedSistemasNCVO) {
		this.selectedSistemasNCVO = selectedSistemasNCVO;
	}

	public List<SelectItem> getComboBoxFechasI() {
		return comboBoxFechasI;
	}

	public void setComboBoxFechasI(List<SelectItem> comboBoxFechasI) {
		this.comboBoxFechasI = comboBoxFechasI;
	}

	public List<AnomaliasVO> getLstFechasIVOs() {
		return lstFechasIVOs;
	}

	public void setLstFechasIVOs(List<AnomaliasVO> lstFechasIVOs) {
		this.lstFechasIVOs = lstFechasIVOs;
	}

	public Calendar getSelectedFechasIVO() {
		return selectedFechasIVO;
	}

	public void setSelectedFechasIVO(Calendar selectedFechasIVO) {
		this.selectedFechasIVO = selectedFechasIVO;
	}

	private List<AnomaliasVO> lstAnomaliasVO;

	private List<SeveridadesAnomaliaVO> lstSeveridadesAnomaliaVOs;

	private String noReporteAnomalia;
	private String selectedEstatusAnomalia;

	public BusquedaAnomaliasManageBean() {
		lstAnomaliasVO = new ArrayList<AnomaliasVO>();
		Calendar today = Calendar.getInstance();

		AnomaliasService anomaliasService = SpringUtil.getApplicationContext()
				.getBean(ConstantesServicios.SIGA_SERVICE_IMPL_ANOMALIAS,
						AnomaliasServiceImpl.class);
		lstAnomaliasVO = anomaliasService.obtenTodosAnomalia();

		comboBoxEstatusAnomalia = new ArrayList<SelectItem>();
		lstEstatusAnomaliaVOs = new ArrayList<EstatusAnomaliaVO>();
		lstEstatusAnomaliaVOs.add(new EstatusAnomaliaVO());
		EstatusAnomaliasService estatusAnomaliasService = SpringUtil
				.getApplicationContext()
				.getBean(
						ConstantesServicios.SIGA_SERVICE_IMPL_ESTATUS_ANOMALIAS,
						EstatusAnomaliasServiceImpl.class);
		lstEstatusAnomaliaVOs = estatusAnomaliasService
				.obtenTodosEstatusAnomalia();
		for (EstatusAnomaliaVO unEstatusAnomalia : lstEstatusAnomaliaVOs) {
			comboBoxEstatusAnomalia.add(new SelectItem(unEstatusAnomalia,
					unEstatusAnomalia.getDescripcionEstatusAnomalia()));
		}

		comboBoxSistemasNC = new ArrayList<SelectItem>();
		lstSistemasNCVOs = new ArrayList<SistemasNCVO>();
		lstSistemasNCVOs.add(new SistemasNCVO());
		SistemasNCService sistemasNCService = SpringUtil
				.getApplicationContext().getBean(
						ConstantesServicios.SIGA_SERVICE_IMPL_SISTEMAS_NC,
						SistemasNCServiceImpl.class);
		lstSistemasNCVOs = sistemasNCService.obtenTodosSistemasNC();
		for (SistemasNCVO unSistemas : lstSistemasNCVOs) {
			comboBoxSistemasNC.add(new SelectItem(unSistemas, unSistemas
					.getNombreSistemaNC()));
		}

		comboBoxFechasI = new ArrayList<SelectItem>();
		lstFechasIVOs = new ArrayList<AnomaliasVO>();
		lstFechasIVOs.add(new AnomaliasVO());
		AnomaliasService anomaliaService = SpringUtil.getApplicationContext()
				.getBean(ConstantesServicios.SIGA_SERVICE_IMPL_ANOMALIAS,
						AnomaliasServiceImpl.class);
		lstFechasIVOs = anomaliaService.obtenTodosAnomalia();
		for (AnomaliasVO unAnomalias : lstFechasIVOs) {

			comboBoxFechasI.add(new SelectItem(unAnomalias, UtileriasFechas
					.devuelveCalendarEnTexto(unAnomalias
							.getFechaInicioAnomalia())));
		}

		lstSeveridadesAnomaliaVOs = new ArrayList<SeveridadesAnomaliaVO>();
		SeveridadesAnomaliaService severidadesAnomaliaService = SpringUtil
				.getApplicationContext()
				.getBean(
						ConstantesServicios.SIGA_SERVICE_IMPL_SEVERIDADES_ANOMALIA,
						SeveridadesAnomaliaServiceImpl.class);
		lstSeveridadesAnomaliaVOs = severidadesAnomaliaService
				.obtenTodosSeveridadAnomalia();

	}

	@PostConstruct
	public void BusquedaAnomaliasManageBeanPostConstruct() {
		System.out.println("Estoy en el postconstructor");
	}

	public void buscarAnomalias() {
		System.out.println("entre a metodo");
		System.out.println("No Reporte anomalia: " + noReporteAnomalia);
		System.out.println("selectedEstatusAnomaliaVO: "
				+ selectedEstatusAnomaliaVO);
		// --------------------------

		AnomaliasService anomaliasService = SpringUtil.getApplicationContext()
				.getBean(ConstantesServicios.SIGA_SERVICE_IMPL_ANOMALIAS,
						AnomaliasServiceImpl.class);
		AnomaliasVO anomaliasVO = new AnomaliasVO();
		anomaliasVO.setNoReporteAnomalia(Integer.parseInt(noReporteAnomalia));

		anomaliasVO.setEstatusAnomaliaVO(selectedEstatusAnomaliaVO);
		lstAnomaliasVO = anomaliasService
				.filtrarAnomaliasPorTodosCampos(anomaliasVO);
		System.out.println(lstAnomaliasVO);

		anomaliasVO.setFechaInicioAnomalia(selectedFechasIVO);
		
		 anomaliasVO.setSistemasNCVO(selectedSistemasNCVO);
		 System.out.println(anomaliasVO.getSistemasNCVO() + "------------");
		
		lstFechasIVOs = anomaliasService
				.filtrarAnomaliasPorTodosCamposFechaI(anomaliasVO);
		System.out.println(lstFechasIVOs);

		
		  
		  
		 /*lstSistemasNCVOs =
		 anomaliasService
		 .filtrarAnomaliasPorTodosCamposSistemasNC(anomaliasVO);
		 System.out.println(lstSistemasNCVOs);*/
		 

	}

	/**
	 * @return the lstAnomaliasVO
	 */
	public List<AnomaliasVO> getLstAnomaliasVO() {
		return lstAnomaliasVO;
	}

	/**
	 * @param lstAnomaliasVO
	 *            the lstAnomaliasVO to set
	 */
	public void setLstAnomaliasVO(List<AnomaliasVO> lstAnomaliasVO) {
		this.lstAnomaliasVO = lstAnomaliasVO;
	}

	/**
	 * @return the lstEstatusAnomaliaVOs
	 */
	public List<EstatusAnomaliaVO> getLstEstatusAnomaliaVOs() {
		return lstEstatusAnomaliaVOs;
	}

	/**
	 * @param lstEstatusAnomaliaVOs
	 *            the lstEstatusAnomaliaVOs to set
	 */
	public void setLstEstatusAnomaliaVOs(
			List<EstatusAnomaliaVO> lstEstatusAnomaliaVOs) {
		this.lstEstatusAnomaliaVOs = lstEstatusAnomaliaVOs;
	}

	/**
	 * @return the lstSeveridadesAnomaliaVOs
	 */
	public List<SeveridadesAnomaliaVO> getLstSeveridadesAnomaliaVOs() {
		return lstSeveridadesAnomaliaVOs;
	}

	/**
	 * @param lstSeveridadesAnomaliaVOs
	 *            the lstSeveridadesAnomaliaVOs to set
	 */
	public void setLstSeveridadesAnomaliaVOs(
			List<SeveridadesAnomaliaVO> lstSeveridadesAnomaliaVOs) {
		this.lstSeveridadesAnomaliaVOs = lstSeveridadesAnomaliaVOs;
	}

	/**
	 * @return the noReporteAnomalia
	 */
	public String getNoReporteAnomalia() {
		return noReporteAnomalia;
	}

	/**
	 * @param noReporteAnomalia
	 *            the noReporteAnomalia to set
	 */
	public void setNoReporteAnomalia(String noReporteAnomalia) {
		try {
			Integer.parseInt(noReporteAnomalia);
			this.noReporteAnomalia = noReporteAnomalia;
		} catch (NumberFormatException e) {
			this.noReporteAnomalia = "-1";
		}

	}

	/**
	 * @return the selectedEstatusAnomalia
	 */
	public String getSelectedEstatusAnomalia() {
		return selectedEstatusAnomalia;
	}

	/**
	 * @param selectedEstatusAnomalia
	 *            the selectedEstatusAnomalia to set
	 */
	public void setSelectedEstatusAnomalia(String selectedEstatusAnomalia) {
		this.selectedEstatusAnomalia = selectedEstatusAnomalia;
	}

	/**
	 * @return the selectedEstatusAnomaliaVO
	 */
	public EstatusAnomaliaVO getSelectedEstatusAnomaliaVO() {
		return selectedEstatusAnomaliaVO;
	}

	/**
	 * @param selectedEstatusAnomaliaVO
	 *            the selectedEstatusAnomaliaVO to set
	 */
	public void setSelectedEstatusAnomaliaVO(
			EstatusAnomaliaVO selectedEstatusAnomaliaVO) {
		this.selectedEstatusAnomaliaVO = selectedEstatusAnomaliaVO;
	}

	/**
	 * @return the comboBoxEstatusAnomalia
	 */
	public List<SelectItem> getComboBoxEstatusAnomalia() {
		return comboBoxEstatusAnomalia;
	}

	/**
	 * @param comboBoxEstatusAnomalia
	 *            the comboBoxEstatusAnomalia to set
	 */
	public void setComboBoxEstatusAnomalia(
			List<SelectItem> comboBoxEstatusAnomalia) {
		this.comboBoxEstatusAnomalia = comboBoxEstatusAnomalia;
	}

}
