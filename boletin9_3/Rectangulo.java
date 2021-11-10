package boletin9_3;

import javax.swing.JOptionPane;


public class Rectangulo {
 
    public void Calcular(){
        int i = 0;
       
        while(i<=0){
            String base = JOptionPane.showInputDialog("Dame la longitud de la base");
            String longi = JOptionPane.showInputDialog("Dame la longitud de la altura");
            float basen = Float.parseFloat(base);
            float longin = Float.parseFloat(longi);
            if (basen<=0 || longin<=0){
                System.out.println("Los valores deben ser positivos");
            }
            else{
                i++;
                System.out.println("El area del rectangulo es: " + basen*longin);
            }
            
            
        }
        

    }
    
}
