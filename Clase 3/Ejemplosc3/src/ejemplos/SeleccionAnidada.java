/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class SeleccionAnidada {

    public static void main(String[] args) {
        // documentacion
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese nombre del estudiante");
        String nombre = entrada.nextLine();
        nombre = nombre.toUpperCase();
        
        System.out.println("Ingrese apellido del estudiante");
        String apellido = entrada.nextLine();
        apellido = apellido.toUpperCase();
        
        System.out.println("Ingrese calificacion");
        int calificacion = entrada.nextInt();
        
        if (calificacion >= 50) {
            System.out.printf("ESTUIANTE %s %s \nAprobado\ncon calificacion\n%d\n", nombre,apellido, calificacion);
        } else {
            if (calificacion < 50) {
                System.out.printf("ESTUIANTE %s %s \nReprobado\ncon calificacion\n%d\n", nombre,apellido, calificacion);
            } 
        }
    }
}
