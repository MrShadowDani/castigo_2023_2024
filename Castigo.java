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
    }

    public static long calcularSegundosEnAnio(int dias, byte horas, byte minutos, byte segundos) {
        return (long) dias * horas * minutos * segundos;
    }

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

    public static int sumarArray(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
    }
}
