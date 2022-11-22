/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadturron;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class RecursividadTurron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dia;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe el dia");
        dia= sc.nextInt();
        
        int trozos;
        
        trozos= CalculoTrozos(dia);
        
        System.out.println("En el dia "+ dia + " te comes "+ trozos + " trozos");
              
        
    }
    
    public static int CalculoTrozos (int dia)
    {
        int calorias=91;
        int trozos=0;
        
        //Caso base
            if(dia==1)
            {
                trozos=4;
                return 4*calorias;
            }
            
        //Caso recursivo
        
            else if (dia>1)
            {
                if (dia%3==0)
                {                 
                    return (1*calorias)+CalculoTrozos(dia-1);
                }
                
                else
                {
                    calorias=(4*calorias)+CalculoTrozos(dia-1); 
                    return calorias;
                }
            }
            
        return 0;
    }
    
}
