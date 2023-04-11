//Crear una clase Empleado con atributo nombre, apellido, legajo, aniosTrabajados Sobrescribir el método toString() para ver una representación entendible de un objeto de la clase.
//        Crear una lista con 5 empleados.
//        Crear un mapa <String, Empleado> y copiar los 5 empleados, la clave del mapa debe ser un string con la combinación de apellido+",”+nombre.
//        Iterar sobre el mapa y mostrar la clave y el objeto Empleado.

import clases.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) {

        List<Empleado> listaEmpleados = new ArrayList<>();

        Empleado empleado1 = new Empleado("Martin", "Reyes", 60150, 2);
        Empleado empleado2 = new Empleado("Facundo", "Guarnier", 60155, 1);
        Empleado empleado3 = new Empleado("Luis", "Sarmiento", 60160, 3);
        Empleado empleado4 = new Empleado("Bruno", "Orbelli", 60162, 4);
        Empleado empleado5 = new Empleado("Juan", "Perez", 60190, 5);

        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        listaEmpleados.add(empleado4);
        listaEmpleados.add(empleado5);

        Map<String, Empleado> mapaEmpleados = new HashMap<>();
        for (Empleado empleado : listaEmpleados) {
            String clave = empleado.getApellido() + ", " + empleado.getNombre();
            mapaEmpleados.put(clave, empleado);
        }

        for (String clave : mapaEmpleados.keySet()) {
            Empleado empleado = mapaEmpleados.get(clave);
            System.out.println("\nClave: " + clave + ", Empleado: " + empleado);
        }

    }
}