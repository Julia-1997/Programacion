/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf2ejercicio5;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class UF2Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int millas;
        double resultado_conversion;
        
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Introduce las millas");
        millas= sc.nextInt();
        
        resultado_conversion= millas_a_kilometros(millas);
        
        System.out.println("Tus millas son "+resultado_conversion + " km");
        
        
        
    }
    
    // funcion que sirve para convertir millas a km
    public static double millas_a_kilometros(int millas)
    {
        final double CONVERSION_1= 1*1.60934;
        double conversion= CONVERSION_1*millas;
        
        return conversion;
        
    }
    
}
