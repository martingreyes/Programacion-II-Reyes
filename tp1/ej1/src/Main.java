
/*Crear una clase Empleado con atributo nombre, apellido, legajo, aniosTrabajados
  Sobrescribir el método toString() para ver una representación entendible de un objeto de la clase
  Crear en la clase de arranque un Set de empleados.
  Crear 5 objetos empleado, donde 2 empleados tienen los mismos valores de atributos, agregarlos al set
  Iterar sobre el set y mostrar los objetos empleados
  Crear una herencia de la clase Empleado (EmpleadoSet) y modificarla para que cuando se agreguen EmpleadoSet a un set, los repetidos sean ignorados. Investigar como se hace.
  Crear 5 objetos empleadoSet, donde 2 empleados tienen los mismos valores de atributos, agregarlos al set
  Iterar sobre el set y mostrar los objetos empleados. Verificar que el duplicado no existe.*/

import clases.Empleado;
import clases.EmpleadoSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set <Empleado> miSet = new HashSet<>();

        Empleado empleado1 = new Empleado("Martin", "Reyes", 60150, 2);
        Empleado empleado2 = new Empleado("Martin", "Reyes", 60150, 2);
        Empleado empleado3 = new Empleado("Facundo", "Guarnier", 60155, 1);
        Empleado empleado4 = new Empleado("Luis", "Sarmiento", 60160, 3);
        Empleado empleado5 = new Empleado("Bruno", "Orbelli", 60162, 4);

        miSet.add(empleado1);
        miSet.add(empleado2);
        miSet.add(empleado3);
        miSet.add(empleado4);
        miSet.add(empleado5);

        System.out.println("\nObjetos Empleado:");
        for (Empleado empleado: miSet) {
            System.out.println(" - " + empleado);
        }

        Set <EmpleadoSet> miSet2 = new HashSet<>();

        EmpleadoSet empleadoset1 = new EmpleadoSet("Martin", "Reyes", 60150, 2);
        EmpleadoSet empleadoset2 = new EmpleadoSet("Martin", "Reyes", 60150, 2);
        EmpleadoSet empleadoset3 = new EmpleadoSet("Facundo", "Guarnier", 60155, 1);
        EmpleadoSet empleadoset4 = new EmpleadoSet("Luis", "Sarmiento", 60160, 3);
        EmpleadoSet empleadoset5 = new EmpleadoSet("Bruno", "Orbelli", 60162, 4);

        miSet2.add(empleadoset1);
        miSet2.add(empleadoset2);
        miSet2.add(empleadoset3);
        miSet2.add(empleadoset4);
        miSet2.add(empleadoset5);

        System.out.println("\nObjetos EmpleadoSet:");
        for (EmpleadoSet empleadoSet : miSet2) {
            System.out.println(" - " + empleadoSet);
        }



    }
}