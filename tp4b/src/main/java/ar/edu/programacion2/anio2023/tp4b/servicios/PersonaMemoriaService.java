package ar.edu.programacion2.anio2023.tp4b.servicios;

import ar.edu.programacion2.anio2023.tp4b.entidades.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PersonaMemoriaService implements PersonaRepositorio {
    protected Map<Integer, Persona> personas;

    public PersonaMemoriaService() {

        this.personas = new HashMap<>();
    }

    @Override
    public Persona get(int codigo) {
        Persona p = this.personas.get(codigo);
        return p;
    }

    @Override
    public void add(Persona p) {
        this.personas.put(p.getCodigo(), p);
    }

    @Override
    public void remove(int codigo) {
        this.personas.remove(codigo);
    }

    @Override
    public void remove(Persona p) {
        this.personas.remove(p.getCodigo());
    }

    @Override
    public void put(int codigo, Persona p) {
        Persona persona = this.personas.get(codigo);
        this.personas.remove(codigo);
        Persona persona2 = p;
        persona2.setCodigo(codigo); // para q no se pueda modificar el codigo
        this.personas.put(persona2.getCodigo(), persona2);
    }

    @Override
    public List<Persona> getAll() {
        List<Persona> personas;
        personas = this.personas.values().stream().collect(Collectors.toCollection(ArrayList::new));
        return personas;
    }
}

