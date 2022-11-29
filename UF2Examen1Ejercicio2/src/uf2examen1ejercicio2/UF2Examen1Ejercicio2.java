/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf2examen1ejercicio2;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class UF2Examen1Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num_filas;
        int bombillas_totales;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("¿Cuantas filas tiene tu arbol navideño?");
        num_filas= sc.nextInt();
        
        bombillas_totales= calculaBombetes(num_filas);
        
        if (bombillas_totales==1)
        {
            System.out.println("Para tu arbol de una fila necesitas 1 bombilla");
        }
        
        else
        {
            System.out.println("Para tu arbol de " + num_filas + " filas necesitas " + bombillas_totales + " bombillas");
        }
            
      
        
    }
    
    // Metodo recursivo que calcula las bombillas del arbol, recibe un entero y devuelve un entero
    
    public static int calculaBombetes(int num_filas)
    {
        int bombillas=1;
        
        if (num_filas==1) // Caso base
        {
            bombillas=1;
        }
              
        else // Caso recursivo
            
        {
            bombillas= 2+calculaBombetes(num_filas-1);
        }
        return bombillas;
    }
    
}
