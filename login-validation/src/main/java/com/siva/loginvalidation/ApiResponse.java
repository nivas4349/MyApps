package com.siva.loginvalidation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Siva Srinivasa Pasam
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
	private int statusCode;
	private String devMsg;
	private String userMsg;
}
