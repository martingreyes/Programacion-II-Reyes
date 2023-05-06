// Convertir el ejercicio 2 utilizando el patrón productor-consumidor. Seguir utilizando la interfaz Runnable y la clase Thread.
import ej3.*;
public class Main3 {
    public static void main(String[] args) {

        // Creamos una instancia del almacenamiento compartido
        Almacenamiento almacenamiento = new Almacenamiento();

        // Creamos una instancia del productor y lo iniciamos
        Productor productor = new Productor(almacenamiento);
        Thread hiloProductor = new Thread(productor);
        hiloProductor.start();

        // Creamos una instancia del consumidor y lo iniciamos
        Consumidor consumidor = new Consumidor(almacenamiento, "myconsumer");
        Thread hiloConsumidor = new Thread(consumidor);
        hiloConsumidor.start();

    }
}