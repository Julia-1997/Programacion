/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc= new Scanner(System.in);
        
        int numero_id;
        
        do {
        System.out.println("Introduce tu numero de identificacion");
        numero_id= sc.nextInt();
        
        } while (numero_id<=1000 | numero_id>=10000);
        
    }
    
}
