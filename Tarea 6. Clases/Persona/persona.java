public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private String genero;
    private String ocupacion;

    // Constructor por defecto
    public Persona() {
        nombre = "";
        edad = 0;
        genero = "";
        ocupacion = "";
    }

    // Constructor sobrecargado
    public Persona(String nombre, int edad, String genero, String ocupacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.ocupacion = ocupacion;
    }

    // Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    // Método toString
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                '}';
    }

    // Métodos de uso general
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }

    public void trabajar() {
        System.out.println("Estoy trabajando como " + ocupacion);
    }

    public void cumplirAños() {
        edad++;
        System.out.println("¡Feliz cumpleaños! Ahora tengo " + edad + " años.");
    }
}