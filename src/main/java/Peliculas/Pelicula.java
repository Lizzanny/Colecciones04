/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peliculas;

/**
 *
 * @author LizzW
 */
public class Pelicula {
    private String título;
    private String director;
    private String duración;

    public Pelicula() {
    }

    public Pelicula(String título, String director, String duración) {
        this.título = título;
        this.director = director;
        this.duración = duración;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDuración() {
        return duración;
    }

    public void setDuración(String duración) {
        this.duración = duración;
    }
    
    
}