package Pizza.base;
import Pizza.especialidades.PizzaPepperoni;
import Pizza.especialidades.PizzaVegetariana;;
import Pizza.especialidades.PizzaMexicana;
import Pizza.especialidades.Pizza_Italiana;


public class Main {
    public static void main(String[] args) {
        // Crear pizzas con diferentes tamaños
        Pizza pizzaPequeña = new Pizza("Pizza Margherita (Pequeña)", 10.99);
        pizzaPequeña.setTamaño(Pizza.SMALL); // Establecer el tamaño como "Pequeña"
        pizzaPequeña.addTopping(new Topping("Tomato sauce", 1.99));
        pizzaPequeña.addTopping(new Topping("Mozzarella", 2.99));
        pizzaPequeña.addTopping(new Topping("Basil", 0.99));
        pizzaPequeña.addTopping(new Topping("Oregano", 0.99));

        Pizza pizzaMediana = new Pizza("Pizza Margherita (Mediana)", 10.99);
        pizzaMediana.setTamaño(Pizza.MEDIUM); // Establecer el tamaño como "Mediana"
        pizzaMediana.addTopping(new Topping("Tomato sauce", 1.99));
        pizzaMediana.addTopping(new Topping("Mozzarella", 2.99));
        pizzaMediana.addTopping(new Topping("Basil", 0.99));
        pizzaMediana.addTopping(new Topping("Oregano", 0.99));

        Pizza pizzaGrande = new Pizza("Pizza Margherita (Grande)", 10.99);
        pizzaGrande.setTamaño(Pizza.LARGE); // Establecer el tamaño como "Grande"
        pizzaGrande.addTopping(new Topping("Tomato sauce", 1.99));
        pizzaGrande.addTopping(new Topping("Mozzarella", 2.99));
        pizzaGrande.addTopping(new Topping("Basil", 0.99));
        pizzaGrande.addTopping(new Topping("Oregano", 0.99));

        // Preparar y mostrar precios de las pizzas
        pizzaPequeña.prepare();
        pizzaMediana.prepare();
        pizzaGrande.prepare();

        // Imprimir los precios de los toppings para cada pizza
        System.out.println("Los precios de los toppings son para la pizza pequeña:");
        for (Topping topping : pizzaPequeña.getToppings()) {
            System.out.println(topping.getNombre() + ": " + topping.getPrice());
        }

        System.out.println("Los precios de los toppings son para la pizza mediana:");
        for (Topping topping : pizzaMediana.getToppings()) {
            System.out.println(topping.getNombre() + ": " + topping.getPrice());
        }

        System.out.println("Los precios de los toppings son para la pizza grande:");
        for (Topping topping : pizzaGrande.getToppings()) {
            System.out.println(topping.getNombre() + ": " + topping.getPrice());
        }

        PizzaMexicana pizzaMexicana = new PizzaMexicana("Pizza Mexicana (Mediana)", 12.99);
        pizzaMexicana.setTamaño(Pizza.MEDIUM);
        pizzaMexicana.prepare();

        PizzaPepperoni pizzaPepperoni = new PizzaPepperoni("Pizza Pepperoni (Grande)", 14.99);
        pizzaPepperoni.setTamaño(Pizza.LARGE);
        pizzaPepperoni.prepare();

        PizzaVegetariana pizzaVegetariana = new PizzaVegetariana("Pizza Vegetariana (Pequeña)", 10.99);
        pizzaVegetariana.setTamaño(Pizza.SMALL);
        pizzaVegetariana.prepare();

        Pizza_Italiana pizzaItaliana = new Pizza_Italiana("Pizza Italiana (Mediana)", 12.99);
        pizzaItaliana.setTamaño(Pizza.MEDIUM);
        pizzaItaliana.prepare();


    }
}

