/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf2ejercicio11;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class UF2Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero= sc.nextInt();
        
    }
    public static void tablaMultiplicar(int numero)
    {
        int numero2;
        int resultado;
        
        System.out.println("La tabla de multiplicar de "+numero);
        
        for (numero2= 1; numero2<10; numero2++) {
            
            resultado= numero*numero2;
            
            System.out.println(numero + " x"+ numero2 + " =" + resultado);
            
        }
    }
    
}
