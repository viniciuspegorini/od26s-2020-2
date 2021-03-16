package br.edu.utfpr.pb.od26s.server.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationResponse {
	
	private String token;
	
	// {"token" : "jwt" }
	
}
