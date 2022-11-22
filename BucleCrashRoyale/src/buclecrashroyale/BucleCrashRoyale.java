/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclecrashroyale;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class BucleCrashRoyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // 
        
 int nivel_leñador;
        int nivel_torre;
        int daño_leñador = 0;
        int vida_torre = 0;
        int num_golpes= 0;
        // Variables usadas para la version 2
        int vida_leñador= 0;
        int daño_torre= 0;

       
        Scanner sc= new Scanner(System.in);
       

       
        System.out.println("¿Que nivel tiene el leñador? (Solo se acepta del 9 al 13)");
        nivel_leñador= sc.nextInt();
       
        System.out.println("¿Que nivel tiene la torre a la que quieres atacar?(solo se acepta nivel del 1 al 13)");
        nivel_torre= sc.nextInt();

        switch (nivel_leñador)
        {
            case 9 -> {
                daño_leñador= 200;
                vida_leñador= 1060;
                System.out.println("El daño del leñador es " + daño_leñador + ". Su vida es " + vida_leñador);
            }
               
            case 10 -> {
                daño_leñador= 220;
                vida_leñador= 1166;
                System.out.println("El daño del leñador es " + daño_leñador + ". Su vida es " + vida_leñador);
            }
               
            case 11 -> {
                daño_leñador= 242;
                vida_leñador= 1282;
                System.out.println("El daño del leñador es " + daño_leñador + ". Su vida es " + vida_leñador);
            }
               
            case 12 -> {
                daño_leñador = 266;
                vida_leñador= 1409;
                System.out.println("El daño del leñador es " + daño_leñador + ". Su vida es " + vida_leñador);
            }
               
            case 13 -> {
                daño_leñador = 292;
                vida_leñador = 1547;
                System.out.println("El daño del leñador es " + daño_leñador + ". Su vida es " + vida_leñador);
            }
        }
       
        switch (nivel_torre)
        {
            case 1 -> {
                vida_torre= 1400;
                daño_torre= 50;
                System.out.println("La vida de la torre es " + vida_torre);
            }
               
            case 2 -> {
                vida_torre = 1512;
                daño_torre = 54;
                System.out.println("La vida de la torre es " + vida_torre);
            }
               
            case 3 -> {
                vida_torre = 1624;
                daño_torre = 58;
                System.out.println("La vida de la torre es " + vida_torre);
            }
               
            case 4 -> {
                vida_torre = 1750;
                daño_torre = 62;
                System.out.println("La vida de la torre es " + vida_torre);
            }
               
            case 5 -> {
                vida_torre = 1890;
                daño_torre = 67;
                System.out.println("La vida de la torre es " + vida_torre);
            }
               
            case 6 -> {
                vida_torre = 2030;
                daño_torre = 72;
                System.out.println("La vida de la torre es " + vida_torre);
            }
               
            case 7 -> {
                vida_torre = 2184;
                daño_torre = 78;
                System.out.println("La vida de la torre es " + vida_torre);
            }
                       
            case 8 -> {
                vida_torre = 2352;
                daño_torre = 84;
                System.out.println("La vida de la torre es " + vida_torre);
            }
               
            case 9 -> {
                vida_torre = 2534;
                daño_torre = 90;
                System.out.println("La vida de la torre es " + vida_torre);
            }
               
            case 10 -> {
                vida_torre = 2786;
                daño_torre = 99;
                System.out.println("La vida de la torre es " + vida_torre);
            }
               
            case 11 -> {
                vida_torre = 3052;
                daño_torre = 109;
                System.out.println("La vida de la torre es " + vida_torre);
            }
               
            case 12 -> {
                vida_torre = 3346;
                daño_torre = 119;
                System.out.println("La vida de la torre es " + vida_torre);
            }
               
            case 13 -> {
                vida_torre = 3668;
                daño_torre = 131;
                System.out.println("La vida de la torre es " + vida_torre);
            }
        }
       
   
        System.out.println("¡Golpea a la torre!");
       
    do
     {
         
         vida_torre= vida_torre-daño_leñador;
         System.out.println("Leñador ataca con fuerza de valor " + daño_leñador + ". A la torre le queda de vida " + vida_torre);
         ++num_golpes;
         
         System.out.println("¡Cuidado! La torre contraataca");
         int doble_daño_torre= daño_torre*2;
         vida_leñador= vida_leñador-doble_daño_torre;
         System.out.println("La torre te ha atacado. Te queda " + vida_leñador + " de vida.");
         Thread.sleep(500);
         
         
     }  
     
     while (vida_torre>0 && vida_torre!=0 && vida_leñador>0 && vida_leñador!=0);

   
           if (vida_torre<0 || vida_torre==0)
           {
               System.out.println("¡Felicidades! Has derrotado a la torre con " + num_golpes + " golpes.");
           }
           
           else if (vida_leñador<0 || vida_leñador==0)
           {
               System.out.println("La torre te ha matado. Partida perdida.");
           }
    }
   

}