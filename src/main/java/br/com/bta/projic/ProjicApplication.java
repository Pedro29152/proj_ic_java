package br.com.bta.projic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjicApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ProjicApplication.class);
		//app.setAddCommandLineProperties(false);
		app.run(args);
	}

}
