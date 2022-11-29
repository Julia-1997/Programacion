/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf2examen1ejercicio1;

import java.util.Scanner;

/**
 *
 * @author jupr7227
 */
public class UF2Examen1Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner sc= new Scanner(System.in);
        
        int id_usuario=0;
        int nacimiento_usuario=0;
        int contraseña=0;
        char conocimiento_contraseña;
        int contraseña_usuario=0;
        boolean credenciales;
        
        id_usuario= llegirNumero(id_usuario);
        nacimiento_usuario= llegirNaixement(nacimiento_usuario);

        System.out.println("¿Sabes cual es tu contraseña? Escribe S si la conoces o N si no la conoces");
        conocimiento_contraseña= sc.next().charAt(0);
        
        if (conocimiento_contraseña== 's' |conocimiento_contraseña== 'S') // El usuario si que conoce la contraseña
        {
            System.out.println("Escribe tu contraseña");
            contraseña_usuario= sc.nextInt();
            
             credenciales = verificarCredencials(id_usuario, nacimiento_usuario,contraseña, contraseña_usuario);
            
            if (credenciales=true)
            {
                System.out.println("0. Sortir");
                System.out.println("1. Mostrar perfil d’usuari");
                
                System.out.println("Escoge una opcion");
                int opcion = sc.nextInt();
                
                if (opcion==0)
                {
                    System.out.println("Fins aviat");
                }
                
                else if (opcion==1)
                {
                    contraseña= generarContrasenya (id_usuario,nacimiento_usuario);
                    mostrarPerfilUsuari (id_usuario, nacimiento_usuario, contraseña);
                }
                
                else if (credenciales=false)
                {
                    System.out.println("Opcion no correcta");
                }
                    
            }
            
            else 
            {
                
            }
        }
        
        else if (conocimiento_contraseña== 'n' |conocimiento_contraseña== 'N') //El usuario no conoce la constraseña 
        {
            contraseña= generarContrasenya (id_usuario,nacimiento_usuario);
            System.out.println("Tu contraseña de usuario es " + contraseña);
              
        }
        
        else
        {
            System.out.println("La respuesta que has introducido no es correcta (debe de ser S o N");
        }
        
    }
    
    // Metodo que pide al usuario un numero de identificación, recibe un entero, devuelve un entero
    
    public static int llegirNumero(int numero_id)
    {
        Scanner sc= new Scanner(System.in);
        
        do {
        System.out.println("Introduce tu numero de identificacion. Este numero debe de estar entre 1000 y 10000");
        numero_id= sc.nextInt();
        
        } while (numero_id<=1000 | numero_id>=10000);
        
        return numero_id;
    }
    
    
    // Metodo que pide al usuario su año de nacimiento, recibe un entero, devuelve un entero
    
    public static int llegirNaixement(int nacimiento)         
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Introduce tu año de nacimiento");
        nacimiento=sc.nextInt();
        
        return nacimiento;
    }
    // Metodo que genera una contraseña, recibe dos enteros, devuelve la contraseña
    
    public static int generarContrasenya(int numero_id, int nacimiento)
    {
        int contraseña= (numero_id*nacimiento)/10000;
        
        return contraseña;
    }
    
    
    // Metodo que verifica la contraseña, recibe 3 parametros enteros, devuelve un booleano
    
    public static boolean verificarCredencials(int numero_id, int nacimiento, int contraseña, int contraseña_usuario)
    {
        boolean valida_contraseña= true;
        
        if (contraseña_usuario==contraseña)
        {
            valida_contraseña= true;
        }

        else 
        {
            valida_contraseña= false;
        }
        
            return valida_contraseña;
            
    }
    
    // Metodo que muestra el perfil del usuario, recibe 2 parametros enteros, no devuelve nada.
    
    public static void mostrarPerfilUsuari(int numero_id, int nacimiento, int contraseña)
    {
        int edad= 2022-nacimiento;
        
        System.out.println(numero_id + " - " + edad + " - " + contraseña);
        System.out.println("*******************************");
    }
    
}
