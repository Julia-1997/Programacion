/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examencompañero;

import java.util.Scanner;

/**
 *
 * @author dagr5755
 */
public class Ex2PE1Dario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double f, numd = 1.8, num1, num2;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("introdueix grau minim:");
        num1 = Teclado.nextDouble();
        System.out.println("Introdueix grau max");
        num2 = Teclado.nextDouble();
        for (double tabla = num1; tabla <= num2; tabla++) {
            f = numd * num1 + 32;
            System.out.println("De graus " + num1 + " a Fahrenheit " + f + "F");
            num1++;
            
        }
    }
}
