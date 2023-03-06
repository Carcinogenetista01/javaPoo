public class Main {
    public static void main(String[] args) {
        Telefono telefono = new Telefono("Samsung", "Galaxy S20", 128, true);

        System.out.println(telefono.toString());

        telefono.llamar("555-1234");

        telefono.tomarFoto();

        telefono.liberarEspacio(64);
    }
}