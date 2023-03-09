public class Main {
    public static void main(String[] args) {
        // Crear un cubo de Rubik con el constructor por defecto
        CuboDeRubik cubo1 = new CuboDeRubik();
        
        // Establecer los valores de los atributos usando los métodos de acceso
        cubo1.setMarca("Rubik's");
        cubo1.setTamano(3);
        cubo1.setColor("Multicolor");
        
        // Imprimir el objeto usando el método toString
        System.out.println(cubo1);
        
        // Crear otro cubo de Rubik con el constructor sobrecargado
        CuboDeRubik cubo2 = new CuboDeRubik("Qiyi", 4, "Negro");
        
        // Imprimir el objeto usando el método toString
        System.out.println(cubo2);
        
        // Usar los métodos de uso general
        System.out.println("¿El cubo 1 está resuelto? " + cubo1.estaResuelto());
        cubo1.girarCara("Derecha");
    }
}
