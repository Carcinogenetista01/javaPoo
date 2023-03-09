public class Pais {
    private String nombre;
    private int poblacion;
    private String capital;

    // constructor por defecto
    public Pais() {
        this.nombre = "";
        this.poblacion = 0;
        this.capital = "";
    }

    // constructor sobrecargado
    public Pais(String nombre, int poblacion, String capital) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.capital = capital;
    }

    // métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    // método toString
    public String toString() {
        return "País: " + nombre + "\nPoblación: " + poblacion + "\nCapital: " + capital;
    }

    // métodos de uso general
    public void aumentarPoblacion(int cantidad) {
        poblacion += cantidad;
    }

    public void cambiarCapital(String nuevaCapital) {
        capital = nuevaCapital;
    }
}