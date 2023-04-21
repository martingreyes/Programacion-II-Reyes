//Crear un hilo implementando la interfaz Runnable.
//        Debe manejar la misma funcionalidad del hilo anterior y se tiene que agregar la posibilidad de manejar los valores de XX
//        de iteraciones y de YYY de demora como atributos de la clase y poder asignarlos desde un constructor.

package ej1b;
import java.util.Random;
public class HiloRunnable implements Runnable{

    private String nombre;
    private int iteraciones;
    private int demora;
    public HiloRunnable() {

        this.nombre = "hiloRunnable";
        Random random = new Random();
        this.iteraciones = random.nextInt(31) + 10;
        this.demora = random.nextInt(950) + 50;
    }

    public HiloRunnable(String nombre, int iteraciones, int demora) {
        this.nombre = nombre;
        this.iteraciones = iteraciones;
        this.demora = demora;
    }

    @Override
    public void run() {
        for(int i=1; i <= iteraciones; i++) {
            System.out.println("Este es el hilo " + this.nombre + " y esta es la iteración " + i + " de " + this.iteraciones );
            try {
                Thread.sleep(this.demora);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("\n" + nombre + " muriendo ...\n");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIteraciones() {
        return iteraciones;
    }

    public void setIteraciones(int iteraciones) {
        this.iteraciones = iteraciones;
    }

    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }
}
