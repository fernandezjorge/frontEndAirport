package com.dxc.frontEnd.frontEnd.tools;

import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.*;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class FiveCustomExceptions extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FiveCustomExceptions(String msg) {
		super(msg);
	}

	public FiveCustomExceptions() {

	}

}
