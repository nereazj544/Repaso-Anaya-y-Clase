package colecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* 
 * Crea un programa que lea de la entrada estándar una línea de texto y a continuación almacene en una
 * colección las palabras que no se repiten y en otra colección las que sí se repiten. 
 * El programa finalizará mostrando el contenido de ambas colecciones (hacerlo sin escribir código para iterar).
 * 
*/
public class c_3 {
    public static void main(String[] args) {
        //Necesitamos Scanner para leer los datos de entrada que el user nos daras

        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una linea de texto:");
        String linea = s.nextLine();

        //Se añade una linea    
        String [] palabras = linea.split(" ");

        //Ahora se escriben dos listas, una donde se almacenaran las repetidas y las otras las palabras que no estan repetidas

        Set<String> unicas = new HashSet<>();
        Set<String> repe = new HashSet<>();

        System.out.println(" ");

        //Creamos el ciclo para verificar si es una o otra
        for (String palabra : palabras) {
            if(!unicas.add(palabra)){
                repe.add(palabra);
            }
        }
        System.out.println("Palabras unicas: " + unicas);
        System.out.println("Palabras repetidas: " + repe);
    }
}
