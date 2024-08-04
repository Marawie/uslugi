package uslugi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UslugiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UslugiApplication.class, args);
	}
// TODO: zmienic yml dla deva tylko zamiast prod.env to zrobic app jakies properties i przeanalizowac dockera bo nie dzIała jak trzeba
}
