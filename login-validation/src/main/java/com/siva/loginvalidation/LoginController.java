package com.siva.loginvalidation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Siva Srinivasa Pasam
 *
 */
@RestController
public class LoginController {

	private static final Map<String, String> credentialsMap = new HashMap<>();
	private static final Set<String> apiKeys = new HashSet<>();

	static {
		credentialsMap.put("siva", "sivalogin");
		credentialsMap.put("india", "indialogin");
		credentialsMap.put("usa", "usalogin");
		apiKeys.add("jkhjh54EASDFZ44j3bgk");
		apiKeys.add("aw4w398URHWEIJRwef");
		apiKeys.add("SDF345wrfgrw4tgedfg");

	}

	@PostMapping("/login")
	public ApiResponse login(@RequestBody LoginCreds creds) {
		boolean isValidCreds = false;
		if (LoginController.credentialsMap.containsKey(creds.getUserName())) {
			if (LoginController.credentialsMap.get(creds.getUserName()).equals(creds.getPassword())) {
				isValidCreds = true;
			}
		}
		return buildResponse(isValidCreds);
	}

	@GetMapping("/loginKey")
	public ApiResponse loginKey(@RequestHeader("x-api-key") String apiKey) {
		return buildResponse(apiKeys.contains(apiKey));
	}

	private ApiResponse buildResponse(boolean isValid) {
		ApiResponse response = new ApiResponse();
		response.setStatusCode(2000);
		if (isValid) {
			response.setDevMsg("valid creds");
			response.setUserMsg("UI: Login Successful");
		} else {
			response.setDevMsg("Invalid creds");
			response.setUserMsg("UI: Login Unsuccessful");
		}
		return response;
	}
}
