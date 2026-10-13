/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc =new Scanner(System.in);
        int n;
        nom=new Empleado(nombre, salarioBase, horasextras);
        System.out.print("Ingrese el numero de empleados a registrar");
        n=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del empleado: ");
            nomb=sc.nextLine();
            
            nom.calcularSalarioTotal();
            System.out.print("==INFORMACION DEL IMPLEADO "+(i+1)+" Registrado==");
            nom.mostrarDatos();            
        }
    }
    
}
