package ar.edu.programacion2.anio2023.tp4b.configuracion;

import ar.edu.programacion2.anio2023.tp4b.entidades.Persona;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "martin", ignoreUnknownFields = true)
public class PersonaConfiguration {
    protected String url;
    protected String puerto;
    protected Persona pers;

}
