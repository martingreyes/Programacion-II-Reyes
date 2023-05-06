package ej5;

import java.util.concurrent.Callable;

public class Productor implements Callable {
    private ej5.Almacenamiento almacenamiento;

    public Productor(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void run() {
    }

    @Override
    public String call() throws Exception {
        System.out.println("Hilo productor arrancando ...");
        for (int i = 0; i < 40; i++) {
            int valor = (int) (Math.random() * 13) + 3;
            almacenamiento.agregar(valor);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
