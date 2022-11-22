/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuejercicio2;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class MenuEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          int opcion;
       
       
        Scanner sc= new Scanner(System.in);
       
        System.out.println("******MENU******");
        System.out.println("0- Salir");
        System.out.println("1- Escribir 10 veces");
        System.out.println("2- Cuenta atras timbre");
        System.out.println("3- Numeros pares entre 2 valores");
        System.out.println("");
        System.out.println("Escoge la opcion que quieras:");
       
        opcion= sc.nextInt();
       
        switch (opcion) {
           
            case 0:
               
                break;
               
            case 1:
               
                for (int numero_linea = 1; numero_linea <= 10; numero_linea++)
               
                {
                    System.out.println(numero_linea + " A clase se viene a trabajar.");
                   
                }
                break;
               
            case 2:
               
                for (int cuenta_atras =10; cuenta_atras >=0; cuenta_atras--)
                {
                    System.out.print(cuenta_atras + " ");
                   
                }
               
                     System.out.print(" RIIIIINGGGG!!!!!");

                break;
               
            case 3:
               
                System.out.println("Introduce un numero");
                int numero1= sc.nextInt();
               
                System.out.println("Introduce otro numero (no puede ser el mismo numero)");
                int numero2= sc.nextInt();
               
                    if (numero1>numero2) //si el numero1 es mayor que numero2
                    {
                        final int NUMERO_MAXIMO= numero1;
                        final int NUMERO_MINIMO= numero2;
                        int numero;

                        for ( numero = NUMERO_MINIMO; numero < NUMERO_MAXIMO ; numero++)

                        {
                            if (numero %2==0)

                            {
                                System.out.print(numero + " ");
                            }


                        }

                    }
               
                        else if (numero1<numero2) // Si el numero1 es menor que numero2.
                        {
                            final int NUMERO_MAXIMO= numero2;
                            final int NUMERO_MINIMO= numero1;
                            int numero;

                            for ( numero = NUMERO_MINIMO; numero < NUMERO_MAXIMO ; numero++)

                            {
                                if (numero %2==0)

                                {
                                    System.out.print(numero + " ");
                                }


                            }


                        }
               
                else
                {
                    System.out.println("Los numeros tienen que ser diferentes para que el programa funcione.");
                }
                break;
               
            default:
               
                System.out.println("Opcion No Valida");
        }
           
       
       
    }
   
}
   
