/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1hora;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Ejercicio1hora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hora;
        int minutos;
        int segundos;
        
        Scanner sc=new Scanner (System.in);
        System.out.println("Escribe la hora");
        hora= sc.nextInt();
        
        System.out.println("Escribe los minutos");
        minutos= sc.nextInt();
        
        System.out.println("Escribe los segundos");
        segundos= sc.nextInt();
        
        if (segundos==60)
        {
            segundos=0;
            minutos=minutos+1;
                 
                if (minutos==60)
                        {
                        hora=hora+1;
                        minutos=0;           
                        }    
        }
        else 
        {
            System.out.println();
        }
        // TODO code application logic here
    }
    
}
