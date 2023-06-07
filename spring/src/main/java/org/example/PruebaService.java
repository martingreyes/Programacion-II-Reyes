package org.example;

import org.springframework.stereotype.Service;

@Service
public class PruebaService {
    public void llamado1(String nombre) {
        System.out.println("Hola mi nombre es " + nombre + " e implemente el servicio llamado1");
    }

}
