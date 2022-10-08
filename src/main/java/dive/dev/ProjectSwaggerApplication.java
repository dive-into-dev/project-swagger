package dive.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import dive.dev.services.UserServices;

@SpringBootApplication
public class ProjectSwaggerApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				SpringApplication.run(ProjectSwaggerApplication.class, args);
		UserServices userServices = applicationContext.getBean(UserServices.class);
		userServices.init();
	}

}
