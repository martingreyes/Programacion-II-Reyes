//Crear una clase Empleado con atributo nombre, apellido, legajo, aniosTrabajados
//Sobrescribir el método toString() para ver una representación entendible de un objeto de la clase.
//        Agregar un método estático que reciba un string con formato “nombre=nombre, apellido=apellido, legajo=legajo,aniosTrabajados=aniosTrabajados” y que devuelva un nuevo objeto del tipo Empleado.
//        Ejemplo:
//        “nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=10”
//        El string puede estar separado por coma, con o sin espacio y se debe contemplar en caso de tener espacio que no quede reflejado en el valor de los atributos, los nombres de los atributos pueden estar desordenados y estar en mayúsculas, minúsculas o mezclado.
//        Todos estos ejemplos deberían generar el mismo objeto:
//        “nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=10” “nombre=Pablo,apellido=Marquez,legajo=E001,aniosTrabajados=10” “nombre=Pablo ,apellido=Marquez ,legajo=E001, aniosTrabajados=10” “Nombre=Pablo,apellidO=Marquez ,LEGAJO=E001, ANIOStrabajados=10” “nombre=Pablo,legajo=E001,aniosTrabajados=10,apellido=Marquez”
//        Crear una excepción al crear el objeto que evalúe las siguientes condiciones:
//        ● todos los campos tienen que estar presentes
//        ● todos los campos tienen que tener datos
//        ● el campo aniosTrabajados tiene que ser un valor numérico entero, mayor a cero
//        Cuando nos referimos a que todos los campos tienen que tener valor se refiere a que no puede haber una definición de este tipo:
//        “nombre=Pablo, apellido=, legajo=E001, aniosTrabajados=10”
//        El código debe incluir una parte donde se generan a propósito cada una de las excepciones definidas y el tratamiento del mismo.

import clases.Empleado;
import clases.MiExcepcion;
public class Main {
    public static void main(String[] args) throws MiExcepcion {

        Empleado empleado1 = Empleado.fromString("nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=10");

        Empleado empleado2 = Empleado.fromString("nombre=Pablo,apellido=Marquez,legajo=E001,aniosTrabajados=10");

        Empleado empleado3 = Empleado.fromString("nombre=Pablo ,apellido=Marquez ,legajo=E001, aniosTrabajados=10");

        Empleado empleado4 = Empleado.fromString("Nombre=Pablo,apellidO=Marquez ,LEGAJO=E001, ANIOStrabajados=10");

        Empleado empleado5 = Empleado.fromString("nombre=Pablo,legajo=E001,aniosTrabajados=10,apellido=Marquez");

        System.out.println("\nSon todos los objetos iguales? " + (empleado1.equals(empleado2) && empleado2.equals(empleado3) && empleado3.equals(empleado4) && empleado4.equals(empleado5)));

        try {
            Empleado empleado6 = Empleado.fromString("nombre=Pablo, apellido=, legajo=E001, aniosTrabajados=10");
        } catch (Exception e) {
            System.out.println("\n" + e);
        }

        try {
            Empleado empleado6 = Empleado.fromString("nombre=Pablo, legajo=E001, aniosTrabajados=10");
        } catch (Exception e) {
            System.out.println("\n" + e);
        }

        try {
            Empleado empleado6 = Empleado.fromString("nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=1a");
        } catch (Exception e) {
            System.out.println("\n" + e);
        }

        try {
            Empleado empleado6 = Empleado.fromString("nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=-1");
        } catch (Exception e) {
            System.out.println("\n" + e);
        }

    }
}