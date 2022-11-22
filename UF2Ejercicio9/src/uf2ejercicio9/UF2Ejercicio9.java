/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf2ejercicio9;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class UF2Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int numero1;
        int numero2;
        int numero3;
        int mayor;
        
        Scanner sc= new Scanner (System.in);
        System.out.println("Escribe un numero");
        numero1= sc.nextInt();
        System.out.println("Escribe otro numero");
        numero2= sc.nextInt();
        System.out.println("Escribe un ultimo numero");
        numero3= sc.nextInt();
        
        mayor= elmasGrande(numero1, numero2);
        mayor= elmasGrande(numero3,mayor);
        
        System.out.println("El numero mas grande es "+mayor);
        
        
    }
    
    // Funcion que devuelve el numero más grande
    public static int elmasGrande (int n,int m)
    {
        int mayor;
        
        if (n>m)
        {
            mayor=n;
        }
        
        else
        {
            mayor=m;
        }
        
        return mayor;
    }
    
    
}

