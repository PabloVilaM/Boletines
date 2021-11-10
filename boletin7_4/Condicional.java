package boletin7_4;

import javax.swing.JOptionPane;


public class Condicional {
    
    
    public void facerTodo(){
        
       String nombre1 = JOptionPane.showInputDialog("Dime un nombre");
       String num1 = JOptionPane.showInputDialog("Dime el peso de esa persona");
       String nombre2 = JOptionPane.showInputDialog("Dime otro nombre");
       String num2 = JOptionPane.showInputDialog("Dime el peso de esa persona");
       
       int numero1 = Integer.parseInt(num1);
       int numero2 = Integer.parseInt(num2);
       
       if (numero2 > numero1){
           JOptionPane.showMessageDialog(null, nombre2 + " pesa mas");
           JOptionPane.showMessageDialog(null, numero2-numero1 + " de diferencia de peso");
       }
       
       else if (numero1 < numero2){
           JOptionPane.showMessageDialog(null, nombre1 + " pesa mas");
           JOptionPane.showMessageDialog(null, numero1-numero2 + " de diferencia de peso");
       }
       
       else JOptionPane.showMessageDialog(null, nombre2 + nombre1 + "Pesan lo mismo");
    }
}
