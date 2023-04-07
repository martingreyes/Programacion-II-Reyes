package clases;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaGenerica<T extends Comparable <T>> {
    private List<T> lista = new ArrayList<>();

    //1
    public void agregar(T elemento) {
        lista.add(elemento);
    }

    //2
    public List<T> obtenerLista() {
        return lista;
    }

    //3
    public int cantidadElementos() {
        return lista.size();
    }

    //4
    public void agregarAlPrincipio(T elemento) {
        lista.add(0, elemento);
    }

    //5
    public void ordenar() {
        Collections.sort(lista);    //el método estático Collections.sort() ordena la lista utilizando el método compareTo() de los objetos de la lista.
    }

    //6
    public void desordenar() {
        Collections.shuffle(lista);
    }

    //7
    public void agregarEnPosicion(T elemento, int posicion) {
        lista.add(posicion, elemento);
    }

    //8
    public T obtenerEnPosicion(int posicion) {
        return lista.get(posicion);
    }

    //9
    public T obtenerPrimero() {
        return lista.get(0);
    }

    //10
    public T obtenerUltimo() {
        return lista.get(lista.size() - 1);
    }

    //11
    public void eliminarEnPosicion(int posicion) {
        lista.remove(posicion);
    }

}
