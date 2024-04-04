package org.example;

public class Alumno {
    private String Nombre;
    private int Edad;
    private String Correo;

    public Alumno() {
    }

    public Alumno(String nombre, int edad, String correo) {
        Nombre = nombre;
        Edad = edad;
        Correo = correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }
}
