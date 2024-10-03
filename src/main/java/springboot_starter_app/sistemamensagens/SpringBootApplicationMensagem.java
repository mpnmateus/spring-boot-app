package springboot_starter_app.sistemamensagens;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

public class SpringBootApplicationMensagem {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationMensagem.class, args);
    }
    @Bean
    public CommandLineRunner run(SistemaMensagem sistema) {
        return args -> {

        };
    }
}
