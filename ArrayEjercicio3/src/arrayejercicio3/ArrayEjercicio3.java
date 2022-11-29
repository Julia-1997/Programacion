/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayejercicio3;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class ArrayEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea un programa que pida diez números reales por teclado, los almacene en un array, y
        // luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
        
        Scanner sc= new Scanner(System.in);
        
        // Definir las arrays  
        final int TAMAÑO=6;
        int []numeros;
        numeros = new int [6];
        
        // Pedir numeros al usuario
        for (int i = 0; i < numeros.length; i++) 
        {
            System.out.println("Introduce un numero en la posicion " +(i+1));
            numeros[i] = sc.nextInt();
        }       
        
        mostrarArray(numeros);
        
        int minimo= numeros[0]; //inicializado en la primera posicion
        int maximo= numeros[0];
        
        for (int i = 0; i < numeros.length; i++) 
        {
            if(numeros[i]>maximo)
            {
                maximo=numeros[i];
            }
            
            if(numeros[i]<minimo)
            {
                minimo= numeros[i];
            }
        }
}
    
 public static void mostrarArray(int[] numeros)
    {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("La posicion " + i + " tiene el numero " + numeros[i]);
    }   
    
}
 

}