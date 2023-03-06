public class Main {
    public static void main(String[] args) {
        // Crear un monitor
        Monitor monitor = new Monitor("LG", "27GL850-B", 27.0, "2560x1440");

        // Imprimir los atributos del monitor
        System.out.println(monitor.toString());

        // Encender el monitor
        monitor.encender();

        // Ajustar el brillo del monitor
        monitor.ajustarBrillo(50);

        // Apagar el monitor
        monitor.apagar();
    }
}