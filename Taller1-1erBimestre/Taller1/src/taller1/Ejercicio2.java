package taller1;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int hijos;
        int padres;
        double dinero = 0;
        double pasajes;
        double bar;
        double salidas;
        double pasajes_sum = 0;
        double bar_sum = 0;
        double salidas_sum = 0;
        
        //Ingreso de datos
        
        System.out.print("Bienvenido al sistema de gastos familiares\n"
                + "Ingrese la cantidad de padres de familia:\n");
        padres = entrada.nextInt();
        
        String cadenafinal = String.format("\n%s\n","Reporte de Gastos de Padres de Familia");
        entrada.nextLine();
        //Entrada al ciclo repetitivo for
        for (int aux1 = 1; aux1 <= padres; aux1++){
            System.out.print("Ingrese el primer nombre del padre de familia "+aux1+":\n");
            String nombre1 = entrada.nextLine();
            nombre1=nombre1.toUpperCase();
            
            System.out.print("Ingrese el segundo nombre del padre de familia "+aux1+":\n");
            String nombre2 = entrada.nextLine();
            nombre2=nombre2.toUpperCase();
            
            System.out.print("Ingrese el primer apellido del padre de familia "+aux1+":\n");
            String apellido1 = entrada.nextLine();
            apellido1=apellido1.toUpperCase();
            
            System.out.print("Ingrese el segundo apellido del padre de familia "+aux1+":\n");
            String apellido2 = entrada.nextLine();
            apellido2=apellido2.toUpperCase();
            
            System.out.print("Ingrese el sueldo semanal del padre "+aux1+": \n");
            dinero = entrada.nextDouble();
            
            System.out.print("Ingrese la catidad de hijos que tiene:\n");
                hijos = entrada.nextInt();
                
            cadenafinal = String.format("%s\n%s %s %s\n%s $%.2f\n%s %d\n\n%s\n%-12s\t%-12s\t%-12s\t%-12s\n"
                    ,cadenafinal,"Nombre del padre de familia:",nombre1,apellido1,"Sueldo semanal:",dinero,"Numero de hijos:"
                    ,hijos,"Reporte de gastos","Persona","Pasajes","Bar","Salida");
            
            for (int aux2 = 1;aux2 <= hijos;aux2++){
                
                System.out.println("Ingrese el dinero por pasajes semanal del hijo "+aux2+" de "+nombre1+" "+apellido1);
                pasajes = entrada.nextDouble();
                System.out.println("Ingrese el dinero por bares semanal del hijo "+aux2+" de "+nombre1+" "+apellido1);
                bar = entrada.nextDouble();
                System.out.println("Ingrese el dinero por salidas semanal del hijo "+aux2+" de "+nombre1+" "+apellido1);
                salidas = entrada.nextDouble();
                
                pasajes_sum = pasajes_sum + pasajes;
                bar_sum= bar + bar_sum;
                salidas_sum = salidas_sum + salidas;
            
                cadenafinal = String.format("%s%s %d\t\t%.2f\t\t%.2f\t\t%.2f\n",cadenafinal,"Hijo",aux2,pasajes,bar,salidas);
            }
            double sum_total = pasajes_sum + bar_sum + salidas_sum;
            cadenafinal = String.format("%s%s\t%.2f\t\t%.2f\t\t%.2f\n\n"
                ,cadenafinal,"Totales",pasajes_sum,bar_sum,salidas_sum);
            if (dinero < sum_total){
                double dinerof = sum_total - dinero;
                cadenafinal = String.format("%s El padre de familia %s %s %s %s  le faltan %.2f dolares\n\n"
                        ,cadenafinal,nombre1,nombre2,apellido1,apellido2,dinerof);
            }else{
                if (dinero > sum_total){
                    double dinerof = dinero - sum_total;
                    cadenafinal = String.format("%s El padre de familia %s %s %s %s  le sobran %.2f dolares\n\n"
                            ,cadenafinal,nombre1,nombre2,apellido1,apellido2,dinerof);
                }    
            }
            pasajes_sum = 0;
            bar_sum =0;
            salidas_sum = 0;
            
            entrada.nextLine();
        }
       System.out.print(cadenafinal);
       System.out.println();
    }
}
