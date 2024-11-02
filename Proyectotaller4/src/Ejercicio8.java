
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        double netflix, youtubepremium, dropbox, spotify, Edad, totalMensual;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el costo de netflix");
        netflix = teclado.nextDouble();
        System.out.println("Ingresa el costo de youtube premium");
        youtubepremium = teclado.nextDouble();
        System.out.println("Ingresa el costo de dropbox");
        dropbox = teclado.nextDouble();
        System.out.println("Ingresa el costo de spotify");
        spotify = teclado.nextDouble();
        System.out.println("Ingresa la edad");
        Edad = teclado.nextDouble();
        totalMensual = netflix + youtubepremium + dropbox + spotify;
        if (Edad <= 30) {
        }
        totalMensual *= 0.80;
        System.out.println("El valor total a pagar de los servicios digitales es = " + totalMensual);

    }

}
