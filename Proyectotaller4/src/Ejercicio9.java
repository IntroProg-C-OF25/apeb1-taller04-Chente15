
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        double base, altura, arearectangulo, areatriangulo, areacuadrado, areatotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la base");
        base = teclado.nextDouble();
        System.out.println("Ingresa la altura");
        altura = teclado.nextDouble();
        arearectangulo = base * altura;
        areatriangulo = ((base * altura) / 2) * 3;
        areacuadrado = Math.pow(altura, 2);
        areatotal = arearectangulo + areatriangulo + areacuadrado;
        System.out.println("valor arearectangulo = " + arearectangulo);
        System.out.println("valor areatriangulo = " + areatriangulo);
        System.out.println("valor areacuadrado = " + areacuadrado);
        System.out.println("areatotal = " + areatotal);

    }
}
