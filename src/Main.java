import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("CALCULADORA DE NOTAS");

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = input.nextLine();

        System.out.print("Ingrese la nota 1: ");
        double nota1 = input.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        double nota2 = input.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        double nota3 = input.nextDouble();

        System.out.println();

        dev1(nota1, nota2, nota3);
        dev2(nota1, nota2, nota3);
        dev3(nota1, nota2, nota3);
        dev4(nota1, nota2, nota3);
        dev5(nota1, nota2, nota3);
        dev6(nombre, nota1, nota2, nota3);

        input.close();
    }

    static void dev1(double nota1, double nota2, double nota3) {

    }

    static void dev2(double nota1, double nota2, double nota3) {

    }

    static void dev3(double nota1, double nota2, double nota3) {

    }

    static void dev4(double nota1, double nota2, double nota3) {

    }

    static void dev5(double nota1, double nota2, double nota3) {

    }

    static void dev6(String nombre, double nota1, double nota2, double nota3) {

        System.out.println();

        System.out.println("Hola " + nombre + ".");
        System.out.println("Tus notas son:");

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);

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