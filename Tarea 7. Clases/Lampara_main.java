public class Main {
    public static void main(String[] args) {
        Lampara lampara1 = new Lampara();
        lampara1.setMarca("Philips");
        lampara1.setModelo("LED");
        lampara1.setPrecio(19.99);
        lampara1.setEncendida(false);

        Lampara lampara2 = new Lampara("Osram", "Fluorescente", 14.99, true);

        System.out.println(lampara1.toString());
        System.out.println(lampara2.toString());

        lampara1.encender();
        lampara2.apagar();
    }
}
