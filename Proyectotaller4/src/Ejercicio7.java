
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        double costoKilovatioHora, KilovatiosConsumidos, EdadUsuario, TotalApagar, MayorEdad, ValordePlanilla;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el costo por kilovatio/hora");
        costoKilovatioHora = teclado.nextDouble();
        System.out.println("Ingrese los kilovatios consumidos");
        KilovatiosConsumidos = teclado.nextDouble();
        System.out.println("Ingree la edad del usuario");
        EdadUsuario = teclado.nextDouble();
        TotalApagar = costoKilovatioHora * KilovatiosConsumidos;
        MayorEdad = TotalApagar - (TotalApagar * 0.10);
        if (EdadUsuario >= 65) {
            System.out.printf("El valor a cancelar de la planilla de luz es = " + MayorEdad);
        } else {
            System.out.println("El valor a cancelar de la planilla de luz es = " + TotalApagar);
        }

    }

}
