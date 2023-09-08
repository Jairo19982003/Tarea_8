package Pizza.especialidades;

import Pizza.base.Pizza;
import Pizza.base.Topping;

// Clase de especialidad PizzaVegetariana
public class PizzaVegetariana extends Pizza {
    public PizzaVegetariana(String name, double price) {
        super(name, price);
        // Agregar ingredientes adicionales
        addTopping(new Topping("Bell peppers", 1.29));
        addTopping(new Topping("Olives", 0.99));
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Pizza Vegetariana: " + getName());
        System.out.println("Adding special ingredients: Bell peppers and Olives");
        super.prepare(); // Llama al método de la clase base para agregar los ingredientes básicos
    }
}
