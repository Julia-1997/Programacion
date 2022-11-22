/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduce dos numeros");
        numero1=sc.nextInt();
        numero2=sc.nextInt();
        
        if (numero1>=numero2)
        {// si es cierto
            
            if (numero1==numero2)
            {
                System.out.println("Son iguales");   
            }
            
            else 
            {
                System.out.println(numero1);
            }
            
        }
        
        else 
        {
            System.out.println(numero2);
        }

    }
    

}