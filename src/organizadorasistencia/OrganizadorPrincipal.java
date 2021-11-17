/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizadorasistencia;

/**
 *
 * @author EQUIPO
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
public class OrganizadorPrincipal {
    public static void main(String[] args) {
        /* MODULO CAPTURA */
        Scanner scan = new Scanner(System.in);
        //Captura.ingresoDatos();
        //Captura.ingresoEstudiantes();
         /* MODULO PROCESAMIENTO */
        Procesamiento.asignarAsistencia();
        /* MODULO VISUALIZACION */
        System.out.println("");
        Visualizacion.imprimirAsistencia(Procesamiento.listasAsistencia);
         /* MODULO PERSISTENCIA */
         Persistencia.guardarListas();
        
    }
}