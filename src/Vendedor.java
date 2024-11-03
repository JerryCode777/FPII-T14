public class Vendedor extends Empleado{
    private double ventas;

    public Vendedor(String nombre){
        super(nombre);
        this.ventas = 0.0;
    }
    public double getVentas(){
        return ventas;
    }
    public void setVentas(double ventas){
        this.ventas = ventas;
    }
}
