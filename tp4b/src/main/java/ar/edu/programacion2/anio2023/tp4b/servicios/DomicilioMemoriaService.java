package ar.edu.programacion2.anio2023.tp4b.servicios;

import ar.edu.programacion2.anio2023.tp4b.entidades.Domicilio;
import ar.edu.programacion2.anio2023.tp4b.entidades.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DomicilioMemoriaService implements DomicilioRepositorio {

    protected Map<Integer, Domicilio> domicilios;
    protected int siguienteId;

    public DomicilioMemoriaService() {

        this.domicilios = new HashMap<>();
        siguienteId = 0;
    }

    @Override
    public Domicilio get(int id) {
        Domicilio d = this.domicilios.get(id);
        return d;
    }

    @Override
    public List<Domicilio> getAll() {
        List<Domicilio> domicilios;
        domicilios = this.domicilios.values().stream().collect(Collectors.toCollection(ArrayList::new));
        return domicilios;
    }

    @Override
    public void add(Domicilio domicilio) {
        domicilio.setId(siguienteId);
        siguienteId = siguienteId + 1;
        this.domicilios.put(domicilio.getId(), domicilio);
    }

    @Override
    public void remove(int id) {
        this.domicilios.remove(id);
    }

    @Override
    public void remove(Domicilio d) {
        this.domicilios.remove(d.getId());
    }

    @Override
    public void put(int id, Domicilio d) {
        Domicilio domicilio_viejo = this.domicilios.get(id);
        this.domicilios.remove(id);
        Domicilio domicilio_nuevo = d;
        domicilio_nuevo.setId(id);

        if (d.getCalle() == null) {
            domicilio_nuevo.setCalle(domicilio_viejo.getCalle());
        }
            if (d.getNumero() == 0) {
                domicilio_nuevo.setNumero(domicilio_viejo.getNumero());
           }
        if (d.getLocalidad() == null) {
            domicilio_nuevo.setLocalidad(domicilio_viejo.getLocalidad());
        }
        if (d.getProvincia() == null) {
            domicilio_nuevo.setProvincia(domicilio_viejo.getProvincia());
        }

        this.domicilios.put(domicilio_nuevo.getId(), domicilio_nuevo);

    }

}
