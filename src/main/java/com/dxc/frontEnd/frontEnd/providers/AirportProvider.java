package com.dxc.frontEnd.frontEnd.providers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;

import com.dxc.frontEnd.frontEnd.domain.Airport;

public interface AirportProvider {
	ResponseEntity<List<Airport>> getAllAirports();
	ResponseEntity<Airport> searchByAirportCode(String airportCode);

}
