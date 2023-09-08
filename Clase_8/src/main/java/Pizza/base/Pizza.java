package Pizza.base;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private List<Topping> toppings = new ArrayList<>();

    private String size;

    // Constantes para los tamaños de pizza
    public static final String SMALL = "Pequeña";
    public static final String MEDIUM = "Mediana";
    public static final String LARGE = "Grande";

    // Porcentaje de aumento para los tamaños de pizza
    private static final double SMALL_PRICE_INCREASE = 0.0;  // No hay aumento para pequeña
    private static final double MEDIUM_PRICE_INCREASE = 0.20; // 20% de aumento para mediana
    private static final double LARGE_PRICE_INCREASE = 0.35;  // 35% de aumento para grande


    //    los tres puntos (...) en el parámetro Topping... toppings del constructor de la clase Pizza tienen
//    un significado especial en Java.
//    Estos three dots se llaman "spread operator" (operador de dispersión) y permiten pasar un
//    conjunto de argumentos variádicos a un método. En este caso, el constructor de la clase Pizza
//    espera una lista de objetos Topping, pero en lugar de especificar explícitamente la lista de
//    objetos, se utiliza el operador de dispersión para pasar todos los argumentos restantes como una
//    lista de objetos Topping.
    public Pizza(String name, double price, Topping... toppings) {
        this.name = name;
        this.price = price;

        for (Topping topping : toppings) {
            this.toppings.add(topping);
        }

        this.size = SMALL;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    public List<Topping> getToppings() {

        return Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    public String getName() {
        return name;
    }

    public String getTamaño() {
        return size;
    }

    public void setTamaño(String tamaño) {
        this.size = size;
    }

    double Total_price = 0;
    public double getPrice() {
        //for (Topping topping : toppings) {
            //Total_price += topping.getPrice();
        double sizeMultiplier = 1.0; // Factor para ajustar el precio según el tamaño

        // Determinar el factor de ajuste según el tamaño
        switch (size) {
            case MEDIUM:
                sizeMultiplier = 1.0 + MEDIUM_PRICE_INCREASE;
                break;
            case LARGE:
                sizeMultiplier = 1.0 + LARGE_PRICE_INCREASE;
                break;
            default:
                sizeMultiplier = 1.0; // Predeterminado: "Pequeña"
                break;
        }


        double total_price = 0;

        for (Topping topping : toppings) {
            total_price += topping.getPrice();
        }

        return price * sizeMultiplier + total_price;
    }




    @Override
    public String toString() {
        return "Pizza{" + "name='" + name + '\'' + ", price=" + price + ", toppings=" + toppings + '}';
    }

    public void prepare() {
        System.out.println("Preparing..... " + name);
        System.out.println("Adding toppings:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre());
            //put 1 second delay
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The Pizza is ready!");
        System.out.println("Total price: " + getPrice());
    }

    class PizzaHawaiana extends Pizza {
        public PizzaHawaiana(String name, double price) {
            super(name, price);
            // Agregar ingredientes adicionales
            addTopping(new Topping("Pineapple", 1.49));
            addTopping(new Topping("Ham", 2.49));
        }

        @Override
        public void prepare() {
            System.out.println("Preparing Pizza Hawaiana: " + getName());
            System.out.println("Adding special ingredients: Pineapple and Ham");
            super.prepare(); // Llama al método de la clase base para agregar los ingredientes básicos
        }
    }






}


