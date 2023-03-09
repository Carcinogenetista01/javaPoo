public class Lampara {
    private String marca;
    private String modelo;
    private double precio;
    private boolean encendida;

    public Lampara() {
        this.marca = "";
        this.modelo = "";
        this.precio = 0.0;
        this.encendida = false;
    }

    public Lampara(String marca, String modelo, double precio, boolean encendida) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.encendida = encendida;
    }

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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", encendida=" + encendida +
                '}';
    }

    public void encender() {
        this.encendida = true;
        System.out.println("La lámpara está encendida.");
    }

    public void apagar() {
        this.encendida = false;
        System.out.println("La lámpara está apagada.");
    }
}
