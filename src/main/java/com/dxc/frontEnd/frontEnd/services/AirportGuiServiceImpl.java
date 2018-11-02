package com.dxc.frontEnd.frontEnd.services;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dxc.frontEnd.frontEnd.domain.Airport;
import com.dxc.frontEnd.frontEnd.providers.AirportProvider;
import com.dxc.frontEnd.frontEnd.tools.FiveCustomExceptions;

@Service("airportGuiServiceImpl")
public class AirportGuiServiceImpl implements AirportGuiService {

	private AirportProvider airportProvider;

	public AirportGuiServiceImpl(AirportProvider provider) {
		this.airportProvider = provider;
	}

	@Override
	public ResponseEntity<?> searchByAirportCode(String airportCode) {
		if (airportProvider.searchByAirportCode(airportCode).getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return airportProvider.searchByAirportCode(airportCode);
	}

	@Override
	public ResponseEntity<List<Airport>> getAllAirports() throws FiveCustomExceptions {
		return airportProvider.getAllAirports();
	}

}
