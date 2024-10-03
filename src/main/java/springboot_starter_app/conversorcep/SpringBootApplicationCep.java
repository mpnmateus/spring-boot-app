package springboot_starter_app.conversorcep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springboot_starter_app.calculadora.SpringBootAppApplication;

@SpringBootApplication
public class SpringBootApplicationCep {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationCep.class, args);
    }
    @Bean
    public CommandLineRunner run(ConversorJson conversor) throws Exception {
        return args -> {
            String json = "{\"cep\": \"01001-000\", \"logradouro\": \"Praça da Sé\", \"Localidade\": \"POA\"}";
            ViaCepResponse response = conversor.converter(json);
            System.out.println("Dados do CEP: " + response);
        };
    }
}
