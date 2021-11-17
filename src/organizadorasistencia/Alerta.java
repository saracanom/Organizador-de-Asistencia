
package organizadorasistencia;
public class Alerta {
    public static final int MINESTUDIANTES = 5;
    public static String arrojarAlertas(){
    if(Captura.size < MINESTUDIANTES){
        return "El número de estudiantes no puede ser menor que 5";
    }
    return "";
}
    public static String mensaje(String mensaje){
        return mensaje;
    }
}
