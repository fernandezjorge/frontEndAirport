package com.dxc.frontEnd.frontEnd.domain;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Airport {

	private String airportCode;

	public Airport() {
	}

	@JsonCreator
	public Airport(@JsonProperty("airportCode") String airportCode) {
		this.airportCode = airportCode;
	}

	public String getAirportCode() {
		return airportCode;
	}

	@Override
	public String toString() {
		return "Airport [airportCode=" + airportCode + "]";
	}

}
