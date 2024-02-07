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
    }

    public static long calcularSegundosEnAnio(int dias, byte horas, byte minutos, byte segundos) {
        return (long) dias * horas * minutos * segundos;
    }
}
