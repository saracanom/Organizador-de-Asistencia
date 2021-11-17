
package organizadorasistencia;

import java.util.Scanner;
import java.lang.String;
public class Captura extends OrganizadorInterfaz{
    public static int aforo;
    public static int size;
    public static int numeroListas;
    public static String hora;
    public static String dia;
    public static int aula;
    public static String materia;
    public static int bloque;
    public static String[] estudiantes;
    public static void ingresoDatos(String m, String d, String h, int b, int a, int af, int nE, int nL){
        
        Captura.materia = m;
        Captura.dia = d;
        Captura.hora = h;
        Captura.bloque = b;
        Captura.aula = a;
        Captura.aforo = af;
        Captura.size = nE;
        for(int i = 0; Alerta.arrojarAlertas().equalsIgnoreCase("El número de estudiantes no puede ser menor que 5");i++){
            System.out.println(Alerta.arrojarAlertas());
            System.out.println("Ingrese el número de estudiantes: ");
            Captura.size = nE;
        }
 
        estudiantes = new String[Captura.size];
        Captura.numeroListas = nL;
    }
    
    public static void ingresoEstudiantes(String nombres) {
            
        
    }
 
}
