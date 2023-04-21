package ej2;

import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.List;

public class HiloFactorial extends Thread {
    private List<Integer> lista;
    private String nombre;

    public HiloFactorial(List<Integer> lista, String nombre) {
        this.lista = lista;
        this.nombre = nombre;
    }

    public void run() {
            List<Integer> procesados = new ArrayList<>();
            int resultado;
            for (int numero : lista) {
                int valor = numero;
                if (numero < 2) {
                    resultado = 1;
                } else {
                    resultado = 1;
                    while (numero > 1) {
                        resultado = resultado * numero;
                        numero = numero - 1;
                    }
                }
                procesados.add(valor);
                System.out.println("Hilo " + this.nombre + " procesando lista. Valor a calcular: " + valor + ". Resultado: " + resultado + ". Quedan " + (lista.size() - procesados.size()) + " elementos por procesar.");
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    System.out.println("\n" + e);
                }
        }
    }

    public List<Integer> getLista() {
        return lista;
    }

    public String getNombre() {
        return nombre;
    }
}
