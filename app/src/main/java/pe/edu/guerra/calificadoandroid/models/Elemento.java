package pe.edu.guerra.calificadoandroid.models;

/**
 * Created by Alumno on 6/04/2018.
 */

public class Elemento {

    private String titulo;
    private  String direccion;
    private int telefono;

    public Elemento() {
    }

    public Elemento(String titulo, String direccion, int telefono) {
        this.titulo = titulo;
        this.direccion = direccion;
        this.telefono = telefono;
    }





    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "titulo='" + titulo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
