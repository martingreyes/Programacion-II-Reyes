import ej3.Almacenamiento;
import ej3.Consumidor;
import ej3.Productor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//        Convertir el ejercicio 3 utilizando Callable, ExecutorService y Future.
//        Al finalizar cada ejecución de hilo se debe retornar el valor calculado y se debe analizar el valor resultado,
//        si el resultado es mayor a 30.000.000 se debe mostrar un mensaje por pantalla indicando que es mayor.
public class Main5 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Almacenamiento almacenamiento = new Almacenamiento();

        Productor productor = new Productor(almacenamiento);
        executorService.submit(productor);
        Consumidor consumidor = new Consumidor(almacenamiento, "myconsumer");
        Future<String> resultado = (Future<String>) executorService.submit(consumidor);
        while(resultado.isDone()) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            System.out.println("Resultado de la ejecución: "+resultado.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


        executorService.shutdown();




        // Creamos una instancia del consumidor y lo iniciamos




    }
}
