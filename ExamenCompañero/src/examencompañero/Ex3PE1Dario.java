/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examencompañero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dagr5755
 */
public class Ex3PE1Dario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        Random rd = new Random();
        int aleatori = 0;
        //rd.nextInt(la cantidad de numeros diferentes a dar) + (valordelmaspeque�o)
        System.out.println("1 numero aleatori");
        for (int i = 0; i < 1; i++) {
            aleatori = rd.nextInt(9);
        }
        int calculo;
        boolean resultado = true;
        for (int tabla = 0; tabla <= 10; tabla++) {
            if (resultado = true) {
                System.out.println("Tabla de multiplicar del " + aleatori);
                System.out.println(+aleatori + " * " + tabla + " = ");
                System.out.println("Dame resultado: ");
                resultado = Teclado.hasNextInt();
                calculo = aleatori * tabla;
                System.out.println(aleatori + "x" + tabla + "=" + calculo);
                System.out.println("Es correcto");
            } else {
                System.out.println("es incorrecto");
            }
            
        }
    }
}
