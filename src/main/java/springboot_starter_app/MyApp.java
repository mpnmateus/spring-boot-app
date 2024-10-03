package springboot_starter_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {

        System.out.println("O resultado da soma é: " + calculadora.somar(7, 2));
    }
}
