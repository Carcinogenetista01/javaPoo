public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato();
        gato1.setNombre("Baphy");
        gato1.setRaza("Bombay");
        gato1.setEdad(2);
        gato1.setEstaDurmiendo(true);

        Gato gato2 = new Gato("Limonada", "Atigrado", 2, true);

        System.out.println(gato1.toString());
        System.out.println(gato2.toString());

        gato1.dormir();
        gato2.despertar();
    }
}
