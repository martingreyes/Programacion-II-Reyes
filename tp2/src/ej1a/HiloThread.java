//Crear un hilo extendiendo la clase Thread.
//        El hilo debe mostrar el mensaje “Este es el hilo NOMBRE y esta es la iteración XX” XX cantidad de veces.
//        Debe de haber una demora de YYY milisegundos entre iteración e iteración.
//        El valor NOMBRE debe ser manejado como atributo de la clase.
//        El valor XX de la iteración debe ser un número aleatorio de 10 a 40.
//        El valor YYY de demora es un valor en milisegundos que va de 50 a 999 ms.

package ej1a;
import java.util.Random;
public class HiloThread extends Thread{
    protected String nombre;
    public HiloThread() {
        this.nombre = "hiloThread";
    }
    public HiloThread(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        Random random = new Random();
        int iteraciones = random.nextInt(31) + 10;
        int demora = random.nextInt(950) + 50;


        for(int i=1; i <= iteraciones; i++) {
            System.out.println("Este es el hilo " + this.nombre + " y esta es la iteración " + i + " de " + iteraciones );
            try {
                Thread.sleep(demora);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("\n" + nombre + " muriendo ...\n");
    }

}
