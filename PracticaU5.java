/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicau5;

/**
 *
 * @author Usuario
 */
public class PracticaU5 {

    public static int[] sumarconsumo(int[][]numeros, int numca, int numcad){
        int[] consumocasa = new int [numca];
        for (int i = 0; i < numca; i++) {
            int suma = 0;
            for (int j = 0; j < numcad; j++) {
                suma += numeros [i][j];
            }
            consumocasa[i] = suma;
        }
        return consumocasa;
    }
    
    public static int[] sumarconsumodia(int [][] numeros){
        int numca = numeros.length;
        int numcad = numeros.length;
        int [] consumodia = new int [numcad];
        for (int j = 0; j < numeros.length; j++) {
            int suma = 0;
            for (int i = 0; i < numeros.length; i++) {
                suma += numeros[i][j];
                
            }
            consumodia[j] = suma;
        }
        return consumodia;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] numeros = {
            {100, 50, 30, 120, 60},
            {32, 122, 46, 80, 90},
            {45, 100, 56, 26, 36},
            {60, 110, 72, 33, 40},
            
        };
        int[] consumoCasa = PracticaU5.sumarconsumo(numeros, 4, 5);
        for (int a: consumoCasa){
            System.out.println(a);
        }
        int [] consumodia = PracticaU5.sumarconsumodia(numeros);
        for (int o: consumodia) {
            System.out.println(o);
        }
    }

}
