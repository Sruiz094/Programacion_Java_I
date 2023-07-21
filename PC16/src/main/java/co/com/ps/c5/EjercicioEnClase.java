package co.com.ps.c5;

import javax.swing.*;  //Se debe importar este paquete para utilizar la funcion de imprimir mesasajes en pantalla

public class EjercicioEnClase {
    public static void main(String[] args) {

// Realiza herramienta que diga si es mayor de edad y decirme de que año nació.


        String edadStr = JOptionPane.showInputDialog("Ingresa tu edad:");   //Muestra el dialogo
        int edad = Integer.parseInt(edadStr);                               //Captura y almacena el dato

        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Eres mayor de edad."); //Muestra el mensaje en pantalla
        } else {
            JOptionPane.showMessageDialog(null, "Eres menor de edad."); //Muestra el mensaje en pantalla
        }

        int anoactual=2023;
        int Anonacimiento= anoactual-edad;
        JOptionPane.showMessageDialog(null, "Mi año de nacimiento "+Anonacimiento);

}

}


