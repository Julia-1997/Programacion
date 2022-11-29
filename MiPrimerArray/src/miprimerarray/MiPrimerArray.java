/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miprimerarray;

/**
 *
 * @author jupr7227
 */
public class MiPrimerArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] notas;
        
        notas= new int [10];
        notas[0]=3;
        notas[1]=4;
        notas[2]=7;
        notas[5]=1;
   
        for (int i = 0; i < notas.length; i++) {
            
            System.out.println("Posicion "+ i + " contiene --> "+ notas[i]);
            
        }
    }
    
}
