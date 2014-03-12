package  com.SiGA.persistencia.pojo;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tablaPrueba")
public class TablaPruebaPOJO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4441543977343433595L;


	@Id
	@Column(name = "idPrueba", nullable = false, unique = true)
	private Integer idPrueba;
	

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaPrueba", nullable = false)
	private Calendar fechaPrueba;
	
	public TablaPruebaPOJO() {
		// TODO Auto-generated constructor stub
	}

	public TablaPruebaPOJO(Integer idPrueba, Calendar fechaPrueba) {
		super();
		this.idPrueba = idPrueba;
		this.fechaPrueba = fechaPrueba;
	}

	/**
	 * @return the idPrueba
	 */
	public Integer getIdPrueba() {
		return idPrueba;
	}

	/**
	 * @param idPrueba the idPrueba to set
	 */
	public void setIdPrueba(Integer idPrueba) {
		this.idPrueba = idPrueba;
	}

	/**
	 * @return the fechaPrueba
	 */
	public Calendar getFechaPrueba() {
		return fechaPrueba;
	}

	/**
	 * @param fechaPrueba the fechaPrueba to set
	 */
	public void setFechaPrueba(Calendar fechaPrueba) {
		this.fechaPrueba = fechaPrueba;
	}
	
	
}
