package clases;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaGenerica<T extends Comparable <T>>{
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

    //7       //TODO podria largar la excepcion: IndexOutOfBoundsException
    public void agregarEnPosicion(T elemento, int posicion) throws MiExcepcion {
        if(posicion > this.cantidadElementos()) {
            throw new MiExcepcion("Error en agregarEnPosicion(). El indice es más grande que la cantidad de elementos de la lista.");
        } else {
            lista.add(posicion, elemento);
        }
    }

    //8     //TODO podria largar la excepcion: IndexOutOfBoundsException
    public T obtenerEnPosicion(int posicion) throws MiExcepcion {
        if (posicion > this.cantidadElementos()) {
            throw new MiExcepcion("Error en obtenerEnPosicion(). El indice es mayor que la cantidad de elementos de la lista.");
        } else {
            return lista.get(posicion);
        }
    }

    //9     //TODO podria largar la excepcion: NoSuchElementException
    public T obtenerPrimero() throws MiExcepcion{
        if (this.cantidadElementos() == 0)  {
            throw new MiExcepcion("Error en obtenerPrimero(). La lista de elementos es vacía.");
        } else {
            return lista.get(0);
        }
    }

    //10    //TODO podria largar la excepcion: NoSuchElementException
    public T obtenerUltimo() throws MiExcepcion{
        if (this.cantidadElementos() == 0) {
            throw new MiExcepcion("Error en obtenerUltimo(). La lista de elementos es vacía.");
        } else {
            return lista.get(lista.size() - 1);
        }
    }

    //11
    public void eliminarEnPosicion(int posicion) throws MiExcepcion{
        try {
            lista.remove(posicion);
        } catch (IndexOutOfBoundsException e) {
            throw new MiExcepcion("El indice no existe.");
        }

    }

}