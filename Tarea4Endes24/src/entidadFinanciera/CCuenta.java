/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;


public class CCuenta {

    // Atributos privados de la clase
    private String nombre;          // Nombre del titular de la cuenta
    private String cuenta;          // Número de cuenta
    private double saldo;           // Saldo actual de la cuenta
    private double tipoInterés;     // Tipo de interés de la cuenta

    // Atributo constante para el mensaje de error
    private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";

    // Constructor por defecto
    public CCuenta() {
    }

    // Constructor con parámetros para inicializar la cuenta
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    // Métodos getter y setter para el atributo 'saldo'
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos getter y setter para el atributo 'tipoInterés'
    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    // Métodos getter y setter para el atributo 'nombre'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para el atributo 'cuenta'
    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    // Método para obtener el estado actual de la cuenta (saldo)
    public double estado() {
        return saldo;
    }

    // Método para ingresar dinero a la cuenta
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception(ERRORCANTIDADNEGATIVA);
        saldo = saldo + cantidad;
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
