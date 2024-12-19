package web.scrapper.omnivox_webscrapper_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = { DatasSourceAutoConfiguration.class })
public class OmnivoxWebscrapperApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmnivoxWebscrapperApiApplication.class, args);
	}

}
