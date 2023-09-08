package Pizza.especialidades;

import Pizza.base.Pizza;
import Pizza.base.Topping;

// Clase de especialidad PizzaPepperoni
 public class PizzaPepperoni extends Pizza {
    public PizzaPepperoni(String name, double price) {
        super(name, price);
        // Agregar ingredientes adicionales
        addTopping(new Topping("Pepperoni", 1.99));
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Pizza Pepperoni: " + getName());
        System.out.println("Adding special ingredient: Pepperoni");
        super.prepare(); // Llama al método de la clase base para agregar los ingredientes básicos
    }
}