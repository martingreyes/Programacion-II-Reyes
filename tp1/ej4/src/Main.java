//
//Crear una interfaz llamada FiguraGeometrica con los métodos calcularPerimetro y calcularSuperfice.
//        Crear 3 clases que implementen la interfaz FiguraGeometrica. Pueden ser círculo, triángulo, rectángulo, cuadrado, pentágono.
//        Crear una lista para almacenar figuras geométricas y agregar 5 elementos.
//        Recorrer la lista mostrando información de cada uno de los objetos (recomendable que las clases prescriban el método toString) y mostrar el perímetro y la superficie de cada uno.

import clases.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<FiguraGeometrica> miLista = new ArrayList<>();

        miLista.add(new Triangulo(1,1,1,2));
        miLista.add(new Triangulo(2,2,2,4));
        miLista.add(new Cuadrado(5,10));
        miLista.add(new Cuadrado(2,4));
        miLista.add(new Circulo(5));

        for (FiguraGeometrica figura : miLista) {
            System.out.println("\n" + figura);
            System.out.println("Perimetro: " + figura.calcularPerimetro());
            System.out.println("Superficie: " + figura.calcularSuperficie());
        }
    }
}