package br.fiap.assistencia.tecnica.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SenhaConfig {
    public PasswordEncoder enconder(){
        return new BCryptPasswordEncoder(12);
    }
}
