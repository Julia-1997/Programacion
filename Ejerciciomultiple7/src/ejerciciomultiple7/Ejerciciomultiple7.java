/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciomultiple7;

/**
 *
 * @author jupr7227
 */
public class Ejerciciomultiple7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriu un programa que mostri per pantalla els 10 múltiples de 7 a partir del 12
        
        int numero=12;
        int contador_10=0;
        
        do 
        {
            numero++;
            
            if (numero%7==0)
            {
                contador_10++;
                System.out.println(numero + "--" + contador_10);
            }
        }
        
        while (contador_10<10);
    }
    
}
