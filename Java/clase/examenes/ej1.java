package clase.examenes;

import java.util.Arrays;

public class ej1 {
    public static void main(String[] args) {

        // NOTA IMPORATEN A PARTIR DE LA SEGUNDA FUNCION SE DEBE DE HACER REFERENCIA A: numeroA
        
        //Primera funcion: obtener un nº de forma aleatoria

        long numeroA = obtna(100, 999);
        System.out.println("Nº generado: " + numeroA);
        
        //Segunda funcion: Me gusta o no (Impar (true) o  Par (false))

        boolean megus = Simegusta (numeroA);
        System.out.println("¿Impar o Par?" + megus);

        //Arrays de digitos

        long [] digi = obtDig(numeroA);
        System.out.println("Estos son los digitos del nº " + Arrays.toString(digi)); //el for se sustituyo por el arrays
        
    }

    // En esta funcion se usa la clase Math, pero prefiero más la otra solucion aun que no use Math.random
    static int obtna (int min, int max){
        int temp = min;
        min = Math.min(min, max);
        max = Math.max(temp, max);
        return (int) ((long) (Math.random() * (max - min + 1)) + min);
    }

    static boolean Simegusta(long num) {
        long sumaIm = 0;
        long sumaT = 0;
        long nutemp = num;

        while (nutemp != 0) {
            long dig = nutemp % 10; // % (modulo) devuelve el resto, por lo que va a hacer es dar el resto de esta division y lo comparara con lo siguiente
            sumaT += dig; 
            sumaIm += dig * (1-2 * (dig % 2));
            nutemp /= 10;  
                }
                //faltaba el return.
        return sumaIm > sumaT || (num%2 != 0 && sumaT % 2 != 0);

    }

    static long[] obtDig(long num){
        int cantidadDigis = (int) Math.log10(num) + 1;
        long[] digi = new long[cantidadDigis];
        for (int i = cantidadDigis - 1; i >= 0; i--)
            digi[i] = num % 10;
            num /= 10;
        return digi;
    }
}
