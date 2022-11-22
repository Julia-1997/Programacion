/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocalculartabla;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Ejerciciocalculartabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int contador=1;
        int calculo;
        
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Escribe un numero");
        numero= sc.nextInt();
        
        
        for (contador = 1; contador <=10; contador++) 
        {
          calculo=numero*contador;
          System.out.println(numero + "*" + contador + "=" + calculo);
        
        }
        
       
            
    
        
    }
    
}
