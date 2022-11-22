/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1ejercicio3;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Practica1Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num_entrada; 
        int menor;
                       
       Scanner sc= new Scanner(System.in);
       System.out.println("Cuantes entrades vols comprar?");
       num_entrada= sc.nextInt();
       
       System.out.println("Quants menors hi ha?");
       menor= sc.nextInt();
       
       
        double entrada_adult= num_entrada*20;
        double descompte_10= (num_entrada*20)/1.25;
        double descompte_25= descompte_10 - 20;
        double entrada_menor=menor*10;
        double preu_total= entrada_adult+entrada_menor;
       
       if (num_entrada<10)
       {
           entrada_adult= num_entrada*20;
           System.out.println(num_entrada + " adults.Preu a pagar: " + entrada_adult);
           
       }
       
       else if (num_entrada>=10 && num_entrada<25)
       {
           
           System.out.println(num_entrada + " adults. Preu a pagar aplicant el descompte del 25% per grups de 10 persones o mes " + descompte_10);
       }
       
       else if (num_entrada>25)
       {
           System.out.println(num_entrada + " adults. Preu a pagar aplicant el descompte de l'entrada gratuita per grups de 25 persones o ms "+ descompte_25);
       }
       
       else if (menor>0)
       {
           num_entrada= num_entrada-menor;
           System.out.println("El preu de l'entrada als menors es " + entrada_menor);
           
       }
       
       System.out.println("El precio total es " + preu_total);
    }
    
}
