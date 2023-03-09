public class Giroscopio {
    private double velocidad;
    private double aceleracion;
    private String marca;

    // constructor por defecto
    public Giroscopio() {
        this.velocidad = 0;
        this.aceleracion = 0;
        this.marca = "";
    }

    // constructor sobrecargado
    public Giroscopio(double velocidad, double aceleracion, String marca) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.marca = marca;
    }

    // métodos de acceso
    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // método toString
    public String toString() {
        return "Giroscopio de marca " + marca + "\nVelocidad: " + velocidad + "\nAceleración: " + aceleracion;
    }

    // métodos de uso general
    public double calcularMomentum() {
        return velocidad * aceleracion;
    }

    public void aumentarVelocidad(double incremento) {
        velocidad += incremento;
    }
}