package ma.simplemavenproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleMavenProjectApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SimpleMavenProjectApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from this maven project");
    }
}
