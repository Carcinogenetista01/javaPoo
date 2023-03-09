public class Gato {
    private String nombre;
    private String raza;
    private int edad;
    private boolean estaDurmiendo;

    public Gato() {
        this.nombre = "";
        this.raza = "";
        this.edad = 0;
        this.estaDurmiendo = false;
    }

    public Gato(String nombre, String raza, int edad, boolean estaDurmiendo) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.estaDurmiendo = estaDurmiendo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstaDurmiendo() {
        return estaDurmiendo;
    }

    public void setEstaDurmiendo(boolean estaDurmiendo) {
        this.estaDurmiendo = estaDurmiendo;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", estaDurmiendo=" + estaDurmiendo +
                '}';
    }

    public void dormir() {
        this.estaDurmiendo = true;
        System.out.println("El gato está durmiendo.");
    }

    public void despertar() {
        this.estaDurmiendo = false;
        System.out.println("El gato se ha despertado.");
    }
}
