package org.example;
import java.util.Arrays;
import java.util.Comparator;

class Persona {
    String nombre;
    // Constructor that takes a name as a parameter
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return nombre;
    }
}

public class orderLetters {
    public static void main() {
        // System.out.println("Hola");
        Persona[] personas = {new Persona("Carlos"), new Persona("Ana"), new Persona("Bruno")};

        // Ordenar los nombres alfabéticamente
        Arrays.sort(personas, Comparator.comparing(p -> p.nombre));
        //de manera inversa Z-A
        // Arrays.sort(personas, Comparator.comparing((Persona p) -> p.nombre).reversed());

        // Imprimir los nombres ordenados
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
