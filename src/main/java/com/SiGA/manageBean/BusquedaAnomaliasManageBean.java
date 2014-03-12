package com.SiGA.manageBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import org.primefaces.component.selectonemenu.SelectOneMenu;

import com.SiGA.common.VO.AnomaliasVO;
import com.SiGA.common.VO.EstatusAnomaliaVO;
import com.SiGA.common.VO.SeveridadesAnomaliaVO;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.core.SpringUtil;
import com.SiGA.services.AnomaliasService;
import com.SiGA.services.EstatusAnomaliasService;
import com.SiGA.services.SeveridadesAnomaliaService;
import com.SiGA.services.impl.AnomaliasServiceImpl;
import com.SiGA.services.impl.EstatusAnomaliasServiceImpl;
import com.SiGA.services.impl.SeveridadesAnomaliaServiceImpl;
import com.SiGA.common.constantes.ConstantesManageBeans;;




@ManagedBean(name=ConstantesManageBeans.MANAGE_BEAN_BUSQUEDA_ANOMALIAS)
@ViewScoped
//@ApplicationScoped
//@RequestScoped
public class BusquedaAnomaliasManageBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1955257440354260445L;
	
	/** Utilizado para llenar el combo de estatus */
	private List<SelectItem> comboBoxEstatusAnomalia;
	private List<EstatusAnomaliaVO> lstEstatusAnomaliaVOs;
	private EstatusAnomaliaVO selectedEstatusAnomaliaVO;
	
	private List<AnomaliasVO> lstAnomaliasVO;
	
	private List<SeveridadesAnomaliaVO> lstSeveridadesAnomaliaVOs;
	
	private String noReporteAnomalia;
	private String selectedEstatusAnomalia;
	
	
	
	public BusquedaAnomaliasManageBean() {
		lstAnomaliasVO = new ArrayList<AnomaliasVO>();
		
		AnomaliasService anomaliasService = SpringUtil.getApplicationContext().getBean(ConstantesServicios.SIGA_SERVICE_IMPL_ANOMALIAS, AnomaliasServiceImpl.class);
		lstAnomaliasVO = anomaliasService.obtenTodosAnomalia();
		
		comboBoxEstatusAnomalia = new ArrayList<SelectItem>();
		lstEstatusAnomaliaVOs = new ArrayList<EstatusAnomaliaVO>();
		lstEstatusAnomaliaVOs.add(new EstatusAnomaliaVO());
		EstatusAnomaliasService estatusAnomaliasService = SpringUtil.getApplicationContext().getBean(ConstantesServicios.SIGA_SERVICE_IMPL_ESTATUS_ANOMALIAS, EstatusAnomaliasServiceImpl.class);
		lstEstatusAnomaliaVOs = estatusAnomaliasService.obtenTodosEstatusAnomalia();
		for(EstatusAnomaliaVO unEstatusAnomalia: lstEstatusAnomaliaVOs){
			comboBoxEstatusAnomalia.add(new SelectItem(unEstatusAnomalia, unEstatusAnomalia.getDescripcionEstatusAnomalia()));
		}
			
		
		lstSeveridadesAnomaliaVOs = new ArrayList<SeveridadesAnomaliaVO>();
		SeveridadesAnomaliaService severidadesAnomaliaService = SpringUtil.getApplicationContext().getBean(ConstantesServicios.SIGA_SERVICE_IMPL_SEVERIDADES_ANOMALIA,  SeveridadesAnomaliaServiceImpl.class);
		lstSeveridadesAnomaliaVOs = severidadesAnomaliaService.obtenTodosSeveridadAnomalia();
	}
	
	@PostConstruct
	public void BusquedaAnomaliasManageBeanPostConstruct(){
		System.out.println("Estoy en el postconstructor");
	}

	
	public void buscarAnomalias(){
		System.out.println("entre a metodo");
		System.out.println("No Reporte anomalia: " + noReporteAnomalia);
		System.out.println("selectedEstatusAnomaliaVO: " + selectedEstatusAnomaliaVO);
		//--------------------------

		AnomaliasService anomaliasService = SpringUtil.getApplicationContext().getBean(ConstantesServicios.SIGA_SERVICE_IMPL_ANOMALIAS, AnomaliasServiceImpl.class);
		AnomaliasVO anomaliasVO = new AnomaliasVO();
		anomaliasVO.setNoReporteAnomalia(Integer.parseInt(noReporteAnomalia));
		
		anomaliasVO.setEstatusAnomaliaVO(selectedEstatusAnomaliaVO);
		lstAnomaliasVO =  anomaliasService.filtrarAnomaliasPorTodosCampos(anomaliasVO);
		System.out.println(lstAnomaliasVO);
	}
	
	/**
	 * @return the lstAnomaliasVO
	 */
	public List<AnomaliasVO> getLstAnomaliasVO() {
		return lstAnomaliasVO;
	}

	/**
	 * @param lstAnomaliasVO the lstAnomaliasVO to set
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
	 * @param lstEstatusAnomaliaVOs the lstEstatusAnomaliaVOs to set
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
	 * @param lstSeveridadesAnomaliaVOs the lstSeveridadesAnomaliaVOs to set
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
	 * @param noReporteAnomalia the noReporteAnomalia to set
	 */
	public void setNoReporteAnomalia(String noReporteAnomalia) {
		try{
		Integer.parseInt(noReporteAnomalia);
		this.noReporteAnomalia = noReporteAnomalia;
		}catch(NumberFormatException e){
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
	 * @param selectedEstatusAnomalia the selectedEstatusAnomalia to set
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
	 * @param selectedEstatusAnomaliaVO the selectedEstatusAnomaliaVO to set
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
	 * @param comboBoxEstatusAnomalia the comboBoxEstatusAnomalia to set
	 */
	public void setComboBoxEstatusAnomalia(List<SelectItem> comboBoxEstatusAnomalia) {
		this.comboBoxEstatusAnomalia = comboBoxEstatusAnomalia;
	}

		
	
}
