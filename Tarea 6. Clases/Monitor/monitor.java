public class Monitor {
    // Atributos
    private String marca;
    private String modelo;
    private double tamaño;
    private String resolucion;

    // Constructor por defecto
    public Monitor() {
        marca = "";
        modelo = "";
        tamaño = 0.0;
        resolucion = "";
    }

    // Constructor sobrecargado
    public Monitor(String marca, String modelo, double tamaño, String resolucion) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamaño = tamaño;
        this.resolucion = resolucion;
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

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    // Método toString
    @Override
    public String toString() {
        return "Monitor{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamaño=" + tamaño +
                ", resolucion='" + resolucion + '\'' +
                '}';
    }

    // Métodos de uso general
    public void encender() {
        System.out.println("El monitor está encendido.");
    }

    public void apagar() {
        System.out.println("El monitor está apagado.");
    }

    public void ajustarBrillo(int nivel) {
        System.out.println("El brillo del monitor se ha ajustado a " + nivel + ".");
    }
}