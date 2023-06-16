package ar.edu.programacion2.anio2023.tp4b.servicios;

import ar.edu.programacion2.anio2023.tp4b.entidades.Persona;

import java.util.List;

public interface PersonaRepositorio {
    public Persona get(int codigo);

    public List<Persona> getAll();
    public void add(Persona persona);
    public void remove(int codigo);
    public void remove(Persona p);
    public void put(int codigo, Persona p);
}
