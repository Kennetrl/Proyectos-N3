//Kennet Rodriguez
/*Dado el año y el número del mes (1 a 12), retornar el número de días del mes. Debe tomar en cuenta si el año es bisiesto para los días de febrero.

Sugerencia: Debe crear 2 métodos, uno para calcular si es año bisiesto y otro para determinar los días del mes, el segundo método debe llamar al primero.*/
import java.util.Scanner;

public class DiasMes {

    public static void main(String[] args) {
        int anio = 0, mes = 0, diasMes=0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el año: ");
        anio = leer.nextInt();
        
        System.out.println("Ingrese el mes: ");
        mes = leer.nextInt();
        
        diasMes=diasMes(anio, mes);
        System.out.println(diasMes);
        
        
    }
    
    public static boolean bisiesto(int anio){
        int ultimosDigitos = 0;
        ultimosDigitos = anio%100;
        if (anio%100 == 0 & anio%400 != 0){
            return false;
        }else if (ultimosDigitos%4==0) {
            return true;
        } else 
            return false;
    }
    
    public static int diasMes(int anio, int mes){
        int dias=0;
        switch(mes) {
            case 1:
                dias = 31;
                break;
            case 2: 
                if (bisiesto(anio))
                    dias=29;
                else
                    dias=28;
                break;
            case 3:
                dias = 31;
                break;
            case 4:
                dias = 30;
                break;
            case 5:
                dias = 31;
                break;
            case 6:
                dias = 30;
                break;
            case 7:
                dias = 31;
                break;
            case 8:
                dias = 31;
                break;
            case 9:
                dias = 30;
                break;
            case 10:
                dias = 31;
                break;
            case 11:
                dias = 30;
                break;
            case 12:
                dias = 31;
                break;
            default:
                dias=0;
        }
        return dias;
    }
    
}

