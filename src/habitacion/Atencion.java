package habitacion;

import java.util.Date;
import javax.swing.JOptionPane;

public class Atencion {
    
    private int id;
    private String nombre;
    private String telefono;
    private String correo;

    public Atencion(int id, String nombre, String telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    } // Cierre metodo constructor

    public void registrarPaciente(int id, String nombre, String telefono, String correo) {
        
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
     
        
        
    } // Cierre metodo registrarPaciente
    
    public void salidaPaciente(int id, String nombre, String telefono, String correo) {

            JOptionPane.showMessageDialog(null, "ID Paciente: " + this.id + "\n"
                    + " Telefono: " + this.telefono + "\n"
                    + " Nombre del paciente: " + this.nombre + "\n"
                    + " Telefono del paciente: " + this.telefono + "\n"
                    + " Correo del paciente: " + this.correo);

    }

    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
}// Cierre clase Atencion
