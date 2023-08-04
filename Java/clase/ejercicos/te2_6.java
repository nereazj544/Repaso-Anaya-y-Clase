import java.util.Scanner;

public class te2_6 {
    /*
     * Construir un programa que
     * calcule el perímetro y el área de
     * ana circunferencia leyendo su
     * radio por teclado. (π = 3.14159)
     */

    public static void main(String[] args) {

        //Necesitamos scanner para introducir el radio

        Scanner sc = new Scanner (System.in);
        double perimetro; double area;
        System.out.println("Radio: ");
        double radio = sc.nextDouble();
        perimetro = circunp (radio); 
        area = circuar (radio);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);

    
    }

    static double circunp(double radio){
        double perimetro = 2 * Math.PI * radio;    
        return perimetro;
    }

    static double circuar (double radio){
        double area = Math.pow(radio, 2) * Math.PI;
        return area;
    }
}
