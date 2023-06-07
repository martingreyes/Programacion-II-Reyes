package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Arranque {
    @Autowired
    PruebaService pruebaservice;
    public void arranque() {
        System.out.println("Arranque");
        this.pruebaservice.llamado1("Martin");
    }
}
