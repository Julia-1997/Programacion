/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadvirus;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class RecursividadVirus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dia;
        int virus;
        Scanner sc= new Scanner(System.in);
        System.out.println("Pon un dia");
        dia= sc.nextInt();
        
        virus= CantidadVirus(dia);
        System.out.println("En el dia "+ dia + " hay "+ virus + " virus.");
    }
    
    
    public static int CantidadVirus (int dia)
    {
        int virus=1;
            if(dia==1) //Caso base
            {
                virus=1;
            }
            
            else //Caso recursivo
            {
                virus= 3*CantidadVirus(dia-1);
            }
        
        return virus;
    }
    
}
