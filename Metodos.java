/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

/**
 *
 * @author evely
 */
public class Metodos {

     public static int sumar (int a, int b){
         return a+b;
     }
     public static double restar (double i, double o){
         return i-o;
     }
     public static int multiplicar (int z, int w){
         return z*w;
     }
     public static double division (double q, double t){
         return q/t;
     }
    public static void main(String[] args) {
        int resultado = Metodos.sumar(10, 12);
        System.out.println("El resultado de la suma es: " + resultado);
        double resultadores = Metodos.restar(24.9, 33.98);
        System.out.println("El resultado de la resta es " + resultadores);
        int resmulti = Metodos.multiplicar(33, 55);
        System.out.println("El resultado de la multiplicacion es: " + resmulti);
        double resdivision = Metodos.division(13.46, 45.6);
        System.out.println("El resultado de la division es: " + resdivision);
    }
    
}
