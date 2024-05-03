import java.util.Scanner;

public class NombrePaciente {
    public String Nombrepaciente(){
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        System.out.println("ingrese nombre del paciente: ");
        nombre = sc.nextLine();
        return nombre;

    }
}
