package com.dxc.frontEnd.frontEnd.services;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dxc.frontEnd.frontEnd.providers.AirportProviderImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AirportGuiServiceTest {
	
	private AirportGuiService svc = new AirportGuiServiceImpl(new AirportProviderImpl());
	
	@Test
	public void shouldGetNotNullSearchByAirportCode() {
		assertNotNull(svc.searchByAirportCode("DFW"));
	}
	
	@Test
	public void shouldGetNotNullGetAllAirports() {
		assertNotNull(svc.getAllAirports());
	}
	
}
