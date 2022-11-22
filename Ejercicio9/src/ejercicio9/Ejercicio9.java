/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduce tu edad");
        edad= sc.nextInt();
        
        if (edad>=18) //si es cierto la condición del if, no punto y coma. 
            {
            System.out.println("Eres mayor de edad");
            }
            
        else    
            {  
            System.out.println("mala suerte");
            }
            
            
            }
    
}
