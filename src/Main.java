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
        // Llama a tu función de aprobar/reprobar aqui
        notaFinalNecesaria(nota1, nota2, nota3);

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
    public static void notaFinalNecesaria(double n1, double n2, double n3) {

        double notaMinima = 3.0;
        double totalNecesario = notaMinima * 4;

        double suma = n1 + n2 + n3;

        double notaNecesaria = totalNecesario - suma;

        System.out.println("\n--- NOTA FINAL NECESARIA ---");

        if (notaNecesaria > 5) {
            System.out.println("Con estas notas no es posible aprobar, incluso sacando 5.0 en el examen.");
        } else if (notaNecesaria <= 0) {
            System.out.println("Ya tienes la materia aprobada, no necesitas examen final.");
        } else {
            System.out.printf("Para aprobar necesitas sacar %.2f en el examen final.%n", notaNecesaria);
        }
    }
    static void dev6(String nombre, double nota1, double nota2, double nota3) {

        System.out.println();

        System.out.println("Hola " + nombre + ".");

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