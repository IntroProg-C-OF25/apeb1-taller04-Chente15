
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        double montoprestamo, interesmensual,tasainteres, numeropagos = 12, pagoMensual;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el monto prestamo");
        montoprestamo = teclado.nextDouble();
        System.out.println("Ingresa el interes mensual");
        interesmensual = teclado.nextDouble();
        tasainteres = interesmensual / 100;
        pagoMensual = (montoprestamo * tasainteres) / (1 - Math.pow(1 + tasainteres, -numeropagos));
        System.out.printf("El pago mensual del préstamo es: $%.2f%n", pagoMensual);
    }
}
