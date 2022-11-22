/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf2ejercicio6;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class UF2Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double precio;
        double precio_con_IVA;
        int contador=0;
        Scanner sc= new Scanner(System.in);
        
        do
        {
            System.out.println("Por un precio");
            precio= sc.nextDouble();
            ++contador;
            
            precio_con_IVA= precioConIVA(precio);
            System.out.println("El precio con IVA es "+ precio_con_IVA);
            
        } while (contador<5);
    }
    
    // funcion para aplicar el 21% de IVA a los precios
    public static double precioConIVA (double precio)
    {
        double precio_con_IVA = precio + (precio*0.21);
        
        return precio_con_IVA;
    }
}
