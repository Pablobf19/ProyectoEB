import java.util.Scanner;

public class IngresarEdad {

    public int Ingresaredad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        return edad;
    }
}