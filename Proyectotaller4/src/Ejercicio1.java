
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        double base, altura, area;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la base");
        base = teclado.nextDouble();
        System.out.println("Ingresa la altura");
        altura = teclado.nextDouble();
        area = (base + altura) / 2;
        System.out.println("area del triangulo = " + area);

    }
}
