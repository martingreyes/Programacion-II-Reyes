package ar.edu.programacion2.anio2023.tp4b.servicios;

import ar.edu.programacion2.anio2023.tp4b.entidades.Domicilio;

import java.util.List;

public interface DomicilioRepositorio {

    public Domicilio get(int id);

    public List<Domicilio> getAll();
    public void add(Domicilio domicilio);
    public void remove(int id);
    public void remove(Domicilio d);
    public void put(int id, Domicilio d);


}
