import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--SISTEMA CALCULADORA DE NOTAS--");

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese la nota 1: ");
        double nota1 = teclado.nextDouble();
        System.out.print("Ingrese la nota 2: ");
        double nota2 = teclado.nextDouble();
        System.out.print("Ingrese la nota 3: ");
        double nota3 = teclado.nextDouble();

        System.out.println("\n--- Resultados para " + nombre + " ---");

        // Llama a tu función de promedio aquí

        // Llama a tu función de aprobar/reprobar aquí

        // Llama a tu función de nota del final aquí

        // Llama a tu función de clasificar desempeño aquí

        // Llama a tu función de nota alta y baja aquí

        // Llama a tu función de mejora aquí
        teclado.close();
    }


    // ZONA DE CREACIÓN DE FUNCIONES



}