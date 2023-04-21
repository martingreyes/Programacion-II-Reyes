//Crear una clase hilo que sea capaz de calcular el factorial de un número utilizando un bucle for, la fuente de datos para el cálculo es una lista de valores enteros.
//        El hilo debe tomar cada uno de los valores de la lista, quitarlo, calcular el valor, esperar 5 segundos y tomar el siguiente.
//        Una vez terminada la lista el hilo debe finalizar
//        Cada hilo tiene un identificador (nombre) y al procesar el valor debe mostrar por pantalla lo siguiente:
//        “Hilo NOMBRE procesando la lista. Valor a calcular: VALOR. Resultado: RESULTDO. Quedan XX elementos en la lista por procesar.”
//        Crear una lista de 40 valores enteros de entre 3 y 15.
//        1- Crear un objeto de la clase hilo para que procese los valores de la lista.
//        2- Crear 3 objetos de la clase hilo para que procese los valores de la lista, los 3 hilos deben trabajar sobre la misma lista.

import ej2.HiloFactorial;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        List<Integer> valores = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            Integer valor = (int) (Math.random() * 13) + 3;
            valores.add(valor);
        }

        HiloFactorial hilo1 = new HiloFactorial(valores, "Hilo 1");

        System.out.println("\nConsigna 1:");
        hilo1.start();
        try {
            hilo1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nConsigna 2:");
        HiloFactorial hilo2 = new HiloFactorial(valores, "Hilo 2");
        HiloFactorial hilo3 = new HiloFactorial(valores, "Hilo 3");
        HiloFactorial hilo4 = new HiloFactorial(valores, "Hilo 4");

        hilo2.start();
        hilo3.start();
        hilo4.start();


    }
}