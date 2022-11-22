/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padawanejercicio4;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class PadawanEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        
        System.out.println("Introduce un numero");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        int contador;
        
        for (contador=1; contador<=n; contador++ ) 
        {
            System.out.println("El numero es "+contador);    
        }
        
    }
    
}
