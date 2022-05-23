//autor pepito perez  programa compra de usuario
package cliente;

import javax.swing.JOptionPane;


public class Compra {

    public static void main(String[] args) {
     String  usuario = "", contra = "", login, producto= "";
     int valor, cantidad;
        Persona factura = new Persona("pepito", "123456","pepito@gmail.com", "avenida siempre viva");
        
        usuario = JOptionPane.showInputDialog("digite usuario");
        contra = JOptionPane.showInputDialog("digite contraseña");
        
        login = factura.login(usuario, contra);
        
        if (login == "n"){
            producto = JOptionPane.showInputDialog("digite producto");
            cantidad =Integer.parseInt(JOptionPane.showInputDialog("digite cantidad"));
             valor =Integer.parseInt(JOptionPane.showInputDialog("digite valor"));
             factura.comprar(producto, valor, cantidad);
        } else{
            JOptionPane.showMessageDialog(null,"usuario no encontrado");   
        }       
     
        
       
    }//cierre metodo main
    
}// cierre clase compra
