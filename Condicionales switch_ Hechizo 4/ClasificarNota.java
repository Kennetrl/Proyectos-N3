//Kennet Rodriguez
/*Calcular el resultado final de la nota de un alumno de acuerdo a la siguiente tabla:

Categoría -Resultado

D - Insuficiente

C - Buena

B - Muy buena

A - Sobresaliente

Cualquier otra categoría

Nota mal ingresada
*/

import java.util.Scanner;

public class ClasificarNota {

    public static void main(String[] args) {

        String cat="",resultado="";
        char categoria;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la categoria: ");
        cat=leer.next();
        categoria=cat.charAt(0);
        resultado = clasificarNota(categoria);
        System.out.println(resultado);
    }
    
    public static String clasificarNota(char tipo){
       switch (tipo) {
            case 'A':
               return "Sobresaliente";
            case 'B':
                return "Muy buena";
            case 'C':
                return "Buena";
            case 'D':
                return "Insuficiente";
            default:
                return "Nota mal ingresada";
       }
    }
}
