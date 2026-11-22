/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.de.programacion;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EjerciciosDeProgramacion {

    private static final Scanner entrada = new Scanner(System.in);

    // Lee un numero decimal aceptando tanto coma (1,82) como punto (1.82)
    private static double leerDecimal(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String texto = entrada.nextLine().trim().replace(',', '.');
            try {
                return Double.parseDouble(texto);
            } catch (NumberFormatException e) {
                System.out.println("Valor no valido. Ingrese un numero (ejemplo 1.82 o 1,82).");
            }
        }
    }

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n===== TAREA: TRADUCCION DE PSEINT A JAVA =====");
            System.out.println("1. Datos personales");
            System.out.println("2. Operaciones con dos numeros");
            System.out.println("3. Mayoria de edad");
            System.out.println("4. Aprobado o reprobado");
            System.out.println("5. Categoria de calificacion");
            System.out.println("6. Dia de la semana");
            System.out.println("7. Contar y sumar hasta ingresar un negativo");
            System.out.println("8. Verificar contrasena");
            System.out.println("9. Tabla de multiplicar");
            System.out.println("10. Suma y promedio de 10 numeros");
            System.out.println("11. Mayor y menor de 10 numeros");
            System.out.println("0. Salir");
            System.out.print("Elija el ejercicio: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el salto de linea pendiente

            switch (opcion) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> ejercicio6();
                case 7 -> ejercicio7();
                case 8 -> ejercicio8();
                case 9 -> ejercicio9();
                case 10 -> ejercicio10();
                case 11 -> ejercicio11();
                case 0 -> System.out.println("Programa finalizado.");
                default -> System.out.println("Opcion no valida. Elija un numero del 0 al 11.");
            }
        } while (opcion != 0);
    }

    // Ejercicio 1: solicitar y mostrar datos personales
    private static void ejercicio1() {
        System.out.println("\n--- Ejercicio 1: Datos personales ---");
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese su carrera: ");
        String carrera = entrada.nextLine();
        double estatura = leerDecimal("Ingrese su estatura en metros (ejemplo 1.70 o 1,70): ");

        System.out.println("\n--- Datos ingresados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura + " m");
    }

    // Ejercicio 2: operaciones aritmeticas
    private static void ejercicio2() {
        System.out.println("\n--- Ejercicio 2: Operaciones ---");
        System.out.print("Ingrese el primer numero entero: ");
        int numero1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int numero2 = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicacion: " + (numero1 * numero2));
        if (numero2 != 0) {
            System.out.println("Division: " + ((double) numero1 / numero2));
            System.out.println("Residuo: " + (numero1 % numero2));
        } else {
            System.out.println("No se puede dividir ni calcular el residuo entre cero.");
        }
    }

    // Ejercicio 3: determinar mayoria de edad
    private static void ejercicio3() {
        System.out.println("\n--- Ejercicio 3: Mayoria de edad ---");
        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }

    // Ejercicio 4: aprobar o reprobar con nota minima de 7
    private static void ejercicio4() {
        System.out.println("\n--- Ejercicio 4: Aprobado o reprobado ---");
        double nota = leerDecimal("Ingrese la nota del estudiante: ");
        if (nota >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }

    // Ejercicio 5: clasificar calificacion entre 0 y 10
    private static void ejercicio5() {
        System.out.println("\n--- Ejercicio 5: Categoria de calificacion ---");
        double calificacion = leerDecimal("Ingrese una calificacion entre 0 y 10: ");

        if (calificacion < 0 || calificacion > 10) {
            System.out.println("Calificacion no valida. Debe estar entre 0 y 10.");
        } else if (calificacion >= 9) {
            System.out.println("Excelente");
        } else if (calificacion >= 8) {
            System.out.println("Muy Bueno");
        } else if (calificacion >= 7) {
            System.out.println("Bueno");
        } else if (calificacion >= 5) {
            System.out.println("Regular");
        } else {
            System.out.println("Deficiente");
        }
    }

    // Ejercicio 6: mostrar el dia segun un numero del 1 al 7
    private static void ejercicio6() {
        System.out.println("\n--- Ejercicio 6: Dia de la semana ---");
        System.out.print("Ingrese un numero del 1 al 7: ");
        int dia = entrada.nextInt();
        entrada.nextLine();

        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Numero no valido. Debe estar entre 1 y 7.");
        }
    }

    // Ejercicio 7: sumar y contar entradas hasta recibir un numero negativo
    private static void ejercicio7() {
        System.out.println("\n--- Ejercicio 7: Contar y sumar numeros ---");
        int cantidad = 0;
        int suma = 0;
        int numero;

        do {
            System.out.print("Ingrese un numero (negativo para terminar): ");
            numero = entrada.nextInt();
            if (numero >= 0) { // El numero negativo usado para salir no se cuenta
                cantidad++;
                suma += numero;
            }
        } while (numero >= 0);
        entrada.nextLine();

        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);
    }

    // Ejercicio 8: solicitar contrasena hasta que sea correcta
    private static void ejercicio8() {
        System.out.println("\n--- Ejercicio 8: Verificacion de contrasena ---");
        String contrasena;
        do {
            System.out.print("Ingrese la contrasena: ");
            contrasena = entrada.nextLine();
            if (!contrasena.equals("java2026")) {
                System.out.println("Contrasena incorrecta. Intentelo nuevamente.");
            }
        } while (!contrasena.equals("java2026"));
        System.out.println("Acceso concedido.");
    }

    // Ejercicio 9: tabla de multiplicar del 1 al 12
    private static void ejercicio9() {
        System.out.println("\n--- Ejercicio 9: Tabla de multiplicar ---");
        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();
        entrada.nextLine();
        for (int multiplicador = 1; multiplicador <= 12; multiplicador++) {
            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
        }
    }

    // Ejercicio 10: suma y promedio de diez numeros
    private static void ejercicio10() {
        System.out.println("\n--- Ejercicio 10: Suma y promedio ---");
        int suma = 0;
        for (int contador = 1; contador <= 10; contador++) {
            System.out.print("Ingrese el numero " + contador + ": ");
            int numero = entrada.nextInt();
            suma += numero;
        }
        entrada.nextLine();
        double promedio = suma / 10.0;
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }

    // Ejercicio 11: mayor y menor de diez numeros
    private static void ejercicio11() {
        System.out.println("\n--- Ejercicio 11: Numero mayor y menor ---");
        System.out.print("Ingrese el numero 1: ");
        int numero = entrada.nextInt();
        int mayor = numero;
        int menor = numero;

        for (int contador = 2; contador <= 10; contador++) {
            System.out.print("Ingrese el numero " + contador + ": ");
            numero = entrada.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        entrada.nextLine();
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
    }
}