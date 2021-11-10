package boletin8_2;

import javax.swing.JOptionPane;


public class SuperficieSwitch {
    
    
    public void facerSwitch(){
       String respuesta = JOptionPane.showInputDialog("De que quieres saber la superficie? (Cuadrado, triangulo o circulo)").toLowerCase();
       
       switch(respuesta){
           
           case "cuadrado":
               String ladoc = JOptionPane.showInputDialog("Dime la longitud del lado del cuadrado");
               int ladocm = Integer.parseInt(ladoc);
               System.out.println("La superficie del lado es: " + ladocm*ladocm);
               break;
           case "triangulo":
               String ladotb = JOptionPane.showInputDialog("Dime la longitud de la base");
               String ladota = JOptionPane.showInputDialog("Dime la longitud de la altura");
               int ladotbm = Integer.parseInt(ladotb);
               int ladotam = Integer.parseInt(ladota);
               System.out.println("La superficie del triangulo es: " + (ladotbm*ladotam)/2);
               break;
           case "circulo":
               String radioc = JOptionPane.showInputDialog("Dime la longitud del radio");
               final float pi = 3.14f;
               int radiocm = Integer.parseInt(radioc);
               System.out.println("La superficie del circulo es: " + (radiocm*radiocm)*pi); //Método que haría normalmente
               break;
           default:
               System.out.println("Opción incorrecta");
            break;
       }
    }
    
    /*private int base;
    private int altura;
    private int lado;
    private int radio;
    private final float pi = 3.14f;
    
    public SuperficieSwitr*/
}
