package com.SiGA.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SiGA.common.constantes.ConstantesMensajesDeError;



/**
 * 
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Clase principal para crear el ApplicationContext de Spring.
 *
 */
public class SpringUtil {
	
	
	private static String APPLICATION_CONTEXT_XML = "applicationContext.xml";
	private static ApplicationContext applicationContext = null;
	
	static{
		try{
			applicationContext = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_XML);
		}catch(Exception e){
			System.err.println(ConstantesMensajesDeError.ERROR_INICIALIZACION_SPRING_FRAMEWORK + " " + SpringUtil.class + ": \n" + e);
		}
		
	}
	
	public static ApplicationContext getApplicationContext(){
		return applicationContext;
	}
	
	

}
