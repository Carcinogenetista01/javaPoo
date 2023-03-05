import java.util.Scanner;

public class Gato {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa una cadena de 9 caracteres (solo X, O o _): ");
        String cadena = input.nextLine();

        if (cadena.length() != 9) {
            System.out.println("La cadena ingresada debe tener exactamente 9 caracteres.");
            return;
        }

        for (int i = 0; i < 9; i++) {
            char c = cadena.charAt(i);
            if (c != 'X' && c != 'O' && c != '_') {
                System.out.println("La cadena ingresada solo puede contener los caracteres X, O o _.");
                return;
            }
        }

        System.out.println("Cadena ingresada: " + cadena);

        System.out.println(" " + cadena.charAt(0) + " | " + cadena.charAt(1) + " | " + cadena.charAt(2) + " ");
        System.out.println("---+---+---");
        System.out.println(" " + cadena.charAt(3) + " | " + cadena.charAt(4) + " | " + cadena.charAt(5) + " ");
        System.out.println("---+---+---");
        System.out.println(" " + cadena.charAt(6) + " | " + cadena.charAt(7) + " | " + cadena.charAt(8) + " ");
    }
}