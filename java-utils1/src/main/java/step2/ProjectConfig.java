package step2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import step1.Parrot;


@Configuration
public class ProjectConfig {
	
	@Bean
	Parrot parrot() {
		Parrot p = new Parrot();
		
		p.setName("KoKo");
		
		return p;
	}
	
	@Bean(name="miki")
	Parrot parrot2() {
		Parrot p = new Parrot();
		
		p.setName("MiKi");
		
		return p;
	}
	
	@Bean
	Parrot parrot3() {
		Parrot p = new Parrot();
		
		p.setName("Riki");
		
		return p;
	}
	
	@Bean
	String hello() {
		return "Hello";
	}
	
	@Bean
	int ten() {
		return 10;
	}
}
