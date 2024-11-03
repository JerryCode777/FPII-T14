import java.util.ArrayList;

public class Concesionario {
    private String nombreEmpresa;
    private Gerente elGerente;
    private ArrayList<Vendedor> personal;
    private ArrayList<Auto> autos;

    public Concesionario(String nombreEmpresa, Gerente elGerente){
        this.nombreEmpresa = nombreEmpresa;
        this.elGerente = elGerente;
        this.personal = new ArrayList<>();
        this.autos = new ArrayList<>();
    }
    public void addAuto(Auto auto1){
        autos.add(auto1);
    }

    public void addVendedor(Vendedor vendedor1){
        personal.add(vendedor1);
    }

    public void imprimirEstatus(){
        System.out.println("Nombre de la empresa: "+nombreEmpresa);
        System.out.println("Gerente: "+elGerente.getNombre());
        System.out.println("Autos en inventario: ");
        for(Auto autoi:autos){
            System.out.println("* "+autoi.getMarca());
        }
        System.out.println("Personal de ventas: ");
        for(Vendedor ven1:personal){
            System.out.println("* "+ven1.getNombre()+" con ventas: "+ven1.getVentas());
        }
    }
}
