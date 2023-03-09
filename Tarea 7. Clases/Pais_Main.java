public class Main {
    public static void main(String[] args) {
        // creación de objetos
        Pais mexico = new Pais("México", 130000000, "Ciudad de México");
        Pais canada = new Pais("Canadá", 37000000, "Ottawa");
        Pais brasil = new Pais();

        // uso de métodos de acceso
        brasil.setNombre("Brasil");
        brasil.setPoblacion(212000000);
        brasil.setCapital("Brasilia");

        // uso de métodos de uso general
        mexico.aumentarPoblacion(500000);
        canada.cambiarCapital("Toronto");

        // impresión de objetos
        System.out.println(mexico.toString());
        System.out.println();
        System.out.println(canada.toString());
        System.out.println();
        System.out.println(brasil.toString());
    }
}