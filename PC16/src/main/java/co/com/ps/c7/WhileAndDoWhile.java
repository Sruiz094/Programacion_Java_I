package co.com.ps.c7;
import java.util.Scanner;

public class WhileAndDoWhile {
    public static void main (String [] args) {


        int num1=5;
        while (num1>0){
        System.out.print(num1);
        num1--;                         //-- le resta 1 a la variable num1

    }

////////////////////////////////////////////////////////////
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("¿Quieres continuar? (s/n)");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("Fin del programa.");

}
}