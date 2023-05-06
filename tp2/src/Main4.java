import ej4.HiloCallable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Modificar el ejercicio 1 parte b, se debe convertir la clase que implementa Runnable por una que implementa Callable
// y los hilos deben ejecutarse con un ExceutorService.
public class Main4 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        HiloCallable hilo = new HiloCallable("mythread", 100, 10);
        executorService.submit(hilo);
        executorService.shutdown();

    }

}

