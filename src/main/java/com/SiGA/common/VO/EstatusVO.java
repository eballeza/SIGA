package  com.SiGA.common.VO;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 15/02/2013
 * @descripcion Clase de tipo VO que mapea sus atributos con las columnas de la tabla SiGA_estatus
 *
 */
public class EstatusVO {

	private Integer idEstatus;
	private char claveEstatus;
	private String descripcionEstatus;
	
	public EstatusVO() {
		
	}

	public EstatusVO(Integer idEstatus, char claveEstatus,
			String descripcionEstatus) {
		super();
		this.idEstatus = idEstatus;
		this.claveEstatus = claveEstatus;
		this.descripcionEstatus = descripcionEstatus;
	}

	
	public Integer getIdEstatus() {
		return idEstatus;
	}

	public void setIdEstatus(Integer idEstatus) {
		this.idEstatus = idEstatus;
	}

	
	public char getClaveEstatus() {
		return claveEstatus;
	}

	public void setClaveEstatus(char claveEstatus) {
		this.claveEstatus = claveEstatus;
	}

	
	public String getDescripcionEstatus() {
		return descripcionEstatus;
	}

	public void setDescripcionEstatus(String descripcionEstatus) {
		this.descripcionEstatus = descripcionEstatus;
	}

	@Override
	public String toString() {
		return "EstatusPOJO [idEstatus=" + idEstatus + ", claveEstatus="
				+ claveEstatus + ", descripcionEstatus=" + descripcionEstatus
				+ "]";
	}
	
}
