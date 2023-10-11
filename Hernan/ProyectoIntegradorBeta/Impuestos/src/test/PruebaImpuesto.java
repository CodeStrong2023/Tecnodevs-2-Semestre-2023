package test;
import impuesto. *;
import menus.menus_generales_servicios;
import monto_en_cuenta. *;
import pago_impuestos.pagar_impuestos;
import clases. *;
/*
Esta clase está únicamente para probar las demás. Las funciones y métodos están
encadenados, asique sólo es necesario llamar a menus.menus_generales_servicios
para que se ejecute todo el sistema. De esa forma será fácil de acoplar al
proyecto entero.
*/

public class PruebaImpuesto {
    public static void main(String[] args) {

        menus.menus_generales_servicios.menu();
    }
}