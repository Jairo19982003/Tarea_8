package Pizza.Intafaces;

public class PizzaBase implements Ipreparable{
    private String nombre;
    private double precio;

    public PizzaBase(String n, double p){
        this.nombre = n;
        this.precio = p;
    }

    @Override
    public void prepare() {
        System.out.println("Preparando pizza " + this.nombre + " con precio " + this.precio);
        System.out.println("Pizza preparada");
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    //public void setPrecio(double precio) {
        //this.precio = precio;
    }

