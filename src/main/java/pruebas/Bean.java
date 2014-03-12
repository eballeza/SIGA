package pruebas;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.annotation.Scope;


import com.SiGA.common.VO.EstatusVO;
import com.SiGA.common.VO.ModulosNCVO;
import com.SiGA.common.VO.SistemasNCVO;
import com.SiGA.common.constantes.ConstantesServicios;
import com.SiGA.core.HibernateUtil;
import com.SiGA.core.SpringUtil;

import com.SiGA.services.EstatusService;
import com.SiGA.services.ModulosNCService;
import com.SiGA.services.SistemasNCService;
import com.SiGA.services.impl.EstatusServiceImpl;
import com.SiGA.services.impl.ModulosNCServiceImpl;
import com.SiGA.services.impl.SistemasNCServiceImpl;



@ManagedBean(name="bean")
@RequestScoped
public class Bean {
	
	private String text;
	
	private List<Player> lstPlayers;
	
	private List<EstatusVO> lstEstatusVOs;
	
	private List<SistemasNCVO> lstSistemasNCVOs;
	
	private List<ModulosNCVO> lstModulosNCVOs;
	
	private String contacto;
	
	private List<Order> orderList2 ;
	private Order[] orderList = new Order[5];
	
	public Bean() {
		contacto = " ";
		lstPlayers = new ArrayList<Player>();
		lstPlayers.add(new Player("Carlos"));
		lstPlayers.add(new Player("Jorge"));
		lstEstatusVOs = new ArrayList<EstatusVO>();
		System.out.println("entre al constructor");
		
		orderList2 = new ArrayList<Order>();
		orderList2.add(new Order("A0001", "Intel CPU", new BigDecimal("700.00"), 1));
		orderList2.add(new Order("A0002", "Harddisk 10TB",new BigDecimal("500.00"), 2));
		
		orderList[0] = new Order("A0001", "Intel CPU", new BigDecimal("700.00"), 1);
		
		orderList[1] = new Order("A0002", "Harddisk 10TB",new BigDecimal("500.00"), 2);
		
		orderList[2] = new Order("A0003", "Dell Laptop", new BigDecimal("11600.00"), 8);
		
		orderList[3] = new Order("A0004", "Samsung LCD", new BigDecimal("5200.00"), 3);
		
		orderList[4] = new Order("A0005", "A4Tech Mouse", new BigDecimal("100.00"), 10);
		
	}
	
	@PostConstruct
	public void Inicializa(){
		System.out.println("entre al postconstructor");
		/*
		EstatusService estatusService = SpringUtil.getApplicationContext().getBean(ConstantesServicios.SIGA_SERVICE_IMPL_ESTATUS, EstatusServiceImpl.class);
		lstEstatusVOs = estatusService.obtenTodosEstatus();
		
		SistemasNCService sistemasNCService = SpringUtil.getApplicationContext().getBean(ConstantesServicios.SIGA_SERVICE_IMPL_SISTEMAS_NC, SistemasNCServiceImpl.class);
		lstSistemasNCVOs = sistemasNCService.obtenTodosSistemasNC();
		
		ModulosNCService modulosNCService = SpringUtil.getApplicationContext().getBean(ConstantesServicios.SIGA_SERVICE_IMPL_MODULOS_NC, ModulosNCServiceImpl.class);
		lstModulosNCVOs = modulosNCService.obtenTodosModulosNC();
		*/
		
	}
	
	public void accion(){
		System.out.println("ñsliurrnvodri");
		
		System.out.println("Maven + Hibernate + Oracle");
		System.out.println("-----------------------------Maven + Hibernate + Oracle");
		System.out.println(contacto);
		
		//prueba escritura en bd
		
		ModulosNCService modulosNCService = SpringUtil.getApplicationContext().getBean(ConstantesServicios.SIGA_SERVICE_IMPL_MODULOS_NC, ModulosNCServiceImpl.class);

	    ModulosNCVO modulosNCVO = new ModulosNCVO();
	    modulosNCVO.setIdModuloNC(0);
	    modulosNCVO.setDescripcionModuloNC("");
	    EstatusVO estatusVO = new EstatusVO();
	    estatusVO.setIdEstatus(1);
	    modulosNCVO.setEstatusVO(estatusVO);
	    modulosNCVO.setFechaCreacionModuloNC(Calendar.getInstance());
	    modulosNCVO.setNombreModuloNC(contacto);
	    SistemasNCVO sistemasNCVO = new SistemasNCVO();
	    sistemasNCVO.setIdSistemaNC(1);
	    modulosNCVO.setSistemasNCVO(sistemasNCVO);
	    
	    modulosNCService.insertaModuloNC(modulosNCVO);

		
	}

	public List<String> complete(String query) {
		List<String> results = new ArrayList<String>();
		for (int i = 0; i < 10; i++)
			results.add(query + i);
		return results;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<Player> getLstPlayers() {
		return lstPlayers;
	}

	public void setLstPlayers(List<Player> lstPlayers) {
		this.lstPlayers = lstPlayers;
	}

	/**
	 * @return the lstEstatusVOs
	 */
	public List<EstatusVO> getLstEstatusVOs() {
		return lstEstatusVOs;
	}

	/**
	 * @param lstEstatusVOs the lstEstatusVOs to set
	 */
	public void setLstEstatusVOs(List<EstatusVO> lstEstatusVOs) {
		this.lstEstatusVOs = lstEstatusVOs;
	}

	/**
	 * @return the contacto
	 */
	public String getContacto() {
		return contacto;
	}

	/**
	 * @param contacto the contacto to set
	 */
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	/**
	 * @return the lstSistemasNCVOs
	 */
	public List<SistemasNCVO> getLstSistemasNCVOs() {
		return lstSistemasNCVOs;
	}

	/**
	 * @param lstSistemasNCVOs the lstSistemasNCVOs to set
	 */
	public void setLstSistemasNCVOs(List<SistemasNCVO> lstSistemasNCVOs) {
		this.lstSistemasNCVOs = lstSistemasNCVOs;
	}

	/**
	 * @return the lstModulosNCVOs
	 */
	public List<ModulosNCVO> getLstModulosNCVOs() {
		return lstModulosNCVOs;
	}

	/**
	 * @param lstModulosNCVOs the lstModulosNCVOs to set
	 */
	public void setLstModulosNCVOs(List<ModulosNCVO> lstModulosNCVOs) {
		this.lstModulosNCVOs = lstModulosNCVOs;
	}

	/**
	 * @return the orderList
	 */
	public Order[] getOrderList() {
		return orderList;
	}

	/**
	 * @param orderList the orderList to set
	 */
	public void setOrderList(Order[] orderList) {
		this.orderList = orderList;
	}

	/**
	 * @return the orderList2
	 */
	public List<Order> getOrderList2() {
		return orderList2;
	}

	/**
	 * @param orderList2 the orderList2 to set
	 */
	public void setOrderList2(List<Order> orderList2) {
		this.orderList2 = orderList2;
	}

	
	
	
	

}
