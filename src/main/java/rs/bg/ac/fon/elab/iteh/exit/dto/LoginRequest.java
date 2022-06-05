package rs.bg.ac.fon.elab.iteh.exit.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}