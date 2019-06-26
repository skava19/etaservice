package etaservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

	@SpringBootApplication
	public class AppStarter {	

		 public static void main(String[] args) {
		        SpringApplication.run(AppStarter.class, args);
		    }
		 
	    @Configuration
	    @ComponentScan(lazyInit = true)
	    static class LocalConfig {
	    }
	}

