/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadconejos;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class RecursividadConejos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int mes;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Que mes es?");
        mes= sc.nextInt();
        
        int conejos;
        
        conejos= Conejos (mes);
        
        System.out.println("En el mes " + mes + " hay " + conejos + " parejas de conejos");
    }
    
    public static int Conejos (int mes)
    {
        //caso base
        
        int conejo=1;
        
        if (mes==0 ||mes==1)
        {
            conejo=1;
        }
        
        else if (mes>1)
        {
            conejo = Conejos (mes-1) + Conejos (mes-2);
        }
        
        return conejo;
    }
    
    
}
