package boletin9_5;

import javax.swing.JOptionPane;



public class Soldo {
    
    public void Cuentas(){
        int i = 1;
        int a = 0;
        float b = 0;
        float c = 0;
        
        while(i>0){
          String sueld =  JOptionPane.showInputDialog("Sueldo del trabajador (Pon 0 para salir del programa)");
          float sueldo = Float.parseFloat(sueld);
          if(sueldo >= 1000 && sueldo <= 1750){
              a++;
             
          }
          else if(sueldo<1000 && sueldo>0){
              c++;
              
          }
          else if(sueldo == 0){
              i=0;
          }
          b++;
                             
        }
        
        b = b-1f;
        System.out.println("Numero total de personas entre 1000 y 1750: " + a);
        System.out.println("Porcentaje de personas por debajo de 1000€: " + (c/b)*100 +"%");
    }
}
