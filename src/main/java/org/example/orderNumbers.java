package org.example;
import java.util.Arrays;

public class orderNumbers {
    public static void main() {
        Integer[] numeros = {3, 8, 2, 5, 1};

        // Ordenar de mayor a menor usando un Comparator
        //Arrays.sort(numeros,  Comparator.reverseOrder());

        //de menor a mayor
        Arrays.sort(numeros);

        // Imprimir el array ordenado
        System.out.println(Arrays.toString(numeros));

    }
}
