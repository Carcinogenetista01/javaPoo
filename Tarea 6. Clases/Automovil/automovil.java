public class Automovil {
    // Atributos
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private int velocidad;

    // Constructor por defecto
    public Automovil() {
        marca = "";
        modelo = "";
        año = 0;
        color = "";
        velocidad = 0;
    }

    // Constructor sobrecargado
    public Automovil(String marca, String modelo, int año, String color, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.velocidad = velocidad;
    }

    // Métodos de acceso
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    // Método toString
    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }

    // Métodos de uso general
    public void acelerar() {
        velocidad += 10;
        System.out.println("Velocidad actual: " + velocidad);
    }

    public void frenar() {
        velocidad -= 10;
        System.out.println("Velocidad actual: " + velocidad);
    }

    public void encender() {
        System.out.println("El auto ha sido encendido.");
    }
}