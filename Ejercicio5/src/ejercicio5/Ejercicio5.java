/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio;
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Introduce el radio");
        radio= sc.nextInt();
        
        final double pi= 3.14;
        double diametro= radio+radio;
        double longitud= pi*diametro;
        double area=pi*radio*radio;
        
        System.out.println("El area es " + area);
    }
    
}
