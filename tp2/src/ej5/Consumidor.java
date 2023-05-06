package ej5;

import ej5.Almacenamiento;

import java.util.concurrent.Callable;

public class Consumidor implements Callable<String> {
    private Almacenamiento almacenamiento;

    private String nombre;

    public Consumidor(Almacenamiento almacenamiento, String nombre) {

        this.almacenamiento = almacenamiento;
        this.nombre = nombre;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Hilo consumidor " + this.nombre + " arrancando ...");
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
            StringBuffer sb = new StringBuffer();
            sb.append("Hilo consumidor " + this.nombre + " :  " + valor + "! = " + resultado);
            if (resultado > 30000) {
                sb.append(" . Resultado mayor a 30000");
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "Hilo consumidor " + this.nombre + " finalizando ...";
    }
}

