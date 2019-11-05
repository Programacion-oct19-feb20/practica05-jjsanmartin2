/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author JAVIER
 * 
 * Un padre de familia ha pagado 3 cuotas de navidad de sus hijos, 
 * la cuota uno de 15 dolares, la cuota dos de 10 dolares y 
 * la cuota tres de 16 dolares.
 * Generar un programa en lenguaje java que permita ingresar por teclado 
 * los valores de las cuotas, luego presentar el promedio de dolares pagados 
 * entre las cuotas, ademas, presentar un mensaje en pantalla (true or false)
 * dependiendo del promedio. 
 * Si el promedio es mayorigual a 11  = true.
 * Si el promedio es menor a 11 = false.
 * 
 * 
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int cuota1;
        int cuota2;
        int cuota3;
        
        
        System.out.println("Ingrese el valor de la cuota 1");
        cuota1 = entrada.nextInt();
        
        System.out.println("Ingrese el valor de la cuota 3");
        cuota2 = entrada.nextInt();
        
        System.out.println("Ingrese el valor de la cuota 3");
        cuota3 = entrada.nextInt();
        
        int sumaTotal = cuota1 + cuota2 + cuota3;
        double promedio = sumaTotal / (double)3;
        
        
        
        
        System.out.printf("Cuotas\n\nTotal de dolares pagados entre cuotas: "
                + "%d\n\nPromedio del valor de las cuotas pagadas: %.2f\n\n ",
                sumaTotal, promedio);
        System.out.printf("Mayor Igual: %.2f >= %d = %s\n", promedio, 11,
                promedio >= 11);
        System.out.printf("Menor Igual: %.2f <= %d = %s\n", promedio, 11,
                promedio <= 11);

        
        
        
        
        
        
    }
    
}
