package co.com.ps.c6;

import java.util.ArrayList;

public class Arreglos {
        public static void main(String[] args) {

            int [] miPrimerArreglo= new int[2];
            System.out.print(miPrimerArreglo[0]);
            miPrimerArreglo[0]=10;
            System.out.print(miPrimerArreglo[0]);
            int [] miPrimerArreglo2= {1,4,3,1000};

            // Los arreglos son estructuras de datos que permiten almacenar información
            // el tamaño del arreglo no puede superar su capacidad
            //es decir, que si el tamaño es 3 el arreglo va del 0 al 2, arreglo es tamaño-1
            // Utilizar el arreglo para almacenar datos fijos poco variables como paises del mundo, etc.
            // Utilizar lista para agregar datos variables


            String [] nombre =new String [3];
            nombre [0] = "Colombia";
            nombre [1] = "Venezuela";
            nombre [2] = "Panamá";

            System.out.println( nombre [0]); // Asi se llama cada arreglo en la base de datos

            pais(nombre);
            double[] notas = new double[4];


            notas[0] = 1.3;
            notas[1] = 5.0;
            notas[2] = 4.5;



            System.out.println("La nota final del estudiante es: "+calcularNota(notas));


        pais(nombre);

        }

    public static double calcularNota(double[] notas){
        double acumulador=0;
        for (double nota:notas) {
            acumulador= acumulador+nota;
        }
        return acumulador/notas.length;
    }


    public static void pais(String[] nombre) {

}


}