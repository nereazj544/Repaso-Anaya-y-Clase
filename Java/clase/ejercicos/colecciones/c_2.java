package colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class c_2 {

    /*
     * Crea un programa que realice las tareas siguientes:
     * • Almacenar en una lista 100 números aleatorios entre 1 y 100 y mostrarlos
     * todos utilizando uno de
     * los métodos de iteración.
     * • Almacenar los números de la lista original en otra colección sin que se
     * repita ninguno y mostrarlos
     * todos usando un método de iteración diferente al anterior.
     * • Almacenar los números de la lista original en otra colección en la que se
     * almacenen ordenados y sin
     * que se repita ninguno y mostrarlos todos usando un método de iteración
     * diferente al anterior.
     */
    public static void main(String[] args) {
        // Primero se crea lita original + la random

        ArrayList<Integer> originalList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 100; i++)
            originalList.add(r.nextInt(100) + 1);

        // Mostar la lista orginal
        System.out.println("Lista original:");
        for (Integer number : originalList) {
            System.out.println(number + " ");
        }
        System.out.println();

        // Almacenar numeros unicos en el HashSet
        HashSet<Integer> uniqueSet = new HashSet<>(originalList);

        System.out.println("Numeros unicos:");
        for (Integer number : uniqueSet)
            System.out.println(number + " ");

        System.out.println();

        //Orndenamos los numeros unicos con un treeset

        TreeSet<Integer> sorttedSet = new TreeSet<>(originalList);

        System.out.println("Numeros unicos ordenados:");
        for(Integer number : sorttedSet)
            System.out.println(number + " ");
        
        System.out.println();

    }
}
