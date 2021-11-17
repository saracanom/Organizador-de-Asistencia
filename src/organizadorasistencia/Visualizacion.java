/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizadorasistencia;

public class Visualizacion {
    public static void imprimirAsistencia(String listasAsistencia[][]) {
        System.out.println( "Materia: "+Captura.materia);
        System.out.println("Dia:" + Captura.dia);
        System.out.println("Hora:" + Captura.hora);
        System.out.println("Salon: "+ Captura.bloque+ "-"+Captura.aula);
        System.out.println("Aforo permitido "+ Captura.aforo);
        System.out.println(" ");
        System.out.println("______________");
        System.out.println(" ");
        for (int y = 0; y < listasAsistencia.length; y++) {
            System.out.println("Lista de aistencia " + (y + 1) + ":");
            System.out.println(" ");
            for (int k = 0; k < listasAsistencia[0].length; k++) {
                if (listasAsistencia[y][k] != null) {
                    System.out.println(Captura.estudiantes[k] + " asiste presencial");
                }
            }
            System.out.println(" ");
        }

    }
}
