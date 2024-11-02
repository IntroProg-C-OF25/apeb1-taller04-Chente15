
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número entre 2 y 6: ");
        int numero = teclado.nextInt();
        if (numero >= 2 && numero <= 6) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } else {
            System.out.println("Error: el número ingresado no está entre 2 y 6.");
        }

    }
}
