package com.simplyShop.simplyShop;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Client {
	
	@Id
	Long id;
	String name;
	String pswrd;
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(Long id, String name, String pswrd) {
		super();
		this.id = id;
		this.name = name;
		this.pswrd = pswrd;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPswrd() {
		return pswrd;
	}

	public void setPswrd(String pswrd) {
		this.pswrd = pswrd;
	}
	
}
