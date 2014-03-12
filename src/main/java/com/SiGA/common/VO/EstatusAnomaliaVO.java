package  com.SiGA.common.VO;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 15/02/2013
 * @descripcion Clase de tipo VO que mapea sus atributos con las columnas de la tabla SiGA_estatusAnomalia
 *
 */
public class EstatusAnomaliaVO {

	
	private Integer idEstatusAnomalia;
	
	
	private char claveEstatusAnomalia;
	
	
	private String descripcionEstatusAnomalia;
	
	public EstatusAnomaliaVO() {
		// TODO Auto-generated constructor stub
	}

	public EstatusAnomaliaVO(Integer idEstatusAnomalia,
			char claveEstatusAnomalia, String descripcionEstatusAnomalia) {
		super();
		this.idEstatusAnomalia = idEstatusAnomalia;
		this.claveEstatusAnomalia = claveEstatusAnomalia;
		this.descripcionEstatusAnomalia = descripcionEstatusAnomalia;
	}

	/**
	 * @return the idEstatusAnomalia
	 */
	public Integer getIdEstatusAnomalia() {
		return idEstatusAnomalia;
	}

	/**
	 * @param idEstatusAnomalia the idEstatusAnomalia to set
	 */
	public void setIdEstatusAnomalia(Integer idEstatusAnomalia) {
		this.idEstatusAnomalia = idEstatusAnomalia;
	}

	/**
	 * @return the claveEstatusAnomalia
	 */
	public char getClaveEstatusAnomalia() {
		return claveEstatusAnomalia;
	}

	/**
	 * @param claveEstatusAnomalia the claveEstatusAnomalia to set
	 */
	public void setClaveEstatusAnomalia(char claveEstatusAnomalia) {
		this.claveEstatusAnomalia = claveEstatusAnomalia;
	}

	/**
	 * @return the descripcionEstatusAnomalia
	 */
	public String getDescripcionEstatusAnomalia() {
		return descripcionEstatusAnomalia;
	}

	/**
	 * @param descripcionEstatusAnomalia the descripcionEstatusAnomalia to set
	 */
	public void setDescripcionEstatusAnomalia(String descripcionEstatusAnomalia) {
		this.descripcionEstatusAnomalia = descripcionEstatusAnomalia;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EstatusAnomalia [idEstatusAnomalia=" + idEstatusAnomalia
				+ ", claveEstatusAnomalia=" + claveEstatusAnomalia
				+ ", descripcionEstatusAnomalia=" + descripcionEstatusAnomalia
				+ "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + claveEstatusAnomalia;
		result = prime
				* result
				+ ((descripcionEstatusAnomalia == null) ? 0
						: descripcionEstatusAnomalia.hashCode());
		result = prime
				* result
				+ ((idEstatusAnomalia == null) ? 0 : idEstatusAnomalia
						.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EstatusAnomaliaVO other = (EstatusAnomaliaVO) obj;
		if (claveEstatusAnomalia != other.claveEstatusAnomalia)
			return false;
		if (descripcionEstatusAnomalia == null) {
			if (other.descripcionEstatusAnomalia != null)
				return false;
		} else if (!descripcionEstatusAnomalia
				.equals(other.descripcionEstatusAnomalia))
			return false;
		if (idEstatusAnomalia == null) {
			if (other.idEstatusAnomalia != null)
				return false;
		} else if (!idEstatusAnomalia.equals(other.idEstatusAnomalia))
			return false;
		return true;
	}
	
	
}
