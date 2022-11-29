/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package correccioneric2;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class CorreccionEric2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 //Instancia objeto Scanner
        Scanner in = new Scanner(System.in);
        
        //Crear variables
        int numFilas = 0,bombillas;
        
        //Preguntar al usuario por las filas
        System.out.println("cuantas filas tiene tu arbol");
        numFilas = in.nextInt();
        
        bombillas = Filas(numFilas);
        System.out.println("El numero de bombillas que te hacen falta son " + bombillas);
    }
    
    //Fucion recursiva
    
    public static int Filas(int numFilas){
        int bombillas = 0;
        
        if(numFilas == 0){
            return 0;
        }else if(numFilas == 1 ){
            return 1;
        }else if(numFilas < 0){
            return -1;
        }else{
            bombillas = Filas(numFilas - 1) + Filas(numFilas - 2);
            return bombillas;
        }
    }
}