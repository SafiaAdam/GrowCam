package Project.CarRecogAPI.CarRecogAPI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

@Configuration
@PropertySource("Data.properties")
public class AppConfig {
	
	
	//Retrieves values from Data.properties file
	@Value("${user.email}")
	private String email;
	@Value("${user.password}")
	private String password;
	@Value("${user.url4}")
	private String url;
	
	//CarInfo constructor configuration
	@Bean
	public CarInfo carInfo(){
		RestTemplate rest = new RestTemplate();
		CarInfo car = rest.getForObject("http://cloud.eyedea.cz/api/v2/cardetect.json?"+email+password+url, CarInfo.class);
		return car;
	}

}
