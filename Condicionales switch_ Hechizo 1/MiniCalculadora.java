//Kennet Rodriguez
/*Realizar una mini calculadora para realizar operaciones aritméticas con dos operandos. Se dispone de una variable de tipo char que indicará el tipo de operación que se debe efectuar ´+´, ´-´, ´*´, ´/´ (en cualquier otro caso devolverá la suma). Debe retornar el valor de la operación realizada.*/
import java.util.Scanner;
public class MiniCalculadora {

    public static void main(String[] args) {
        double numero1=0, numero2;
        String op = "";
        char operador;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        numero1 = leer.nextDouble();
        
        System.out.println("Ingrese el segundo numero: ");
        numero2 = leer.nextDouble();
        
        System.out.println("Ingrese el operador (+ - * / .): ");
        op= leer.next();
        operador= op.charAt(0);
        if (operador=='/' && numero2==0){
            System.out.println("Error, no puede ser el denomidar 0 en la division");
        }
        else{
            System.out.println(miniCalculadora(numero1, numero2, operador));
        }

    }
    
    public static double miniCalculadora(double num1, double num2, char op){
        double resultado = 0.0;
        switch (op) {
            case '+' :
            resultado = num1 + num2;
            break;
            case '-':
            resultado = num1 - num2;
            break;
            case '*':
            resultado = num1 * num2;
            break;
            case '/':
            resultado = num1 / num2;
            break;
            default:
            resultado = num1 + num2;
        }
        return resultado;
    }
    
}
