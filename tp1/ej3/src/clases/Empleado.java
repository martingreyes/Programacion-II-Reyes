package clases;
public class Empleado implements Comparable <Empleado>{

    private String nombre;
    private String apellido;
    private int legajo;
    private int aniosTrabajados;
    public Empleado() {
    }
    public Empleado(String nombre, String apellido, int legajo, int aniosTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " legajo: " + legajo + " antiguedad: " + aniosTrabajados;
    }

    @Override
    public int compareTo(Empleado otroEmpleado) {
        if (this.aniosTrabajados < otroEmpleado.getAniosTrabajados()) {
            return -1;
        }
        if (this.aniosTrabajados > otroEmpleado.getAniosTrabajados()) {
            return 1;
        }
        return 0;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }

}