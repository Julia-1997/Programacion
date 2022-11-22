/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jediejercicio5;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class JediEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realiza un programa que lea un número positivo N y calcule y visualice su factorial N! Siendo el factorial:
        int numero;
        int acum_factorial=1; //es lo que tenia multiplicado por el numero del contador
        int contador;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Introduce un numero positivo:");
        
        numero= sc.nextInt();
        
        for (contador=1; contador<=numero;contador++ ) 
        {
            acum_factorial= contador*acum_factorial;
            System.out.print(contador+ "*");
        }
        
        System.out.println("El factorial es "+ acum_factorial);
    }
    
}
