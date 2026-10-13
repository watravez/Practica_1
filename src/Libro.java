/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author labesp
 */
public class Libro {
    //metodos
    String  titulo, autor, estado;
    int paginas;

    public Libro() {
    }

    public Libro(String titulo, String autor, String estado, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = "Disponible";
        this.paginas = paginas;
    }
    //Atributos
    public void prestar(){
        
    }
    
    public void devolver(){
    
    }
    
    public void mostrarInfo(){
        System.out.println("==INFORMACION DEL LIBRO==");
        System.out.print("Titulo del libro: "+titulo);
        System.out.print("Autor: "+autor);
        System.out.print("Paginas: "+paginas);
        System.out.print("Estado: "+estado);
    }
    
}
