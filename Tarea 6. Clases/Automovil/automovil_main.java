public class Main {
    public static void main(String[] args) {
        // Crear un automóvil
        Automovil auto = new Automovil("Ford", "Mustang", 2021, "Rojo", 0);

        // Imprimir los atributos del auto
        System.out.println(auto.toString());

        // Acelerar el auto y verificar la velocidad actual
        auto.acelerar();

        // Frenar el auto y verificar la velocidad actual
        auto.frenar();

        // Encender el auto
        auto.encender();
    }
}