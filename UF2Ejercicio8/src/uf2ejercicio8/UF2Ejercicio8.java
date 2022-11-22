/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf2ejercicio8;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class UF2Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;
        int suma; //esta variable es de la funcion suma1aN
        int producto; //esta variable es de la funcion producto1aN
        double mitad;
        Scanner sc= new Scanner(System.in);
       
        System.out.println("Introduce un numero");
        numero= sc.nextInt();
       
        suma= suma1aN(numero);
        System.out.println("La suma de todos los numero es "+suma);
       
        producto= producto1aN(numero);
        System.out.println("La multiplicacion de todos los numeros da "+producto);
        
        mitad= intermedio1aN(numero);
        System.out.println("La mitad es "+numero);
        
    }
   
    // Funcion que realiza la suma del 1 al numero del usuario.
    public static int suma1aN(int n)
    {
        int contador_numero=0;
        int acumulador_suma=0;
       
        while (contador_numero<n)
        {
            ++contador_numero;
            acumulador_suma= acumulador_suma+contador_numero;
        }
       
        return acumulador_suma;
    }
   
    //Funcion que realiza la multiplicacion del 1 al numero del usuario.
    public static int producto1aN(int n)
    {
        int contador_numeros=0;
        int acumulador_producto=1;
       
        while (contador_numeros<n)
        {
            ++contador_numeros;
            acumulador_producto= acumulador_producto*contador_numeros;
        }
       
        return acumulador_producto;
    }
    
    public static double intermedio1aN (int n)
    {
        double mitad= (double)(1+n)/2;
        return mitad;
    }
    
    }
    

