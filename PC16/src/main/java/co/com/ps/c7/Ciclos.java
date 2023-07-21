package co.com.ps.c7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Ciclos {

    public static void main (String [] args) {

     //Ciclo for (para)

        double[] notas = new double[4];


        notas[0] = 1.3;
        notas[1] = 5.0;
        notas[2] = 4.5;
        notas[3] = 2.5;
        for (double nota :notas) {
            System.out.println(nota);
        }

        System.out.println("Aqui inicia el iterador para mi arreglo");

        for (int i = 0; i < notas.length; i++) {    //miLista.length contine el tamaño total de mi arreglo
            System.out.println(notas[i]);             // length se utiliza para arreglos y miLista.size para listas
        }


        System.out.println("---------------------------"); //Se utilizo para separa en la consola los datos de nota y lista

        List<String>miLista = new ArrayList<>();

        miLista.add("Pedro");
        miLista.add("Juan");
        miLista.add("Pablo");
        miLista.add("Carlos");
        miLista.add("Lucas");

        for (String nombre:miLista) {      //Se utiliza el String porque la lista es de tipo texto,
           System.out.println(nombre);     //nombre es la variable donde se alamacena la información de la lista
        }

        System.out.println("Aqui inicia el iterador para mi lista");

        for (int i = 0; i < miLista.size(); i++) {    //miLista.size contine el tamaño total de mi lista
            System.out.println(miLista.get(i));       // i es un interador i=o inicia en cero,
                                                      // i++ incrementa 1 en 1
        }                                             // para recorrer mi lista utilizo el comado milista.get(i));
                                                      // milista esta iniciando en la posicion i=0 imprimer el primer valor de mi lista






    }


}
