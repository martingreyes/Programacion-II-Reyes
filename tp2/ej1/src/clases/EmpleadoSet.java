package clases;

import java.util.Objects;

public class EmpleadoSet extends Empleado {

    public EmpleadoSet(String nombre, String apellido, int legajo, int aniosTrabajados) {
        super(nombre, apellido, legajo, aniosTrabajados);
    }

    // Sobrescribimos los métodos equals y hashCode para que los objetos EmpleadoSet se comparen solo por su legajo
    // y que los objetos EmpleadoSet con el mismo legajo se consideren iguales y tengan el mismo hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpleadoSet empleadoSet = (EmpleadoSet) o;
        return getLegajo() == empleadoSet.getLegajo();
    }

    @Override
    public int hashCode() {
        return getLegajo();
    }

}
