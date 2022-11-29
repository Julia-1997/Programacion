/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package correccioneric1;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class CorreccionEric1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Instancia obeto Scanner
        Scanner in = new Scanner(System.in);

        //Crear variables
        int numId, year, pass, id, sabePass, opcionMenu;
        boolean flag = false, validate, menu = false;

        //Inicio programa
        while (flag == false) {

            id = llegirNumero();
            System.out.println("Cual es tu año de nacimiento");
            year = in.nextInt();

            System.out.println("¿Conoces tu password? pulsa [1] si la sabes y [2] si no la sabes?");
            sabePass = in.nextInt();

            if (sabePass == 1) {
                System.out.println("Introduce tu password");
                pass = in.nextInt();

                validate = verificarCredencials(id, year, pass);

                if (validate) {
                    while (menu == false) {
                        opcionMenu = Menu();
                        if (opcionMenu == 0) {
                            flag = true;
                            menu = true;
                        } else if (opcionMenu == 1) {
                            mostrarPerfilUsuari(id, year);
                        }
                    }
                } else {
                    System.out.println("Password incorrecta");
                    flag = true;
                }

            } else if (sabePass == 2) {
                System.out.println(generarContrasenya(id, year));
                flag = true;
            } else {
                System.out.println("Dato incorrecto");
            }

        }

    }

    //Funciones
    
    //Muestra menu usuario
    public static int Menu() {
        Scanner in = new Scanner(System.in);

        int opcion;
        System.out.println("******Menu******");
        System.out.println("0.Salir \n"
                + "1.Mostrar perfil de usuario");
        System.out.println("*****************");
        opcion = in.nextInt();

        return opcion;
    }

    //Funcion leer un numero de identificacion entre 1000 y 10000 retorna un valor entero valido
    public static int llegirNumero() {
        boolean flag = false;
        int num = 0;
        Scanner in = new Scanner(System.in);

        while (flag == false) {
            System.out.println("Introduce tu numero de identificacion entre 1000 y 10000");
            num = in.nextInt();

            if (num > 1000 && num < 10000) {
                flag = true;
            }
        }

        return num;
    }

    //Generar contraseña recibe 2 valores enteros y calcula para devolver la contraseña
    public static int generarContrasenya(int numId, int year) {
        int result = (numId * year) % 10000;
        return result;
    }

    //Verificar credenciales recibe 3 valores enteros para procesar los datos y devolver verdadero o falso 
    public static boolean verificarCredencials(int numId, int year, int pass) {
        boolean validate;
        int password = generarContrasenya(numId, year);

        if (password == pass) {
            validate = true;
        } else {
            validate = false;
        }

        return validate;
    }

    //Muestra el perfil de usuario
    public static void mostrarPerfilUsuari(int numId, int year) {
        System.out.println("******Perfil de usuario******");
        System.out.println("Numero de usuario: " + numId);
        System.out.println("Edad: " + (2022 - year));
        System.out.println("Password: " + generarContrasenya(numId, year));
        System.out.println("************************");
    }
}