package org.example;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@PropertySource("classpath:config.properties")
public class ConfigurationProperties {
    @Value("${exponente}")
    private int exponente;

    @Value("${raiz}")
    private int raiz;

    public int getExponente() {
        return exponente;
    }

    public int getRaiz() {
        return raiz;
    }
}