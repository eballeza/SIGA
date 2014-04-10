package com.SiGA.manageBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import com.SiGA.common.constantes.ConstantesManageBeans;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 10/04/2014
 * @descripcion 
 *
 */
@ManagedBean(name = ConstantesManageBeans.MANAGE_BEAN_ABSTRAC_MANAGE_BEAN)
@SessionScoped
public class AbstractManageBean {

	public void setSessionAttribute(String attributeName, String attributeValue){
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		session.setAttribute(attributeName, attributeValue);
	}
	
	public String getSessionAttribute(String attributeName){
		String result = "";
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		result = session.getAttribute(attributeName).toString();
		return result;
	}
	
}
