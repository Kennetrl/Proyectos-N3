//Kennet Rodriguez
/* Un supermercado realiza una tómbola con todos los clientes, si son hombres tienen que sacar de una
canasta una bolita la cual tiene un número grabado y si son mujeres lo mismo pero de otra canasta,
los premios se dan bajo la siguiente tabla:
 

HOMBRES - MUJERES

# bolita - Premio

# bolita - Premio

1 - Desodorante

1 - Perfume

2 - Cerveza

2 - Bikini

3 - Boxer

3 - Crema

4 - Rasuradora

4 - Plancha

5 - Camiseta

5 - Blusa
*/
import java.util.Scanner;

public class Tombola {

    public static void main(String[] args) {
        int num=0;
        String cat="", resultado="";
        char genero;
        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese si es mujer (M) u hombre (H): ");
        cat = leer.next();
        
        genero=cat.charAt(0);
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        
        resultado=tombola(genero, num);
        System.out.println(resultado);
    }
    
    private static String tombolaH(int num){
        switch (num){
            case 1:
                return "Desodorante";
            case 2:
                return "Cerveza";
            case 3:
                return "Boxer";
            case 4:
                return "Rasuradora";
            case 5:
                return "Camiseta";
            default:
                return "Error";
        }
        
    }
    
    private static String tombolaM(int num){
        switch (num){
            case 1:
                return "Perfume";
            case 2:
                return "Bikini";
            case 3:
                return "Crema";
            case 4:
                return "Plancha";
            case 5:
                return "Blusa";
            default:
                return "Error";
        }
        
    }
    
    public static String tombola(char genero, int num){
        String resultado="";
        if (genero=='M'){
            resultado=tombolaM(num);
        } else if (genero=='H') {
            resultado=tombolaH(num);
        } else{
            resultado = "Error";
        }
        return resultado;
    }
    
}
