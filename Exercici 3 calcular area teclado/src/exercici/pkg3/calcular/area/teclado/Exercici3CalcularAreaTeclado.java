/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg3.calcular.area.teclado;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Exercici3CalcularAreaTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int lado;
        System.out.println("pon la longitud del lado");
        lado= sc.nextDouble();
        
        double area= lado*lado;
        System.out.println("el lado mide " + lado);// TODO code application logic here
        System.out.println("el lado mide " + area);// TODO code application logic here

        
    }
    
}
