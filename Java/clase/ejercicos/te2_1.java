package clase.ejercicios;

import java.util.Scanner;

public class te2_1 {
    /*
     * Escribir y ejecutar un programa
     * que imprima el nombre, edad y
     * dirección del alumno.
     */
    public static void main(String[] args) {
        System.out.println("Nombre: Neo. Edad: 19 años. Dir: distririto 11");

        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Bienvenido, nuevo usuario. Necsitamos que consestes a las siententes preguntas. Para empezar dale al enter");
        String enter = sc.nextLine();
        System.out.println("Primere pregunta: ¿cual es tu nombre usuario?");
        String nombreuser = sc.nextLine();
        System.out.println(
                "Bienvenido/a/e/x: " + nombreuser + " seguiremos con la siguiente pregunta; ¿cual es tu edad?");
        String edaduser = sc.nextLine();
        System.out.println("Asi que te llamas " + nombreuser + " y tu edad es: " + edaduser + ".");
        /*
         * 
         * String respuesta;
         * boolean preguntaAdicionalHecha = false;
         * do {
         * 
         * System.out.println("¿Llevas camiseta? (si o no)");
         * respuesta = sc.nextLine();
         * 
         * if(respuesta.equalsIgnoreCase("si")){
         * System.out.println("Pregunta adicional: ¿de que color es?");
         * String coloruser = sc.nextLine();
         * System.out.println("Felicidades Usuario: " + nombreuser + " de edad: " +
         * edaduser + " que llevas una camiseta de color: " + coloruser );
         * 
         * preguntaAdicionalHecha = true;
         * } else if(!respuesta.equalsIgnoreCase("no")){
         * }
         * 
         * } while (!respuesta.equalsIgnoreCase("no"));
         * System.out.println("Ok, en tal caso terminaremos el formulario aqui.");
         * System.out.println("Nombre del user: "+ nombreuser);
         * System.out.println("Edad del User: " + edaduser);
         */

        String respuesta;

        do {
            System.out.println("¿Llevas camiseta? (si o no)");
            respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {

                System.out.println("Pregunta adicional: ¿De qué color es?");

                String coloruser = sc.nextLine();

                System.out.println("Felicidades Usuario: " + nombreuser + " de edad: " + edaduser
                        + " que llevas una camiseta de color: " + coloruser);

                break; // Salir del bucle si el usuario responde "si"

            } else if (respuesta.equalsIgnoreCase("no")) {
                
                System.out.println(" ");

                System.out.println("Ok, en tal caso terminaremos el formulario aquí.");

                System.out.println("Nombre del usuario: " + nombreuser);

                System.out.println("Edad del usuario: " + edaduser);

                break; // Salir del bucle si el usuario responde "no"

            } else {

                System.out.println("Respuesta inválida. Por favor, responde 'si' o 'no'.");

            }

        } while (true);

    }

}
