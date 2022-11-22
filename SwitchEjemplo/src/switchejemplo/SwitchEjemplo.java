/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchejemplo;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class SwitchEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);

        
        System.out.println("Bienvenido al FIFA 2022");
        System.out.println("a. Jugar partido rapido");
        System.out.println("b. Multijugador");
        System.out.println("c. Carrera");
        System.out.println("d. Ultimate");
        System.out.println("e. Salir");
        
        System.out.println("Escoge opcion");
        char opcion= sc.nextLine().charAt(0);//opcion caracter
        
        switch (opcion) {
            case 'a' -> System.out.println("Vamos a jugar un partido rapido");
                
            case 'b' -> System.out.println("Opcion multijugador");
                
            case 'c' -> System.out.println("Carrera");
                
            case 'd' -> System.out.println("Ultimate");
            
            case 'e' -> System.out.println("Salir");
                
            default -> System.out.println("Opcion no valida");
        }
        }
        // TODO code application logic here
    }
    

