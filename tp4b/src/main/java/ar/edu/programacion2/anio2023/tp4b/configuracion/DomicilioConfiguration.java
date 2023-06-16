package ar.edu.programacion2.anio2023.tp4b.configuracion;

import ar.edu.programacion2.anio2023.tp4b.entidades.Domicilio;
import ar.edu.programacion2.anio2023.tp4b.servicios.DomicilioMemoriaService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class DomicilioConfiguration {

    private DomicilioMemoriaService domicilioMemoriaService;

    @Autowired
    public DomicilioConfiguration(DomicilioMemoriaService domicilioMemoriaService) {
        this.domicilioMemoriaService = domicilioMemoriaService;
        inicializarDomicilios();
    }

    private void inicializarDomicilios() {

        Domicilio domicilio1 = new Domicilio("Calle 1", 123, "Localidad 1", "Provincia 1");
        Domicilio domicilio2 = new Domicilio("Calle 2", 123, "Localidad 2", "Provincia 2");
        Domicilio domicilio3 = new Domicilio("Calle 3", 123, "Localidad 3", "Provincia 3");

        domicilioMemoriaService.add(domicilio1);
        domicilioMemoriaService.add(domicilio2);
        domicilioMemoriaService.add(domicilio3);

    }
}
