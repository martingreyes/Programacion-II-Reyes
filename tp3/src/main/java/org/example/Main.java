package org.example;
/*Crear una clase FechaPropia que maneje fechas en formato string “AAAA-MM-DD”.
        Debe tener un constructor que permita crear una fecha en el formato dado anteriormente.
        La clase debe tener 2 métodos, sumarDias y restarDias donde se envía un número entero indicando la cantidad de días que se quiere
        sumar o restar.
        El cálculo de la fecha debe realizarse sin la ayuda de ninguna clase extra de Java, ya sea de librería externa o de alguna clase que
        exista en las clase estándares de Java (el cálculo es manual).*/

public class Main {
    public static void main(String[] args) {

        Fecha fecha = new Fecha(2021,01,01);

        System.out.println(fecha.sumarDias(1));


    }
}