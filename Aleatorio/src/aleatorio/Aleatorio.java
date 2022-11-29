/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aleatorio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Este programa genera un numero y tienes que adivinar cual es"); //Nueva linea añadida para el git
        Random rd= new Random(); //lo piensa el ordenador
        
        int aleatori;
        int numero_usuari;
        
        System.out.println("Adivina el numero que estoy pensando"); 
        aleatori= rd.nextInt(101)+1; //el 1 indica que comience con 1 y no con 0 y el 101 el máximo
            
        Scanner sc=new Scanner(System.in);
        
        do
        {
            System.out.println("Introduce un numero del 1 al 100");
            numero_usuari= sc.nextInt();
            
            if (numero_usuari>aleatori) //si el numero que pone el usuario es más grande que el numero del programa.
            {
                System.out.println("Mi numero es menor");
            }
            
            else if (numero_usuari<aleatori) //si el numero que pone el usuario es mas pequeño que el numero del programa.
            {
                System.out.println("Mi numero es mayor");
            }
            
        }
        
        while (numero_usuari !=aleatori);
        
            System.out.println("Enhorabuenas, has acertado el numero");
            
        
        
}
    
}




        
     
        
    
    

