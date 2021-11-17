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
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
public class Persistencia {
    public static void guardarListas(){
        File myObj = new File("listasAsistencia.txt");
      PrintWriter pw = null;
    try {
        
        pw = new PrintWriter(myObj);
        pw.println("Materia: "+Captura.materia);
        pw.println("Dia:" + Captura.dia);
        pw.println("Hora:" + Captura.hora);
        pw.println("Salon: "+ Captura.bloque+ "-"+Captura.aula);
        pw.println("Aforo permitido "+ Captura.aforo);
        pw.println(" ");
        pw.println("______________");
        pw.println(" ");
        for (int y = 0; y < Procesamiento.listasAsistencia.length; y++) {
            pw.println("Lista de aistencia " + (y + 1)+";");
            pw.println(" ");
            for (int k = 0; k < Procesamiento.listasAsistencia[0].length; k++) {
                if (Procesamiento.listasAsistencia[y][k] != null) {
                    
                    pw.println(Captura.estudiantes[k]+ " asiste presencial");
                                }
            }
            pw.println(" ");
        }
        System.out.println(Alerta.mensaje("Archivo creado correctamente"));
      
    } catch (IOException e) {
      System.out.println(Alerta.mensaje("Ocurrió un error."));
      e.printStackTrace();
    } finally {
        if(pw != null){
            pw.close();
        }
    }
    
        
    }
    }

