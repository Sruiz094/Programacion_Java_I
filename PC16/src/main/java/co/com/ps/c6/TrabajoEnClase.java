package co.com.ps.c6;
import java.util.Arrays;
public class TrabajoEnClase {
    public static void main (String [] args) {

        //crear un arreglo con 10 numeros, y encontrar el menor de todos y el mayor.


    double[] valores = new double[10];


        valores[0] = 1;
        valores[1] = 2;
        valores[2] = 6;
        valores[3] = 4;
        valores[4] = 5;
        valores[5] = 3;
        valores[6] = 7;
        valores[7] = 9;
        valores[8] = 8;
        valores[9] = 10;


        for (double num :valores) {
        System.out.println(num);
    }

        //Se itera el arreglo para encontrar el número manro y el mayor

        double menor = valores [0];
        double mayor = valores [0];


        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < menor) {
                menor = valores[i];
            }
            if (valores[i] > mayor) {
                mayor = valores[i];
            }


        }

        System.out.println("El número menor es: " + menor);
        System.out.println("El número mayor es: " + mayor);


    }

}
