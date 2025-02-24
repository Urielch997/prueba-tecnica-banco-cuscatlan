package bancocuscatlan.core.bancocuscatlan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BancocuscatlanApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancocuscatlanApplication.class, args);
	}

}
