public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setTitulo("El señor de los anillos");
        libro1.setAutor("J.R.R. Tolkien");
        libro1.setAnioPublicacion(1954);
        libro1.setPrecio(25.99);

        Libro libro2 = new Libro("Juego de tronos", "George R.R. Martin", 1996, 20.99);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        System.out.println("¿Es recomendado el libro 1? " + libro1.esRecomendado());
        System.out.println("¿Es recomendado el libro 2? " + libro2.esRecomendado());

        System.out.println("El precio del libro 1 con descuento del 10% es: " + libro1.calcularDescuento(10));
        System.out.println("El precio del libro 2 con descuento del 15% es: " + libro2.calcularDescuento(15));
    }
}
