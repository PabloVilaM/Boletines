package boletin9_4;

import javax.swing.JOptionPane;


public class Tabla {
    private  int i = 1;
    
    public void Multiplicar(){
        String num1 = JOptionPane.showInputDialog("Dame un numero para hacer su tabla de multiplicación 0");
        double num2 = Double.parseDouble(num1);
        
        while(i<11 && num1 == "0"){
            
            System.out.println(num2 + " x " + i + " = " + num2*i);
            i++;

        }
        
        System.out.println("Programa parado por el 0");
    }
}
