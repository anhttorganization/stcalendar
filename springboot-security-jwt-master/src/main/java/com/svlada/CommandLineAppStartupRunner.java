package com.svlada;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.svlada.security.config.JwtSettings;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(new JwtSettings().getTokenIssuer());
	}

}
