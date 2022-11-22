/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1ejercicio1;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Examen1Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         char dia;
         int tipo;
         double precio;
         
        //Paso1: Programa pregunta al usuario si es  laborable (L), dissabte (S) o Festiu (F).
         Scanner sc= new Scanner(System.in);
         
         System.out.println("Que dia es?. Pon L si es un dia laborable, S si es sabado o F si es festivo");
         dia= sc.next().charAt(0);
         
         
         //Paso2: Programa pregunta al usuario el tipo de almuerzo (1 0 2)
         System.out.println("Que tipo de almuerzo quieres?. Escoge entre el tipo 1 o el 2");
         tipo= sc.nextInt();
               
        //Paso3: programa muestra el precio según las opciones que ha marcado el usuario. Si la opción del usuario esta mal, decirlo.
        
        switch (dia) {
            
            case 'L':
            case 'l':
                
                if (tipo==1)
                    {
                        precio=2;
                        System.out.println("El precio del almuerzo de tipo 1 es de " + precio + " euros.");
                    }
                
                else if (tipo==2)
                    {
                        precio=2.50;
                        System.out.println("El precio del almuerzo de tipo 2 es de " + precio + " euros.");
                    }
                
                else
                    {
                        System.out.println("El tipo de almuerzo que has puesto no es correcto.");
                    }
            break;
            
            case 'S':
            case 's':    
                
                if (tipo==1)
                    {
                        precio=2.20;
                        System.out.println("El precio del almuerzo de tipo 1 es de " + precio + " euros.");
                    }
                
                else if (tipo==2)
                    {
                        precio=2.70;
                        System.out.println("El precio del almuerzo de tipo 2 es de " + precio + " euros.");
                    }
                
                else
                    {
                        System.out.println("El tipo de almuerzo que has puesto no existe.");
                    }
            break;
            
            
            case 'F':
            case 'f':
                if (tipo==1)
                    {
                        precio=2.30;
                        System.out.println("El precio del almuerzo de tipo 1 es de " + precio + " euros.");
                    }
                
                else if (tipo==2)
                    {
                        precio=2.80;
                        System.out.println("El precio del almuerzo de tipo 2 es de " + precio + " euros.");
                    }
                
                else
                    {
                        System.out.println("El tipo de almuerzo que has puesto no existe.");
                    }
            break;
            
            default:
                System.out.println("Has puesto mal el dia");
                
        }
            

    }
    
}
