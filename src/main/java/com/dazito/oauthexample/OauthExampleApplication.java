package com.dazito.oauthexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@EnableResourceServer
@SpringBootApplication
public class OauthExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthExampleApplication.class, args);
	}
}
