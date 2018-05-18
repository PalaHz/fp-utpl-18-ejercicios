package ejerciciosencasa;

import java.util.Scanner;

public class Ejercicio1_Factura {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int cantidad;
        double suma = 0;
        double prec_u;
        double iva;
        double prectotal;
        int edad = 0;
        boolean pregunta = true;
        
        System.out.print("Bienvenido al sistema de facturación\n");
        System.out.print("Ingrese el nombre del cliente\n");
        String nombre =entrada.nextLine();
        System.out.print("Ingrese el apellido del cliente\n");
        String apellido = entrada.nextLine();
        
        //Encabezado
        
        String cadenafinal = String.format("\t\t%s\n\n%s\n%s %s %s\n\n%s\t\t%s\t%s\t\t%s\n"
                ,"Factura","Supermercado \"Todo al menor precio\"","Nombre del Cliente:"
                ,nombre,apellido,"Artículo","Cantidad","Precio Unitario","Precio Total");
        
        //Inicio del ciclo repetitivo
        
        while (pregunta){
            
            System.out.println("Ingrese nombre del artículo:");
            String narticulo = entrada.nextLine();
            System.out.println("Ingrese cantidad de artículos:");
            cantidad = entrada.nextInt();
            System.out.println("Ingrese el precio unitario:");
            prec_u = entrada.nextDouble();
            
            prectotal = cantidad * prec_u;
            suma = prectotal + suma;
            
            entrada.nextLine();
            
            //Cadena final
            
            cadenafinal = String.format("%s%-12s\t\t%d\t\t%.2f\t\t\t%.2f\n",cadenafinal,narticulo,cantidad,prec_u,prectotal);
            System.out.println("¿Desea ingresar más artículos? (escriba no para salir)");
            
            //Pregunta de continuación
            
            String temporal = entrada.nextLine();
            temporal = temporal.toUpperCase();
            if (temporal.equals("NO")){
                pregunta = false;
            }     
        }
        iva = suma * 0.14;
        
        //Imprimir resultado
        
        cadenafinal = String.format("%s  \t\t\t\t\tSubtotal:\t\t%.2f\n"
                + "  \t\t\t\t\tIva:     \t\t%.2f\n  \t\t\t\t\tTotal:    \t\t%.2f\n",cadenafinal,suma,iva,suma*1.14);
        System.out.printf(cadenafinal);
        
    }
}