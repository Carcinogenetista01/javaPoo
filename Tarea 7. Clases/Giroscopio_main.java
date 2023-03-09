public class Main {
    public static void main(String[] args) {
        // creación de objetos
        Giroscopio giroscopio1 = new Giroscopio(20, 5, "XYZ");
        Giroscopio giroscopio2 = new Giroscopio();
        giroscopio2.setVelocidad(10);
        giroscopio2.setAceleracion(3);
        giroscopio2.setMarca("ABC");

        // uso de métodos de acceso
        System.out.println("Marca del giroscopio 1: " + giroscopio1.getMarca());
        System.out.println("Velocidad del giroscopio 2: " + giroscopio2.getVelocidad());

        // uso de métodos de uso general
        System.out.println("Momentum del giroscopio 1: " + giroscopio1.calcularMomentum());
        giroscopio2.aumentarVelocidad(5);

        // impresión de objetos
        System.out.println(giroscopio1.toString());
        System.out.println();
        System.out.println(giroscopio2.toString());
    }
}
