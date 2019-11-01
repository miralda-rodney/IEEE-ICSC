package com.memoprovenance.services;

import java.util.Date;

public class Provenance {
	private String name;
	private String organization;
	private Date date;
	private String action;
	
	public Provenance() {}
	
	public Provenance(String name, String organization, Date date, String action) {
		this.setName(name);
		this.setOrganization(organization);
		this.setDate(date);
		this.setAction(action);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
}
