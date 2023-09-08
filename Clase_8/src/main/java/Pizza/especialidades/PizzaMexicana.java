package Pizza.especialidades;

import Pizza.base.Pizza;
import Pizza.base.Topping;


// Clase de especialidad PizzaMexicana
public class PizzaMexicana extends Pizza {
        public PizzaMexicana(String name, double price) {
            super(name, price);
            // Agregar ingredientes adicionales
            addTopping(new Topping("Jalapeños", 1.49));
            addTopping(new Topping("Chili beans", 1.99));
        }

        @Override
        public void prepare() {
            System.out.println("Preparing Pizza Mexicana: " + getName());
            System.out.println("Adding special ingredients: Jalapeños and Chili beans");
            super.prepare(); // Llama al método de la clase base para agregar los ingredientes básicos
        }
    }

