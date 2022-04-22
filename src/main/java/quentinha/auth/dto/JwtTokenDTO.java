package quentinha.auth.dto;

public class JwtTokenDTO {

	public String token;

	public JwtTokenDTO() {
	}

	public JwtTokenDTO(String token) {
		this.token = token;
	}

	public String getToken() {
		return this.token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "JwtTokenDTO [token=" + token + "]";
	}
	
	
}
