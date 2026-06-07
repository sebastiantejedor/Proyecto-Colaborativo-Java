import java.util.Scanner;
// Git y Github Colaborativo Actividad
// Proyecto Calculadora de Notas en Java
// Integrador: inicializar el proyecto en GitHub ademas de proteger la rama Main
// Dev 1 Calcular: promedio de 3 notas // Dev 2 Indicar si aprueba o reprueba
// Dev 3 Calcular nota necesaria en el final
// Dev 4 Clasificar desempeño: bajo, medio, alto
// Dev 5: Determinar la nota más alta y la nota más baja entre las tres calificaciones.
// Dev 6: Identificar cuál de las tres notas requiere mayor mejora para aumentar el promedio general del estudiante.

public class Main {
    Scanner input = new Scanner(System.in);
    void main(){
        IO.println("CALCULADORA DE NOTAS");

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese la nota 1: ");
        double nota1 = input.nextDouble();
        System.out.print("Ingrese la nota 2: ");
        double nota2 = input.nextDouble();
        System.out.print("Ingrese la nota 3: ");
        double nota3 = input.nextDouble();
        IO.println();

        // Funcionalidades del proyecto
        dev1(nota1, nota2, nota3);
        dev2(nota1, nota2, nota3);
        dev3(nota1, nota2, nota3);
        dev4(nota1, nota2, nota3);
        dev5(nota1, nota2, nota3);
        dev6(nombre, nota1, nota2, nota3);

        input.close();
    }

void dev1(double nota1, double nota2, double nota3) {

}

void dev2(double nota1, double nota2, double nota3) {

}

void dev3(double nota1, double nota2, double nota3) {

}

void dev4(double nota1, double nota2, double nota3) {

}

void dev5(double nota1, double nota2, double nota3) {

}

void dev6(String nombre, double nota1, double nota2, double nota3) {

        System.out.println("");

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
