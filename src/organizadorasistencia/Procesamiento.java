
package organizadorasistencia;
public class Procesamiento {
    
    public static String[][] listasAsistencia; 

    public static String[][] asignarAsistencia() {
        listasAsistencia = new String[Captura.numeroListas][Captura.size];;
        int a = 0;
        for (int j = 0; j < Captura.numeroListas; j++) {
            for (int i = 0; i < Captura.aforo; i++) {
                if (a == Captura.size) {
                    a = 0;
                }
                listasAsistencia[j][a] = "Presencial";
                a++;
            }
        }

        return listasAsistencia;
    }
    
}
