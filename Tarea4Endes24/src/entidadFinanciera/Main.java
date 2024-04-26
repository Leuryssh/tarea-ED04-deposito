/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;

        objetoCuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            probarRetirar(objetoCuenta, 2300, 2300); // Probamos retirar 2300, esperando que se retiren 2300
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }
        try {
            System.out.println("Ingreso en cuenta");
            probarIngresar(objetoCuenta, 695, 695); // Probamos ingresar 695, esperando que se ingresen 695
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }
    }

    // Método para probar el retiro de dinero
    public static void probarRetirar(CCuenta cuenta, double cantidad, double cantidadEsperada) throws Exception {
        cuenta.retirar(cantidad);
        if (cuenta.getSaldo() != cantidadEsperada) {
            throw new Exception("La cantidad retirada no coincide con la cantidad esperada");
        }
        System.out.println("Retiro exitoso: Se retiraron " + cantidad + " de la cuenta");
    }

    // Método para probar el ingreso de dinero
    public static void probarIngresar(CCuenta cuenta, double cantidad, double cantidadEsperada) throws Exception {
        cuenta.ingresar(cantidad);
        if (cuenta.getSaldo() != cantidadEsperada) {
            throw new Exception("La cantidad ingresada no coincide con la cantidad esperada");
        }
        System.out.println("Ingreso exitoso: Se ingresaron " + cantidad + " a la cuenta");
    }
}

