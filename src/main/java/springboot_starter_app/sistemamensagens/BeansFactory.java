package springboot_starter_app.sistemamensagens;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansFactory {
    @Bean
    public Remetente remetente (){
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com.br");
        remetente.setNome("Tech Elite");
        return remetente;
    }
}
