import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by prashu on 27/8/17.
 */
@SpringBootApplication
@ComponentScan("com.crm")
@EnableJpaRepositories("com.crm.dao")
@EntityScan("com.crm.model")
public class CRMApplication {
    public static void main(String[] args) {
        SpringApplication.run(CRMApplication.class, args);
    }
}
