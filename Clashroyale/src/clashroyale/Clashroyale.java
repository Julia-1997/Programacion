/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyale;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class Clashroyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int copa;
             
        System.out.println("Quantes copes tens?:");
         
        Scanner sc= new Scanner(System.in);
        copa = sc.nextInt();
        char carta = 0;
        sc.nextLine(); //Limpiar buffer
        if (copa<2000)
        {
            System.out.println("Tria una d'aquestes 2 cartes:");
            System.out.println("m. Mago Electrico");
            System.out.println("e. Esbirro Mega");
                   
          carta= sc.nextLine().charAt(0);
            
            switch (carta) {
                case 'm' -> System.out.println("Has escollit la carta Mago Electrico");
                case 'e' -> System.out.println("Has escollit la carta Esbirro Mega");
                default -> System.out.println("L'opcio que has introduït no correspon a cap carta.");
            }
           
           
        }
       
        else if (copa>=2000)
        {
            System.out.println("Tria una d'aquestes 2 cartes:");
            System.out.println("c.Cavallero");
            System.out.println("b.Bandida");  
           
          
        
           
            switch (carta) {
                case 'c' -> System.out.println("Has escollit la carta Cavallero");
                case 'b' -> System.out.println("Has escollit la carta Bandida");
                default -> System.out.println("L'opcio que has introduït no correspon a cap carta.");
            }
        }
       
   
   
}  
}
        // TODO code application logic here
    
    

