/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wii;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Wii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
// TODO code application logic here

   Random rd= new Random();
        int eleccion_petardo;
        
        int petardo1= rd.nextInt(10)+1;
        int petardo2= rd.nextInt(10)+1;
        int petardo3= rd.nextInt(10)+1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoge un petardo (1, 2 o 3)");
        
        eleccion_petardo= sc.nextInt();
        
        System.out.println("Has escogido el petardo " + eleccion_petardo);
        
        // Prueba para ver que asigna los numeros bien, del 1 al 10.
        System.out.println("El petardo 1 tiene de numero " + petardo1);
        System.out.println("El petardo 2 tiene de numero " + petardo2);
        System.out.println("El petardo 3 tiene de numero " + petardo3);
        // Luego esto se borra Julia.

       if (eleccion_petardo==1)
           
       {
           if (petardo1>=petardo2 && petardo1>=petardo3)
                {
                   System.out.println("Felicidades has ganado, porque el petardo que has escogido era el mayor.");
                }
           
           else 
           {
               System.out.println("Lo siento pero has perdido, porque el petardo que has escogido es mas pequeño.");
           }
       }
       
       
        else if (eleccion_petardo==2)

        {
            if (petardo2>=petardo1 && petardo2>=petardo3)
            {
                System.out.println("Felicidades has ganado, porque el petardo que has escogido era el mayor.");
            }

            else
            {
                System.out.println("Lo siento pero has perdido, porque el petardo que has escogido es mas pequeño.");
            }
        }
           
       
            else if (eleccion_petardo==3)

            {
                if (petardo3>=petardo1 && petardo3>=petardo2)
                {
                    System.out.println("Felicidades has ganado, porque el petardo que has escogido era el mayor.");
                }

                else 
                {
                    System.out.println("Lo siento pero has perdido, porque el petardo que has escogido es mas pequeño.");
   
                }
            }
       
       for (int linea = 1; linea <=10; linea++) {
           
           // petardo1
           
           if (linea<=petardo1)
           {
               System.out.print("* ");
           }
           
           else
           {
               System.out.print("_ ");
           }
           
           // petardo2
           if (linea<=petardo2)
           {
               System.out.print("* ");
           }
           
            else
           {
               System.out.print("_ ");
           }
           
           //petardo3
           
           if (linea<=petardo3)
           {
                  System.out.println("* ");
           }
           
           else 
           {
               System.out.print("_ ");
           }
                  
          
         System.out.println("");

       }
       
    }
    
}
