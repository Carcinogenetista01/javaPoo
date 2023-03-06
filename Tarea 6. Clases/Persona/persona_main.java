public class Main {
    public static void main(String[] args) {
        // Crear una persona
        Persona persona = new Persona("Juan", 25, "Masculino", "Ingeniero");

        // Imprimir los atributos de la persona
        System.out.println(persona.toString());

        // Saludar
        persona.saludar();

        // Trabajar
        persona.trabajar();

        // Cumplir años
        persona.cumplirAños();
    }
}