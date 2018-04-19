/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
    Crear un programa que permita ingresar una calificacion por teclado
    Si la calificacion ingresada es mayor o igual a 5 Y la calificacion es menor 
    a 10, se debe presentar un mensaje que diga "Usted está en supletorios"
    De lo contrario se presenta un mensaje con el valor de la calificacion 
    dividido para 2
*/
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class EjemploSeleccion {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
           double calificacion;
           System.out.println("INGRESE SU CALIFICACION");
           calificacion = entrada.nextDouble();
           
           if(calificacion >= 5 & calificacion < 10){
               System.out.println("Usted esta en supletorio");
           }else{
               System.out.println("C MAMO");
               System.out.printf("%.1000f\n", calificacion / 113 );
           }
        }
}
    
