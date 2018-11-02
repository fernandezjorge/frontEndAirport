package com.dxc.frontEnd.frontEnd.tools;

import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.*;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class FourCustomExceptions extends RuntimeException {

	private static final long serialVersionUID = 6717028118090300512L;

	public FourCustomExceptions(String msg) {
		super(msg);
	}

	public FourCustomExceptions() {

	}

}
