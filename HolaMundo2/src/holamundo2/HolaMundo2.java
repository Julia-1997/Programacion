/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo2;

/**
 *
 * @author jupr7227
 */
public class HolaMundo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int idioma=1;
        int julia=2;
        int calculo=doble (julia);
        System.out.println(calculo);
    }
    
    
    public static int doble(int a) 
    {
        int resultado = a*2;
        return resultado;
    }
    
    
    
    
}
