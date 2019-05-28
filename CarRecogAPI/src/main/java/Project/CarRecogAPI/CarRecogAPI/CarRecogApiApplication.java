//Main Class- used to run application
package Project.CarRecogAPI.CarRecogAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CarRecogApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRecogApiApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CarInfo car= context.getBean(CarInfo.class);
		
		
		System.out.println(car.toString());
	}

}
