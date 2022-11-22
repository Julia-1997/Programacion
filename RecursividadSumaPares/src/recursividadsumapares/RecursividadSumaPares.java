/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadsumapares;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class RecursividadSumaPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Introduce un numero par");
        numero= sc.nextInt();
        
        int suma;
        
        suma = SumaPares (numero);
        
        if (suma==-1)
        {
            System.out.println("El programa solo puede calcular la suma de numeros pares.");
        }
        
        else
        {
             System.out.println("La suma del numero " + numero + " es " + suma);
        {        
        
    }

    }
    
    /**
     *
     * @param numero
     * @return
     */
    
    }
    
    public static int SumaPares (int numero)
            
    {
        int suma=2;
        
        //Caso base 1
        
        if (numero==2)
        {
            suma=2;
        }
        
        //Caso base 2 (numeros impares)
        
        else if (numero%2==1)
        {
            suma=-1;
        }
        
        else 
        {
            suma= numero+SumaPares(numero-2);
        }
        return suma;
        
    }
    
}
    

