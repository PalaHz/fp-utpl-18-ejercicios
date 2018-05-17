package ejerciciosencasa;

import java.util.Scanner;

public class Ejercicio2_Reporte {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int lim;
        int contador = 1;
        int costo;
        
        //Auxiliares para contar los orígenes
        
        int aux1 = 0;
        int aux2 = 0;
        int aux3 = 0;
        int aux4 = 0;
        
        
        double impuesto;
        double precvent;
        double sumaimp = 0;
        double suma = 0;
        
        System.out.print("Bienvenido al sistema de reporte de autos\n");
        System.out.print("Ingrese cantidad de autos que desea ingresar:\n");
        lim = entrada.nextInt();
        entrada.nextLine();
        
        //Creación del encabezado
        
        String cadenafinal = String.format("\t\t\t%s\n\n%-10s\t%-10s\t%-10s\t%-10s\t%s\n"
                ,"Reporte de Autos Importados","Marca","Origen","Costo","Impuesto","Precio venta");
        
        //Inicio del ciclo
        
        while (contador <= lim){
            System.out.println("Ingrese marca del automovil "+contador+":");
            String marca = entrada.nextLine();
            System.out.println("Ingrese origen del automovil "+contador+":");
            String origen = entrada.nextLine();
            System.out.println("Ingrese costo del automovil "+contador+":");
            costo = entrada.nextInt();
            entrada.nextLine();
            
        //Condicionales if para los orígenes
            
            if (origen.equals("Argentina")){
                impuesto = 0.20 * costo;
                aux1 = aux1 + 1; 
            }else{
                if (origen.equals("Colombia")){
                    impuesto = 0.25 * costo;
                    aux2 = aux2 + 1; 
                }else{
                    if (origen.equals("Chile")){
                        impuesto = 0.30 * costo;
                        aux3 = aux3 + 1; 
                    }else{
                        impuesto = 0.40 * costo;
                        aux4 = aux4 + 1; 
                    }
                }
            }
            
            //Cálculo de valores finales
            
            sumaimp = sumaimp + impuesto;
            precvent = impuesto + costo;
            suma = suma + precvent;
            
            //Suma de la cadena
            
            cadenafinal = String.format("%s%-12s\t%-12s\t%d\t\t%.0f\t\t%.0f\n"
                    ,cadenafinal,marca,origen,costo,impuesto,precvent);
            contador = contador + 1;
        }
        contador = contador -1;
        
        //Imprimir el resultado
        
        cadenafinal = String.format("%s\n%-12s\t%d\tTot. Imps  %.0f\t%s\t%.0f\n\n%-12s\t%d\n%-12s\t%d\n%-12s\t%d\n%-12s\t%d\n"
                ,cadenafinal,"Total Autos",contador,sumaimp,"Tot. PV",suma,"Argentina",aux1,"Chile",aux3,"Colombia",aux2,"Otros Paises",aux4);
        System.out.printf(cadenafinal);
        
    }
}