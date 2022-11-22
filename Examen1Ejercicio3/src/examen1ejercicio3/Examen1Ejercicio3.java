/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1ejercicio3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Examen1Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Paso1: programa escoge un numero al azar del 1 al 9
        Random rd= new Random();
        int tabla_multiplicar= rd.nextInt(9)+1;
        int numero2=1;
        int contador_tabla=0;
        int respuesta_usuario;
        int SOLUCION;
        int fallos=0;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("La tabla va a ser del numero "+tabla_multiplicar);
        
        do 
        {
            
            ++contador_tabla;
            
            for (numero2= 1; numero2 <=10; numero2++) {
                
                //Paso2: preguntar al usuario de forma ordenada la tabla de ese número.
                
                System.out.println("Cual es el resultado de esta operacion?");
                System.out.print(tabla_multiplicar + "x" + numero2 + " =");
                //Paso3: el usuario debe de poner la solución de la operación.
                respuesta_usuario=sc.nextInt();
                
                SOLUCION= tabla_multiplicar*numero2;
                
                //3.1. Si lo ha puesto mal, decirlo y mostrar la solución 
                if (SOLUCION!=respuesta_usuario)
                {
                    ++fallos;
                    System.out.println("-->Incorrecto."+ tabla_multiplicar + "x" + numero2 + " =" + SOLUCION);
                }
         
            }
                     
        } while (contador_tabla<10 && numero2<10);
                 
        //Paso4: el programa acaba con una tabla entera y poner fallos del usuario.
        
        System.out.println("Fin del programa. Has hecho "+ fallos + " fallos.");
        
    }
    
}
