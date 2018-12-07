package com.rs.exception;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
@ControllerAdvice
//This will go to @Controller and will handle exception wherever the flow of controller is going
public class GlobalException {
	@ExceptionHandler(HandleException.class)
	public @ResponseBody ExceptionJSONdata handleEmployeeNotFoundException(HttpServletRequest request,
			HandleException  ex) {

		ExceptionJSONdata response = new ExceptionJSONdata();
		response.setTimestamp(ZonedDateTime.now().format(DateTimeFormatter.ISO_INSTANT));
		response.setMessage(ex.getMessage());
		response.setDetails(request.getRequestURL().toString());
		System.out.println("Global");
		return response;
	}

}
