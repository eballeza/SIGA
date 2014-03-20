package pruebas;

import java.util.Calendar;
import java.util.List;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SiGA.common.VO.AccionesAnomaliaVO;
import com.SiGA.common.VO.AnomaliasVO;
import com.SiGA.common.VO.EstatusAnomaliaVO;

import com.SiGA.common.constantes.ConstantesServicios;
import  com.SiGA.common.convert.pojo_to_vo.ConvertAccionesAnomaliaPOJOToVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertAccionesPOJOToVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertAnomaliasPOJOToVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertTiposAnomaliaPOJOToVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertTiposUsuarioPOJOToVO;
import  com.SiGA.common.convert.pojo_to_vo.ConvertUsuariosPOJOToVO;
import com.SiGA.core.SpringUtil;

import com.SiGA.services.AnomaliasService;
import com.SiGA.services.EstatusAnomaliasService;
import com.SiGA.services.EstatusService;
import com.SiGA.services.ModulosNCService;
import com.SiGA.services.ServicioPrueba;
import com.SiGA.services.impl.AccionesAnomaliaServiceImpl;
import com.SiGA.services.impl.AnomaliasServiceImpl;
import com.SiGA.services.impl.EstatusAnomaliasServiceImpl;
import com.SiGA.services.impl.EstatusServiceImpl;
import com.SiGA.services.impl.ModulosNCServiceImpl;


public class Main {
	public static void main(String []args){
		
		AnomaliasService anomaliasService = SpringUtil.getApplicationContext().getBean(ConstantesServicios.SIGA_SERVICE_IMPL_ANOMALIAS, AnomaliasServiceImpl.class);
		EstatusAnomaliasService estatusAnomaliasService = SpringUtil.getApplicationContext().getBean(ConstantesServicios.SIGA_SERVICE_IMPL_ESTATUS_ANOMALIAS, EstatusAnomaliasServiceImpl.class);
		EstatusAnomaliaVO estatusAnomaliaVO = new EstatusAnomaliaVO();
		estatusAnomaliaVO.setIdEstatusAnomalia(2);
		/*
		List<EstatusAnomaliaVO> lstEstatusAnomaliaVOs = estatusAnomaliasService.obtenTodosEstatusAnomalia();
		for(EstatusAnomaliaVO estatusAnomalia: lstEstatusAnomaliaVOs){
			System.out.println(estatusAnomalia);
		}
	
		
		List<AnomaliasVO> anomaliasVOs =  anomaliasService.filtrarAnomaliasPorTodosCampos(estatusAnomaliaVO);
		for(AnomaliasVO unaAnomalia: anomaliasVOs){
			System.out.println(unaAnomalia);
		}
		*/
	    
	   
	}
}
