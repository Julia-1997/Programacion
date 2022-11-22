/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1exercici2;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Practica1Exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* El programa demana un número i mostra un missatge a l’usuari indicant
        *si el número introduït és senar, si és parell però no divisible entre 3, o si 
        *és a la vegada parell i divisible entre 3.
        */
        
       double numero;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Introdueix un numero");
        
        numero= sc.nextDouble();
        
        if (numero%2==0)
        {
            if (numero%3==0)
            {
                System.out.println("El numero es parell i divisible entre 3");
            }
            
            else 
            {
                System.out.println("Numero parell i no divisible entre 3");
            }
        }
        
        
        else
        {
            System.out.println("El numero es senar");
        }
        
        System.out.println("Fi del programa");
    }
    
}
