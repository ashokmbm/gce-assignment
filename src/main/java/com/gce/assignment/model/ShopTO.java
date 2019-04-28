package com.gce.assignment.model;

public class ShopTO {
	private String name;
	private String ownerName;

	public ShopTO() {
		super();
	}

	public ShopTO(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
}
