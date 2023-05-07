package ej3;

public class Consumidor implements Runnable {
    private Almacenamiento almacenamiento;

    private String nombre;

    public Consumidor(Almacenamiento almacenamiento, String nombre) {

        this.almacenamiento = almacenamiento;
        this.nombre = nombre;
    }

    public void run() {
        for (int i = 0; i < 40; i++) {
            int valor = almacenamiento.retirar();
            int resultado;
            int numero = valor;
            if (valor < 2) {
                resultado = 1;
            } else {
                resultado = 1;
                while (valor > 1) {
                    resultado = resultado * valor;
                    valor = valor - 1;
                }
            }

            System.out.println("Hilo consumidor " + this.nombre + " :  " + numero + "! = " + resultado);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
