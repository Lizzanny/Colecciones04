/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparadores;

import Peliculas.Pelicula;
import java.util.Comparator;

/**
 *
 * @author LizzW
 */
public class Comparador {
    public static Comparator<Pelicula> durAsc = new  Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> durDesc = new  Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
    };
    
    
    public static Comparator<Pelicula> alfaAsc = new  Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> alfaDesc = new  Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getTitulo().compareTo(o1.getTitulo());
        }
    };
    
    
    public static Comparator<Pelicula> dirAsc = new  Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
    
    public static Comparator<Pelicula> dirDesc = new  Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDirector().compareTo(o1.getDirector());
        }
    };
}
