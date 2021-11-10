package boletin7_2;

import javax.swing.JOptionPane;


public class CondicionalSegundo {
    
    public void HacerOperación(){
        String num1 = JOptionPane.showInputDialog("Dame un Short");
        String num2 = JOptionPane.showInputDialog("Dame otro Short");
        
        short numero1 = Short.parseShort(num1);
        short numero2 = Short.parseShort(num2);
        
        if (numero1>=numero2){
            JOptionPane.showMessageDialog(null, numero1-numero2);
            JOptionPane.showMessageDialog(null, numero1+numero2);
        }  
        
        else
            JOptionPane.showMessageDialog(null, numero1+numero2);
    }
    
    
}
