//autor pepito perez  programa compra de usuario
package cliente;

import javax.swing.JOptionPane;

public class Persona {

    private String Nombres;
    private String telefono;
    private String correo;
    private String direccion;

    public Persona(String Nombres, String telefono, String correo, String direccion) {
        this.Nombres = Nombres;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public void registrarce(String Nombres, String telefono, String correo, String direccion) {
        this.Nombres = Nombres;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getTelefono() {
        return telefono;
    }
     
    public String login(String user, String contra) {
        if ((Nombres == user) && telefono == contra) {
            return "a";
        } else {
            return "n";
        }
    }//cierre metodo login

    public void comprar(String articulo, int valor, int cantidad) {

       
            int total = cantidad * valor;
            JOptionPane.showMessageDialog(null, "cliente: " + this.Nombres + "\n"
                    + " Telefono: " + this.telefono + "\n"
                    + " articulo: " + articulo + "\n"
                    + " cantidad: " + cantidad + "\n"
                    + " valor: " + valor + "\n"
                    + " Total: " + total);
        
    }

}// cierre de clase
