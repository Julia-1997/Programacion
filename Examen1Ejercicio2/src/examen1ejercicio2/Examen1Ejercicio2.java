/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1ejercicio2;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Examen1Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int temperatura_minima=0;
        int temperatura_maxima=0;
        int contador_temperatura=0;
        double conversion;
        double resultado_conversion;
        double resultado_final;
        

        //Paso1: Pedir al usuario temperatura minima y temperatura maxima.
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Pon una temperatura minima");
        temperatura_minima= sc.nextInt();
        
        System.out.println("Pon una temperatura maxima");
        temperatura_maxima= sc.nextInt();
        
        // System.out.println("La temperatura minima es "+ temperatura_minima);
        // System.out.println("La temperatura maxima es "+ temperatura_maxima);
        
        contador_temperatura= temperatura_minima;
        
        //Paso2: Hacer el calculo e imprimir la tabla(bucle)
        
        while (contador_temperatura<=temperatura_maxima)
            
        {

            conversion= 1.8;
            resultado_conversion= conversion*contador_temperatura;
            
            resultado_final= 32 + resultado_conversion;
            
            System.out.println(contador_temperatura + " C ----"+ resultado_final + " F");
            ++contador_temperatura;
        }
        
        
        
    }
    
}
