package seminars.my_first_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MyFirstCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstCrudApplication.class, args);
	}

}
