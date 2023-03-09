public class Main {
    public static void main(String[] args) {
        // creando un objeto de Computadora
        Computadora miComputadora = new Computadora("HP", "Pavilion", 999.99);
        
        // mostrando la información de la computadora
        System.out.println(miComputadora.toString());
        
        // encendiendo la computadora
        miComputadora.encender();
        
        // aumentando el brillo de la pantalla
        miComputadora.aumentarBrillo();
        
        // apagando la computadora
        miComputadora.apagar();
    }
}
