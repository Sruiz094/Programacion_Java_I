package co.com.ps.c4;

public class Taller {


    private String nombre;

    private int tamano;
    private int precio;

    public Taller()  {

    }


    public Taller(String nombre, int tamano)  {
        this.nombre=nombre;
        this.tamano=tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Taller(int precio)  {
        this.precio=precio;

    }



}
