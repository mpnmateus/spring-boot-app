package springboot_starter_app.sistemamsgsproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagemProperties implements CommandLineRunner {
    @Value("${name:NoReply-DIO}")
    private String nome;

    @Value("${email}")
    private String email;

    @Value("${telefones}")
    private List<Long> telefones =
            new ArrayList<>(Arrays.asList(new Long[]{51999999999L}));

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por "
                + nome + ", e-mail: " + email + ", telefone(s): " + telefones);
        System.out.println("Seu cadastro foi aprovado!");
    }


}
