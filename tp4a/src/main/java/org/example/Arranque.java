package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Arranque {
    @Autowired
    CalculatorService calculatorService;
    public void arranque() {
        System.out.println("Arrancó la app");

        // Realiza los cálculos de raíces y potencias llamando a las funciones del servicio
        double base = 2.0;
        double exponente = 3.0;
        double value = 16.0;
        double index = 2.0;

        // Calcula la potencia entre 2 números
        System.out.println("Potencia: " + calculatorService.power(base, exponente));
        System.out.println("Potencia con exponente por defecto: " + calculatorService.power(base));
        System.out.println();

        // Calcula la raíz entre 2 números
        System.out.println("Raíz: " + calculatorService.sqrt(value, index));
        System.out.println("Raíz con índice por defecto: " + calculatorService.sqrt(value));
        System.out.println();

        // Realiza los cálculos nuevamente
        base = 3.0;
        exponente = 4.0;
        value = 25.0;
        index = 3.0;

        // Calcula la potencia entre 2 números
        System.out.println("Potencia: " + calculatorService.power(base, exponente));
        System.out.println("Potencia con exponente por defecto: " + calculatorService.power(base));
        System.out.println();

        // Calcula la raíz entre 2 números
        System.out.println("Raíz: " + calculatorService.sqrt(value, index));
        System.out.println("Raíz con índice por defecto: " + calculatorService.sqrt(value));

    }
}
