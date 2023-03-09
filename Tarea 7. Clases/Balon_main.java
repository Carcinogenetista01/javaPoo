public class Main {
    public static void main(String[] args) {
        Balon balon1 = new Balon();
        balon1.setMarca("Nike");
        balon1.setTipo("Fútbol");
        balon1.setPrecio(29.99);
        balon1.setCantidad(10);

        Balon balon2 = new Balon("Adidas", "Baloncesto", 34.99, 5);

        System.out.println(balon1.toString());
        System.out.println(balon2.toString());

        System.out.println("El precio total de balon1 es: " + balon1.calcularPrecioTotal());
        System.out.println("El precio total de balon2 es: " + balon2.calcularPrecioTotal());

        balon1.aumentarCantidad(5);
        System.out.println("La cantidad de balon1 después de aumentar es: " + balon1.getCantidad());
    }
}
