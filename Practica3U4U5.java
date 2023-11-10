/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3u4u5;

/**
 *
 * @author evely
 */
public class Practica3U4U5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] calificaciones = {
            {90.5, 85.0, 78.5, 92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5, 91.0, 87.5},
        };
       double [] promMate = Practica3U4U5.promediomateria(calificaciones,3,4);
       for (double a: promMate){
           System.out.println(a);    
       }
       double [] promEstu = Practica3U4U5.promedioestudiante(calificaciones);
       for(double o : promEstu){
           System.out.println(o);
       }

    }

    public static double[] promediomateria(double[][] calificaciones, int numEstudiante, int numAsig) {
        double[] promedioAsig = new double[numAsig];
        for (int j = 0; j < numAsig; j++) {
            double suma = 0.0;
            for (int i = 0; i < numEstudiante; i++) {
                suma += calificaciones[i][j];
                suma++;
            }
            promedioAsig[j] = suma / numEstudiante;
        }
        return promedioAsig;
    }

    public static double[] promedioestudiante(double[][] calificaciones) {
        int estudiantes = calificaciones.length;
        int asig = calificaciones.length;
        double[] promedioEstu = new double[estudiantes];
        for (int i = 0; i < calificaciones.length; i++) {
            double suma = 0.0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
                suma++;
            }
            promedioEstu[i] = suma / estudiantes;
        }
        return promedioEstu;

    }

}
