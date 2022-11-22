/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package espaciocasa;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class EspacioCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double anchura_estancia = 0;
        double longitud_estancia = 0;
        boolean numero_estancias = true;
        char respuesta_usuario;
        double espacio_estancia;
        double espacio_total= 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce la anchura de la estancia");
            anchura_estancia = sc.nextDouble();

            System.out.println("Introduce la longitud de la estancia");
            longitud_estancia = sc.nextDouble();

            System.out.println("¿Hay mas estancias en tu casa? (Responde con una s si hay mas y con una n si ya no quedan mas estancias)");
            respuesta_usuario = sc.next().charAt(0);

            if (respuesta_usuario == 'n') //Si el usuario pone n, significa que no hay mas estancias
            {
                numero_estancias = false; // Si no hay mas, me voy del bucle y la condición para salir es que el numero_estancias este en false
                System.out.println("NO HAY MAS ESTANCIAS, se acabaron las preguntas");
            } else {
                numero_estancias = true; //quiere decir que hay mas estancias, por lo tanto tengo que seguir en el bucle.
                System.out.println("Vuelvo a preguntar todo, porque HAY MAS ESTANCIAS");
                espacio_estancia = anchura_estancia * longitud_estancia;
                System.out.println(espacio_estancia + " que es -- el ancho " + anchura_estancia + "* la longitud " + longitud_estancia);

            }

        } while (numero_estancias != false);

        espacio_estancia = anchura_estancia * longitud_estancia;

        espacio_total = espacio_total + espacio_estancia; // como indico que quiero sumarlo tantas veces como los espacio_estancia que tengo?

        System.out.println("El espacio total de tu casa es de " + espacio_total);

    }

}
