package springboot_starter_app.conversorcep;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

@Component
public class ConversorJson {
    private Gson gson;
    public ViaCepResponse converter (String json){
        ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
        return response;
    }
}
