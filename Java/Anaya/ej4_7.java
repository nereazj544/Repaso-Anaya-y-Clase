package Anaya;

public class ej4_7 {
    /* 
     * Pintar los numeros del cero a noventa y nueve en una matriz de 10 x 10
     * hay que hacer un bucle dentro de otro bucle.
    */

private static int tam = 10;
    public static void main(String[] args) {
        for (int i = 0; i < tam; i++){
            for (int j = 0; j < tam; j++){
                System.out.print(i + "" + j + " "); 
                //si se pone como println se dara un salto de linea y no saldra en cuadricula
            }
            System.out.println();
        }
		}
    }

