package org.example;

public class EjemploException extends Exception{
    // Definición de constructores
    public EjemploException() {
        super("Texto genérico de excepción");
    }

    public EjemploException(String msg) {
        super(msg);
    }


}
