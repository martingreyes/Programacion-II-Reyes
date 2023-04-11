//Modificar el ejercicio 4 y agregar 2 parámetros más, uno para la ubicación en el eje X y otro para el eje Y.
//        Agregar excepciones para que:
//        ● Al crear el objeto los valores de los parámetros no pueden ser negativos. Los parámetros a contemplar deben ser los que definen a la figura geométrica. También debe verificarse al querer cambiar los parámetros con los setter.
//        ● Al crear el objeto los valores de los parámetros de la ubicación en eje X y eje Y no pueden ser negativos. También debe verificarse al querer cambiar los parámetros con los setter.
//        El código debe incluir una parte donde se generan a propósito cada una de las excepciones definidas y el tratamiento del mismo.

import clases.*;
public class Main {
    public static void main(String[] args) throws MiExcepcion {

        try {
            Circulo figura1 = new Circulo(-5);
        } catch (Exception e) {
            System.out.println("\n" + e);
        }

        Circulo figura2 = new Circulo(5);

        try {
            figura2.setUbicacion(-2,-4);
        } catch (Exception e) {
            System.out.println("\n" + e);
        }

        try {
            figura2.setUbicacion(2,4);
            System.out.println("\n" + figura2 + " con ubicación " + figura2.getUbicacion());
        } catch (Exception e) {
            System.out.println("\n" + e);
        }

    }
}