package co.com.ps.c3;


import java.util.Scanner;

    public class EntradaSalidaDatos {

        public static void main(String[] args) {
            //JOptionPane.showInputDialog(null);

            // Crear un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);

            // Leer un número entero desde el teclado
            System.out.print("Ingrese dos número entero: ");//escribir en pantalla

           final int num1 = scanner.nextInt();//Capaturar el dato
           final int num2 = scanner.nextInt();//Capaturar el dato
            int suma= num1+num2;
            int resta= num1-num2;
            int multiplicacion= num1*num2;
            int divison= num1/num2;

            // Mostrar la salida en la consola
            System.out.println("La suma de mis Constantes es, "+suma);
            System.out.println("La resta de mis Constantes es, "+resta);
            System.out.println("La multiplicacion de mis Constantes es, "+multiplicacion);
            System.out.println("La division de mis Constantes es, "+divison);


            // Cerrar el objeto Scanner
              scanner.close();
        }
    }



