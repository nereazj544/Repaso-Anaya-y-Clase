package clase.examenes;

import java.util.Arrays;
import java.util.Random;

public class ej2 {
    public static void main(String[] args) {
        // minimo 10 y maximo 50
        int tam = obtNumAl (10, 50);
        double [] array = new double[tam];

        llenarArry(array);

        //mostrar el array
        System.out.println("Nº generados: " + Arrays.toString(array));

        //Resultado
        double res = proA (array, 0, 0, 1000);
        System.out.println("resultado final: " + res);
    }

    static int obtNumAl(int min, int max){
        Random r = new Random();
        return (int) r.nextInt(max-min +1) + min;
    }

    static void llenarArry(double[] array){
        //se hace un for para que recorra la cadena en bucle, ahi que poner {} si o si
        for(int i = 0; i < array.length; i++){
            double numAl = Math.random() * 2001 - 1000; 
            array[i] = Math.round(numAl * 100.0)/100.0;
        }
    }

    static double proA (double [] array, int ind, double sumAc, double mMax){
        if(ind >= array.length){
            //hace un if dentro de otro if
        if(sumAc > mMax){
            return sumAc * 0.3333;
        } else{
            return sumAc *0.6666;
        }}
        //Ahora se hace lo de procesar el array
        double valAc = array[ind];
        double nuvsum = sumAc + valAc;
        return proA(array, ind + 1, nuvsum, mMax);
    }
}
