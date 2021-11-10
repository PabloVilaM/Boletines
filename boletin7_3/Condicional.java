package boletin7_3;

import javax.swing.JOptionPane;

public class Condicional {
    
    public int lerNumero(){
        String num1 = JOptionPane.showInputDialog("Dame un número");
        int numero1 = Integer.parseInt(num1);
        return numero1;
    }
    
    public void facerOpera(){
        
        int numero = lerNumero();
        
        if (numero>0){
            JOptionPane.showMessageDialog(null, "+");
        }
        
        else if (numero<0){
            JOptionPane.showMessageDialog(null, "-");
        }
        
        else JOptionPane.showMessageDialog(null, "0");
    }
}
