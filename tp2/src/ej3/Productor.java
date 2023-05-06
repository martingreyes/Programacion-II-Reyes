package ej3;

public class Productor implements Runnable {
    private Almacenamiento almacenamiento;

    public Productor(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void run() {

        for (int i = 0; i < 40; i++) {
            int valor = (int) (Math.random() * 13) + 3;
            almacenamiento.agregar(valor);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
