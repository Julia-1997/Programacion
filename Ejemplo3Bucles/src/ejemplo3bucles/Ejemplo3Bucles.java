/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo3bucles;

/**
 *
 * @author jupr7227
 */
public class Ejemplo3Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma_acum=0;
        int contador=1;
        
        while(contador<=5)
        {
            suma_acum= suma_acum + contador;
            contador=contador+1;
        }
        
        System.out.println("La suma acumulada es " + suma_acum);
    }
    
}
