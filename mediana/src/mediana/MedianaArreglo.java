package mediana;
import java.util.Arrays;
import java.util.Scanner;

public class MedianaArreglo {
    
    public static double calcularMediana(double[] arreglo) {
        Arrays.sort(arreglo); 
        
        int n = arreglo.length;
        if (n % 2 == 1) {
            
            return arreglo[n / 2];
        } else {
            return (arreglo[n / 2 - 1] + arreglo[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de elementos del arreglo: ");
        int n = scanner.nextInt();

        double[] x = new double[n];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextDouble();
        }

        double mediana = calcularMediana(x);
        System.out.println("La mediana del arreglo es: " + mediana);
        
        scanner.close();
    }
}

