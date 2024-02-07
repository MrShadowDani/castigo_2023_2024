import java.util.Scanner;

public class Castigo {
    public static void main(String[] args) {
        // Parte 1: Calcular segundos en un año
        int diasEnAnio = 365;
        byte horasEnDia = 24;
        byte minutosEnHora = 60;
        byte segundosEnMinuto = 60;

        long segundosEnAnio = calcularSegundosEnAnio(diasEnAnio, horasEnDia, minutosEnHora, segundosEnMinuto);
        System.out.println("El número de segundos en un año es: " + segundosEnAnio);

        // Parte 2: Mostrar mayores números enteros representables
        System.out.println("El mayor número representable por un char es: " + Character.MAX_VALUE);
        System.out.println("El mayor número representable por un short es: " + Short.MAX_VALUE);
        System.out.println("El mayor número representable por un int es: " + Integer.MAX_VALUE);

        // Parte 3: Calcular la suma de los múltiplos de 5 entre 1 y 100
        int[] multiplosDe5 = encontrarMultiplosDe5(1, 100);
        int suma = sumarArray(multiplosDe5);
        System.out.println("La suma de los múltiplos de 5 entre 1 y 100 es: " + suma);

        // Parte 4: Calcular el mínimo y el máximo de una lista de números enteros positivos introducidos por el usuario
        Scanner scanner = new Scanner(System.in);
        int numero;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        System.out.println("Introduce números enteros positivos (introduce un número negativo para finalizar):");
        while (true) {
            numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            minimo = Math.min(minimo, numero);
            maximo = Math.max(maximo, numero);
        }

        if (minimo == Integer.MAX_VALUE) {
            System.out.println("No se han introducido números enteros positivos.");
        } else {
            System.out.println("El mínimo de la lista es: " + minimo);
            System.out.println("El máximo de la lista es: " + maximo);
        }

        scanner.close();

        // Parte 5: Mostrar la tabla de multiplicar de los 10 primeros números naturales
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla de multiplicar de " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }

        // Parte 6: Mostrar la lista de los N primeros números primos
        int N = 10; // Cambiar el valor de N según sea necesario
        int[] primos = encontrarPrimos(N);
        System.out.println("Los primeros " + N + " números primos son:");
        for (int primo : primos) {
            System.out.print(primo + " ");
        }
        System.out.println();

        // Parte 7: Descomponer un número en factores primos
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número entero para descomponer en factores primos:");
        int numeroADescomponer = input.nextInt();
        System.out.println("Los factores primos de " + numeroADescomponer + " son:");
        int[] factoresPrimos = descomponerEnFactoresPrimos(numeroADescomponer);
        for (int factor : factoresPrimos) {
            System.out.print(factor + " ");
        }
        System.out.println();
    }

    // Método para la Parte 1
    public static long calcularSegundosEnAnio(int dias, byte horas, byte minutos, byte segundos) {
        return (long) dias * horas * minutos * segundos;
    }

    // Método para la Parte 3
    public static int[] encontrarMultiplosDe5(int inicio, int fin) {
        int cantidad = 0;
        for (int i = inicio; i <= fin; i++) {
            if (i % 5 == 0) {
                cantidad++;
            }
        }

        int[] multiplos = new int[cantidad];
        int index = 0;
        for (int i = inicio; i <= fin; i++) {
            if (i % 5 == 0) {
                multiplos[index++] = i;
            }
        }
        return multiplos;
    }

    // Método para la Parte 3
    public static int sumarArray(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
    }

    // Método para la Parte 6
    public static int[] encontrarPrimos(int cantidad) {
        int[] primos = new int[cantidad];
        int contador = 0;
        int numero = 2;
        while (contador < cantidad) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                primos[contador++] = numero;
            }
            numero++;
        }
        return primos;
    }

    // Método para la Parte 7
    public static int[] descomponerEnFactoresPrimos(int numero) {
        if (numero <= 1) {
            return new int[0];
        }

        int[] factoresPrimos = new int[numero];
        int contador = 0;
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                factoresPrimos[contador++] = i;
                numero /= i;
            }
        }
        int[] resultado = new int[contador];
        System.arraycopy(factoresPrimos, 0, resultado, 0, contador);
        return resultado;
    }
}