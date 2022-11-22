/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jediejercicio10;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class JediEjercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10) que
        //termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
        
        int nota; 
        boolean nota_10=false;
        
        Scanner sc= new Scanner(System.in);
        
        do
        {
        System.out.println("Escribe una nota, si escribes -1 sales del programa");
        nota= sc.nextInt();
        
            if (nota==10)
                {
                    nota_10=true; //activo variable centinela
                }
        
        }
        while (nota!=-1);
        
            if (nota_10=true)
            {
                System.out.println("Has puesto un 10");
            }
        
            else 
             {
                 System.out.println("No has puesto un 10");
             }
            

        
        System.out.println("El programa acaba porque has escrito -1");
        

    }
    
}
