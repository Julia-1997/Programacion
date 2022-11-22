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
public class Ex1PE1Dario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        String laborable, dissabte, festiu, dia, tipus2;
        Double tipus;
        int tipusDia = 0, tipusEsmorzar = 0;
        
        switch (tipusDia) {
            case 1:
                dia = "laborable";

                break;
            case 2:
                dia = "dissabte";
                break;
            case 3:
                dia = "festiu";
                break;
            
            default:
                dia = "dia incorrecto";
                break;
        }
        switch (tipusEsmorzar) {
            case 1:
                tipus = 2.00;
                break;
            case 2:
                tipus = 2.20;
                break;
            case 3:
                tipus = 2.00;
                break;
            case 4:
                tipus = 2.50;
                break;
            case 5:
                tipus = 2.70;
                break;
            case 6:
                tipus = 2.80;
                break;
            default:
                tipus2 = "tipus incorrecto";
                break;
        }

        System.out.println("Has escollit el dia: " + dia);
    }
}
