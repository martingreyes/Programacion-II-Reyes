// Ejecutar en la clase main 4 hilos de la clase definida en el punto a y 4 de hilos definidos en el punto b,
// y ver que todos se ejecuten simultáneamente.
import ej1a.HiloThread;
import ej1b.HiloRunnable;

public class Main1 {
    public static void main(String[] args) {

        HiloThread hiloThread1 = new HiloThread("Hilo1");
        HiloThread hiloThread2 = new HiloThread();

        HiloRunnable hiloRunnable1 = new HiloRunnable("Hilo3",12,55);
        Thread hilo3 = new Thread(hiloRunnable1);

        HiloRunnable hiloRunnable2 = new HiloRunnable();
        hiloRunnable2.setIteraciones(10);
        hiloRunnable2.setDemora(50);
        Thread hilo4 = new Thread(hiloRunnable2);

        hiloThread1.start();
        hiloThread2.start();
        hilo3.start();
        hilo4.start();



    }
}