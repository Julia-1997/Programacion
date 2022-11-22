/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadsumas;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class RecursividadSumas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        numero= sc.nextInt();
        
        int suma;
        
        suma= Sumanumeros(numero);
        
        System.out.println("La suma del numero "+ numero + " es " + suma);
    }
    
    public static int Sumanumeros (int numero)
    {
        int suma=0;
        
        // caso base
        if (numero==0)
        {
           suma=0;
        }
        
        else if (numero==1)
        {
            suma=1;
        }
        
        else if (numero>1)
        {
            suma= numero+Sumanumeros(numero-1);
            
        }
        return suma;
    }
    
}
