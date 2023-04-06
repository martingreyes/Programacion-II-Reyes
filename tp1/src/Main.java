/*Crear una clase Persona con atributos nombre, apellido y edad.
        Crear una lista del tipo String y almacenar 5 nombres.
        Crear una lista del tipo String y almacenar 5 apellidos.
        Crear una lista de Personas y agregar 5 personas, donde el nombre y apellido corresponde a la posición 1 a 5 de las listas de nombre y apellido, y la edad es un número aleatorio entre 20 y 50 años.
        Reescribir el método toString() de la clase Persona para que muestre los datos formateados
        Mostrar la lista de personas
        Iterar sobre la lista de personas y buscar la persona más grande y mostrarla por pantalla.

 */


import clases.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Martin");
        nombres.add("Luisma");
        nombres.add("Facu");
        nombres.add("Leo");
        nombres.add("Papu");

        List<String> apellidos = new ArrayList<>();

        apellidos.add("Reyes");
        apellidos.add("Sarmiento");
        apellidos.add("Guarnier");
        apellidos.add("Messi");
        apellidos.add("Gomez");

        List<Persona> personas = new ArrayList<>();

        Persona persona = new Persona("x","x",3);

        for (int i=0; i<5; i++) {

            int edad = (int)(Math.random() * 31) + 20;

            personas.add(new Persona(nombres.get(i),apellidos.get(i),edad));

        }

        System.out.println(personas);

        String nombreMayor = "";

        int edadMayor = 0;

        for(Persona x : personas) {

            if (x.getEdad() > edadMayor) {

                edadMayor = x.getEdad();

                nombreMayor = x.getNombre();
            }
        }

        System.out.println("La persona más grande es " + nombreMayor + " con " + edadMayor + " años");

    }
}