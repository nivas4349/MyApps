package com.siva.loginvalidation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @author: Siva Srinivasa Pasam
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginCreds {
	
	@NonNull
	private String userName;
	
	@NonNull
	private String password;
}
