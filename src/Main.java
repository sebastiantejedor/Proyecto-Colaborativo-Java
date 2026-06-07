// Git y Github Colaborativo Actividad
// Proyecto Calculadora de Notas en Java

// Integrador: inicializar el proyecto en GitHub ademas de proteger la rama Main
// Dev 1 Calcular: promedio de 3 notas
// Dev 2 Indicar si aprueba o reprueba
// Dev 3 Calcular nota necesaria en el final
// Dev 4 Clasificar desempeño: bajo, medio, alto
// Dev 5: Determinar la nota más alta y la nota más baja entre las tres calificaciones.
// Dev 6: Identificar cuál de las tres notas requiere mayor mejora para aumentar el promedio general del estudiante.

void main() {
    IO.println("===Java Calculator of Grades===");
    dev1();
    dev2();
    dev3();
    dev4();
    dev5();
    dev6(4.0, 2.5, 3.9);
}

void dev1() {
    IO.println("promedio de 3 notas");
}

void dev2() {
    IO.println("Indicar si aprueba o reprueba");
}

void dev3() {
    IO.println("Calcular nota necesaria en el final");
}

void dev4() {
    IO.println("Clasificar desempeño: bajo, medio, alto");
}

void dev5() {
    IO.println("Determinar la nota más alta y la nota más baja entre las tres calificaciones.");
}

void dev6(double nota1, double nota2, double nota3) {
    String name = "Pepito";

    IO.println("Hello " + name + "! Vamos a calcular q nota debes reforzar para subir tu promedio general.");
    IO.println("Tus notas son: " + nota1 + ", " + nota2 + " y " + nota3);
    double menor = Math.min(nota1, Math.min(nota2, nota3));

    if (menor == nota1) {
        IO.println("La nota que debes reforzar es la nota 1: " + nota1);
    } else if (menor == nota2) {
        IO.println("La nota que debes reforzar es la nota 2: " + nota2);
    } else {
        IO.println("La nota que debes reforzar es la nota 3: " + nota3);
    }
    IO.println("¡Ánimo " + name + "! Con esfuerzo y dedicación puedes mejorar tu promedio general.");
}