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
public class MayorEdad {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int edad;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Cuantos años tienes?");
        edad= sc.nextInt();
        
        boolean mayor = esMayorEdad (edad);
        
        
        if (mayor==true)
        {
            System.out.println("Eres mayor de edad");
        }
        
        else  
        {
            System.out.println("No eres mayor de edad");
        }
        
    }
    
    public static boolean esMayorEdad(int a)
    {
        
        
        if (a>=18)
        {
            return true;
        }
        
        else 
        {
            return false;
        }
                
    }
    
    
    
}
