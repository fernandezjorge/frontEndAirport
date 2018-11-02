package com.dxc.frontEnd.frontEnd.controllers;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dxc.frontEnd.frontEnd.providers.AirportProviderImpl;
import com.dxc.frontEnd.frontEnd.services.AirportGuiService;
import com.dxc.frontEnd.frontEnd.services.AirportGuiServiceImpl;

/**
 * Created by JavaDeveloperZone on 19-07-2017.
 */
@Controller
@RequestMapping("/frontEnd")
public class ShowAirportController {

	private AirportGuiService airportGuiService = new AirportGuiServiceImpl(new AirportProviderImpl());

	@RequestMapping("/welcome")
	private String welcome(ModelMap modelMap) {
		return "welcome";
	}

	@RequestMapping("/airports")
	private String showAllAirports(ModelMap modelMap) {
		modelMap.put("airports", airportGuiService.getAllAirports().getBody());
		return "airports";
	}

	@RequestMapping("/search")
	private String searchAirport(@RequestParam(value = "searchValue", required = false) String airCode,
			ModelMap modelMap) {
		modelMap.put("airportSearch", airportGuiService.searchByAirportCode(airCode).getBody());
		return "search";

	}

	@RequestMapping("*")
	private String index(ModelMap modelMap) {
		return "index";
	}

}