package pruebas;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@javax.persistence.Entity
@Table(name = "prueba")
public class Usuario implements Serializable{
	
	private int userId;
	private String userName;
	private String createdBy;
	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}


	public Usuario(int userId, String userName, String createdBy) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.createdBy = createdBy;
	}

	@Id
	@Column(name = "userId", unique=true, nullable=false)
	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "username", nullable = false, length = 30)
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "createdBy", nullable = false, length = 30 )
	public String getCreatedBy() {
		return createdBy;
	}
	
	
	
}
