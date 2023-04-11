package clases;

import java.util.Objects;

public class EmpleadoSet extends Empleado {

    public EmpleadoSet(String nombre, String apellido, int legajo, int aniosTrabajados) {
        super(nombre, apellido, legajo, aniosTrabajados);
    }

    // Sobrescribimos los métodos equals y hashCode para que los objetos EmpleadoSet se comparen solo por todos sus atributos
    // y que los objetos EmpleadoSet con todos los atributos iguales se consideren iguales y tengan el mismo hashCode

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EmpleadoSet) {
            EmpleadoSet emp = (EmpleadoSet) obj;
            return this.getLegajo() == emp.getLegajo() &&
                    this.getAniosTrabajados() == emp.getAniosTrabajados() &&
                    this.getNombre().equals(emp.getNombre()) &&
                    this.getApellido().equals(emp.getApellido());
        }
        return false;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.getNombre() == null) ? 0 : getNombre().hashCode());        // el operador ternario ? funciona asi:
        result = prime * result + ((this.getApellido() == null) ? 0 : getApellido().hashCode());    // <expresion_booleana> ? <valor_si_es_verdadero> : <valor_si_es_falso>
        result = prime * result + this.getLegajo();
        result = prime * result + this.getAniosTrabajados();
        return getLegajo();
    }
}

// El método equals() compara si dos objetos son exactamente el mismo objeto en la memoria.
// El método hashCode() es un método de la clase Object de Java que devuelve un número entero (el código hash) que representa el objeto.
// La forma en que se calcula el código hash es utilizando una fórmula que involucra multiplicar el valor de cada atributo por un número primo (31 en este caso)
// y luego sumar los resultados. El valor resultante de esta operación es el código hash que se devuelve.
// Por ejemplo, si tenemos dos objetos de la clase Empleado con los mismos valores de nombre, apellido, legajo y años trabajados, su código hash será el mismo,
// lo que significa que estos objetos son iguales para las estructuras de datos de Java
// Es importante mantener la consistencia entre estos los métodos equals() y hashCode(),
// de manera que si dos objetos son iguales, deben tener el mismo código hash, y viceversa.