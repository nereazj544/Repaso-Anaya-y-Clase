package clase.examenes;

import java.util.Random;

public class Clase1 {
    public static void main(String[] args) {
        long numeroAleatorio = obtenerNumeroAleatorio(100, 999);
        System.out.println("Número aleatorio generado: " + numeroAleatorio);

        boolean meGusta = determinarSiMeGusta(numeroAleatorio);
        System.out.println("¿Me gusta el número? " + meGusta);

        long[] digitos = obtenerDigitos(numeroAleatorio);
        System.out.println("Digitos del número:");
        for (long digito : digitos) {
            System.out.print(digito + " ");
        }
    }

    static long obtenerNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    static boolean determinarSiMeGusta(long numero) {
        long sumaImpares = 0;
        long sumaTotal = 0;
        long numeroTemp = numero;

        while (numeroTemp != 0) {
            long digito = numeroTemp % 10;
            sumaTotal += digito;
            sumaImpares += digito * (1 - 2 * (digito % 2)); // Suma si es impar, resta si es par
            numeroTemp /= 10;
        }

        return sumaImpares > sumaTotal || (numero % 2 != 0 && sumaTotal % 2 != 0);
    }

    static long[] obtenerDigitos(long numero) {
        int cantDigitos = (int) Math.log10(numero) + 1;
        long[] digitos = new long[cantDigitos];
        for (int i = cantDigitos - 1; i >= 0; i--) {
            digitos[i] = numero % 10;
            numero /= 10;
        }
        return digitos;
    }
}
