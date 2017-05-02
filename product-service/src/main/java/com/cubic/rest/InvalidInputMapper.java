package com.cubic.rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import com.cubic.exception.InvalidInputException;
import com.cubic.vo.ErrorResponse;

public class InvalidInputMapper implements ExceptionMapper<InvalidInputException> {

	public Response toResponse(InvalidInputException exception) {
		ErrorResponse errResponse = new ErrorResponse();
		errResponse.setErrorCode("ERR-VAL-100");
		errResponse.setErrorDesc("Your input is invalid. Please try again");
		return Response.status(510).entity(errResponse).build();
	}

}
