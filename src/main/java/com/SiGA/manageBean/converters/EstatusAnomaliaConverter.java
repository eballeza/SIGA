package com.SiGA.manageBean.converters;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


import com.SiGA.core.SpringUtil;
import com.SiGA.services.EstatusAnomaliasService;
import com.SiGA.services.impl.EstatusAnomaliasServiceImpl;
import com.SiGA.common.VO.EstatusAnomaliaVO;
import com.SiGA.common.constantes.ConstantesConverters;
import com.SiGA.common.constantes.ConstantesServicios;

@FacesConverter(value = ConstantesConverters.SIGA_CONVERTER_ESTATUS_ANOMALIAS)
public class EstatusAnomaliaConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext ctx, UIComponent component, String value) {
		System.out.println("value----------------------------------: " + value);
		EstatusAnomaliasService estatusAnomaliasService = SpringUtil.getApplicationContext().getBean(ConstantesServicios.SIGA_SERVICE_IMPL_ESTATUS_ANOMALIAS, EstatusAnomaliasServiceImpl.class);
		EstatusAnomaliaVO estatusAnomaliaVO = new EstatusAnomaliaVO();
		estatusAnomaliaVO = estatusAnomaliasService.encuentraEstatusAnomaliaXId(Integer.parseInt(value));
		return estatusAnomaliaVO;
	}

	@Override
	public String getAsString(FacesContext ctx, UIComponent component, Object object) {
		return ( (EstatusAnomaliaVO)object ).getIdEstatusAnomalia().toString();
		//return ((EstatusAnomaliaVO)object).toString();
	}
	

}
