
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        double hijo1, hijo2, hijo3, totaldegastos;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el gasto del hijo1");
        hijo1 = teclado.nextDouble();
        System.out.println("Ingresa el gasto del hijo2");
        hijo2 = teclado.nextDouble();
        System.out.println("Ingresa el gasto del hijo3");
        hijo3 = teclado.nextDouble();
        totaldegastos = hijo1 + hijo2 + hijo3;
        System.out.println("totaldegastos = " + totaldegastos);

    }

}
