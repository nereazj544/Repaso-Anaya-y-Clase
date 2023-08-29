package clases_objetos;

import java.time.LocalDate;

public class PruebaAnimal {
    public static void main(String[] args) {
        /*
         * Animal animal1 = new Animal("Gato", LocalDate.of(2019, 5, 23));
         * System.out.println(animal1);
         * 
         * Animal animal2 = new Animal("Perro");
         * System.out.println(animal2);
         * 
         * animal2.setNombre("Loro");
         * System.out.println(animal2.getNombre());
         * 
         * animal1.setFecha(LocalDate.of(2018, 4, 12));
         * System.out.println(animal1);
         * 
         */

        Animal animal1 = new Animal("Loro", LocalDate.of(2017, 5, 23));
		Animal animal2 = new Animal("Gato");
		System.out.println(animal1);
		System.out.println(animal2);
    }
}
