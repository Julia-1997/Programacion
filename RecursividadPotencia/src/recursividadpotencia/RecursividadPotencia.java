/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadpotencia;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class RecursividadPotencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;
        int potencia;
        
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Escribe el numero base");
        numero= sc.nextInt();
        
        System.out.println("Escribe la potencia");
        potencia= sc.nextInt();
        
        int resultado;
        
        resultado= Potencia (numero,potencia);
        
        System.out.println("El resultado es " + resultado);
                
               
        
    }
    
    public static int Potencia (int numero, int potencia)
    {
        int resultado=0;

        //Caso base
        if (potencia==0)
        {
            resultado=1;
        }
        
        else if(potencia>0)
        {
            resultado= numero*Potencia(numero, potencia-1);
        }
        
        return resultado;
    }
    
}
