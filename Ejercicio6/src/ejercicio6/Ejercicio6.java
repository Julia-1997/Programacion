/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int milla; //creo variable milla
        Scanner sc=new Scanner(System.in); 
        
        System.out.println("Introduce las millas");
        milla= sc.nextInt(); // digo que la variable tenga de valor lo que han escrito.
        final int milla_metros = 1852; //creo otra variable final que indica que esa variable no cambia nunca.
        int m= milla*milla_metros;
        
        System.out.println("Son "+ m);
        
        // TODO code application logic here
    }
    
}
