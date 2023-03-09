public class Computadora {
    private String marca;
    private String modelo;
    private double precio;
    
    // constructor por defecto
    public Computadora() {
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
        this.precio = 0.0;
    }
    
    // constructor sobrecargado
    public Computadora(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    // métodos de acceso
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
    
    // método toString
    @Override
    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: $" + precio;
    }
    
    // método para encender la computadora
    public void encender() {
        System.out.println("La computadora se está encendiendo...");
    }
    
    // método para apagar la computadora
    public void apagar() {
        System.out.println("La computadora se está apagando...");
    }
    
    // método para aumentar el brillo de la pantalla
    public void aumentarBrillo() {
        System.out.println("El brillo de la pantalla se ha aumentado.");
    }
    
    // método para disminuir el brillo de la pantalla
    public void disminuirBrillo() {
        System.out.println("El brillo de la pantalla se ha disminuido.");
    }
}
