/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero1;
        double numero2;
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Escribe dos numeros");
        numero1=sc.nextDouble();
        numero2=sc.nextDouble();
        
        double suma= numero1+numero2;
        double resta= numero1+numero2;
        double multi= numero1*numero2;
        
        System.out.println("la suma es "+ suma);
        System.out.println("la resta es "+ resta);
        System.out.println("la multiplicacion es "+ multi);
        
        double divi=0;
        if (numero2!=0)
        {
        divi= numero1/numero2;
        }
            
            System.out.println("la division es "+ divi);
        
    }
    
}
