package com.dxc.frontEnd.frontEnd.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.dxc.frontEnd.frontEnd.domain.Airport;

public interface AirportGuiService {
	ResponseEntity<?> searchByAirportCode(String airportCode);

	ResponseEntity<List<Airport>> getAllAirports();

}
