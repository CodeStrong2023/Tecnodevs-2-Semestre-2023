package datos;

import modelos.Movimiento;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.GregorianCalendar;

public class Movimientos {
    public static List<Movimiento> GenerarMovimientos() {
        Random random = new Random();
        int cantidad = random.nextInt(20) + 1;
        List<Movimiento> listaMovimientos = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            // Random date
            GregorianCalendar gc = new GregorianCalendar();
            int anio = randomEntre(2000, 2023);
            gc.set(gc.YEAR, anio);
            int dia = randomEntre(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
            gc.set(gc.DAY_OF_YEAR, dia);

            Date fecha = gc.getTime();

            // Random movimiento
            String titulo = movimientos[random.nextInt(movimientos.length)];

            // Random monto
            int monto = random.nextInt(100);

            Movimiento movimiento = new Movimiento(titulo, monto, fecha);
            listaMovimientos.add(movimiento);
        }

        return listaMovimientos;
    }

    private static int randomEntre(int desde, int hasta) {
        return desde + (int)Math.round(Math.random() * (hasta - desde));
    }

    private static String[] movimientos = new String[] {
            "Juegos",
            "Joystick",
            "Facebook Ad",
            "Youtube",
            "Cena en Restaurante",
            "Compra de Ropa",
            "Suscripción a Netflix",
            "Tarifa de Taxi",
            "Entradas para el Cine",
            "Compra de Libros",
            "Gimnasio",
            "Compra de Electrónicos",
            "Tarjeta de Crédito",
            "Pago de Servicios",
            "Compra de Música",
            "Viaje en Avión",
            "Alquiler de Coche",
            "Seguro Médico",
            "Compra en Supermercado",
            "Regalo de Cumpleaños",
            "Pago de Préstamo",
            "Clases de Baile",
            "Curso Online",
            "Donación a Caridad",
            "Entrada a Parque de Atracciones",
            "Gastos de Mascota",
            "Renovación de Software",
            "Compra de Videojuegos",
            "Pago de Internet",
            "Gastos de Jardinería"
    };
}
