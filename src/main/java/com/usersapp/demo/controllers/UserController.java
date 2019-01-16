package com.usersapp.demo.controllers;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.usersapp.demo.model.User;
import com.usersapp.demo.service.UserService;
import com.usersapp.demo.util.RestResponse;

@RestController
public class UserController {

	@Autowired
	protected UserService userService;

	protected ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping(value = "/guardarOEditar", method = RequestMethod.POST)
	public RestResponse guardarOEditar(@RequestBody String userJson)
			throws JsonParseException, JsonMappingException, IOException {
		User user = this.objectMapper.readValue(userJson, User.class);

		if (!this.validate(user)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "Los campos son obligatorios");
		}

		this.userService.save(user);

		return new RestResponse(HttpStatus.OK.value(), "Operación exitosa");
	}

	private boolean validate(User user) {
		boolean isValid = true;
		if (user.getPrimerNombre() == null || user.getPrimerNombre().trim().equals("")) {
			isValid = false;
		}
		//dependecia de StringUtil que convierte vacios a nulls
		if (StringUtils.trimToNull(user.getApellidoPaterno()) == null) {
			isValid = false;
		}

		if (StringUtils.trimToNull(user.getApellidoMaterno()) == null) {
			isValid = false;
		}

		return isValid;
	}
}
