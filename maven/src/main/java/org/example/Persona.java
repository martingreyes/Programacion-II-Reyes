package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    protected String nombre;
    protected String apellido;
    protected boolean activo;
    protected int codigo;
}
