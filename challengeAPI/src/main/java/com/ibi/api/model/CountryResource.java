package com.ibi.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryResource {
	@JsonProperty("id")
	private Long id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("capital")
	private String capital;

	@JsonProperty("region")
	private String region;

	@JsonProperty("subregion")
	private String subregion;

	@JsonProperty("area")
	private double area;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSubregion() {
		return subregion;
	}

	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", capital=" + capital + ", region=" + region + ", subregion="
				+ subregion + ", area=" + area + "]";
	}

}
