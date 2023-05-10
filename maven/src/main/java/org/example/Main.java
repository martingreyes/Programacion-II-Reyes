package org.example;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        System.out.println(persona);

        persona.setNombre("Martin");
        persona.setApellido("Reyes");
        persona.setActivo(true);
        persona.setCodigo(60150);

        System.out.println(persona);

        Persona persona1 = new Persona("Pepe", "Jose", false, 1);

        System.out.println(persona1.getApellido());

    }
}