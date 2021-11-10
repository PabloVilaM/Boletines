package boletin7_5;

import javax.swing.JOptionPane;

public class Condicional {
    
    public void facerComparacion(){
        
        String num1 = JOptionPane.showInputDialog("Dame el primer numero para comparar");
        String num2 = JOptionPane.showInputDialog("Dame el segundo numero para comparar");
        String num3 = JOptionPane.showInputDialog("Dame el tercer numero para comparar");
        
        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);
        int numero3 = Integer.parseInt(num3);
        
        if (numero1 > numero2 && numero1>numero3){
            JOptionPane.showMessageDialog(null, "O número 1 é o maior");
        }
        
        else if (numero2 > numero1 && numero2>numero3){
            JOptionPane.showMessageDialog(null, "O número 2 é o maior");
        }
        
        else if (numero3 > numero1 && numero3>numero2){
            JOptionPane.showMessageDialog(null, "O número 3 é o maior");
        }
        
        else JOptionPane.showMessageDialog(null, "Dos o mais son iguais  e son os superiores");
        
    }
    
}
