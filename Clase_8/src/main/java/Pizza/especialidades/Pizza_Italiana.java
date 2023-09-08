package Pizza.especialidades;
import Pizza.base.Topping;
import Pizza.base.Pizza;

public class Pizza_Italiana extends Pizza {

    private static final String nombre = "Pizza Italiana";
    private static final double precio = 10.99;
    private String salsa;

    public Pizza_Italiana(String nombre, double precio, String salsa, Topping... toppings) {
        super(nombre, precio, toppings);
        this.salsa = salsa;
    }

    public Pizza_Italiana(String s, double v) {
        super(nombre, precio);
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }
}
