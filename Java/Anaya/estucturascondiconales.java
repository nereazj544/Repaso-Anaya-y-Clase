package Anaya;

public class estucturascondiconales {
    public static void main(String[] args) {
        // ejercicio y test 3.2
        // Ejercicio original: ¿Cuanto vale X?
        /*
         * 
         * int a = 5; int b = 8; int c = 3;
         * boolean x = !((b-c) <= a ) && (c*c != a);
         */

        // -------------------------------------------------------------------------------------------------------------------------------

        // La respuesta del ejercicio es que no da ningun resultado.

        // -------------------------------------------------------------------------------------------------------------------------------

        // Solucion al ejercicio:
        // La soluccion del ejercicio seria la siguiente:

        // int a = 5; int b = 8; int c = 3;
        // boolean x = !((b - c) <= a) && (c * c != a);
        // apartir de aqui no haria nada, es decir no llegaria a dar ningun resultado
        // pero si le añadimos lo siguiente:

        // System.out.println(x);
        // al poner esto nos saldra un resultado; el cual es "false"

        // -------------------------------------------------------------------------------------------------------------------------------
        // Ejercicio 3.6.
        // ¿Cuanto vale x?
        /*
         * int A = -3; int B = -8; int C = 4; int d = 6;
         * int X = (A<0 ? A : -A) * (B > C ? B : d < C ? C : d);
         * Con esa manera da -18 (que estaria haciendo X=3*6=-18)
         * 
         * LA MANERA CORRECTA
         * int X = (a < 0 ? a : -a) * (b > c ? b : d > c ? c : d);
         * Que si da -12, el fallo era que cambi el > por <.
         */

        // int a = -3; int b = -8;  int c = 4; int d = 6;
        // int X = (a < 0 ? a : -a) * (b > c ? b : d > c ? c : d);
        // System.out.println(X);

        //resultado: -12
    }

    /*
     * Ejecrcio 3.5
     * private String preparaNombre(boolean mujer){
     * String nombre = ""; //Fatltaba ponerle esto
     * 
     * if (mujer){
     * nombre = "mario";
     * } else{
     * nombre = "maria";
     * }
     * 
     * return nombre; //y este return
     * }
     */
}
