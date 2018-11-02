package com.dxc.frontEnd.frontEnd.providers;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.dxc.frontEnd.frontEnd.domain.Airport;
import com.dxc.frontEnd.frontEnd.errorHandler.errHan;

@Component
public class AirportProviderImpl implements AirportProvider {

	private final String GETALLAIRPORTSURL = "http://localhost:8080/backEnd/all";
	private final String SEARCHAIRPORTURL = "http://localhost:8080/backEnd/search?searchValue=";

	private RestTemplate restTemplate = new RestTemplate();

	// OK
	@Override
	public ResponseEntity<List<Airport>> getAllAirports() {		
		restTemplate.setErrorHandler(new errHan());

		ResponseEntity<List<Airport>> restResponse = restTemplate.exchange(GETALLAIRPORTSURL, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Airport>>() {
				});

		return restResponse;
	}

	@Override
	public ResponseEntity<Airport> searchByAirportCode(String airportCode) {
		restTemplate.setErrorHandler(new errHan());

		ResponseEntity<Airport> restResponse = restTemplate.exchange(SEARCHAIRPORTURL + airportCode, HttpMethod.GET,
				null, new ParameterizedTypeReference<Airport>() {
				});

		return restResponse;
	}

}
