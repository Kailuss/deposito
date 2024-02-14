package cuentas;

/**
 * Esta clase representa una cuenta bancaria.
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor de CCuenta.
     * @param nom  Nombre del titular de la cuenta.
     * @param cue  Número de cuenta bancaria.
     * @param sal  Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
        setTipoInteres(tipo);
    }

    /**
     * Devuelve el nombre del titular de la cuenta bancaria.
     * @return Nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta bancaria.
     * @param nombre Nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de la cuenta bancaria.
     * @return Número de la cuenta.
     */
    public String getCuenta() { return cuenta; }

    /**
     * Establece el número de la cuenta bancaria.
     * @param cuenta Número de la cuenta.
     */
    public void setCuenta(String cuenta) { this.cuenta = cuenta; }

    /**
     * Devuelve el saldo de la cuenta bancaria.
     * @return Saldo de la cuenta.
     */
    public double getSaldo() { return saldo; }

    /**
     * Establece el saldo de la cuenta bancaria.
     * @param saldo Saldo de la cuenta.
     */
    public void setSaldo(double saldo) { this.saldo = saldo; }

    /**
     * Devuelve el tipo de interés de la cuenta bancaria.
     * @return Tipo de interés de la cuenta.
     */
    public double getTipoInteres() { return tipoInteres; }

    /**
     * Establece el tipo de interés de la cuenta bancaria.
     * @param tipoInteres Tipo de interés de la cuenta.
     */
    public void setTipoInteres(double tipoInteres) { this.tipoInteres = tipoInteres; }

    /**
     * Devuelve el saldo actual de la cuenta bancaria.
     * @return Saldo de la cuenta.
     */
    public double estado() { return getSaldo(); }

    /**
     * Ingresa una cantidad en la cuenta bancaria.
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de la cuenta bancaria.
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o si el saldo es insuficiente.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}