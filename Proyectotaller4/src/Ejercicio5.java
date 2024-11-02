
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        double Cpu, Teclado, Pantalla, Ratón, costoTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el costo del cpu");
        Cpu = teclado.nextDouble();
        System.out.println("Ingresa el costo del teclado");
        Teclado = teclado.nextDouble();
        System.out.println(" Ingresa el costo de la pantalla");
        Pantalla = teclado.nextDouble();
        System.out.println("Ingresa el costo del raton");
        Ratón = teclado.nextDouble();
        costoTotal = Cpu + Teclado + Pantalla + Ratón; 
        System.out.println("El costo total de la computadora es: $" + costoTotal);

    }
}
