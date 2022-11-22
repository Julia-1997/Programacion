/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2bucle;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Ejercicio2Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        
        Scanner sc=new Scanner(System.in);
        
        do
        {
        System.out.println("Introduce un numero");
        num=sc.nextInt();
        {
        System.out.println("Has escrito --> " + num);
        }
        }while(num!=0); //condición para que continue
        System.out.println("Has terminado");
    }
    
}
