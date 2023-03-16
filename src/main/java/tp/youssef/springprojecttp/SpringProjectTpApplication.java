package tp.youssef.springprojecttp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("tp.youssef.springprojecttp.model")
@EnableJpaRepositories("tp.youssef.springprojecttp.repository")
public class SpringProjectTpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectTpApplication.class, args);
    }

}
