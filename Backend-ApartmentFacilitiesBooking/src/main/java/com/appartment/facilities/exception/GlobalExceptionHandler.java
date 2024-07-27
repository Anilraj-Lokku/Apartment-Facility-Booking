package com.appartment.facilities.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class GlobalExceptionHandler {
	
	@ExceptionHandler(BookingException.class)
	public ResponseEntity<Object> handleBookingException(BookingException ex){
		String errorMessage = ex.getMessage();
		return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		
	}

}
