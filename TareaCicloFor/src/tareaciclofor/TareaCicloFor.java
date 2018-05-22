package tareaciclofor;
import java.util.Scanner;
public class TareaCicloFor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int estudiantes;
        int contador;
        int edad;
        int s_edad=0;
        int num_asig;
        int cont2;
        int nota1;
        int nota2;
        double prom;
        double sprom = 0;
        double sprom_global =0;
        
        System.out.print("Bienvenido al sistema de reporte de calificaciones de estudiante\n");
        System.out.print("Ingrese la cantidad de estudiantes: ");
        estudiantes = entrada.nextInt();
        String cadena = String.format("Reporte de calificaciones de estudiantes\n\n");
        entrada.nextLine();
        
        for(contador = 1;contador <= estudiantes;contador++){
            System.out.print("\n///////////////////////////////////////////////////////////////////\n\n");
            
            System.out.print("Ingrese el primer nombre del estudiante "+contador+": ");
            String nombre = entrada.nextLine();
            nombre = nombre.toUpperCase();
            System.out.print("Ingrese el segundo nombre del estudiante "+contador+": ");
            String nombre2 = entrada.nextLine();
            nombre2 = nombre2.toUpperCase();
            System.out.print("Ingrese el primer apellido del estudiante "+contador+": ");
            String apellido = entrada.nextLine();
            apellido = apellido.toUpperCase();
            System.out.print("Ingrese el segundo apellido del estudiante "+contador+": ");
            String apellido2 = entrada.nextLine();
            apellido2 = apellido2.toUpperCase();
            System.out.print("Ingrese la edad del estudiante "+nombre+" "+apellido+": ");
            edad = entrada.nextInt();
            System.out.print("Ingrese la cantidad de asignaturas del estudiante "+nombre+" "+apellido+": ");
            num_asig = entrada.nextInt();
            
            s_edad = s_edad + edad;
            cadena = String.format("%sNombre del estudiante %d: %s %s %s %s\nEdad: %d\nNumero de asignaturas: %d\n\n%-12s\t%s\t%s\t%s\n"
                ,cadena,contador,apellido,apellido2,nombre,nombre2,edad,num_asig,"Asignaturas","Bim-1","Bim-2","Promedio");
            
            for(cont2=1;cont2<=num_asig;cont2++){
                
                entrada.nextLine();
                
                System.out.print("Ingrese el nombre de la asignatura "+cont2+": ");
                String nom_asig = entrada.nextLine();
                System.out.print("Ingrese la nota del estudiante "+nombre+" "+apellido+" en el bimestre 1 :");
                nota1 = entrada.nextInt();
                System.out.print("Ingrese la nota del estudiante "+nombre+" "+apellido+" en el bimestre 2 :");
                nota2 = entrada.nextInt();
                
                prom = (nota1+nota2)/num_asig;
                sprom = sprom + prom;
                
                cadena=String.format("%s%-12s\t%d\t%d\t%.0f\n",cadena,nom_asig,nota1,nota2,prom);
                
            }
            prom = sprom/num_asig;
            cadena=String.format("%s\t\tPromedio:\t%.0f\n\n",cadena,prom);
            
            if (prom >= 19){
                cadena=String.format("%s%s %s %s %s tiene un promedio de Sobresaliente\n\n",cadena,apellido,apellido2,nombre,nombre2);
            }else{
                if (prom >= 16 && prom < 19){
                    cadena=String.format("%s%s %s %s %s tiene un promedio de Muy bueno\n\n",cadena,apellido,apellido2,nombre,nombre2);
                }else{
                    if (prom >= 13 && prom < 16){
                        cadena=String.format("%s%s %s %s %s tiene un promedio de Bueno\n\n",cadena,apellido,apellido2,nombre,nombre2);
                    }else{
                        cadena=String.format("%s%s %s %s %s tiene un promedio de Regular\n\n",cadena,apellido,apellido2,nombre,nombre2);
                    }
                }
            }
            sprom_global = sprom_global + prom;
            entrada.nextLine();
        }
        double prom_edad = s_edad / estudiantes;
        double prom_global= sprom_global/estudiantes;
        System.out.print("\n///////////////////////////////////////////////////////////////////\n\n");
        cadena = String.format("%sInformación globarl de los estudiantes:\nPromedio de edad es: %.2f\nProemdio de Notas de los estudiantes es: %.2f\n"
                ,cadena,prom_edad,prom_global);
        System.out.print(cadena);
    }
}
