package  com.SiGA.persistencia.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.SiGA.common.constantes.ConstantesMapeoTablas;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 7/01/2013
 * @descripcion Clase de tipo POJO que mapea sus atributos con las columnas de la tabla SiGA_estatus
 *
 */
@Entity
@Table(name = ConstantesMapeoTablas.SIGA_TABLA_ESTATUS)
public class EstatusPOJO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7289325898949361963L;
	
	private Integer idEstatus;
	private char claveEstatus;
	private String descripcionEstatus;
	
	public EstatusPOJO() {
		
	}

	public EstatusPOJO(Integer idEstatus, char claveEstatus,
			String descripcionEstatus) {
		super();
		this.idEstatus = idEstatus;
		this.claveEstatus = claveEstatus;
		this.descripcionEstatus = descripcionEstatus;
	}

	@Id
	@Column(name = "idEstatus", unique=true, nullable=false)
	public Integer getIdEstatus() {
		return idEstatus;
	}

	public void setIdEstatus(Integer idEstatus) {
		this.idEstatus = idEstatus;
	}

	@Column(name = "claveEstatus", nullable = false, length = 1)
	public char getClaveEstatus() {
		return claveEstatus;
	}

	public void setClaveEstatus(char claveEstatus) {
		this.claveEstatus = claveEstatus;
	}

	@Column(name = "descripcionEstatus", nullable = false, length = 50)
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
