package Anaya;

import java.util.Scanner;

public class ej4_6 {
    // Este ejercico va de: conseguir la respuesta deseada del usuraio
    /*
     * En este ejercicio se debe de usar el do-while y el scanner <3
     * Para empzar ahi que pedir al usurio que escriba <<abracadraba>> e
     * insiste hasta que lo ponga bien, por lo que se entiende que el usurio tendra
     * que escribir mal la palabra como tal.
     *
     */
    // private static final String Clave = "Abracadraba";
    private static String clave = "Esternocleidomastoideo"; 

    public static void main(String[] args) {
        /*
         * 
         * Scanner sc = new Scanner(System.in);
         * //Si no se le pone el String fuera es como si esta variable no exiteria
         * entonces por esa razon a de ponerlo
         * String pala;
         * do {
         * System.out.println("Hola, intoruce " + Clave + " : ");
         * pala = sc.nextLine();
         * } while (!pala.equals(Clave));
         * System.out.println("TU: " + pala);
         * System.out.println("yo: pata de cabra!");
         */

        // ------------------------------------------------------------------------------------------------------
        // Variacion del ejercicio, en este caso lo voy a hacer con while.
        /*
         * En vez de darle al user ya la palabra clave dejar que la adivine. Y en vez de
         * usar el do-while usare el while
         */
        // ------------------------------------------------------------------------------------------------------
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce tu clave: " );
            System.out.print("Pista: Es una parte del cuerpo :D ");
            String palabra = sc.nextLine();

            while (!palabra.equals(clave)) {
                System.out.println("Te has equivocado, vuelve a intentarlo.");
                palabra = sc.nextLine();
            }
            System.out.println("Lo lograste, felicidades por descubirir: " + clave);
                
        
        
        
        
        }

}
