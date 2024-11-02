
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        double costo_minuto, cantidad_minutos, valor_planilla;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el costo por minuto");
        costo_minuto = teclado.nextDouble();
        System.out.println("Ingresa la cantidad por minuto");
        cantidad_minutos = teclado.nextDouble();
        valor_planilla = costo_minuto + cantidad_minutos;
        System.out.println("valor_planilla = " + valor_planilla );

    }
}
