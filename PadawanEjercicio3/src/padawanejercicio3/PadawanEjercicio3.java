/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padawanejercicio3;

/**
 *
 * @author jupr7227
 */
public class PadawanEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador;
        
        for (contador = 2; contador < 200; contador++) {
            
            if (contador%2==0) //residuo de la división solo sale si es un numero par, si el residuo ==1 es impar.
                    {
                        System.out.println("Muestro solo el numero par " + contador);
                    }
                        
        }
    }
    
}
