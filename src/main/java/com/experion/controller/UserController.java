package com.experion.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.experion.dto.UserDto;
import com.experion.service.AzureUserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = "*")
@RestController
public class UserController {

//	private final AzureUserService service;
//
//	public UserController(AzureUserService service) {
//		this.service = service;
//	}

	@GetMapping(value = "/api/me", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserDto getUserDetails(HttpServletRequest request) throws JsonMappingException, JsonProcessingException {
		String token = request.getHeader("Authorization");
		String[] split_string = token.split("\\.");
		String base64EncodedBody = split_string[1];
		Base64 base64Url = new Base64(true);
		String body = new String(base64Url.decode(base64EncodedBody));
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> map = mapper.readValue(body, Map.class);
		String email = String.valueOf(map.get("emails")).split(",")[0];
		email = email.replaceAll("\\[", "").replaceAll("\\]", "");
		UserDto dto = new UserDto(String.valueOf(map.get("oid")), email, String.valueOf(map.get("name")),
				String.valueOf(map.get("given_name")), String.valueOf(map.get("jobTitle")),
				String.valueOf(map.get("extension_Role")), String.valueOf(map.get("family_name")),
				String.valueOf(map.get("city")), String.valueOf(map.get("country")), String.valueOf(map.get("state")),
				String.valueOf(map.get("streetAddress")), String.valueOf(map.get("postalCode")));
//		service.checkAndSaveUser(dto);
		return dto;
	}
}