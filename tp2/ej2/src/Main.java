//Crear una clase Empleado con atributo nombre, apellido, legajo, aniosTrabajados
//Crear una clase generica ListaGenerica que permita mantener una lista de objetos que implementan la interfaz comparable.
//        1. Definir un método que permita agregar un elemento a la lista.
//        2. Definir un método que devuelva la lista de objetos.
//        3. Definir un método que devuelva la cantidad de elementos almacenados en la lista.
//        4. Definir un método que permita agregar un elemento al principio de la lista.
//        5. Definir un método que permita ordenar la lista.
//        6. Definir un método que permita desordenar (barajar) la lista.
//        7. Definir un método que permita almacenar un elemento en una posición particular de la lista, los parámetros que recibe son el objeto a almacenar y la posición en la lista.
//        8. Definir un método que devuelva el objeto en una posición específica de la lista
//        9. Definir un método que devuelva el objeto en la primer posición de la lista
//        10. Definir un método que devuelva el objeto en la ultima posición posición de la lista
//        11. Definir un método que remueva un objeto en una posición particular de la lista.

import clases.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Martin", "Reyes", 60150, 2);
        Empleado empleado2 = new Empleado("Facundo", "Guarnier", 60155, 1);
        Empleado empleado3 = new Empleado("Luis", "Sarmiento", 60160, 3);
        Empleado empleado4 = new Empleado("Bruno", "Orbelli", 60162, 4);

        System.out.println("\n" + empleado1.getNombre() + " trabajó más que " + empleado2.getNombre() + " ?");

        if (empleado1.compareTo(empleado2) == 1) {
            System.out.println("Si");
        } else if (empleado1.compareTo(empleado2) == -1){
            System.out.println("No");
        } else {
            System.out.println("Trabajaron lo mismo");
        }

        ListaGenerica <Empleado> empleados = new ListaGenerica<>();

        empleados.agregar(empleado1);
        empleados.agregar(empleado2);

        System.out.println("\nLista: " + empleados.obtenerLista());

        System.out.println("\nHay " + empleados.cantidadElementos() + " elementos en la lista");

        empleados.agregarAlPrincipio(empleado3);

        System.out.println("\nLista nueva: " + empleados.obtenerLista());

        empleados.ordenar();

        System.out.println("\nLista ordenada: " + empleados.obtenerLista());

        empleados.desordenar();

        System.out.println("\nLista desordenada: " + empleados.obtenerLista());

        empleados.agregarEnPosicion(empleado4,1);

        System.out.println("\nLista nueva: " + empleados.obtenerLista());

        System.out.println("\nEl elemento en la posición 2 es: " + empleados.obtenerEnPosicion(2));

        System.out.println("\nEl primer elemento es: " + empleados.obtenerPrimero());

        System.out.println("\nEl último elemento es: " + empleados.obtenerUltimo());

        empleados.eliminarEnPosicion(1);

        System.out.println("\nLista nueva: " + empleados.obtenerLista());











    }
}