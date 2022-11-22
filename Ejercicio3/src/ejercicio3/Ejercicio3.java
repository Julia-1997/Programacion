/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float lado;
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Pon la longitud del lado");
        lado = sc.nextFloat();
        
        float area = lado*lado;
        System.out.println("El area del cuadrado es " + area);
                
                
        // TODO code application logic here
    }
    
}
