/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class EncontrarMaximoFuncion {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       double numero1;
       double numero2;
       double resultado_maximo;
       double resultado_minimo;
       
       Scanner sc= new Scanner(System.in);
       
       System.out.println("Introduce un numero");
       numero1= sc.nextDouble();
       
       System.out.println("Introduce otro numero");
       numero2= sc.nextDouble();
       
       //Para que pueda devolver el resultado tengo que crear una variable nueva.
  
       resultado_maximo= maximo (numero1, numero2);
       resultado_minimo= minimo (numero1, numero2);
       
       System.out.println("De los dos numeros que has puesto, el numero maximo es " + resultado_maximo);
       System.out.println("De los dos numeros que has puesto, el numero minimo es " + resultado_minimo);
}
    
            public static double maximo(double valor1, double valor2) 
            {
            
                 double max;
            
            if (valor1 > valor2)
                {
                max = valor1;
                }
            else
                {
                max = valor2;
                }
            return max;

        
    }
    
            
          public static double minimo(double valor1, double valor2) 
            {
            
                 double min;
            
            if (valor1 > valor2)
                {
                min = valor2;
                }
            else
                {
                min = valor1;
                }
            return min;

        
    }
    

}