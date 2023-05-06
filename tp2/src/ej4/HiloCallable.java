package ej4;

import java.util.concurrent.Callable;

public class HiloCallable implements Callable<String> {
    protected String nombre;
    protected int demora;
    protected int iteraciones;

    public HiloCallable(String nombre, int demora, int iteraciones) {
        this.nombre = nombre;
        this.demora = demora;
        this.iteraciones = iteraciones;
    }

    @Override
    public String call() throws Exception {
        System.out.println(this.nombre + " arrancando ...");
        for (int i = 0; i < this.iteraciones; i++) {
            System.out.println("Este es el hilo " + this.nombre + " y esta es la iteración " + i + " de " + this.iteraciones);
            try {
                Thread.sleep(this.demora);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return this.nombre + " muriendo ...";
    }

}
