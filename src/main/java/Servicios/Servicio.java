/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Comparadores.Comparador;
import Peliculas.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author LizzW
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 * Para esto, tendremos una clase Pelicula con el titulo, director y duración de
 * la película (en horas). Implemente las clases y métodos necesarios para esta
 * situación, teniendo en cuenta lo que se pide a continuación: 
 * En el servicio
 * deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
 * todos sus datos y guardándolos en el objeto Pelicula. Después, esa Pelicula
 * se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear
 * otra Pelicula o no. Después de ese bucle realizaremos las siguientes
 * acciones:
 *
 * • Mostrar en pantalla todas las películas. • Mostrar en pantalla todas las
 * películas con una duración mayor a 1 hora. • Ordenar las películas de acuerdo
 * a su duración (de mayor a menor) y mostrarlo en pantalla. • Ordenar las
 * películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
 * pantalla. • Ordenar las películas por titulo, alfabéticamente y mostrarlo en
 * pantalla. • Ordenar las películas por director, alfabéticamente y mostrarlo
 * en pantalla.
 */
public class Servicio {
    private final Scanner sc;
    ArrayList<Pelicula> peliculas;
    
    public Servicio() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.peliculas = new ArrayList<>();
    }
    
    public void menu(){
        boolean salir = false;
        int opc;
        do{
            
            System.out.print("¿Que acción desea realizar?\n"
        + "1. Agregar película\n"
        + "2. Listar películas\n"
        + "3. Mostrar películas con duración mayor a 1 hora\n"
        + "4. Ordenar las películas por duración(Asc)\n"
        + "5. Ordenar las películas por duración(Desc)\n"
        + "6. Ordenar las películas alfabericamente(Asc)\n"
        + "7. Ordenar las películas alfabericamente(Desc)\n"
        + "8. Ordenar las películas por director alfabericamente(Asc)\n"
        + "9. Ordenar las películas por director alfabericamente(Desc)\n"
        + "10. Salir\n"
        + "Opción: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1 -> agregarPelicula();
                case 2 -> listarPeliculas();
                case 3 -> mayorHora();
                case 4 -> {
                    duracionAsc();
                    listarPeliculas();
                }
                case 5 -> {
                    duracionDesc();
                    listarPeliculas();
                }
                case 6 -> {
                    alfabeticaAsc();
                    listarPeliculas();
                }
                case 7 -> {
                    alfabeticaDesc();
                    listarPeliculas();
                }
                case 8 -> {
                    directorAsc();
                    listarPeliculas();
                }
                case 9 -> {
                    directorDesc();
                    listarPeliculas();
                }
                case 10 -> salir = true;
                default -> System.out.println("¡Opción invalida!");
            }
        }while(!salir);
    }
    
    public void agregarPelicula(){
        Pelicula peli = new Pelicula();
        System.out.println("¿Cual es el titulo de la película?");
        peli.setTitulo(sc.next());
        System.out.println("¿Quien es el director de la película?");
        peli.setDirector(sc.next());
        System.out.println("¿Cuantos minutos dura la película?");
        peli.setDuracion(sc.nextInt());
        peliculas.add(peli);
    }
    
    public void listarPeliculas(){
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }
    
    public void mayorHora(){
        Iterator<Pelicula> it = peliculas.iterator();
        while (it.hasNext()) {
            Pelicula peliculaActual = it.next();
            if (peliculaActual.getDuracion()>=60) {
                System.out.println(peliculaActual.toString());
            }
        }
    }
    
    public void duracionAsc(){
        Collections.sort(peliculas, Comparador.durAsc);
    }
    
    public void duracionDesc(){
        Collections.sort(peliculas, Comparador.durDesc);
    }
    
    
    public void alfabeticaAsc(){
        Collections.sort(peliculas, Comparador.alfaAsc);
    }
    
    public void alfabeticaDesc(){
        Collections.sort(peliculas, Comparador.alfaDesc);
    }
    
    public void directorAsc(){
        Collections.sort(peliculas, Comparador.dirAsc);
    }
    
    public void directorDesc(){
        Collections.sort(peliculas, Comparador.dirDesc);
    }
}
