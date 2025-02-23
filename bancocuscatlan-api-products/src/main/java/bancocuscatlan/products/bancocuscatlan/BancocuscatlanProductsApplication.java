package bancocuscatlan.products.bancocuscatlan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BancocuscatlanProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancocuscatlanProductsApplication.class, args);
	}

}
