package colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class c_1 {

    /*
     * Programa que lee de la entrada estándar una secuencia de nombres y los guarda
     * en una colección de forma
     * que ésta no contenga nombres repetidos. La primera línea de entrada contiene
     * la cantidad de nombres. El
     * resto de las líneas contienen los nombres a razón de uno por línea. El
     * programa finalizará mostrando los
     * nombres guardados en la colección en el mismo orden en que se insertaron.
     * Ejemplo:
     * Entrada
     * 6
     * Iván
     * Iván
     * Iván
     * Manuela
     * Iván
     * Fernando
     * 
     * Salida
     * Ivan
     * Manuela
     * Fernando
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Recuerde solo puede guardar tas 6 nombres: ");
        int numNombres = sc.nextInt();
        sc.nextLine();
        
        //Creamos las colecciones:

        ArrayList <String> nameList = new ArrayList<>();
        //ArrayList es para mantener el orden orgiginal

        HashSet<String> uniqueName = new HashSet<>();
        //Garantiza que solo son nombres

        //En este bucle lo que hace es que tienes que añadir de uno en uno los nombres

        for(int i = 0; i<numNombres; i++){
            System.out.println("Nombre #" + (i+1) + ":");
            String nombre = sc.nextLine();
            if (uniqueName.add(nombre)){
                nameList.add(nombre);
            }
        }
        //En el foreach mostraremos los nombres guardados

        System.out.println("Nombres gruadados: ");
        for (String nombre : nameList){
            System.out.println(nombre);
        }
    }
}
