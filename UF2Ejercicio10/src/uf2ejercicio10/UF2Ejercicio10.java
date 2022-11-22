/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf2ejercicio10;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class UF2Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        int mes;
        int año;
        boolean fecha;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el dia");
        dia= sc.nextInt();
        
        System.out.println("Introduce el mes");
        mes= sc.nextInt();
        
        System.out.println("Introduce el año");
        año= sc.nextInt();
        
        fecha= FechaCorrecta(dia,mes,año);
        
        if (fecha==false)
        {
            System.out.println("La fecha que has introducido no es correcta");
        }
        
        else 
        {
            System.out.println("La fecha es correcta");
        }
       
        
    }
    
    public static boolean FechaCorrecta(int dia, int mes, int año)
    {
        boolean fecha= false;
        boolean d= false;
        boolean m= false;
        boolean a= false;      
       
        if (dia<1 || dia>30)
        {
            d= false;
        }
        
        if (mes<1 || mes>12)
        {
            m= false;
        }
        
        if (año<1900)
        {
            a= false;
        }
        
        if (d==false && m==false && a==false)
        {
            fecha=false;
        }
        
        else
        {
            fecha=true;
        }

        
        return fecha;
    }
    
}
