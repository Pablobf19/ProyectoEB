import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        NombrePaciente np = new NombrePaciente();
        System.out.println(np.Nombrepaciente());
        
        IngresarEdad ie = new IngresarEdad();
        System.out.println(ie.Ingresaredad());


        LinkedList<Empleado> empleado = new LinkedList<>();
        int cant = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la cantidad de empleados "));
        for (int i = 0; i < cant; i++) {
            Empleado  e = new Empleado(null, null, null, i, null);
            e.setNombre(JOptionPane.showInputDialog("Ingrese nombre"));
            e.setApellido(JOptionPane.showInputDialog("Ingrese el apellido"));
            e.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion"));
            e.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
            e.setCargo("Ingrese el cargo");
            empleado.add(e);
        }
    }
}