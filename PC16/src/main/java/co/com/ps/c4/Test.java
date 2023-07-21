package co.com.ps.c4;

public class Test {

    public static void main(String[] args) {
        Persona persona1= new Persona ();
        Persona persona2 = new Persona("Pedro");
        Persona persona3 = new Persona ("1122466", 20);

        persona2.setNombre("Pablo");
        persona3.setEdad(20);

        Taller repuesto1=new Taller ();
        Taller repuesto2=new Taller ("Balineras",22);
        Taller repuesto3=new Taller (15000);

        repuesto2.setNombre("Maniguetas");
        repuesto2.setTamano(30);
        repuesto3.setPrecio(30000);


    }

}







