package rs.bg.ac.fon.elab.iteh.exit.dto;

import lombok.Data;

@Data
public class AuthenticationResponse {
    private String email;
    private String password;
    private String accessToken;
    private String tokenType;
}