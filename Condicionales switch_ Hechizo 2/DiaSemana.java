//Kennet Rodriguez
/*Dado el número del día de la semana (1 a 7), devolver el nombre del día de la semana (“lunes”, “martes”, “miercoles”, “jueves”, “viernes”, “sabado”, “domingo”), en cualquier otro caso retornar “no existe ese dia”.*/
import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int dia = 0;
        String resultado = "";
        System.out.println("Ingrese el del dia de la semana");
        dia = leer.nextInt();
        resultado= diaSemana(dia);
        System.out.println(resultado);
    }
    
    public static String diaSemana(int dia){
        switch (dia) {
            case 1:
                return "lunes";
            case 2:
                return "martes";
            case 3:
                return "miercoles";
            case 4:
                return "jueves";
            case 5:
                return "viernes";
            case 6:
                return "sabado";
            case 7:
                return "domingo";
            default:
                return "no existe ese dia";
        }
    }    
}
