/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1exercici1;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Practica1Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Programa que demana a l’usuari que entri una data composta de dia, mes i any i validi les tres
        *dades
        */
        int dia;
        int mes;
        int any;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Introdueix el dia");
        
        dia= sc.nextInt();
        
        System.out.println("Introdueix el mes");
        mes= sc.nextInt();
        
        System.out.println("Introdueix l'any");
        any= sc.nextInt();
        
        if (any<1900)
        {
            System.out.println("L'any que has introduit " + any + " no es correcte. El programa no accepta un any anterior a 1900");
        }
        
        else if (mes>12 || mes<1)
        {
            System.out.println("El mes que has introduit " + mes + " no es correcte. El programa nomes accepta del mes 1 al 12");
        }
        
        else if (dia>30 || dia<1)
        {
            System.out.println("El dia que has introduit " + dia + " no es correcte. El programa nomes accepta del dia 1 al 30.");
        }
        else
        {
        System.out.println("La data " + dia + "/" + mes + "/" + any + " es correcte.");
        }
        
    }
    
}
