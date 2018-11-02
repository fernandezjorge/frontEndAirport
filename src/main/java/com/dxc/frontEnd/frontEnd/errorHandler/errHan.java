package com.dxc.frontEnd.frontEnd.errorHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import com.dxc.frontEnd.frontEnd.controllers.HttpErrorController;
import com.dxc.frontEnd.frontEnd.tools.FiveCustomExceptions;
import com.dxc.frontEnd.frontEnd.tools.FourCustomExceptions;

import java.io.IOException;

@Component
public class errHan implements ResponseErrorHandler {
	private static final Logger log = LoggerFactory.getLogger(errHan.class);

	@Override
	public boolean hasError(ClientHttpResponse httpResponse) throws IOException {

		return (httpResponse.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR
				|| httpResponse.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR);
	}

	@Override
	public void handleError(ClientHttpResponse httpResponse) throws IOException {

		if (hasError(httpResponse)) {
			log.error("Response error: {} {}", httpResponse.getStatusCode(), httpResponse.getStatusText());
			if (httpResponse.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
				throw new FiveCustomExceptions();
			} else if (httpResponse.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {
				// Handle CLIENT_ERROR
				if (httpResponse.getStatusCode() == HttpStatus.NOT_FOUND) {
					//throw new FourCustomExceptions();
				}
			}
		}
	}

}
