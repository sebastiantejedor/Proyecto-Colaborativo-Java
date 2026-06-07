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

        PromedioNotas(nota1,nota2,nota3);
        // Llama a tu función de aprobar/reprobar aquí

        // Llama a tu función de nota del final aquí

        // Llama a tu función de clasificar desempeño aquí

        // Llama a tu función de nota alta y baja aquí

        dev6(nombre, nota1, nota2, nota3);

        teclado.close();
    }
  
      public static void PromedioNotas(double n1, double n2, double n3){
        double promedio = (n1+n2+n3)/3;
        System.out.println("El promedio de las 3 notas es "+promedio);
    }

    static void dev6(String nombre, double nota1, double nota2, double nota3) {

        System.out.println();

        System.out.println("Hola " + nombre + ".");
        System.out.println("Tus notas son:");



        double menor = Math.min(nota1, Math.min(nota2, nota3));

        if (menor == nota1) {
            System.out.println("La nota que requiere mayor mejora es la Nota 1: " + nota1);
        } else if (menor == nota2) {
            System.out.println("La nota que requiere mayor mejora es la Nota 2: " + nota2);
        } else {
            System.out.println("La nota que requiere mayor mejora es la Nota 3: " + nota3);
        }

        System.out.println("Si mejoras esta nota, podrás aumentar tu promedio general.");
    }
}