
package boletin9_1;

import javax.swing.JOptionPane;

public class Contabilizar {
    
    public void contarN(){
        int acu1= 0;
        int acu2= 0;
        int acu3= 0;
        int i = 0;
        
        for (i=0;i<10;i++){
            int num = lerNum();
            if(num>0){
                acu1++;
                System.out.println("É positivo");
            }
            else if(num<0){
                acu2++;
                System.out.println("É negativo");
            }
            else{
                acu3++;
                System.out.println("É 0");
            }
                
        }
        
        System.out.println("A cantidade de números positivos é: " + acu1 + "\nA cantidade de números negativos é: " + acu2 + "\nA cantidade de ceros é: " + acu3);
    }
    
    public int lerNum(){
        String nume = JOptionPane.showInputDialog("Dame 10 números");
        int num = Integer.parseInt(nume);
        return num;
    }
}
