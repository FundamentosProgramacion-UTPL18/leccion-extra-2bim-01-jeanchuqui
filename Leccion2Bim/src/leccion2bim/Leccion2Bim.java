/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion2bim;

/**
 *
 * @author Usuario
 */
public class Leccion2Bim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de arreglos 
        double[] arreglo1 = {110, 220, 430, 140, 250, 460};
        double[] arreglo2 = {10, 20, 30, 40, 50, 60};
        double[] arreglo3 = new double[6];
        double suma = 0;
        double promedio_arreglo3;
        //impresion de los titulos del reporte
        System.out.println("Arreglo1\tArreglo2\tResultado");
        //ciclo para interactuar con los arreglos
        for (int contador = 0; contador < 6; contador++) {
            //calculo de los valores del arreglo3
            arreglo3[contador] = arreglo1[contador] / arreglo2[contador];
            //variable que almacena la suma que despues se usara para el calculo del promeido del arreglo 3
            suma = suma + arreglo3[contador];
            //impresion de los valores de las filas que corresponden al reporte
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\n", arreglo1[contador], arreglo2[contador], arreglo3[contador]);

        }
        //claculo del promedio del arreglo 3
        promedio_arreglo3 = suma / 6;
        //impresion del promedio del arreglo 3
        System.out.printf("\nEl promedio del arreglo 3 es %.2f", promedio_arreglo3);

    }

}
