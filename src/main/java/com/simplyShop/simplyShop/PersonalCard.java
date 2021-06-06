package com.simplyShop.simplyShop;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "PersonalCard")
public class PersonalCard {
	
	@Id
	long id;
	String name;
	Date expirationDate;
	float credit;
	int ccv;
	
	public PersonalCard() {
		super();
	}
	public PersonalCard(long id, String name, Date expirationDate, float credit, int ccv) {
		super();
		this.id = id;
		this.name = name;
		this.expirationDate = expirationDate;
		this.credit = credit;
		this.ccv = ccv;
	}
	
	public PersonalCard(long id, String name, float credit, int ccv) {
		super();
		this.id = id;
		this.name = name;
		this.credit = credit;
		this.ccv = ccv;
	}
	
	public PersonalCard(long id, String name, int ccv) {
		super();
		this.id = id;
		this.name = name;
		this.ccv = ccv;
	}
	
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Date getExpirationDate() {
		return expirationDate;
	}
	
	public float getCredit() {
		return credit;
	}
	public void setCredit(float credit) {
		this.credit = credit;
	}
	public int getCcv() {
		return ccv;
	}
	

}
