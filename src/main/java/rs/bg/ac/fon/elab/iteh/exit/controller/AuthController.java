package rs.bg.ac.fon.elab.iteh.exit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import rs.bg.ac.fon.elab.iteh.exit.dto.AuthenticationResponse;
import rs.bg.ac.fon.elab.iteh.exit.dto.LoginRequest;
import rs.bg.ac.fon.elab.iteh.exit.dto.RegisterRequest;
import rs.bg.ac.fon.elab.iteh.exit.model.User;


@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*",
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
public class AuthController {

    private final AuthenticationManager manager;

    @Autowired
    public AuthController(AuthenticationManager manager) {
        this.manager = manager;
    }

    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginRequest loginRequest) {
            return null;
    }

    @PostMapping("/register")
    @CrossOrigin(origins = "http://localhost:8100")
    public ResponseEntity<?> register(@RequestBody RegisterRequest registerRequest) {
        return null;
    }

}
