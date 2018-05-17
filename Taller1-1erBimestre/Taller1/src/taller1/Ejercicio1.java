package taller1;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int hijos;
        double dinero;
        double pasajes;
        double bar;
        double salidas;
        double pasajes_sum = 0;
        double bar_sum = 0;
        double salidas_sum = 0;
        
        //Ingreso de datos
        
        System.out.print("Bienvenido al sistema de gastos familiares\n"
                + "Ingrese las ganancias semanales del padre de familia:\n");
        dinero = entrada.nextDouble();
        System.out.print("Ingrese la catidad de hijos que tiene:\n");
        hijos = entrada.nextInt();
        String cadenafinal = String.format("\n%s\n\n%-12s\t%-12s\t%-12s\t%-12s\n"
                ,"Gastos Familia","Persona","Pasajes","Bar","Salida");
        
        //Entrada al ciclo repetitivo for
        
        for (int i = 1;i <= hijos;i++){
            
            System.out.println("Ingrese el dinero por pasajes semanal del hijo "+i);
            pasajes = entrada.nextDouble();
            System.out.println("Ingrese el dinero por bares semanal del hijo "+i);
            bar = entrada.nextDouble();
            System.out.println("Ingrese el dinero por salidas semanal del hijo "+i);
            salidas = entrada.nextDouble();
            
            pasajes_sum = pasajes_sum + pasajes;
            bar_sum= bar + bar_sum;
            salidas_sum = salidas_sum + salidas;
            
            cadenafinal = String.format("%s%s %d\t\t%.2f\t\t%.2f\t\t%.2f\n",cadenafinal,"Hijo",i,pasajes,bar,salidas);
        }
        double sum_total = pasajes_sum + bar_sum + salidas_sum;
        cadenafinal = String.format("%s\n%-12s\t%s\t%-12s\t%s\n\t\t%.2f\t\t%.2f\t\t%.2f\n\n"
                ,cadenafinal,"Totales","Tot.Pasajes","Tot.Bar","Tot.Salidas",pasajes_sum,bar_sum,salidas_sum);
       System.out.print(cadenafinal);
       if (dinero < sum_total){
           double dinerof = sum_total - dinero;
           System.out.printf("Al padre de familia le faltan %.2f dolares",dinerof);
       }else{
           if (dinero > sum_total){
                double dinerof = dinero - sum_total;
                System.out.printf("Al padre de familia le sobran %.2f dolares",dinerof);
           }
       }
       System.out.println();
    }
}
