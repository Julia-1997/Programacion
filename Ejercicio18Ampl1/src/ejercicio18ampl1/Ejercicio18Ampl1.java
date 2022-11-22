/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18ampl1;

/**
 *
 * @author jupr7227
 */
public class Ejercicio18Ampl1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int horas,h_extra;
        double precio_horas;
        double salario_neto, salario_hnormales, salario_extra;
        final int HORAS_NORMALES = 35;
        double salario_impuestos;
        double impuestos;
        final salario_sin_impuestos= 500;
        double salario_final;
                
        Scanner sc = new Scanner(System.in); //recoger datos teclado
        System.out.print("Posa les hores treballades? ");
        horas = sc.nextInt();
        System.out.print("Posa el preu que et paguen cada hora? ");
        precio_horas = sc.nextDouble();
        
        if (horas > HORAS_NORMALES)
        { //calclare horas y horas extra
            salario_hnormales = HORAS_NORMALES*precio_horas;
            h_extra = horas - HORAS_NORMALES;
            salario_extra = precio_horas*h_extra*1.5;
            salario_neto = salario_hnormales+salario_extra;
        }
        else
        { //no hay horas extra
            salario_neto = horas * precio_horas;
        }
        
            if (salario_neto>500) //calculo los impuestos
            {
                salario_impuestos= salario_neto-500;
                impuestos= salario_impuestos*0.25;
                salario_final= salario_impuestos-impuestos;
                
            }
                

            else 
            {
                salario_final= salario_neto;
            }
       
        System.out.println("Et pagaran " + salario_final + " Euros");
    }
        // TODO code application logic here
    }
    

