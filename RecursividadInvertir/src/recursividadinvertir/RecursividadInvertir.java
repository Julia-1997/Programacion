/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadinvertir;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class RecursividadInvertir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;
        Scanner sc= new Scanner(System.in);
        System.out.println("Pon un numero");
        numero= sc.nextInt();
        
        InvertirNumero(numero);
    }
    
    public static void InvertirNumero (int numero)
    {
        if (numero<10 & numero>0)
        {
            System.out.print(numero);
        }
        
        else
        {
            System.out.print(numero%10);
            InvertirNumero(numero/10);
        }
    }
    
}
