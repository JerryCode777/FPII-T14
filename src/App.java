public class App {
    public static void main(String[] args){
        Gerente gerente = new Gerente("Asdfg jkl;");
        Concesionario concesionario = new Concesionario("empresaunknown", gerente);

        Auto auto1 = new Auto("Toyota");
        Auto auto2 = new Auto("Nissan");

        concesionario.addAuto(auto1);
        concesionario.addAuto(auto2);

        Vendedor vendedor1 = new Vendedor("Carlos");
        Vendedor vendedor2 = new Vendedor("Maria");

        concesionario.addVendedor(vendedor1);
        concesionario.addVendedor(vendedor2);

        concesionario.imprimirEstatus();
    }
}
