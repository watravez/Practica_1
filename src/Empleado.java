/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author labesp
 */
public class Empleado {
    String nombre;
    double salarioBase;
    int horasextras; 

    public Empleado() {
    }

    public Empleado(String nombre, double salarioBase, int horasextras) {
        this.nombre = nombre;
        this.salarioBase = 460;
        this.horasextras = horasextras;
    }
      
    
    public void calcularSalarioTotal(){
        if(horasextras>0){
        salarioBase=(horasextras*10)+salarioBase;
        System.out.println("El salario de "+nombre+" incluida las hroas extra es: "+salarioBase);
        }
    }
    
    public void mostrarDatos(){
        System.out.println(" ");
        System.out.print("Nombre: "+nombre);
        System.out.print("Salario base: "+salarioBase);
        System.out.print("Horas extra: "+horasextras);
        System.out.print("Salario total calculado: ");
    }
    
}
