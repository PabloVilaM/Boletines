package boletin9_2;


public class SumaM {
    
    public void facerSumayMul(){
        int i;
        int cantidad1 = 0;
        double cantidad2 = 1;
        for(i=11;i<90;i++){
            cantidad1 = cantidad1 + i;
            cantidad2 = cantidad2 * i;
            System.out.println("Mult: " + cantidad2);
            System.out.println("Suma: " + cantidad1);
        }
        System.out.println("Suma total: " + cantidad1);
        System.out.println("Multiplicacion total: " + cantidad2);
    }
}
