package ar.edu.programacion2.anio2023.tp4b.entidades;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class Domicilio {

    protected int id;
    protected String calle;
    protected int numero;
    protected String localidad;
    protected String provincia;

    public Domicilio(String calle, int numero, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.provincia = provincia;
    }
}
