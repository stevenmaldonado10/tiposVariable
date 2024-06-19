package practicaclase;
import java.util.Scanner;
/*
•	Crear una nueva clase Java llamada “UsoScanner” y crear un programa que solicite por consola el ingreso 
de la temperatura en grados Fahrenheit (pueden digitar un numero entero o un numero decimal)
 y luego imprimir por consola el resultado en grados Celsius, puedes usar esta fórmula: 
 Celsius = (Fahrenheit - 32) * 5/9 
 */
public class UsoScanner {
    public static void main(String[] args) {
         Scanner imprimir = new Scanner(System.in);
         System.out.println("Ingresae temperatura en grados Fahrenheit");

        double grados = imprimir.nextDouble();
         double celsius = (grados - 32) * 5/9;
        System.out.println("celsius = " + celsius);
    }
}
