/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int valorA = 10;
        int valorB = 3;
        int suma = valorA + valorB;
        double divisionDos = valorA / (double)valorB;

        System.out.printf("Suma: %d + %d = %d\n", valorA, valorB,
                valorA + valorB);
        
        System.out.printf("Suma: %d + %d = %d\n", valorA, valorB, suma);
        //cuando se quiere dividir entre dos números dentro de la programacion// 
        //con ayuda de netbeans, lo que se obtiene es el residuo, mas no el// 
        //cociente, tener cuidado con este comando//
        
        System.out.printf("Resta: %d - %d = %d\n", valorA, valorB,
                valorA - valorB);
        System.out.printf("Multiplicación: %d * %d = %d\n", valorA, valorB,
                valorA * valorB);
        System.out.printf("División: %d / %d = %d\n", valorA, valorB,
                valorA / valorB);
        
        System.out.printf("División Dos: %d / %d = %.2f\n", valorA, valorB,
                divisionDos);
        //
        
        System.out.printf("Módulo o Resto: %d %% %d = %d\n", valorA, valorB,
                valorA % valorB);
        //Cuando se realiza un tipo de operación como está se requiere un doble
        //signo para qiue el computador pueda interpretar la representación de
        //nuestra solicituda y así podamos obtener el resultado//
    }

}
