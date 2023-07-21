package co.com.ps.c7;
import java.util.Arrays;
public class Ejercicio {

    public static void main (String [] args) {

//Dado un arreglo {4,2,6,2,3,5} ordenarlos de menor a mayor
// Crear otro arreglo que recorra el principal y vaya almacenado la información en una variable, los numeros menor y mayores
// luego unir todo en otro arreglo.

        int arreglo[] = {4, 2, 6, 2, 3, 5};


        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length -1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;

                }
            }

        }
        System.out.println(" ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);




}

    }
}










