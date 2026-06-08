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

        promedioNotas(nota1, nota2, nota3);
        aprobarReprobar(nota1, nota2, nota3);
        notaFinalNecesaria(nota1, nota2, nota3);
        desempeñoEstudiante(nota1, nota2, nota3);
        teclado.close();
    }

    public static void promedioNotas(double n1, double n2, double n3) {
        double promedio = (n1 + n2 + n3) / 3;
        System.out.println("El promedio de las 3 notas es " + promedio);
    }

    public static void aprobarReprobar(double n1, double n2, double n3) {
        double promedio = (n1 + n2 + n3) / 3;
        if (promedio >= 3.0) {
            System.out.println("Estado: APRUEBA (promedio " + String.format("%.2f", promedio) + " >= 3.0)");
        } else {
            System.out.println("Estado: REPRUEBA (promedio " + String.format("%.2f", promedio) + " < 3.0)");
        }
    }

    public static void notaFinalNecesaria(double n1, double n2, double n3) {
        double notaMinima = 3.0;
        double totalNecesario = notaMinima * 4;
        double suma = n1 + n2 + n3;
        double notaNecesaria = totalNecesario - suma;

        if (notaNecesaria > 5) {
            System.out.println("Con estas notas no es posible aprobar, incluso sacando 5.0 en el examen.");
        } else if (notaNecesaria <= 0) {
            System.out.println("Ya tienes la materia aprobada, no necesitas examen final.");
        } else {
            System.out.printf("Para aprobar necesitas sacar %.2f en el examen final.%n", notaNecesaria);
        }
    }

    public static void desempeñoEstudiante(double nota1, double nota2, double nota3) {
        double promedio = (nota1 + nota2 + nota3) / 3;
        String desempeño;

        if (promedio >= 4.5) {
            desempeño = "Excelente";
        } else if (promedio >= 4.0) {
            desempeño = "Muy Bueno";
        } else if (promedio >= 3.5) {
            desempeño = "Bueno";
        } else if (promedio >= 3.0) {
            desempeño = "Suficiente";
        } else {
            desempeño = "Insuficiente";
        }

        System.out.println("Desempeño del estudiante: " + desempeño);
    }

}