package habitacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * @author Santiago Rendon Castrillon
 */

public class Registro {

    public static void main(String[] args) throws ParseException {
       
     int id; 
     String nombre,telefono,correo;
     
     String fEntrada,fSalida;
     
     
     id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la ID del paciente"));
     nombre = JOptionPane.showInputDialog("Ingrese el nombre del paciente");
     telefono = JOptionPane.showInputDialog("Ingrese el telefono del paciente");
     correo  = JOptionPane.showInputDialog("Ingrese el correo del paciente");
     
     // Convertir String a Date https://www.aluracursos.com/blog/como-convertir-string-para-date-en-java
     fEntrada  = JOptionPane.showInputDialog("Ingrese fecha de ingreso del paciente (dd/mm/yyyy)");
     fSalida  = JOptionPane.showInputDialog("Ingrese fecha de salida del paciente (dd/mm/yyyy)");
     
     SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy"); //Formato de fecha https://guru99.es/java-date/
     Date fechaEntrada = formatoFecha.parse(fEntrada); 
     Date fechaSalida = formatoFecha.parse(fSalida);
     
     
     
     JOptionPane.showMessageDialog(null, "ID Paciente: " + id + "\n"
                    + "Telefono: " + telefono + "\n"
                    + "Nombre del paciente: " + nombre + "\n"
                    + "Telefono del paciente: " + telefono + "\n"
                    + "Correo del paciente: " + correo + "\n"
                    + "Fecha de ingreso: " + fechaEntrada + "\n"
                    + "Fecha de salida: " + fechaSalida);

        
        // Date Difference: https://code.sololearn.com/czGJlt4Z0T23/#java
        
        
        
        
        
        
        
        
        
        
        
        
        
    }// Cierre metodo main
    
}// Cierre Clase registro
