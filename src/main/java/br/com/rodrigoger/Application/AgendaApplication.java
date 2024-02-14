package br.com.rodrigoger.Application;

import br.com.rodrigoger.EntidadesDominio.Faculdades;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AgendaApplication{

    @Bean
    public CommandLineRunner init(){
        return args -> {
            Faculdades f = new Faculdades();

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(AgendaApplication.class,args);
    }
}
