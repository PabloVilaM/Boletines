package boletin7;

import javax.swing.JOptionPane;


public class Condicional {
    
    public void crearMensaje(){
        String num = JOptionPane.showInputDialog("Ponme un número");
        int numero = Integer.parseInt(num);
        
        
        if (numero>=1){
            JOptionPane.showMessageDialog(null, "É positivo");
        }
        
        else if (numero<0){
            JOptionPane.showMessageDialog(null, "É negativo");
        }
        
        else JOptionPane.showMessageDialog(null, "Son iguais");
    }
    
    //--------------------
    
    /*public int lerNumero(){
        String num = JOptionPane.showInputDialog("Ponme un número");
        int numero = Integer.parseInt(num);
        return numero;
    }
    
    public void crearMensaje(){
        
        int numero = lerNumero();       
        
        if (numero>0){
            JOptionPane.showMessageDialog(null, "É positivo");
        }
        
        else if (numero<0){
            JOptionPane.showMessageDialog(null, "É negativo");
        }
        
        else JOptionPane.showMessageDialog(null, "Son iguais");
    }*/
    
    //Metodo menos óptimo
}
