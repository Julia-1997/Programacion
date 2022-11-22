/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13adivinaelprograma;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Ejercicio13adivinaelprograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero_usuario;
        int minimo=1;
        int maximo=100;
        char respuesta;
        
        Scanner sc= new Scanner(System.in);
        int mitad= (maximo+minimo)/2;
        
        do 
            {
            System.out.println("El numero que has pensado es " + mitad);
            System.out.println("He acertado? (i,m,n)");
            respuesta= sc.next().charAt(0);
            
                if (respuesta=='n')
                {
                    minimo=mitad;
                }
                
                else if (respuesta=='m')
                {
                    maximo=mitad;
                }
                
            }
        
        while (respuesta != 'i');
        System.out.println("Acertaste");
        
        
    }
    
}
