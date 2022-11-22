/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadejercicio4;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class RecursividadEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realitza un algoritme recursivament , on es llegeixen dos valors enters per teclat i realitza la suma de tots els valors entre els dos números.
        
        int num_min;
        int num_max;
        int resultado;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Pon el numero mas pequeño");
        num_min= sc.nextInt();
        System.out.println("Pon el numero mas grande");
        num_max= sc.nextInt();
        
        resultado= Sumavalores(num_min,num_max);
        System.out.println("La suma de los valores " + num_min + " y "+ num_max + " es "+resultado);
    }
    
    public static int Sumavalores(int num_min, int num_max)
    {
        int suma=0;
        
        //Caso base
            if(num_min==num_max)
            {
                suma= num_min;
            }
            
        //Caso recursivo
            else 
            {
                suma= num_max + Sumavalores(num_min,num_max-1);
            }
        return suma;
    }
    
}
