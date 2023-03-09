public class CuboDeRubik {
    private String marca;
    private int tamano;
    private String color;

    // constructor por defecto
    public CuboDeRubik() {
        this.marca = "";
        this.tamano = 0;
        this.color = "";
    }

    // constructor sobrecargado
    public CuboDeRubik(String marca, int tamano, String color) {
        this.marca = marca;
        this.tamano = tamano;
        this.color = color;
    }

    // métodos de acceso
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // método toString
    public String toString() {
        return "Cubo de Rubik de marca " + marca + "\nTamaño: " + tamano + "x" + tamano + "x" + tamano + "\nColor: " + color;
    }

    // métodos de uso general
    public boolean estaResuelto() {
        // código para verificar si el cubo está resuelto
        return false;
    }

    public void girarCara(String cara) {
        // código para girar una cara del cubo
    }
}
