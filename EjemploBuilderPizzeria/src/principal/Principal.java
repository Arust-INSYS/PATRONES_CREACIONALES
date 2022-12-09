package principal;

// CLASE PRINCIPAL.
import clases.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Cocina cocina = new Cocina(); // Se instancia a la clase Director.
        PizzaBuilder hawai_pizzabuilder = new HawaiPizzaBuilder(); // Instancias de los buider concretos, se crea la referencia en base a la clase abstracta
        PizzaBuilder picante_pizzabuilder = new PicantePizzaBuilder(); // Pero se instancia la clase concreta

        System.out.println("\nGenerador de pizzas");
        System.out.print("\n[1] Pizza Hawai\n[2] Pizza Picante\n\nElija una Pizza > ");
        int opcion = teclado.nextInt();

        if (opcion == 1) {

            cocina.setPizzaBuilder(hawai_pizzabuilder);
        } else if (opcion == 2) {

            cocina.setPizzaBuilder(picante_pizzabuilder);
        }
        
        cocina.construirPizza(); // Se construye la pizza

        Pizza pizza = cocina.getPizza(); // Se obtiene el producto final

        System.out.println(pizza.toString());
    }
}
