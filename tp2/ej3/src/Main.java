//Mejorar al ejercicio anterior agregando las siguientes excepciones.
//        Una excepción para la función 7 si el indice es mas grande que la cantidad de elementos de la lista.
//        Una excepción para la función 8 si el indice es mayor a la cantidad de elementos en la lista.
//        Una excepción para la función 9 y 10 si la lista de elementos es vacía.
//        Una excepción para la función 10 si el elemento en la lista no existe.
import clases.*;
public class Main {
    public static void main(String[] args) throws MiExcepcion {

        Empleado empleado1 = new Empleado("Martin", "Reyes", 60150, 2);
        Empleado empleado2 = new Empleado("Facundo", "Guarnier", 60155, 1);
        Empleado empleado3 = new Empleado("Luis", "Sarmiento", 60160, 3);

        ListaGenerica <Empleado> empleados = new ListaGenerica<>();

        empleados.agregar(empleado1);
        empleados.agregar(empleado2);

        try {
            empleados.agregarEnPosicion(empleado3,5);
        } catch (Exception e) {
            System.out.println("\n" + e);
        }

        try {
            System.out.println("\nEl elemento en la posición 5 es: " + empleados.obtenerEnPosicion(5));
        } catch (Exception e) {
            System.out.println("\n" + e);
        }

        empleados.eliminarEnPosicion(1);
        empleados.eliminarEnPosicion(0);

        try {
            empleados.obtenerPrimero();
        } catch (Exception e) {
            System.out.println("\n" + e);
        }

        try {
            empleados.obtenerUltimo();
        } catch (Exception e) {
            System.out.println("\n" + e);
        }
    }
}