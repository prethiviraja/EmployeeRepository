package com.Employee.GlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Employee.Exception.NameException;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(NameException.class)
	public ResponseEntity<Object> notfound(NameException va) {
		return new ResponseEntity<Object>("Name not found",HttpStatus.NOT_FOUND);
	}

}

