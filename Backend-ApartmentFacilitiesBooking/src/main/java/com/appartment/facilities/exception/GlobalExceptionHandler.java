package com.appartment.facilities.exception;

import javax.security.auth.login.LoginException;

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
	
	@ExceptionHandler(FacilityException.class)
	public ResponseEntity<Object> handleFacilityException(FacilityException ex){
		String errorMessage = ex.getMessage();
		return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(ManagerException.class)
    public ResponseEntity<Object> handleManagerException(ManagerException ex) {
        String errorMessage = ex.getMessage();
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }
	
	
	@ExceptionHandler(LoginException.class)
    public ResponseEntity<Object> handleLoginException(LoginException ex) {
        String errorMessage = ex.getMessage();
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }


}
