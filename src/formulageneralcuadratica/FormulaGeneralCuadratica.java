/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formulageneralcuadratica;

/**
 *
 * @author ap550
 */
import java.util.Scanner;

public class FormulaGeneralCuadratica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos los coeficientes de la ecuación cuadrática al usuario
        System.out.print("INTRODUCE EL VALOR DE a: ");
        double a = entrada.nextDouble();
        System.out.print("INTRODUCE EL VALOR DE b: ");
        double b = entrada.nextDouble();
        System.out.print("INTRODUCE EL VALOR DE c: ");
        double c = entrada.nextDouble();
        
        // Calculamos el discriminante
        double discriminante = Math.pow(b, 2) - 4 * a * c;

        // Comprobamos si la ecuación tiene soluciones reales 
        if (discriminante < 0) {
            System.out.println("LOS DATOS INTRODUCIDOS NO TIENEN SOLUCION CUADRATICA.");
        } else {
            // Calculamos las soluciones de la ecuación
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a); 
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            // Mostramos las soluciones de la ecuación
            System.out.printf("\n LA SOLUCICONN DEL PROBLEMA ES: \n");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        entrada.close();
    }
}
