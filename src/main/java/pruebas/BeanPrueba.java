package pruebas;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "prueba")
@SessionScoped
public class BeanPrueba {
	
	private String texto;
	
	public BeanPrueba() {
		texto = "hola";
	}
	
	@PostConstruct
	public void post(){
		texto = "adios";
	}

	/**
	 * @return the texto
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * @param texto the texto to set
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void accion(){
		System.out.println("Esta es una accion de prueba");
		System.out.println(texto);
	}
	
	

}
