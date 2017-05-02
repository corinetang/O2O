package com.o2o;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@Component
@Controller
public class UserController {

	List<User> users = new ArrayList<User>();
	
	public UserController() {
		super();
	}
	
	/**
	 * @return un tableau JSon de voitures disponibles avec HttpStatus = OK
	 */
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	List<User> getUsers(){
		return users;
	}
}
