public class Castigo {
    public static void main(String[] args) {
        int diasEnAnio = 365;
        byte horasEnDia = 24;
        byte minutosEnHora = 60;
        byte segundosEnMinuto = 60;

        long segundosEnAnio = calcularSegundosEnAnio(diasEnAnio, horasEnDia, minutosEnHora, segundosEnMinuto);
        System.out.println("El número de segundos en un año es: " + segundosEnAnio);
    }

    public static long calcularSegundosEnAnio(int dias, byte horas, byte minutos, byte segundos) {
        return (long) dias * horas * minutos * segundos;
    }
}
