package cuentas;
/**
 * La clase CCuenta representa una cuenta bancaria con operaciones básicas como
 * ingresos y retiros.
 *
 * @author Jose Manuel Gilabert Sabio
 * @version 1.0
 */

public class CCuenta {
    // Atributos

    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;
    /**
     * Número de cuenta.
     */
    private String cuenta;
     /**
     * Saldo actual de la cuenta.
     */
    private double saldo;
    /**
     * Tipo de interés asociado a la cuenta.
     */
    private double tipoInterés;
    // Constructores

    /**
     * Constructor por defecto.
     */

    public CCuenta()
    {
    }
    /**
     * Constructor con parámetros.
     *
     * @param nom     Nombre del titular de la cuenta.
     * @param cue     Número de cuenta.
     * @param sal     Saldo inicial.
     * @param tipo Tipo de interés asociado.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    // Métodos

    /**
     * Obtiene el estado actual del saldo.
     *
     * @return Saldo actual de la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * Ingresa una cantidad en la cuenta.
     *
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Retira una cantidad de la cuenta.
     *
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    } 
    /**
     * Realiza operaciones específicas de la cuenta.
     *
     * @param cuenta1 Cantidad a procesar.
     */
    public static void operativa_cuenta(cuentas.CCuenta cuenta1) {
        
        try {
            float cantidad = 2300;
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
