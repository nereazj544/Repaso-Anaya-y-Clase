package clase.examenes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class clase2 {
    public static void main(String[] args) {

        // Crear el array de 10 y 50
        int tamano = obtenerNumeroAleatorio(10, 50);
        double[] array = new double[tamano];

        // Llenar el Array con nº aleatorios comprendidos entre -1000 y 1000 junto con
        // una precisión de dos decimales
        LlenarArrayConNumerosAleatorios(array);

        // mostrar el array
        System.out.println("Array generado: " + Arrays.toString(array));

        // Calcular
        double resultado = procesarArry(array, 0, 0, 1000);
        System.out.println("Resultado: " + resultado);
    }

    // STATIC van fuera del main

    static int obtenerNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    static void LlenarArrayConNumerosAleatorios(double[] array) {
        for (int i = 0; i < array.length; i++) {
            double numeroAleatorio = Math.random() * 2001 - 1000;
            array[i] = Math.round(numeroAleatorio * 100.0) / 100.0;
        }
    }

    static double procesarArry(double[] array, int index, double sumaActual, double mitadMax) {
        if (index >= array.length) {
            // se procesan todos hasta devolver el resultado final
            if (sumaActual > mitadMax) {
                return sumaActual * 0.3333;
            } else {
                return sumaActual * 0.6666;
            }
        }

        // Procesar el elemento actual del array y continuar con el siguiente elemento de forma recursiva.
        double valorActual = array[index];
        double nuevaSuma = sumaActual + valorActual;

        return procesarArry(array, index + 1, nuevaSuma, mitadMax);
    }
}
