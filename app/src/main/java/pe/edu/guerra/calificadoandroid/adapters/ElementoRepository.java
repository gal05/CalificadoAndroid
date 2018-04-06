package pe.edu.guerra.calificadoandroid.adapters;

import java.util.ArrayList;
import java.util.List;

import pe.edu.guerra.calificadoandroid.models.Elemento;

/**
 * Created by Alumno on 6/04/2018.
 */

public class ElementoRepository {

    private static List<Elemento>  elementos;

    static {
        elementos= new ArrayList<>();
        elementos.add(new Elemento("titulo 1 :D","Av los cerillos",25412545));
        elementos.add(new Elemento("tiasdasda :D","Av los paltos",25412545));
        elementos.add(new Elemento("titulo 3 :D","Av los madrigeura",25412545));
        elementos.add(new Elemento("titulo 56 :rtr","Av los c++",25412545));
        elementos.add(new Elemento("titulo 6 :fg","Av ing",25412545));
        elementos.add(new Elemento("titulo 235 ass","Av saastres",25412545));
        elementos.add(new Elemento("titulo 88 :D","Av los orates",25412545));
        elementos.add(new Elemento("titulo 455 asd","Av los 2123",25412545));
        elementos.add(new Elemento("titulo 67 D","Av 2444",25412545));
        elementos.add(new Elemento("titulo 23 :","Av 666",25412545));



    }



}
