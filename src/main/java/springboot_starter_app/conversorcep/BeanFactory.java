package springboot_starter_app.conversorcep;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFactory {
    @Bean
    public Gson gson(){
        return new Gson();
    }
}
