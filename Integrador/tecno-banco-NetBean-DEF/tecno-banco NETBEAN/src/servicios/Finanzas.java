package servicios;

import datos.Usuarios;
import modelos.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Finanzas {
    private static final String[] PALABRAS = {"alfa", "beta", "gamma", "delta", "echo"}; // Add more words as needed

    public static String GenerarAlias() {
        Random random = new Random();
        return PALABRAS[random.nextInt(PALABRAS.length)] + "." +
            PALABRAS[random.nextInt(PALABRAS.length)] + "." +
            PALABRAS[random.nextInt(PALABRAS.length)];
    }


    public static int GenerarCBU() {
        return new Random().nextInt();
    }

    public static void MostrarCuenta() {
        Usuario usuario = Sistema.getUsuario();

        Sistema.Separar();
        System.out.println(usuario.nombre + ": $" + usuario.cuenta.getBalance() + "ARS");
        Sistema.Separar();
    }

    public static void MostrarTarjeta(ETarjeta tipo, boolean mostrarMovimientos) {
        Tarjeta tarjeta = Sistema.getCuenta().obtenerTarjeta(tipo);

        if (tarjeta == null) {
            System.out.println("No tienes una tarjeta de tipo " + tipo);
            return;
        }

        System.out.println("Tarjeta " + tipo);

        if (mostrarMovimientos) {
            List<Movimiento> movimientos = tarjeta.getMovimientos();

            for (int i = 0; i < movimientos.stream().count(); i++) {
                Movimiento movimiento = movimientos.get(i);
                System.out.println(movimiento.nombre + ": " + movimiento.monto);
            }
            Sistema.Pausar();
            System.out.println("Monto: " + tarjeta.monto);
            Sistema.Pausar();
        } else {
            System.out.println("Monto: " + tarjeta.monto);
        }
    }

    public static void MostrarTarjeta(ETarjeta tipo) {
       MostrarTarjeta(tipo, false);
    }

    public static void MostrarCuenta(boolean pausar) {
        MostrarCuenta();
        if (pausar)
            Sistema.Pausar();
    }

    public static void Transferir(Cuenta origen, String alias, float cantidad) {
        Usuario objetivo = null;
        Formulario formulario = new Formulario();
        do {
            objetivo = Usuarios.ObtenerPorAlias(alias);
            if (objetivo == null)
                alias = formulario.PreguntarPalabra("No se ha encontrado ese usuario, ingrese un ALIAS correcto");
        } while (objetivo == null);

        Transferir(origen, objetivo.cuenta, cantidad);
    }

    public static void Transferir(Cuenta origen, int cbu, float cantidad) {
        Usuario objetivo = null;
        Formulario formulario = new Formulario();
        do {
            objetivo = Usuarios.ObtenerPorCbu(cbu);
            if (objetivo == null)
                cbu = formulario.PreguntarNumeroEntero("No se ha encontrado ese usuario, ingrese un CBU correcto");
        } while (objetivo == null);

        Transferir(origen, objetivo.cuenta, cantidad);
    }

    public static void TransferirDNI(Cuenta origen, int dni, float cantidad) {
        Usuario objetivo = null;
        Formulario formulario = new Formulario();
        do {
            objetivo = Usuarios.ObtenerPorDni(dni);
            if (objetivo == null)
                dni = formulario.PreguntarNumeroEntero("No se ha encontrado ese usuario, ingrese un DNI correcto");
        } while (objetivo == null);

        Transferir(origen, objetivo.cuenta, cantidad);
    }

    public static void Transferir(Cuenta origen, Cuenta objetivo, float cantidad) {
        if (origen.getBalance() < cantidad)
            cantidad = origen.getBalance();

        objetivo.setBalance(objetivo.getBalance() + cantidad);
        origen.setBalance(origen.getBalance() - cantidad);

        origen.obtenerTarjeta(ETarjeta.VISA).sumarMovimiento("Transferencia a " + objetivo.usuario.nombre, cantidad);
        objetivo.obtenerTarjeta(ETarjeta.VISA).sumarMovimiento("Transferencia de " + origen.usuario.nombre, cantidad);
    }
}
