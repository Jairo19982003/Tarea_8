/*
package Pizza.base;
import java.util.ArrayList;
import java.util.Scanner;


public class Topping {

    private String nombre; // Nombre del topping

    private double price; // Precio del topping
    private ArrayList<String> ingredientes = new ArrayList<>(); // Ingredientes del topping


    public void agregarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public Topping(String nombre, double price) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Topping{" + "nombre='" + nombre + '\'' + ", ingredientes=" + ingredientes + '}';
    }


    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
    public double getPrice() {
        switch (this.nombre) {
            case "Tomato sauce":
                return 1.99;
            case "Mozzarella":
                return 2.99;
            case "Basil":
                return 0.99;
            case "Oregano":
                return 0.99;
            default:
                return 0;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
*/

package Pizza.base;
import java.util.ArrayList;
import java.util.Scanner;


public class Topping {

    private String nombre; // Nombre del topping

    private double price; // Precio del topping
    private ArrayList<String> ingredientes = new ArrayList<>(); // Ingredientes del topping

    public void agregarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public Topping(String nombre, double price) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Topping{" + "nombre='" + nombre + '\'' + ", ingredientes=" + ingredientes + '}';
    }


    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
    public double getPrice() {
        switch (this.nombre) {
            case "Tomato sauce":
                return 1.99;
            case "Mozzarella":
                return 2.99;
            case "Basil":
                return 0.99;
            case "Oregano":
                return 0.99;
            default:
                return 0;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }
}





