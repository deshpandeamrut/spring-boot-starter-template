package com.amrut.springbootplay.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccuWeatherForecatsDay {

	@JsonProperty("IconPhrase")
	private String phrase;

	public String getPhrase() {
		return phrase;
	}

	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}

	
	
}
